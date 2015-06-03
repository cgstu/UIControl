package com.example.uicontroldemo1;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;

public class AtyUsingProgressDialog extends Activity {
	private ProgressDialog progressDialog;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.atyshowprogressdialog);
		
		findViewById(R.id.btnshowprogressdialog).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				progressDialog = ProgressDialog.show(AtyUsingProgressDialog.this, "加载中", "正在加载请稍后");
				new Thread(){
					public void run() {
						try {
							Thread.sleep(3000);
							progressDialog.dismiss();
						} catch (Exception e) {
							e.printStackTrace();
						}
					};
				}.start();
			}
		});
	}
}
