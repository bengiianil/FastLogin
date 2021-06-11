package com.bengianil.fastlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        URI serviceURL = URI.create("https://bireysel.turkcell.com.tr/fastloginResult");
        DGLoginCoordinator dg = new DGLoginCoordinator.Builder()
                .appID(12345)
                .language("TR")
                .serviceRedirectUrl(serviceURL)
                .disableCellLogin(false)
                .autoLoginOnly(false)
                .disableAutoLogin(false)
                .state("123456")
                .build();


    }

}
