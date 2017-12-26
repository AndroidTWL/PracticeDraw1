package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint paint = new Paint();

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);
        canvas.drawLine(50, 50, 50, 500, paint);
        canvas.drawLine(50, 500, 1000, 500, paint);
        paint.setTextSize(20);
        canvas.drawText("Froyo", 100, 520, paint);
        canvas.drawText("GB", 200, 520, paint);
        canvas.drawText("ICS", 300, 520, paint);
        canvas.drawText("JB", 400, 520, paint);
        canvas.drawText("KitKat", 500, 520, paint);
        canvas.drawText("L", 600, 520, paint);
        canvas.drawText("L", 700, 520, paint);
        canvas.drawLine(100, 497, 170, 497, paint);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        canvas.drawRect(190, 470, 260, 500, paint);
        canvas.drawRect(280, 470, 350, 500, paint);
        canvas.drawRect(370, 400, 440, 500, paint);
        canvas.drawRect(460, 300, 530, 500, paint);
        canvas.drawRect(550, 200, 620, 500, paint);
        canvas.drawRect(640, 410, 710, 500, paint);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
    }
}
