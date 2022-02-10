package com.nehaanand.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CardPage extends AppCompatActivity {

    TextView wish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_page);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("nameT");

        wish=findViewById(R.id.text_view_wish);
        String str="MANY MANY RETURNS OF THE DAY ";
        str=str+" "+name + "! ";
        wish.setText(str);
    }
}