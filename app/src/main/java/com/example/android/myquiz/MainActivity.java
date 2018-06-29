package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import static android.R.id.message;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    TextView tv1,tv2,tv3;
    RadioButton a,b,c,d;
    CheckBox e,f;
    Button bt;
    RadioGroup rg;
    int q,s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.name);
        tv1=(TextView)findViewById(R.id.ques);
        tv2=(TextView)findViewById(R.id.response);
        tv3=(TextView)findViewById(R.id.score);
        rg=(RadioGroup)findViewById(R.id.optionGroup);
        a=(RadioButton)findViewById(R.id.option1);
        b=(RadioButton)findViewById(R.id.option2);
        c=(RadioButton)findViewById(R.id.option3);
        d=(RadioButton)findViewById(R.id.option4);
        bt=(Button)findViewById(R.id.next);
        q=0;
        s=0;

    }
    public void quiz(View v){
        switch (q){
            case 0:
            {
                rg.setVisibility(View.VISIBLE);
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                tv2.setText("");
                tv3.setText("");
                a.setEnabled(true);
                b.setEnabled(true);
                c.setEnabled(true);
                d.setEnabled(true);
                ed1.setEnabled(true);
                bt.setText("Next");
                s=0;

                tv1.setText("1.What is a computer?");
                a.setText("a black macine");
                b.setText("an electronic machine");
                c.setText(" a fan");
                d.setText("a laptop");
                q=1;
                break;
            }
            case 1:
            {
                ed1.setEnabled(false);
                tv1.setText("2.Who is father of microsoft?");
                a.setText("Bill Gates");
                b.setText("Ben");
                c.setText("Sule");
                d.setText("segun");

                if (b.isChecked()){
                    tv2.setText("Right Answer");
                    s=s+10;
                }
                else
                {
                    tv2.setText("Wrong Answer   B was Right Answer");
                }
                q=2;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 2:
            {
                tv1.setText("3.Who is a computer user");
                a.setText("one who plays with computer");
                b.setText("one who dances with computer");
                c.setText("one who sings with computer");
                d.setText("one who uses with computer");
                if (a.isChecked()){
                    s=s+10;
                    tv2.setText("Right Answer");

                }
                else
                {
                    tv2.setText("Wrong Answer   A was Right Answer");
                }
                q=3;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 3:
            {

                tv1.setText("4.Where do we use computer");
                a.setText("home");
                b.setText("farm");
                c.setText("toilet");
                d.setText("kitchen");
                if (d.isChecked()){
                    s=s+10;
                    tv2.setText("Right Answer");
                }
                else
                {
                    tv2.setText("Wrong Answer  D was Right Answer");
                }
                q=4;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                break;
            }
            case 4:
            {
                tv1.setText("5.cpu is part of the computer?");
                a.setText("yes");
                b.setText("no");
                c.setText("I can't tell");
                d.setText("i am not sure");
                if (a.isChecked()){
                    s=s+10;
                    tv2.setText("Right Answer");
                }
                else
                {
                    tv2.setText("Wrong Answer  A was Right Answer");
                }
                q=5;
                a.setChecked(false);
                b.setChecked(false);
                c.setChecked(false);
                d.setChecked(false);
                bt.setText("Finish");
                break;
            }
            case 5:
            {
                a.setEnabled(false);
                b.setEnabled(false);
                c.setEnabled(false);
                d.setEnabled(false);
                if (a.isChecked()){
                    s=s+10;
                    tv2.setText("Right Answer");
                }
                else
                {
                    tv2.setText("Wrong Answer  A was Right Answer");
                }
                tv3.setText(ed1.getText()+"'s final score is "+s);
                bt.setText("Restart");
                q=0;
                break;
            }
        }
    }
}