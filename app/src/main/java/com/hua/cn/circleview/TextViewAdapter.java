package com.hua.cn.circleview;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HuaXiangYang on 2015/6/5.
 */
public class TextViewAdapter extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Integer> lists;
    private int screenWidth;

    public TextViewAdapter(Context context,List<Integer> listInt,int width){
        inflater = LayoutInflater.from(context);
        lists = listInt;
        screenWidth = width;
    }

    @Override
    public int getCount() {
        return lists.size();
    }

    @Override
    public Object getItem(int i) {
        return lists.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder = null;
        if(view == null){
            view = inflater.inflate(R.layout.test_bradieview,null);
            viewHolder = new ViewHolder();
            viewHolder.textView = (TextView) view.findViewById(R.id.textview);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();
        }
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) viewHolder.textView.getLayoutParams();
        int ss = lists.get(i);
        float width = getWidthWith(ss);
        params.width = (int) width;

        viewHolder.textView.setLayoutParams(params);
        return view;
    }

    private float getWidthWith(Integer integer) {
        return (float) (integer / 1000.0 * screenWidth);
    }

    class ViewHolder{
        TextView textView;
    }

}
