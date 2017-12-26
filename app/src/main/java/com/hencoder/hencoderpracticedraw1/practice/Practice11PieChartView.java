package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    private Paint paint = new Paint();

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        canvas.drawArc(300, 50, 900, 650, -180, 135, true, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawArc(320, 70, 920, 670, -44, 45, true, paint);
        paint.setColor(Color.CYAN);
        canvas.drawArc(320, 72, 920, 672, 3, 7, true, paint);
        paint.setColor(Color.GRAY);
        canvas.drawArc(320, 74, 920, 674, 15, 9, true, paint);
        paint.setColor(Color.LTGRAY);
        canvas.drawArc(320, 74, 920, 674, 25, 30, true, paint);
        paint.setColor(Color.BLUE);
        canvas.drawArc(320, 74, 920, 674, 57, 120, true, paint);
    }
}
