package com.example.uicontroldemo1;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

public class AtyUsingBaseAdapter extends ListActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new MyBaseAdapter(AtyUsingBaseAdapter.this));
		
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		Toast.makeText(AtyUsingBaseAdapter.this, "click"+position, Toast.LENGTH_SHORT).show();
	}
}
