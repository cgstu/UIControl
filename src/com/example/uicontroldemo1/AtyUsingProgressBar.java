package com.example.uicontroldemo1;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class AtyUsingProgressBar extends Activity {
	private Timer timer=null;
	private TimerTask task=null;
	private int progress=0;
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		startTimer();
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		stopTimer();
	}
	
	public void startTimer(){
		if(timer==null){
			timer=new Timer();
			task=new TimerTask() {
				
				@Override
				public void run() {
					progress++;
					pBar.setProgress(progress);
				}
			};
			timer.schedule(task, 1000,10);
		}
	}
	public void stopTimer(){
		if(timer!=null){
			task.cancel();
			timer.cancel();
			
			task=null;
			timer=null;
		}
	}
	
	private ProgressBar pBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.aty_usingprogressbar);
		pBar=(ProgressBar) findViewById(R.id.progressBar2);
		
		pBar.setMax(100);
		pBar.setProgress(50);
		
	}
}
