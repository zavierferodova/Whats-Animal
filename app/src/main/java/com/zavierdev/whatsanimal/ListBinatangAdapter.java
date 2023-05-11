package com.zavierdev.whatsanimal;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListBinatangAdapter extends RecyclerView.Adapter<ListBinatangAdapter.ListViewHolder> {
    ArrayList<Binatang> listBinatang;

    private OnItemClickCallback onItemClickCallback;

    public ListBinatangAdapter(ArrayList<Binatang> list) {
        this.listBinatang = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_hewan, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListBinatangAdapter.ListViewHolder holder, final int position) {
        Binatang binatang = listBinatang.get(position);
        Glide.with(holder.itemView.getContext())
                .load(binatang.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.namaBinatang.setText(binatang.getNama());
        holder.detailBinatang.setText(binatang.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Binatang data = listBinatang.get(position);
                String[] datalist = {data.getNama(),data.getKlasifikasi(),data.getDetail()};
                int photodata = data.getPhoto();
                int suaradata = data.getSuara();
                int[] dataraw = {photodata,suaradata};
                onItemClickCallback.onItemClicked(listBinatang.get(holder.getAdapterPosition()),datalist,dataraw);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBinatang.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView namaBinatang, detailBinatang;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.item_photos);
            namaBinatang = itemView.findViewById(R.id.item_nama_hewan);
            detailBinatang = itemView.findViewById(R.id.item_detail_hewan);
        }
    }

    interface OnItemClickCallback {
        void onItemClicked(Binatang data,String[] str,int[] dataraw);
    }
}
