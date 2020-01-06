package com.kindest.android.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Button clear, one, two, three, four, five, six, seven, eight, nine, zero, multiply, divide, plus, minus, mod, point, equalOf;
    private String num1, num2;
    private int op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView)findViewById(R.id.display);
        clear = (Button)findViewById(R.id.clear);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        zero = (Button)findViewById(R.id.zero);
        plus = (Button)findViewById(R.id.plus);
        minus = (Button)findViewById(R.id.minus);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        mod = (Button)findViewById(R.id.mod);
        point = (Button)findViewById(R.id.point);
        equalOf= (Button)findViewById(R.id.equals);


        num1 = num2 = "0";

        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = "0";
                displayNum();
            }
        });

        point.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "0.";
                else
                    num1 += ".";
                displayNum();
            }
        });

        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "0";
                else
                    num1 += "0";
                displayNum();
            }
        });

        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "1";
                else
                    num1 += "1";
                displayNum();
            }
        });

        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "2";
                else
                    num1 += "2";
                displayNum();
            }
        });

        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "3";
                else
                    num1 += "3";
                displayNum();
            }
        });

        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "4";
                else
                    num1 += "4";
                displayNum();
            }
        });

        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "5";
                else
                    num1 += "5";
                displayNum();
            }
        });

        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "6";
                else
                    num1 += "6";
                displayNum();
            }
        });

        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "7";
                else
                    num1 += "7";
                displayNum();
            }
        });

        eight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "8";
                else
                    num1 += "8";
                displayNum();
            }
        });

        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (display.getText().equals("0"))
                    num1 = "9";
                else
                    num1 += "9";
                displayNum();
            }
        });

        plus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = 0;
                if (num2.equals("0")){
                    num2 = num1;
                    num1 = "0";
                }
                else{
                    equal();
                    num2 = num1;
                }
                displayNum();
            }
        });

        minus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = 1;
                if (num2.equals("0")){
                    num2 = num1;
                    num1 = "0";
                }
                else{
                    equal();
                    num2 = num1;
                }
                displayNum();
            }
        });

        multiply.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = 2;
                if (num2.equals("0")){
                    num2 = num1;
                    num1 = "0";
                }
                else{
                    equal();
                    num2 = num1;
                }
                displayNum();
            }
        });

        divide.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = 3;
                if (num2.equals("0")){
                    num2 = num1;
                    num1 = "0";
                }
                else{
                    equal();
                    num2 = num1;
                }
                displayNum();
            }
        });

        mod.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                op = 4;
                if (num2.equals("0")){
                    num2 = num1;
                    num1 = "0";
                }
                else{
                    equal();
                    num2 = num1;
                }
                displayNum();
            }
        });

        equalOf.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                equal();
                displayNum();
            }
        });
    }

    void displayNum(){
        display.setText(num1);
    }
    
    void equal(){
        float result = 0;
        try {
            switch (op) {
                case 0:
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    break;
                case 1:
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    break;
                case 2:
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    break;
                case 3:
                    result = Float.parseFloat(num1) / Float.parseFloat(num2);
                    break;
                case 4:
                    result = Float.parseFloat(num1) % Float.parseFloat(num2);
                    break;
                    default:
                        break;
            }
        }catch(Exception e){
            display.setText("Math Error");
        }
        num1 = String.valueOf(result);
    }
}
