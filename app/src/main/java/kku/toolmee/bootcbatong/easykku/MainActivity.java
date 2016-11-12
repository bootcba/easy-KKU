package kku.toolmee.bootcbatong.easykku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ActionMenuItemView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

     //ประกาศตัวแปล
    private Button signInButton, SignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Bind Widger
        signInButton = (Button) findViewById(R.id.button);
        signInButton = (Button) findViewById(R.id.button2);
         //Sign up Controler
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUpActivity.class));
            }
        });



    } //main method
} //main class
