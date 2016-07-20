package org.mods.powerfulyou;

import android.content.Context;
import android.util.AttributeSet;
import android.view.DragEvent;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Dita on 7/13/2015.
 */
public class Food extends ImageView{


    private int cal;
    private String name;

    public Food(Context c, AttributeSet attrs){
        super(c,attrs);
    }

    public Food(Context context, int c, String n){
        super(context);
        cal = c;
        name = n;
    }

    public Food(ImageView mv, int c, String n){
        super(mv.getContext());
        cal = c;
        name = n;

    }

    public void setCal(int c){ cal = c; }

    public int getCal() { return cal; }

    /*@Override
    public boolean onDragEvent(DragEvent e){
        if (e.getAction()==DragEvent.ACTION_DRAG_EXITED) {
            CalorieCounter.updateCalories(this.getCal());
            return true;
        }
        return true;
    }*/


}
