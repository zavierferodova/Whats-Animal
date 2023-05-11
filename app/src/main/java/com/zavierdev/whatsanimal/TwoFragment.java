package com.zavierdev.whatsanimal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

public class TwoFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_two, container, false);

        LinearLayout siteLayout = v.findViewById(R.id.site);
        siteLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String site = "https://github.com/zavierferodova";
                Uri uri = Uri.parse(site);

                Intent mail_intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(mail_intent);
            }
        });

        return v;
    }
}
