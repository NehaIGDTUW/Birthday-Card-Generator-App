package com.nehaanand.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button cardgenerator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cardgenerator = findViewById(R.id.button_card);
        name = findViewById(R.id.edit_text_name);
        cardgenerator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cardpageIntent = new Intent(MainActivity.this, CardPage.class);
                cardpageIntent.putExtra("nameT", name.getText().toString());
                startActivity(cardpageIntent);
            }
        });
    }
}