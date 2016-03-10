package st.draganddraw.view;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by tengsun on 3/10/16.
 */
public class BoxDrawingView extends View {

    public static final String TAG = "BoxDrawingView";

    // creating the view from code
    public BoxDrawingView(Context context) {
        this(context, null);
    }

    // inflating the view from xml
    public BoxDrawingView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        PointF curr = new PointF(event.getX(), event.getY());
        Log.i(TAG, "Received event: " + curr.x + ", " + curr.y);

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i(TAG, "ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(TAG, "ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(TAG, "ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.i(TAG, "ACTION_CANCEL");
                break;
        }

        return true;
    }
}
