package com.moyu.classdemo.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;

import com.moyu.classdemo.R;

public class RatingBarActivity extends AppCompatActivity {

    private RatingBar rb_normal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);
        rb_normal =findViewById(R.id.rb_normal);
        rb_normal.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//                Toast.makeText(RatingBarActivity.this, "rating:" + String.valueOf(rating),
//                        Toast.LENGTH_LONG).show();
                Toast.makeText(RatingBarActivity.this,"你好呀",Toast.LENGTH_SHORT).show();
            }
        });
    }
}