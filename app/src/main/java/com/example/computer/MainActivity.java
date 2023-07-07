package com.example.computer;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Stack;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Stack;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    static String data = "";
    static double a = 0;

    static double sum = 0;

    static String data1 ="";

    static String data2 ="";

    private EditText editText;

    private EditText editText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = (EditText) findViewById(R.id.edit1);
        editText = (EditText) findViewById(R.id.edit);
        String inputnext = editText.getText().toString();
        int[] buttons = {R.id.button00,R.id.button1,R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,
                R.id.button7,R.id.button8,R.id.button9,R.id.button10,R.id.button11,R.id.button12,R.id.button13,
                R.id.button14,R.id.button15,R.id.button16,R.id.button17,R.id.button18,R.id.button19,R.id.buttontran,
                R.id.sin,R.id.cos,R.id.dx};
        for(int i=0;i<buttons.length;i++)
        {
            int id = buttons[i];
            Button button = (Button) findViewById(id);
            button.setOnClickListener(this);
        }
        Log.d("msg", data);
    }

    public void onClick(View v)
    {
        if(v.getId() == R.id.button00)
        {
            if(data1=="")
            {
                data1+="√";
            }
            else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^')
            {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }

        }
        else if(v.getId() == R.id.button1)
        {
            data+="1";
            data1+="1";

        }
        else if(v.getId() == R.id.button2)
        {
            data+="4";
            data1+="4";

        }
        else if(v.getId() == R.id.button3)
        {
            data+="7";
            data1+="7";

        }
        else if(v.getId() == R.id.button4)
        {
            data="";
            data1="";
        }
        else if(v.getId() == R.id.button5)
        {
            data+="0";
            data1+="0";

        }
        else if(v.getId() == R.id.button6)
        {
            data+="2";
            data1+="2";

        }
        else if(v.getId() == R.id.button7)
        {
            data+="5";
            data1+="5";

        }
        else if(v.getId() == R.id.button8)
        {
            data+="8";
            data1+="8";



        }
        else if(v.getId() == R.id.button9)
        {
            if(data1=="")
            {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }
            else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^')
            {
                data1+="%";
            }
            else {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }

        }
        else if(v.getId() == R.id.button10)
        {
            if(data1=="")
            {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }
            else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^')
            {
                data+=".";
                data1+=".";
            }
            else {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }


        }
        else if(v.getId() == R.id.button11)
        {
            data+="3";
            data1+="3";

        }
        else if(v.getId() == R.id.button12)
        {
            data+= "6";
            data1+="6";

        }
        else if(v.getId() == R.id.button13)
        {
            data+= "9";
            data1+="9";

        }
        else if(v.getId() == R.id.button14)
        {
            if(data1=="")
            {
                Toast.makeText(MainActivity.this,"输入为空无法删除!",Toast.LENGTH_SHORT).show();
            }
            else {
                data1=data1.substring(0,data1.length()-1);
                if(!data.isEmpty())
                {
                    data=data.substring(0,data.length()-1);
                }

            }

        }
        else if(v.getId() == R.id.button15)
        {
           if(!data.isEmpty())
           {
               if(data1.indexOf("+")!=-1) {
                   a = Double.parseDouble(data) + Double.parseDouble(data2);
                   sum = a;
                   data = "";
               }
               else if(data1.indexOf("-")!=-1)
               {
                   a = Double.parseDouble(data2) - Double.parseDouble(data);
                   sum = a;
                   data = "";
               }
               else if(data1.indexOf("*")!=-1)
               {
                   a = Double.parseDouble(data) * Double.parseDouble(data2);
                   sum = a;
                   data = "";
               }
               else if(data1.indexOf("/")!=-1)
               {
                   if(Double.parseDouble(data)!=0)
                   {
                       a = Double.parseDouble(data2) / Double.parseDouble(data);
                       sum = a;
                       data = "";
                   }
                   else{
                       Toast.makeText(MainActivity.this,"除数不能为0请重新输入!",Toast.LENGTH_SHORT).show();
                   }

               }
               else if(data1.indexOf("√")!=-1)
               {
                       a = sqrt(Double.parseDouble(data));
                       sum = a;
                       data = "";
               }


               else if(data1.indexOf("%")!=-1)
               {
                   a = Double.parseDouble(data)/100;
                   sum = a;
                   data = "";
               }

               else if(data1.indexOf("sin")!=-1)
               {
                   a = sin(Math.toRadians(Double.parseDouble(data)));
                   sum = a;
                   data = "";
               }

               else if(data1.indexOf("cos")!=-1)
               {
                   a = cos(Math.toRadians(Double.parseDouble(data)));
                   sum = a;
                   data = "";
               }

               else if(data1.indexOf("^")!=-1)
               {
                   a = Double.parseDouble(data2);
                   for(int i =1;i<Double.parseDouble(data);i++)
                   {
                       a*=Double.parseDouble(data2);
                   }
                   sum = a;
                   data = "";
               }
           }
        }
        else if(v.getId() == R.id.button16)
        {
            if(data1=="")
            {
                data2 = data;
                data="";
                data1+="+";
            }
            else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^')
            {
                data2 = data;
                data="";
                data1+="+";
            }
            else {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }

        }
        else if(v.getId() == R.id.button17)
        {
            if(data1=="")
            {
                data2 = data;
                data+="-";
                data1+="-";
            }
            else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^')
            {
                data2 = data;
                data="";
                data1+="-";
            }
            else {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }

        }
        else if(v.getId() == R.id.button18)
        {
            if(data1=="")
            {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }
            else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^'){
                data2 = data;
                data="";
                data1+="*";
            }
            else {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }

        }
        else if(v.getId() == R.id.button19)
        {
            if(data1=="")
            {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }
            else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^')
            {
                data2 = data;
                data="";
                data1+="/";
            }
            else {
                Toast.makeText(MainActivity.this,"输入错误!请重新输入!",Toast.LENGTH_SHORT).show();
            }
        }
        else if(v.getId()==R.id.buttontran)
        {
            if(data1=="")
            {
                Toast.makeText(MainActivity.this,"请输入!",Toast.LENGTH_SHORT).show();
            }
            else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^')
            {
                if(data1.charAt(0)=='-')
                {
                    data1 = data1.substring(1, data1.length());
                }
                else
                {
                    data1 = "-" + data1;
                }
            }
        }

        else if(v.getId()==R.id.sin) {
            if (data1 == "") {
                data1 += "sin";
            } else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^')
            {
                data1+="^";
                data2 = data;
                data ="";
            }
        }

        else if(v.getId()==R.id.cos) {
            if (data1 == "") {
                data1 += "cos";
            } else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^')
            {
                data1+="^";
                data2 = data;
                data ="";
            }
        }

        else if(v.getId()==R.id.dx) {
            if (data1 == "") {
                Toast.makeText(MainActivity.this,"请输入数字!",Toast.LENGTH_SHORT).show();
            } else if(data1.charAt(data1.length()-1)!='+' && data1.charAt(data1.length()-1)!='-' && data1.charAt(data1.length()-1)!='*'
                    && data1.charAt(data1.length()-1)!='/' && data1.charAt(data1.length()-1)!='.'
                    && data1.charAt(data1.length()-1)!='%'&& data1.charAt(data1.length()-1)!='√'
                    && data1.charAt(data1.length()-1)!='n' && data1.charAt(data1.length()-1)!='s' &&
                    data1.charAt(data1.length()-1)!='^')
            {
                data1+="^";
                data2 = data;
                data ="";
            }
        }

        editText1.setText(data1);
        editText.setText(sum+"");

    }

}