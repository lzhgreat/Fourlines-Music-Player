package com.fourlines.fourlinesmusicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv)
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if(null != mTextView){
            start(null);
        }
    }

    @OnClick(R.id.tv)
    public void start(TextView view) {
        Toast.makeText(this,"ahahha",Toast.LENGTH_LONG).show();
    }
}
