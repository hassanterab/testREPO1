package app.main.utils;

import com.example.arabicletters.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;

public class Utils {

	
	private static MediaPlayer mediaPlayer;
	public static void playAudio(int audioFileId, Context context){
		//int resId = R.raw.welcome;
		if (mediaPlayer != null) {
			mediaPlayer.release();
		}
		
		// Create a new MediaPlayer to play this sound
		mediaPlayer = MediaPlayer.create(context, audioFileId);
		mediaPlayer.start();
		mediaPlayer.setVolume(3, 3);
	}
	
	
	public static void loadAds(Activity activity, boolean top, boolean bottom){
		
		Log.i("Activity", activity.getClass().getName());
		Log.i("Top", String.valueOf(top));
		Log.i("Bottom", String.valueOf(bottom));
		 // Top
	    if(top){
		    AdView  adView = (AdView) activity.findViewById(R.id.adview_top);
		    AdRequest adRequestTop = new AdRequest.Builder().build();
	        adView.loadAd(adRequestTop);
		}

	    // Bottom
		if(bottom){
			
			 AdView  adViewBottom = (AdView) activity.findViewById(R.id.adview_bottom);
			 AdRequest adRequestBottom = new AdRequest.Builder().build();
			 adViewBottom.loadAd(adRequestBottom);
		}
       
        
	}
}
