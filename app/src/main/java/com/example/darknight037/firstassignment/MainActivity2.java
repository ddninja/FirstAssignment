package com.example.darknight037.firstassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView t1,t2,r1,r2,r3,r4;
    private EditText e1,e2;
    private Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById((R.id.editText2));
        but=(Button)findViewById(R.id.button);
        r1=(TextView)findViewById(R.id.textView5);
        r2=(TextView)findViewById(R.id.textView6);
        r3=(TextView)findViewById(R.id.textView4);
        r4=(TextView)findViewById(R.id.textView3);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                r1.setText(s1);
                r2.setText(s2);
                r1.setVisibility(View.VISIBLE);
                r2.setVisibility(View.VISIBLE);
                r3.setVisibility(View.VISIBLE);
                r4.setVisibility(View.VISIBLE);
            }
        });

    }
}
