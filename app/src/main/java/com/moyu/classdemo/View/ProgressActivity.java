package com.moyu.classdemo.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.moyu.classdemo.R;

public class ProgressActivity extends AppCompatActivity {

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        progressBar=findViewById(R.id.progress_4);
        CirclePgBar circlePgBar=new CirclePgBar(this);
    }

    public void onClick(View view){
        progressBar.setProgress(progressBar.getProgress()+5);
    }
}