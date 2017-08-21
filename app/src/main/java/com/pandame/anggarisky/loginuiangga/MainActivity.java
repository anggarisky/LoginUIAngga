package com.pandame.anggarisky.loginuiangga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.et_username);
        password = (EditText)findViewById(R.id.et_password);
        btn_login = (Button)findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // return value true
                // !validate is return value false
                if(validate())
                {
                    Intent i = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(i);
                }
            }
        });


    }

    private boolean validate()
    {
        if((username.getText().toString().equals("anggarisky")) && ((password.getText().toString().equals("youtube"))) )
        {
            return true;
        }

        Toast.makeText(MainActivity.this, "Your Username and Password is not valid", Toast.LENGTH_SHORT).show();
        return false;
    }

}
