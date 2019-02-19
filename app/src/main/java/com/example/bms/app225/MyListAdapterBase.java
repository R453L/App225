package com.example.bms.app225;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapterBase extends BaseAdapter {
    final Context context;
    final String mTitle[];
    final String mSubtitle[];
    final Integer mIcon[];

    public MyListAdapterBase(Context context, String[] mTitle, String[] mSubtitle, Integer[] mIcon) {
        this.context = context;
        this.mTitle = mTitle;
        this.mSubtitle = mSubtitle;
        this.mIcon = mIcon;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
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
