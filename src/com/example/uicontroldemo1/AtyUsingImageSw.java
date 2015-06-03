package com.example.uicontroldemo1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher.ViewFactory;

public class AtyUsingImageSw extends Activity {
	private ImageSwitcher imageSwitcher;
	private boolean showImg1=true;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aty_using_imageswitcher);
		
		imageSwitcher=(ImageSwitcher) findViewById(R.id.imageSwitcher1);
		imageSwitcher.setFactory(new ViewFactory() {
			
			@Override
			public View makeView() {
				// TODO Auto-generated method stub
				return new ImageView(AtyUsingImageSw.this);
			}
		});
		imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(AtyUsingImageSw.this, android.R.anim.fade_in));
		imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(AtyUsingImageSw.this, android.R.anim.fade_out));
		imageSwitcher.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showImg1=!showImg1;
				showCurrentImage();
			}
		});
	}
	private void showCurrentImage(){
		if(showImg1){
			imageSwitcher.setImageResource(R.drawable.img1);
		}else {
			imageSwitcher.setImageResource(R.drawable.img2);
		}
	}
}
