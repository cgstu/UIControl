package com.example.uicontroldemo1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ListActivity {

	private ArrayAdapter<ListCellData> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	// TODO Auto-generated method stub
    	super.onCreate(savedInstanceState);
    	adapter=new ArrayAdapter<ListCellData>(this, android.R.layout.simple_list_item_1);
    	setListAdapter(adapter);
    	adapter.add(new ListCellData(this, "RadioGroup",new Intent(this,AtyUsingRadioGroup.class)));
    	adapter.add(new ListCellData(this, "CheckBox",new Intent(this,CheckBoxDemo.class)));
    	adapter.add(new ListCellData(this, "DatePicker",new Intent(this,AtyUsingDatePicker.class)));
    	adapter.add(new ListCellData(this, "TimePicker",new Intent(this,AtyUsingTimePicker.class)));
    	adapter.add(new ListCellData(this, "Spinner",new Intent(this,AtySpinner.class)));
    	adapter.add(new ListCellData(this, "ProgressBar",new Intent(this,AtyUsingProgressBar.class)));
    	adapter.add(new ListCellData(this, "AutoComplete",new Intent(this,AtyUsingAutoComplete.class)));
    	adapter.add(new ListCellData(this, "SeekBar",new Intent(this,AtyUsingSeekBar.class)));
    	adapter.add(new ListCellData(this, "GridView",new Intent(this,AtyUsingGridView.class)));
    	adapter.add(new ListCellData(this, "ProgressDialog",new Intent(this,AtyUsingProgressDialog.class)));
    	adapter.add(new ListCellData(this, "Notification",new Intent(this,AtyUsingNotification.class)));
    	adapter.add(new ListCellData(this, "ScrollView",new Intent(this,AtyUsingScorllView.class)));
    	adapter.add(new ListCellData(this, "RatingBar",new Intent(this,AtyUsingRatingBar.class)));
    	adapter.add(new ListCellData(this, "ImageSwitcher",new Intent(this,AtyUsingImageSw.class)));
    	adapter.add(new ListCellData(this, "Gallery",new Intent(this,AtyUsingGallery.class)));
    	adapter.add(new ListCellData(this, "EditText",new Intent(this,AtyUsingEditText.class)));
    	adapter.add(new ListCellData(this, "BaseAdapter",new Intent(this,AtyUsingBaseAdapter.class)));

    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	// TODO Auto-generated method stub
    	ListCellData data =adapter.getItem(position);
    	data.startActivity();
    	
    	super.onListItemClick(l, v, position, id);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// TODO Auto-generated method stub
    	return super.onCreateOptionsMenu(menu);
    }
}
