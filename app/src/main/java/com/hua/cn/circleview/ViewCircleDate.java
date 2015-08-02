package com.hua.cn.circleview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by HuaXiangYang on 2015/6/2.
 */
public class ViewCircleDate extends View {

    private Context context;
    private Paint paint;
    private CircleDate circleDate;

    public ViewCircleDate(Context context) {
        this(context,null);
    }

    public ViewCircleDate(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ViewCircleDate(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }


    @Override
    protected void onDraw(Canvas canvas) {

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.reset();
        paint.setColor(getColor(R.color.default_color_bg));
        canvas.drawCircle(getWidth() / 2,getHeight() / 2,getHeight() / 2,paint);

        Paint textPaint = new Paint();
        Paint lintPaint = new Paint();

        textPaint.setAntiAlias(true);
        lintPaint.setAntiAlias(true);

        textPaint.setColor(getColor(R.color.default_text_color));
        lintPaint.setColor(getColor(R.color.default_text_color));
        lintPaint.setStrokeWidth((float) 1.0);
        textPaint.setTextSize(70);
        textPaint.setTextAlign(Paint.Align.CENTER);

        float startX = (float) (7 / 8.0 * getWidth());
        float startY = (float) (3 / 8.0 * getHeight() - 3.0);

        float stopX = (float) (1 / 4.0 * getWidth() + 3.0);
        float stopY = (float) (7 / 8.0 * getHeight()) - 10;

        canvas.drawLine(startX, startY, stopX, stopY, lintPaint);

        Paint x = new Paint();
        x.setAntiAlias(true);
        x.setTextAlign(Paint.Align.CENTER);
        x.setTextSize(50);
        x.setColor(getColor(R.color.default_text_color));

        canvas.drawText(day, (float) (3 / 8.0 * getWidth()), (float) (1 / 2.0 * getHeight()), textPaint);

        canvas.drawText(month, (float) (11 / 16.0 * getWidth()), (float) (7 / 8.0 * getHeight()),x);

    }

    private int getColor(int id){
        return getResources().getColor(id);
    }

    public float sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return spValue * fontScale + 0.5f;
    }
    private String month;
    private String day;

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
