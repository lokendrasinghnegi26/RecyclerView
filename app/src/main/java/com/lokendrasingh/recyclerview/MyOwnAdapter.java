package com.lokendrasingh.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MyOwnAdapter extends RecyclerView.Adapter<MyOwnAdapter.MyOwnHolder> {
    String data1[], data2[];
    int img[];
    Context ctx;
    public MyOwnAdapter(Context ct, String s1[], String s2[], int i1[])
    {
        ctx= ct;
        data1= s1;
        data2= s2;
        img=i1;
    }
    @NonNull
    @Override
    public MyOwnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater myinflater= LayoutInflater.from(ctx);            //get xml file for each row
       View myownview= myinflater.inflate(R.layout.my_row, parent, false);     // false because we don't want to attach parent
        return new MyOwnHolder(myownview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyOwnHolder holder, int position)     /*bind the initilize data with the actual data i.e. data1, data2, img*/
    {
    holder.t1.setText(data1[position]);
    holder.t2.setText(data2[position]);
    holder.image.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyOwnHolder extends RecyclerView.ViewHolder {          // ViewHolder class will initialize all the view at a once
        TextView t1, t2;
        ImageView image;
        public MyOwnHolder(@NonNull View itemView) {
            super(itemView);
            t1= itemView.findViewById(R.id.textView1);
            t2= itemView.findViewById(R.id.textView2);
            image= itemView.findViewById(R.id.imageView);
        }
    }
}
