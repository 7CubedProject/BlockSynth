package sevencubed.blocksynth;

import java.util.ArrayList;
import java.util.List;


import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<ImageView> images = new ArrayList<ImageView>();
    private int size = 36;

    public ImageAdapter(Context c ) {
        mContext = c;
      //  images = temp;      
        
    }
    
    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return position;
    }
    

    

    // create a new ImageView for each item referenced by the Adapter
    public View getView(final int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(55, 55));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            //imageView.setPadding(2, 2, 2, 2);
            
            
            
            
            imageView.setOnTouchListener(new View.OnTouchListener() {
				
				public boolean onTouch(View v, MotionEvent event) {
					v.setBackgroundResource(R.drawable.bloom); 
					
					Log.d("onClick","position ["+position+"]");
			//		event.
           //     	final MediaPlayer mp = MediaPlayer.create(mContext, R.raw.beep);
           //     	mp.start();
					return false;
				}
			}); 
            

            
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(R.drawable.grey);
        return imageView;
    }



	public int getCount() {
		// TODO Auto-generated method stub
		return size;
	}

    // references to our images
}
