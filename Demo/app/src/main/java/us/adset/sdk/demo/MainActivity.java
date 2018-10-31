package us.adset.sdk.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import us.adset.sdk.Adsetus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Adsetus.init(this, "YOUR_APP_ID");
    }

    public void showBtnClicked(View view) {
    	if (Adsetus.isAdLoaded()) {
        	Adsetus.showAd(this);
		}
    }
}