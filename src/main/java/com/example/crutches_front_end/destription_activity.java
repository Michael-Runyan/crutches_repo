package com.example.crutches_front_end;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import org.json.JSONObject;

import android.view.View;
import android.widget.TextView;

public class destription_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destription);

        String test_string = (String) "Tester String";
        TextView textElement;
        TextView newtext = (TextView) findViewById(R.id.title_test);
        newtext.setText("I Love You!");
//        String test_des;
//        JSONObject json_temp = new JSONObject();
//        json_temp
//
    }
    public void Move_To_Review_Activity(View v){
        Intent i = new Intent(this,review_activity.class);
        startActivity(i);

    }

}
