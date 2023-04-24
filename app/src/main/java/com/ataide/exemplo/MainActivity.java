package com.ataide.exemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ataide.exemplo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;

    static final String USERNAMECONSTANTE = "user";
    static final String PASSWORDCONSTANTE = "5432A";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        mainBinding.entrarBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        String username = mainBinding.userED.getText().toString();
                        String password = mainBinding.passED.getText().toString();

                        if ( username.equals(USERNAMECONSTANTE) && password.equals(PASSWORDCONSTANTE) ){
                            Toast.makeText(MainActivity.this, "worked", Toast.LENGTH_LONG).show();
                            Intent i = new Intent(view.getContext(), Home.class);
                            i.putExtra("user", username);
                            i.putExtra("pass", password);
                            startActivity(i);

                        }else {
                            Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

    }
}