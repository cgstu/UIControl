package com.example.uicontroldemo1;

public class DataCell {
	private int icon;
	private String t1;
	private String t2;
	public int getIcon() {
		return icon;
	}
	public void setIcon(int icon) {
		this.icon = icon;
	}
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	public DataCell(int icon,String t1,String t2){
		setIcon(icon);
		setT1(t1);
		setT2(t2);
	}
}
