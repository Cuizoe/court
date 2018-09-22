package com.example.administrator.courtcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView A;
    int a;
    TextView B;
    int b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A=(TextView)findViewById(R.id.textView2);
        B=(TextView)findViewById(R.id.textView4);
    }
    public void count1(View s){
        a=Integer.parseInt(A.getText().toString());
        a=a+3;
        A.setText(a+"");
    }

    public void count2(View b){
        a=Integer.parseInt(A.getText().toString());
        a=a+2;
        A.setText(a+"");
    }

    public void count3(View c){
        a=Integer.parseInt(A.getText().toString());
        a=a+1;
        A.setText(a+"");
    }

    public void count4(View d){
        b=Integer.parseInt(B.getText().toString());
        b=b+3;
        B.setText(b+"");
    }

    public void count5(View e){
        b=Integer.parseInt(B.getText().toString());
        b=b+2;
        B.setText(b+"");
    }

    public void count6(View f){
        b=Integer.parseInt(B.getText().toString());
        b=b+1;
        B.setText(b+"");
    }

    public void count7(View g){
        A.setText(0+"");
        B.setText(0+"");
    }
}
