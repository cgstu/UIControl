package com.example.uicontroldemo1;

import android.content.Context;
import android.content.Intent;
import android.widget.RadioGroup;

public class ListCellData {
	
	public ListCellData(Context context,String controlName,Intent relatedIntent){
		this.controlName=controlName;
		this.context=context;
		this.relatedIntent=relatedIntent;
	}
	public String controlName="";
	public String getControlName() {
		return controlName;
	}
	private Context context=null;
	public Context getContext() {
		return context;
	}
	public void startActivity(){
		getContext().startActivity(getRelatedIntent());
	}
	private Intent relatedIntent=null;
	public Intent getRelatedIntent() {
		return relatedIntent;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getControlName();
	}
	
}
