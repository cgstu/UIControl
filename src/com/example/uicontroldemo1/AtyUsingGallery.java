package com.example.uicontroldemo1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Gallery;

public class AtyUsingGallery extends Activity {
	private ArrayAdapter<String> adapter;
	private Gallery gallery;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atyusinggallery);
		adapter=new ArrayAdapter<String>(AtyUsingGallery.this, android.R.layout.simple_list_item_1);
		gallery=(Gallery) findViewById(R.id.gallery1);
		for (int i = 0; i < 20; i++) {
			adapter.add("gallery"+i);
		}
		gallery.setAdapter(adapter);
		
	}
}
