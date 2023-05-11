package com.zavierdev.whatsanimal;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OneFragment extends Fragment {
    public String NamaBinatang;

    private RecyclerView RecyclerView_Binatang;
    private ArrayList<Binatang> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_one, container, false);
        /*TextView textView=v.findViewById(R.id.text);
        textView.setText("First Fragment");*/
        RecyclerView_Binatang = v.findViewById(R.id.RecyclerView_Hewan);
        RecyclerView_Binatang.setHasFixedSize(true);

        list.addAll(DataBinatang.getListData());
        showRecyclerList();

        return v;
    }

    private void showRecyclerList() {
        RecyclerView_Binatang.setLayoutManager(new LinearLayoutManager(getActivity()));
        ListBinatangAdapter listBinatangAdapter = new ListBinatangAdapter(list);
        RecyclerView_Binatang.setAdapter(listBinatangAdapter);

        listBinatangAdapter.setOnItemClickCallback(new ListBinatangAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Binatang data, String[] str,int [] dataraw) {
                    OneFragment oneFragment = new OneFragment();
                    showSelectedBinatang(data);
                    Intent intent = new Intent(getActivity(), DetailActivity.class);
                    intent.putExtra(DetailActivity.EXTRA_NAME, str[0]);
                    intent.putExtra(DetailActivity.EXTRA_KLASIFIKASI,str[1]);
                    intent.putExtra(DetailActivity.EXTRA_DETAIL,str[2]);
                    intent.putExtra(DetailActivity.EXTRA_PHOTO,dataraw[0]);
                    intent.putExtra(DetailActivity.EXTRA_SOUND,dataraw[1]);
                    startActivity(intent);
            }
        });
    }

    private void showSelectedBinatang(Binatang binatang) {
        Toast.makeText(getActivity(),binatang.getNama(),Toast.LENGTH_SHORT).show();
    }
}
