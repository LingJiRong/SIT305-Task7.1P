package com.example.lostfoundapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.AppCompatActivity;

public class AddItemActivity extends AppCompatActivity {

    RadioGroup postTypeGroup;
    RadioButton lostRadio, foundRadio;
    EditText nameInput, phoneInput, descriptionInput, dateInput, locationInput;
    Button saveButton;
    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        postTypeGroup = findViewById(R.id.postTypeGroup);
        lostRadio = findViewById(R.id.radioLost);
        foundRadio = findViewById(R.id.radioFound);
        nameInput = findViewById(R.id.nameInput);
        phoneInput = findViewById(R.id.phoneInput);
        descriptionInput = findViewById(R.id.descriptionInput);
        dateInput = findViewById(R.id.dateInput);
        locationInput = findViewById(R.id.locationInput);
        saveButton = findViewById(R.id.saveButton);
        db = new DatabaseHelper(this);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String type = lostRadio.isChecked() ? "Lost" : "Found";
                String name = nameInput.getText().toString();
                String phone = phoneInput.getText().toString();
                String description = descriptionInput.getText().toString();
                String date = dateInput.getText().toString();
                String location = locationInput.getText().toString();

                db.insertItem(type, name, phone, description, date, location);
                finish();
            }
        });
    }
}