package com.moyu.classdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.moyu.classdemo.View.ListViewActivity;
import com.moyu.classdemo.View.ProgressActivity;
import com.moyu.classdemo.View.RatingBarActivity;
import com.moyu.classdemo.View.SeekBarActivity;
import com.moyu.classdemo.View.UIActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.open_UI:
                Intent intent=new Intent(this, UIActivity.class);
                startActivity(intent);
                break;
            case R.id.open_Progress:
                Intent intent1=new Intent(this, ProgressActivity.class);
                startActivity(intent1);
                break;
            case R.id.open_seekBar:
                Intent intent2=new Intent(this, SeekBarActivity.class);
                startActivity(intent2);
                break;
            case R.id.open_RatingBar:
                Intent intent3=new Intent(this, RatingBarActivity.class);
                startActivity(intent3);
                break;
                case R.id.open_list:
                Intent intent4=new Intent(this, ListViewActivity.class);
                startActivity(intent4);
                break;

        }

    }


    private void midToast(String str, int showTime)
    {
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.view_toast_custom,
                (ViewGroup) findViewById(R.id.lly_toast));
        ImageView img_logo = (ImageView) view.findViewById(R.id.img_logo);
        TextView tv_msg = (TextView) view.findViewById(R.id.tv_msg);
        tv_msg.setText(str);
        Toast toast = new Toast(this);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }
}