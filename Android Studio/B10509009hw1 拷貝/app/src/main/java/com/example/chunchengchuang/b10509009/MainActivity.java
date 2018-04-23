package com.example.chunchengchuang.b10509009;


import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /* Fields that will store our EditText and Button */
    public EditText mNameEntry;
    private Button mDoSomethingCoolButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Using findViewById, we get a reference to our Button from xml. This allows us to
         * do things like set the onClickListener which determines what happens when the button
         * is clicked.
         */
        mDoSomethingCoolButton = (Button) findViewById(R.id.button);
        mNameEntry = (EditText) findViewById(R.id.editText);
        //String string=this.mNameEntry.getText();

        /* Setting an OnClickListener allows us to do something when this button is clicked. */
        mDoSomethingCoolButton.setOnClickListener(new OnClickListener() {

            /**
             * The onClick method is triggered when this button (mDoSomethingCoolButton) is clicked.
             *
             * @param v The view that is clicked. In this case, it's mDoSomethingCoolButton.
             */
            @Override
            public void onClick(View v) {
                /*
                 * Storing the Context in a variable in this case is redundant since we could have
                 * just used "this" or "MainActivity.this" in the method call below. However, we
                 * wanted to demonstrate what parameter we were using "MainActivity.this" for as
                 * clear as possible.
                 */
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,ChildActivity.class);
                Context context = MainActivity.this;
                EditText mNameEntry=(EditText)findViewById(R.id.editText);
                Bundle bundle=new Bundle();
                bundle.putString("text",mNameEntry.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
                // COMPLETED (1) Store ChildActivity.class in a Class object called destinationActivity
                /* This is the class that we want to start (and open) when the button is clicked. */
                //Class destinationActivity = ChildActivity.class;

                // COMPLETED (2) Create an Intent to start ChildActivity
                /*
                 * Here, we create the Intent that will start the Activity we specified above in
                 * the destinationActivity variable. The constructor for an Intent also requires a
                 * context, which we stored in the variable named "context".
                 */
                //Intent startChildActivityIntent = new Intent(context, destinationActivity);

                // COMPLETED (3) Replace the Toast with code to start ChildActivity
                /*
                 * Once the Intent has been created, we can use Activity's method, "startActivity"
                 * to start the ChildActivity.
                 */
                //startActivity(startChildActivityIntent);
               // MainActivity.this.finish();
            }
        });
    }
}