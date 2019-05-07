package com.example.recycler;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {
    View mview;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mview=itemView;
    }

    public  void setDetails(Context ctx, String title, String description, String image){

        TextView mTitleTv=mview.findViewById(R.id.tv);
        TextView mDetailTv=mview.findViewById(R.id.des);
        ImageView mImageTv=mview.findViewById(R.id.imgv);

        mTitleTv.setText(title);
        mDetailTv.setText(description);
        Picasso.get().load(image).into(mImageTv);

    }
}
