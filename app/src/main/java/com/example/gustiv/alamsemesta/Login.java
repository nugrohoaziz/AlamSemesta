package com.example.gustiv.alamsemesta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText edituser, editpass;
    TextView attleft;
    Button login_button, clear_button;
    int counter = 3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setTitle("ALAM SEMESTA");

        //inisialisasi edittext
        edituser = (EditText) findViewById(R.id.edituser);
        editpass = (EditText) findViewById(R.id.editpass);

        login_button = (Button) findViewById(R.id.login_button);
        clear_button = (Button) findViewById(R.id.clear_button);

        //inisialisasi textview
        attleft = (TextView) findViewById(R.id.attleft);


        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (edituser.getText().toString().equals("admin")&& editpass.getText().
                        toString().equals("admin"))
                {
                    Toast.makeText(getApplicationContext(), "LOGIN succsess", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(Login.this, Home.class);
                    i.setFlags(i.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(), "user password incorrect", Toast.LENGTH_SHORT);
                    attleft.setVisibility(View.VISIBLE);
                    counter--;
                    attleft.setText(Integer.toString(counter));

                    if (counter == 0) {
                        finish();
                    }
                }
            }
        });

        //clearbutton
        clear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edituser.setText("");
                editpass.setText("");
            }
        });
    }
}
