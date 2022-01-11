package com.example.cmse419_lab9_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    ImageView im;
    Button Bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();
        im = findViewById(R.id.imageView);
        Bt = findViewById(R.id.button);

        String races = (String)
                bundle.getString("race");
        switch (races) {
            case "Altmer":
                im.setImageResource(R.drawable.altmer);
                break;
            case "Argonian":
                im.setImageResource(R.drawable.argonian);
                break;
            case "Bosmer":
                im.setImageResource(R.drawable.bosmer);
                break;
            case "Breton":
                im.setImageResource(R.drawable.breton);
                break;
            case "Dunmer":
                im.setImageResource(R.drawable.dunmer);
                break;
            case "Imperial":
                im.setImageResource(R.drawable.imperial);
                break;
            case "Khajiit":
                im.setImageResource(R.drawable.khajiit);
                break;
            case "Nord":
                im.setImageResource(R.drawable.nord);
                break;
            case "Orsimer":
                im.setImageResource(R.drawable.orsimer);
                break;
            case "Redguard":
                im.setImageResource(R.drawable.redguard);
                break;
        }

        final Intent intent = new Intent(Main2Activity.this, MainActivity.class);
        Bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}
