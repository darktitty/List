package com.blacktitty.list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {
    LayoutInflater mInflater;
    String[] name;
    String[] tittle;
    String[] position;

    public ItemAdapter(Context c,String[] n, String[] t, String[] p){
        name = n;
        tittle = t;
        position = p;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int s) {
        return name[s];
    }

    @Override
    public long getItemId(int s) {
        return s;
    }

    @Override
    public View getView(int s, View convertView, ViewGroup parent) {
        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView tittleTextView = (TextView) v.findViewById(R.id.tittleTextView);
        TextView positionTextView = (TextView) v.findViewById(R.id.positionTextView);

        String nam = name[s];
        String Tit = tittle[s];
        String pos = position[s];

        nameTextView.setText(nam);
        tittleTextView.setText(Tit);
        positionTextView.setText(pos);
        return v;
    }
}
