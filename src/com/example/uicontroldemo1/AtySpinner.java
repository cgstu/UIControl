package com.example.uicontroldemo1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AtySpinner extends Activity {
	private ArrayAdapter<String> arrayAdapter;
	private Spinner spinner;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.atyusingspinner);
		spinner=(Spinner) findViewById(R.id.spinner1);
		arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item);
		arrayAdapter.add("PWC");
		arrayAdapter.add("ZLH");
		
		spinner.setAdapter(arrayAdapter);
	}
}
