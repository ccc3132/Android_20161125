package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    LinearLayout layout2;
    RadioButton Dog;
    RadioButton Cat;
    RadioButton Rabbit;
    RadioGroup radioGroup;
    ImageView iDog;
    Switch check;
    Button button1;
    Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    void init(){
        check = (Switch) findViewById(R.id.switch1);
        layout2 = (LinearLayout) findViewById(R.id.layout2);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        Dog = (RadioButton)findViewById(R.id.Radiodog);
        Cat = (RadioButton)findViewById(R.id.Radiocat);
        Rabbit = (RadioButton)findViewById(R.id.Radiorabbit);
        iDog = (ImageView)findViewById(R.id.imageView);

        button1 = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);



        layout2.setVisibility(View.GONE);


        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView,boolean isChecked){

                if(isChecked)
                    layout2.setVisibility(View.VISIBLE);

                else
                    layout2.setVisibility(View.GONE);
            }
        });

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                {
                    if(Dog.isChecked())
                    {
                        iDog.setImageResource(R.drawable.jelly);

                    }
                    else if(Cat.isChecked())
                    {
                        iDog.setImageResource(R.drawable.kitkat);

                    }
                    else if(Rabbit.isChecked())
                    {
                        iDog.setImageResource(R.drawable.rolipop);
                    }
                }
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                return;
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                System.exit(0);
            }
        });


    }
}
