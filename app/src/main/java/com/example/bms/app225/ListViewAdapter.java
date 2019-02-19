package com.example.bms.app225;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<String> {
    final Activity context;
    final String mTitle[];
    final String mSubtitle[];
    final Integer mIcon[];

    public ListViewAdapter(Activity context, String[] mTitle, String[] mSubtitle, Integer[] mIcon) {
        super(context,R.layout.listitem,mTitle);
        this.context = context;
        this.mTitle = mTitle;
        this.mSubtitle = mSubtitle;
        this.mIcon = mIcon;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        view = inflater.inflate(R.layout.listitem,null,true);

        ImageView icon = view.findViewById(R.id.ivicon);
        TextView title = view.findViewById(R.id.tvtitle);
        TextView subtitle = view.findViewById(R.id.tvsubtitle);

        icon.setImageResource(mIcon[position]);
        title.setText(mTitle[position]);
        subtitle.setText(mSubtitle[position]);

        return view;
    }
}
