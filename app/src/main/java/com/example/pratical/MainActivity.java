package com.example.pratical;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private  int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount =(TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast= Toast.makeText(this,R.string.toast_message,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        ++mCount;
        if(mShowCount !=null) {
            mShowCount.setText(Integer.toString(mCount));
            number=mCount %2;
            if (number ==0){
                view.setBackgroundColor(Color.GREEN);
            }
            else
                view.setBackgroundColor(Color.RED);
            findViewById(R.id.button_zero).setBackgroundColor(Color.MAGENTA);
        }
    }

    public void countZero(View view) {
        mCount=0;
        mShowCount.setText(Integer.toString(mCount));
        findViewById(R.id.button_zero).setBackgroundColor(Color.GRAY);
    }
}