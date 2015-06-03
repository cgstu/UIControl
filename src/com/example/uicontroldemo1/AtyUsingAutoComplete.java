package com.example.uicontroldemo1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AtyUsingAutoComplete extends Activity {
	public AutoCompleteTextView autoCompleteTextView;
	private ArrayAdapter<String> adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_autocomplete);
		
		adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);
		adapter.add("pwc");
		adapter.add("plp");
		adapter.add("pjj");
		adapter.add("pm");
		adapter.add("pjy");
		adapter.add("phy");
		
		
		
		autoCompleteTextView=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
		autoCompleteTextView.setAdapter(adapter);
	}
}
