package com.example.uicontroldemo1;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public class AtyUsingNotification extends Activity {
	
	private NotificationManager notificationManager;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		notificationManager.cancel(R.layout.atyusingnotifa);
		setContentView(R.layout.atyusingnotifa);
		
		findViewById(R.id.btnNotification).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Notification notification=new Notification(R.drawable.ic_launcher,"Ticker Text",System.currentTimeMillis());
				notification.setLatestEventInfo(AtyUsingNotification.this, "title", "content", PendingIntent.getActivity(AtyUsingNotification.this, 1, getIntent(), 0));
				notificationManager.notify(R.layout.atyusingnotifa, notification);
			}
		});
	}
}
