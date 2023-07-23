package com.example.kakaologinsample;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class KakaoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        KakaoSdk.init(this, "26b2ae8909742bf625fa30afadfe89ee");
    }
}
