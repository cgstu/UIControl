package com.example.uicontroldemo1;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class AtyUsingTimePicker extends Activity {
	private Button btnTimePicker;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atytimepicker);
		
		btnTimePicker=(Button) findViewById(R.id.btn_TimePicker);
		
		btnTimePicker.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				new TimePickerDialog(AtyUsingTimePicker.this, new TimePickerDialog.OnTimeSetListener() {
					
					@Override
					public void onTimeSet(TimePicker arg0, int arg1, int arg2) {
						// TODO Auto-generated method stub
						btnTimePicker.setText(String.format("%d:%d", arg1,arg2));
					}
				}, 17, 00, true).show();
			}
		});
	}
}
