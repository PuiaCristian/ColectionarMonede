package com.example.puya_.colectionarmonede;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    MyDatabase d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);





        
        Button logIn = (Button) findViewById(R.id.logIn_logIn_btn);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
//                EditText user = (EditText) findViewById(R.id.user_logIn_editView);
//                String _user = user.getText().toString();
//                EditText password = (EditText) findViewById(R.id.password_logIn_editText);
//                String _password = password.getText().toString();
//
//                if(_user.isEmpty() || _password.isEmpty()){
//                    Toast.makeText(LogIn.this, "Nu ati completate corespunzator!", Toast.LENGTH_SHORT).show();
//                }
//
//
////               if(d.validare(_user,_password)){
////                   Intent i = new Intent(getApplicationContext(),MeniuPrincipal.class);
////                   startActivity(i);
////               }
//
//                String uuu = d.getUserData(_user);
//                String ppp = d.getPasswordData(_password);

                Intent i = new Intent(getApplicationContext(),MeniuPrincipal.class);
                startActivity(i);




            }
        });
        
        
        Button signUp = (Button) findViewById(R.id.signUp_logIn_btn);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SignUp.class);
                startActivity(i);
            }
        });
    }
}
