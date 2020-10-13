package com.example.latihanintentanpadata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnMoveactivity, btnMoveDua, btnWithData, btnDial, btnWebView, btnTiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveactivity = findViewById(R.id.btn_move);
        btnMoveactivity.setOnClickListener(this);

        btnMoveDua = findViewById(R.id.btn_move_dua);
        btnMoveDua.setOnClickListener(this);

        btnWithData = findViewById(R.id.btn_with_data);
        btnWithData.setOnClickListener(this);

        btnDial = findViewById(R.id.btn_dial);
        btnDial.setOnClickListener(this);

        btnWebView = findViewById(R.id.btn_webview);
        btnWebView.setOnClickListener(this);
        btnTiga = findViewById(R.id.btn_tiga);
        btnTiga.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move:
                Intent moveIntent = new Intent(MainActivity.this,PindahActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_dua:
                Intent moveintent2 = new Intent(MainActivity.this,PindahDuaACtivity.class);
                startActivity(moveintent2);
                break;
            case R.id.btn_with_data:
                Intent moveIntenWithData = new Intent(MainActivity.this,MoveWithData.class);
                moveIntenWithData.putExtra(MoveWithData.EXTRA_NAME,"DAMAS MAHARDI");
                moveIntenWithData.putExtra(MoveWithData.EXTRA_AGE,5);
                startActivity(moveIntenWithData);
                break;
            case R.id.btn_dial:
                String phoneNumber = "082126994964";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;

            case R.id.btn_tiga:
                Intent btnIntentTiga = new Intent(MainActivity.this, PindahDuaACtivity.class);
                startActivity(btnIntentTiga);
                break;

            case R.id.btn_webview:
                Intent intenWebview = new Intent(MainActivity.this, WebActivityView.class);
                startActivity(intenWebview);
                break;

        }

    }
}