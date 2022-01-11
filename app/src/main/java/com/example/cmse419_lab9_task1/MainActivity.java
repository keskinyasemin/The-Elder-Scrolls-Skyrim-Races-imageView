package com.example.cmse419_lab9_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView Gv;
    static final String[] races = new String[]{ "Altmer","Argonian","Bosmer","Breton",
                                                "Dunmer","Imperial","Khajiit","Nord",
                                                "Orsimer","Redguard"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gv = findViewById(R.id.gridView1);

        final Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, races);
        Gv.setAdapter(adapter);
        Gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v,int position, long id) {
                Toast.makeText(getApplicationContext(),((TextView) v).getText(), Toast.LENGTH_SHORT).show();
                intent.putExtra("race", ((TextView) v).getText());

                startActivity(intent); // start Intent
            }
        });
    }
}