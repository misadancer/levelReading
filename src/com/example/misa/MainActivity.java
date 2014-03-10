package com.example.misa;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

public class MainActivity extends Activity
{
	// 创建标题数组
    String[] titleArray = new String[]{
    		"Finding fossil man"
    		,"Spare that spider"
    		,"Matterhorn man"
    		,"Seeing hands"
    		,"Youth"
    		,"The sporting spirit"
    		,"Bats"
    		,"Trading standards"
    		,"Royal espionage"
    		,"Silicon valley"
    		,"How to grow old"
    		,"Banks and their customers"
    		,"The search for oil"
    		,"The Butterfly Effect"
    		};
    
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.main_list);
        // 创建动态数组
        ArrayList<HashMap<String, Object>> listItem = new ArrayList<HashMap<String, Object>>();
		for (int i = 0; i < 14; i++) {
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("ItemNumber", "Lesson " + (i + 1));
			map.put("ItemTitle", titleArray[i]);
			listItem.add(map);
		}
		SimpleAdapter listItemAdapter = new SimpleAdapter(this	//上下文
				,listItem	//数据源
				,R.layout.list	//资源文件
				,new String[] {"ItemNumber", "ItemTitle"}
				,new int[] {R.id.Number, R.id.Title}
		);
		list.setAdapter(listItemAdapter);

		// 添加点击
		list.setOnItemClickListener(new OnItemClickListener()
		{

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)
			{
				Intent intent = new Intent();
				intent.putExtra("val", String.valueOf(arg2));
				intent.putExtra("txt", titleArray[arg2]);
				intent.setClass(MainActivity.this, SecondActivity.class);
				startActivity(intent);
			}
		});
	}

	/*@Override
	 public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	} */
}
