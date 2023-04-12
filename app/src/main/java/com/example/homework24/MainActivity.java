package com.example.homework24;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText IdIn;
    private EditText timeOtIn;
    private EditText timePribIn;
    private EditText priceIn;
    private EditText placeOtIn;
    private EditText placePribIn;
    private Button button;

    private String id;
    private String placePrib;
    private String placeOt;
    private String timeOt;
    private String timePrib;
    private String price;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IdIn = findViewById(R.id.IdIn);
        placeOtIn = findViewById(R.id.placeOtIn);
        placePribIn = findViewById(R.id.placePribIn);
        timeOtIn = findViewById(R.id.timeOtIn);
        timePribIn = findViewById(R.id.timePribIn);
        priceIn = findViewById(R.id.priceIn);

        button = findViewById(R.id.button);
        button.setOnClickListener(listener);
    }


    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            id = IdIn.getText().toString();
            placeOt = placeOtIn.getText().toString();
            placePrib = placePribIn.getText().toString();
            timeOt = timeOtIn.getText().toString();
            timePrib = timePribIn.getText().toString();
            price = priceIn.getText().toString();


            User user = new User(id, placeOt, placePrib, timeOt, timePrib, price);


            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);


            intent.putExtra(User.class.getSimpleName(), user); // User.class.getSimpleName() является ключом для запаковки в контейнер


            startActivity(intent);
        }
    };
}