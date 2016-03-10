package st.draganddraw.view;

import android.graphics.PointF;

/**
 * Created by tengsun on 3/10/16.
 */
public class Box {

    private PointF origin;
    private PointF current;

    public Box(PointF origin) {
        this.origin = origin;
        this.current = origin;
    }

    public PointF getOrigin() {
        return origin;
    }

    public PointF getCurrent() {
        return current;
    }

    public void setCurrent(PointF current) {
        this.current = current;
    }
}
