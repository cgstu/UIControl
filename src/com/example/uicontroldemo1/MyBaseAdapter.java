package com.example.uicontroldemo1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyBaseAdapter extends BaseAdapter {
	private Context context;
	public Context getContext() {
		return context;
	}
	public MyBaseAdapter(Context context){
		this.context=context;
		
	}
	private DataCell[] dataCells=new DataCell[]{
			new DataCell(R.drawable.img1, "img1", "i1"),
			new DataCell(R.drawable.img2, "img2", "i2"),
			new DataCell(R.drawable.img3, "img3", "i3"),
			new DataCell(R.drawable.img4, "img4", "i4"),
			new DataCell(R.drawable.img5, "img5", "i5"),
			new DataCell(R.drawable.img6, "img6", "i6")
	};
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return dataCells.length;
	}

	@Override
	public DataCell getItem(int position) {
		// TODO Auto-generated method stub
		return dataCells[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LinearLayout layout=null;
		if(convertView!=null){
			layout=(LinearLayout) convertView;
		}
		else {
			layout=(LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.data_cell, null);
		}
		DataCell temp=dataCells[position];
		ImageView imageView=(ImageView) layout.findViewById(R.id.imageView1);
		TextView textView1=(TextView) layout.findViewById(R.id.t1);
		TextView textView2=(TextView) layout.findViewById(R.id.t2);
		imageView.setImageResource(temp.getIcon());
		textView1.setText(temp.getT1());
		textView2.setText(temp.getT2());
		
		
		return layout;
	}

}
