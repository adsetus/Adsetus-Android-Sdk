# Adsetus Android SDK
SDK Version: 1.0.9

## Overview
...

## Quick Start
### 1. Add Jar Libraries To Your Project

Copy all jar files into your project’s /libs directory. Create this directory if it doesn't already exist in your project.
The Adsetus Android SDK requires the following libraries:

* adsetus-\<version>.jar
* adcolony-\<version>.jar
* applovin-\<version>.jar
* chartboost-\<version>.jar
* unity-ads-\<version>.jar
* vungle-\<version>.jar
* adapter-rxjava-\<version>.jar
* converter-gson-\<version>.jar
* dagger-\<version>.jar
* eventbus-\<version>.jar
* gson-\<version>.jar
* javax.inject-\<version>.jar
* okhttp-\<version>jar
* okio-\<version>.jar
* retrofit-\<version>.jar
* rxjava-\<version>.jar

### 2. Add Native Libraries To Your Project

Copy files from **/jniLibs** directory into your project’s native directory. Usually it’s **/src/main/jniLibs**.

You should copy these directories:
* armeabi
* armeabi-v7a
* x86
* x86_64
* arm64-v8a

### 3. Edit AndroidManifest.xml

Add the following lines to your AndroidManifest.xml:

```Java
<manifest>

    ...

    <!-- Required permissions -->

    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>

    <!-- Optional Permissions -->

    <uses-permission android:name="android.permission.GET_ACCOUNTS" />
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
    <uses-permission android:name="android.permission.READ_PHONE_STATE" />
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION" />
    <uses-permission android:name="android.permission.ACCESS_FINE_LOCATION" />

    <application>

        ...

        <!-- Required Activities -->

        <activity android:name="com.unity3d.ads.adunit.AdUnitActivity"
            android:configChanges="fontScale|keyboard|keyboardHidden|locale|mnc|mcc|navigation|orientation|screenLayout|screenSize|smallestScreenSize|uiMode|touchscreen"
            android:hardwareAccelerated="true"
            android:theme="@android:style/Theme.NoTitleBar.Fullscreen" />

        <activity android:name="com.unity3d.ads.adunit.AdUnitTransparentActivity"
            android:configChanges="fontScale|keyboard|keyboardHidden|locale|mnc|mcc|navigation|orientation|screenLayout|screenSize|smallestScreenSize|uiMode|touchscreen"
            android:hardwareAccelerated="true"
            android:theme="@android:style/Theme.Translucent.NoTitleBar.Fullscreen" />

        <activity android:name="com.unity3d.ads.adunit.AdUnitTransparentSoftwareActivity"
            android:configChanges="fontScale|keyboard|keyboardHidden|locale|mnc|mcc|navigation|orientation|screenLayout|screenSize|smallestScreenSize|uiMode|touchscreen"
            android:hardwareAccelerated="false"
            android:theme="@android:style/Theme.Translucent.NoTitleBar.Fullscreen" />

        <activity android:name="com.unity3d.ads.adunit.AdUnitSoftwareActivity"
            android:configChanges="fontScale|keyboard|keyboardHidden|locale|mnc|mcc|navigation|orientation|screenLayout|screenSize|smallestScreenSize|uiMode|touchscreen"
            android:hardwareAccelerated="false"
            android:theme="@android:style/Theme.NoTitleBar.Fullscreen" />

        <activity android:name="com.vungle.publisher.VideoFullScreenAdActivity"
            android:configChanges="keyboardHidden|orientation|screenSize|screenLayout|smallestScreenSize"
            android:theme="@android:style/Theme.NoTitleBar.Fullscreen" />

        <activity android:name="com.vungle.publisher.MraidFullScreenAdActivity"
            android:configChanges="keyboardHidden|orientation|screenSize|screenLayout|smallestScreenSize"
            android:theme="@android:style/Theme.Translucent.NoTitleBar.Fullscreen" />

         <activity android:name="com.vungle.publisher.FlexViewAdActivity"
            android:configChanges="keyboardHidden|orientation|screenSize|screenLayout|smallestScreenSize"
            android:theme="@android:style/Theme.Translucent.NoTitleBar.Fullscreen"/>

        <activity android:name="com.chartboost.sdk.CBImpressionActivity"
            android:configChanges="keyboardHidden|orientation|screenSize"
            android:excludeFromRecents="true"
            android:hardwareAccelerated="true"
            android:theme="@android:style/Theme.Translucent.NoTitleBar.Fullscreen" />

        <activity android:name="com.adcolony.sdk.AdColonyInterstitialActivity"
            android:configChanges="keyboardHidden|orientation|screenSize"
            android:hardwareAccelerated="true" />

        <activity android:name="com.adcolony.sdk.AdColonyAdViewActivity"
            android:configChanges="keyboardHidden|orientation|screenSize"
            android:hardwareAccelerated="true" />

       <activity android:name="com.applovin.adview.AppLovinInterstitialActivity"
            android:configChanges="orientation|screenSize" />

        <activity android:name="com.applovin.adview.AppLovinConfirmationActivity"
            android:configChanges="orientation|screenSize" />
    <application/>

</manifest>
```

### 4. Initialize SDK

Initialize Adsetus SDK in your first Activity.

```Java
import us.adset.sdk.Adsetus;

public class MyActivity extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Adsetus.init(this, "YOUR_APP_ID");	
  }
}
```

### 5. Play an Ad

Simply call the following method.

```Java
if (Adsetus.isAdLoaded()) {
    Adsetus.showAd();
}
```
