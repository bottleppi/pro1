package com.example.my0714;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text1;
    CheckBox ch1;
    RadioGroup rag1;
    RadioButton ra1, ra2, ra3;
    Button btn1;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        ch1 = findViewById(R.id.ch1);
        text1 = findViewById(R.id.text1);
        rag1 = findViewById(R.id.rag1);
        ra1 = findViewById(R.id.ra1);
        ra2 = findViewById(R.id.ra2);
        ra3 = findViewById(R.id.ra3);
        btn1 = findViewById(R.id.btn1);
        img1 = findViewById(R.id.img1);

        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            public void onCheckedChanged(CompoundButton buttonView, boolean isCheked){
                if (ch1.isChecked() == true){
                    text1.setVisibility(android.view.View.VISIBLE);
                    rag1.setVisibility(android.view.View.VISIBLE);
                    btn1.setVisibility(android.view.View.VISIBLE);
                    img1.setVisibility(android.view.View.VISIBLE);
                }else{
                    text1.setVisibility(android.view.View.INVISIBLE);
                    rag1.setVisibility(android.view.View.INVISIBLE);
                    btn1.setVisibility(android.view.View.INVISIBLE);
                    img1.setVisibility(android.view.View.INVISIBLE);
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(rag1.getCheckedRadioButtonId()){
                    case R.id.ra1:
                        img1.setImageResource(R.drawable.cat);
                        break;
                    case R.id.ra2:
                        img1.setImageResource(R.drawable.ra);
                        break;
                    case R.id.ra3:
                        img1.setImageResource(R.drawable.go);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "동물 면저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

}