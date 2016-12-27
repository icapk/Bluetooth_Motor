package com.icapk.bluetooth;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btn_1_1;
    private Button btn_1_2;
    private Button btn_1_3;
    private Button btn_1_4;
    private Button btn_2_1;
    private Button btn_2_2;
    private Button btn_2_3;
    private Button btn_2_4;
    private Button btn_3_1;
    private Button btn_3_2;
    private Button btn_3_3;
    private Button btn_3_4;
    private Button btn_4_1;
    private Button btn_4_2;
    private Button btn_4_3;
    private Button btn_4_4;
    private Switch switch_1;
    private Switch switch_2;
    private Button link_bl;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1_1 = (Button)findViewById(R.id.btn_1_1);
        btn_1_2 = (Button)findViewById(R.id.btn_1_2);
        btn_1_3 = (Button)findViewById(R.id.btn_1_3);
        btn_1_4 = (Button)findViewById(R.id.btn_1_4);
        btn_2_1 = (Button)findViewById(R.id.btn_2_1);
        btn_2_2 = (Button)findViewById(R.id.btn_2_2);
        btn_2_3 = (Button)findViewById(R.id.btn_2_3);
        btn_2_4 = (Button)findViewById(R.id.btn_2_4);
        btn_3_1 = (Button)findViewById(R.id.btn_3_1);
        btn_3_2 = (Button)findViewById(R.id.btn_3_2);
        btn_3_3 = (Button)findViewById(R.id.btn_3_3);
        btn_3_4 = (Button)findViewById(R.id.btn_3_4);
        btn_4_1 = (Button)findViewById(R.id.btn_4_1);
        btn_4_2 = (Button)findViewById(R.id.btn_4_2);
        btn_4_3 = (Button)findViewById(R.id.btn_4_3);
        btn_4_4 = (Button)findViewById(R.id.btn_4_4);
        link_bl = (Button)findViewById(R.id.link_bl);

        switch_1 = (Switch)findViewById(R.id.switch_1);
        switch_2 = (Switch)findViewById(R.id.switch_2);

        link_bl.setOnClickListener(this);
        btn_1_1.setOnClickListener(this);
        btn_1_2.setOnClickListener(this);
        btn_1_3.setOnClickListener(this);
        btn_1_4.setOnClickListener(this);
        btn_2_1.setOnClickListener(this);
        btn_2_2.setOnClickListener(this);
        btn_2_3.setOnClickListener(this);
        btn_2_4.setOnClickListener(this);
        btn_3_1.setOnClickListener(this);
        btn_3_2.setOnClickListener(this);
        btn_3_3.setOnClickListener(this);
        btn_3_4.setOnClickListener(this);
        btn_4_1.setOnClickListener(this);
        btn_4_2.setOnClickListener(this);
        btn_4_3.setOnClickListener(this);
        btn_4_4.setOnClickListener(this);
    }

    /**
     * 开关 abcd
     * @param view
     */
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.link_bl:

                break;
            case R.id.btn_1_1:
//                e
                break;
            case R.id.btn_1_2:
//                f
                break;
            case R.id.btn_1_3:
//              g
                break;
            case R.id.btn_1_4:
//                h
                break;
            case R.id.btn_2_1:
//                  i
                break;
            case R.id.btn_2_2:
//                  j
                break;
            case R.id.btn_2_3:
//                 k
                break;
            case R.id.btn_2_4:
//                l
                break;
            case R.id.btn_3_1:
//                m
                break;
            case R.id.btn_3_2:
//                n
                break;
            case R.id.btn_3_3:
//                o
                break;
            case R.id.btn_3_4:
//                p
                break;
            case R.id.btn_4_1:
//                q
                break;
            case R.id.btn_4_2:
//                r
                break;
            case R.id.btn_4_3:
//                s
                break;
            case R.id.btn_4_4:
//                t
                break;


        }


    }
}
