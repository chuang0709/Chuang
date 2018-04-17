package com.example.chunchengchuang.b10509009;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    /* Field to store our TextView */
    private TextView mDisplayText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Bundle bundle1=this.getIntent().getExtras();
        String text=bundle1.getString("text");
        text="B10509009"+text;
        /* Typical usage of findViewById... */
        mDisplayText = (TextView) findViewById(R.id.textView);



        mDisplayText.setText(text);

    }
}
