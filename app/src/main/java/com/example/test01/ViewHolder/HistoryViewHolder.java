package com.example.test01.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test01.Common.Common;
import com.example.test01.Interface.ItemClickListener;
import com.example.test01.R;

public class HistoryViewHolder extends RecyclerView.ViewHolder implements
        View.OnClickListener,
        View.OnCreateContextMenuListener
{

    public TextView txtMenuName;
    public ImageView imageView;

    private ItemClickListener itemClickListener;

    public HistoryViewHolder(@NonNull View itemView) {
        super(itemView);

        txtMenuName=(TextView)itemView.findViewById(R.id.menu_name);
        imageView =(ImageView)itemView.findViewById(R.id.menu_image);
        itemView.setOnCreateContextMenuListener(this);
        itemView.setOnClickListener(this);

    }


    public void setItemClickListener (ItemClickListener itemClickListener){
        this.itemClickListener=itemClickListener;
    }

    @Override
    public void onClick(View view) {
        itemClickListener.onClick(view,getAdapterPosition(),false);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

    }
}
