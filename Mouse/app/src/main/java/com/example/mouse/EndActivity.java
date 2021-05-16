package com.example.mouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EndActivity extends AppCompatActivity {

    private TextView tv_score;
    private TextView tv_title;

    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        initView();
    }

    private void initView() {
        tv_score = findViewById(R.id.tv_score);
        tv_title = findViewById(R.id.tv_title);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int score = bundle.getInt("score",0);

        if(score > 0 && score <=10) str = "小白一个";
        if(score > 10 && score <=20) str = "新手玩家";
        if(score > 20) str = "地鼠杀手";

        tv_score.setText("你打了" + score + "只地鼠");
        tv_title.setText( str );
    }


}