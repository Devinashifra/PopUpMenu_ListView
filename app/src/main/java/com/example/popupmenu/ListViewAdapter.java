package com.example.popupmenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    //Deklarasi variabel dengan jenis data context
    Context mContext;

    //Deklarasi variabel dengan jenis data layout inflater
    LayoutInflater inflater;

    //Deklarasi variabel dengan jenis data arrayList
    private ArrayList<ClassNama> arrayList;

    //membuat konstruktor Listviewadapter
    public ListViewAdapter(Context context) {
        mContext = context;

        inflater = LayoutInflater.from(mContext);

        this.arrayList = new ArrayList<ClassNama>();

        this.arrayList.addAll(Home_Activity.classNamaArrayList);
    }

    //membuat class untuk mendeklarasikan tempat untuk meletakkan isi kedalam listview
    public class ViewHolder {
        TextView name;
    }

    @Override
    public int getCount() {
        return Home_Activity.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return Home_Activity.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;

        if (view == null) {

            holder = new ViewHolder();

            view = inflater.inflate(R.layout.item_listview,null);

            holder.name = (TextView) view.findViewById(R.id.tvnama_item);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }

        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getNama());
        return view;
    }
}
