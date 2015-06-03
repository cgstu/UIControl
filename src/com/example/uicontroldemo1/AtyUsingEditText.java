package com.example.uicontroldemo1;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AtyUsingEditText extends Activity {
	private EditText editText;
	private Button btnGetTextButton;
	private String wordString;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atyusingedittext);
		editText=(EditText) findViewById(R.id.editText1);
		btnGetTextButton=(Button) findViewById(R.id.btnGetText);
		
		btnGetTextButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(TextUtils.isEmpty(editText.getText().toString())){
					Toast.makeText(AtyUsingEditText.this, "Your word is empty!", Toast.LENGTH_SHORT).show();

				}
				else {
					Toast.makeText(AtyUsingEditText.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();

				}
			}
		});
	}
}
