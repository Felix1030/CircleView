package com.hua.cn.circleview;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.jauker.widget.BadgeView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    /*private LinearLayout ly;
    private TextView text;

    private BadgeView badgeView;*/

   /* private ViewCircleDate viewCircleDate;
    private TestView testView;*/

    private ListView listView;
    private TextViewAdapter adapter;
    private List<Integer> lists = new ArrayList<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*ly = (LinearLayout) findViewById(R.id.id_layout);
        text = (TextView) findViewById(R.id.textview);
        badgeView = new BadgeView(this);
        ly.addView(badgeView);
        //badgeView.setTargetView(ly);
        badgeView.setBackground(9, Color.parseColor("#ff0000"));
        badgeView.setText("new");
        badgeView.setTextSize(11);*/
        /*viewCircleDate = (ViewCircleDate) findViewById(R.id.viewcircle);
        viewCircleDate.setDay("29");
        viewCircleDate.setMonth("8");*/
        /*testView = (TestView) findViewById(R.id.testview);
        testView.setMm(300);
        testView.setText("11111111111111111111111");*/
        listView = (ListView) findViewById(R.id.listview);
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        int screenWidth = metrics.widthPixels;
        for(int i = 100 ; i < 500 ;i++){
            lists.add(i);
        }
        adapter = new TextViewAdapter(this,lists,screenWidth);
        listView.setAdapter(adapter);
    }

}
