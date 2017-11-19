package com.example.nan.h_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.nan.h_app.fragment.MainWalletFragment;


/**
 * Created by Nan on 18/11/2560.
 */

public class Wallet extends AppCompatActivity {
    private TextView textView_wallet;
    private Button btn_subwallet_01;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallet);

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fg_wallet_main, new MainWalletFragment())
                .commit();

        textView_wallet = findViewById(R.id.tv_wallet01);

        String str = getIntent().getExtras().getString("tv");
        textView_wallet.setText(str);
        btn_subwallet_01 = findViewById(R.id.btn_subwallet_01);
        btn_subwallet_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


}

