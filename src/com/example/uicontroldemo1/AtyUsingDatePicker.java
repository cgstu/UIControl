package com.example.uicontroldemo1;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class AtyUsingDatePicker extends Activity {
	
	private Button btnSelectDate;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atydatapicker);
		
		btnSelectDate=(Button) findViewById(R.id.btn_selectDate);
		btnSelectDate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				new DatePickerDialog(AtyUsingDatePicker.this, new DatePickerDialog.OnDateSetListener() {
					
					@Override
					public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
						// TODO Auto-generated method stub
						btnSelectDate.setText(String.format("%d:%d:%d", arg1,arg2,arg3));
					}
				}, 2015, 5, 15).show();
			}
		});
		
	}
}
