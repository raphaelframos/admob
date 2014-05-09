package br.com.powelladmob;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView adView = (AdView) findViewById(R.id.adView);
	    AdRequest adRequest = new AdRequest.Builder()
       .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
	        .build();
	    adView.loadAd(adRequest);
    }
    
}
