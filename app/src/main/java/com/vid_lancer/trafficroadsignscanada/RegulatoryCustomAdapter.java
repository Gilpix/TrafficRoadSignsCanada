package com.vid_lancer.trafficroadsignscanada;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

    public class RegulatoryCustomAdapter extends BaseAdapter {
        Context context;
        String signsDescription[];
        int signsImage[];
        LayoutInflater inflter;

        public RegulatoryCustomAdapter(Context applicationContext, String[] countryList, int[] flags) {
            this.context = context;
            this.signsDescription = countryList;
            this.signsImage = flags;
            inflter = (LayoutInflater.from(applicationContext));
        }

        @Override
        public int getCount() {
            return signsDescription.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = inflter.inflate(R.layout.reugulatory_list_view, null);
            TextView country = (TextView) view.findViewById(R.id.textView);
            ImageView icon = (ImageView) view.findViewById(R.id.icon);
            country.setText(signsDescription[i]);
            icon.setImageResource(signsImage[i]);
            return view;
        }
    }