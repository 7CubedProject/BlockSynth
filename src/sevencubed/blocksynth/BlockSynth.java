package sevencubed.blocksynth;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;

public class BlockSynth extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid);
        
        ArrayList<ImageView> testImages = new ArrayList<ImageView>();
        
        ImageView yup = (ImageView) findViewById(R.drawable.grey);
        
        testImages.add((ImageView) findViewById(R.drawable.grey));
        
      //  GridView temp = (GridView) findViewById(R.id.gridview);
        //temp.addView(yup, 0);

        
        
        
    
        
        
        

        
        final GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));
        
       // makeAlert(Integer.toString(gridview.getChildCount()));
        
      // gridview.get
        
   //     LinearLayout layout = (LinearLayout) findViewById(R.id.view);
        
        gridview.setOnTouchListener(new View.OnTouchListener() {
			
			public boolean onTouch(View v, MotionEvent event) {
				//Log.d("onClick","position ["+event.getX()+" - " + event.getY()+"]" + event.getPressure());
				
				//if(checkPos((int)event.getX(), (int)event.getY()))
				//	makeAlert("WOOOO!");
				
				return true;
			}
		});    
        

 
    }
    
    public boolean checkPos(int x, int y){
    	GridView gridview = (GridView) findViewById(R.id.gridview);
    	
    /*
    	//View test = gridview.getChildAt(5);
		Rect test2 = null;
	    test.getHitRect(test2);
	    Log.v("LEFT",Integer.toString(test.getLeft()));
	    if( test2.contains(x,y))
			return true; */
		return false;    	
    	
    	
    }
    
    public void makeAlert(String text){
        new AlertDialog.Builder(this)
        .setMessage(text)
        .setPositiveButton("OK", null)
        .show();    	
    } 

}

