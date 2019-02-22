package com.example.bms.app225;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class GridViewAdapter extends BaseAdapter {
    Context context;
    ArrayList<Integer> arrayList = new ArrayList<>();

    public GridViewAdapter(Context context, ArrayList<Integer> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    GridViewAdapter(Activity ctx){
        context = ctx;
    }

    @Override
    public int getCount() {
        return arrayList.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
        Activity activity = (Activity) context;

        View v = activity.getLayoutInflater().inflate(R.layout.griditem,null);

        ImageView iv = v.findViewById(R.id.ivgriditem);

        iv.setImageResource(arrayList.get(position));

        return v;
    }
}
