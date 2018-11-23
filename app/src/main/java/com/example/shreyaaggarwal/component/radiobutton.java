package com.example.shreyaaggarwal.component;

/**
 * Created by shreya Aggarwal on 26-Feb-18.
 */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class radiobutton extends AppCompatActivity {
    TextView t;
    RadioButton r1,r2;
    Button b1;String gender ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton_radiogroup);
        r1=findViewById(R.id.radio1);
        r2=findViewById(R.id.radio2);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked()){
                    gender=r1.getText().toString();
                    Toast.makeText(radiobutton.this, "hello" +gender+ "sir", Toast.LENGTH_SHORT).show();
                }
                else{
                 gender=r2.getText().toString();
                    Toast.makeText(radiobutton.this, "hello" + gender+ "mam", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
