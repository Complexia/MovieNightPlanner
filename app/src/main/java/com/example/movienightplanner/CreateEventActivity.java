package com.example.movienightplanner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateEventActivity extends AppCompatActivity {

    private Button next;
    private EditText event_name_box;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
        event_name_box = findViewById(R.id.event_name_box);
        final String vhs = event_name_box.getText().toString(); //Name for the event
        next = findViewById(R.id.event_name_next_button);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateEventActivity.this, SelectStartDateActivity.class);
                intent.putExtra("eventName",vhs);
                startActivity(intent);
            }
        });

    }
}
