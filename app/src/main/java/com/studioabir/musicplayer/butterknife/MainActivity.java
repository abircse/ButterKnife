package com.studioabir.musicplayer.butterknife;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    ///-----Bind Text View-----//
    @BindView(R.id.mytext)
    TextView MYTEXT;
    ///------Bind Button-------//
    @BindView(R.id.myButton)
    Button myButton;
    ///-------Bind Drawable-----///
    @BindDrawable(R.drawable.back)
    Drawable appbackgroud;

    ///-----Bind Layout----///
    @BindView(R.id.lnback)
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //-----Must need this line to initialize Butterknife-----//
        ButterKnife.bind(this);

        MYTEXT.setText("NAYEEM SHIDDIKI ABIR");
        layout.setBackground(appbackgroud);



    }

    ///
    @OnClick(R.id.myButton)
    public void MYBTNCLICK() {
        Toast.makeText(getApplicationContext(), "Clicked on BUtton", Toast.LENGTH_SHORT).show();
    }

    ///------Follow Official Document for learn-----/
    //www.jakewharton.github.io/butterknife/

}
