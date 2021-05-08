package com.moyu.classdemo.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import com.moyu.classdemo.R;

public class UIActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;


    private static final String[] data = {
            "小猪猪", "小狗狗", "小鸡鸡", "小猫猫", "小咪咪"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_i);
        initAutoView();

    }

    private void initAutoView(){
        autoCompleteTextView=findViewById(R.id.atv_content);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_dropdown_item_1line, data);
        autoCompleteTextView.setAdapter(adapter);
    }
}