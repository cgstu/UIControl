package com.example.uicontroldemo1;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;


public class AtyUsingGridView extends Activity {
	private GridView gridView;
	
	private ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.aty_using_gridview);
		adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
		for (int i = 0; i < 60; i++) {
			adapter.add("pwc"+i);
		}
		gridView=(GridView) findViewById(R.id.gridView1);
		gridView.setAdapter(adapter);
		
	}
}
