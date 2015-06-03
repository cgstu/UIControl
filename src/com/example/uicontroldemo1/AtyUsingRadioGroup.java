package com.example.uicontroldemo1;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class AtyUsingRadioGroup extends Activity {
	
	private RadioButton radio1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.using_radiogroup);
		
		radio1=(RadioButton) findViewById(R.id.radio0);
		findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(radio1.isChecked()){
					new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("xxx").setMessage("yyy").show();
				}else {
					new AlertDialog.Builder(AtyUsingRadioGroup.this).setTitle("yyy").setMessage("xxx").show();
				}
			}
		});
	}
}
