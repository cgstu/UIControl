package com.example.uicontroldemo1;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class CheckBoxDemo extends Activity {
	
	private CheckBox c1,c2,c3,c4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.usingcheckbox);
		
		c1=(CheckBox) findViewById(R.id.checkBox1);
		c2=(CheckBox) findViewById(R.id.checkBox2);
		c3=(CheckBox) findViewById(R.id.checkBox3);
		c4=(CheckBox) findViewById(R.id.checkBox4);
		
		findViewById(R.id.btnSubmit).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String str="中午要吃的东西有：\n";
				if(c1.isChecked()){
					str=str+c1.getText()+"\n";
				}
				if(c2.isChecked()){
					str=str+c2.getText()+"\n";
				}
				if(c3.isChecked()){
					str=str+c3.getText()+"\n";
				}
				if(c4.isChecked()){
					str=str+c4.getText()+"\n";
				}
				
				new AlertDialog.Builder(CheckBoxDemo.this).setTitle("结果").setMessage(str).setPositiveButton("关闭", null).show();
			}
		});
	}
}
