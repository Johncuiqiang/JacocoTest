package com.wuba.jacocodemo;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.util.List;

import jaygoo.jacocohelper.JacocoHelper;


public class MainActivity extends AppCompatActivity {

    private View mBtnTest;
    private static final String PROJECT_PATH = "/Users/cuiqiang/developer/demo/JacocoDemo/app" +
            "/build/outputs/code-coverage/";
    private View mBtnGenerate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        JacocoHelper.init(PROJECT_PATH,true);
        mBtnTest = findViewById(R.id.btn_test);
        mBtnGenerate = findViewById(R.id.btn_generate);
        Test test = new Test();
        test.onTest();
        initTest1();
    }

    private void initData() {
        mBtnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("1111","测试按钮");
            }
        });
        mBtnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  JacocoHelper.generateEcFile(true);
            }
        });
    }


    private void initTest1(){
        Test2 test = new Test2();
        test.onTest();
    }

    private void initTest2(){
        Test2 test = new Test2();
        test.onTest();
    }


}
