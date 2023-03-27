package com.example.studentregister;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private User newUser = null;
    private EditText textInput;
    private EditText textInput2;
    private EditText textInput3;
    private TextView textOutput;
    private TextView textOutput2;
    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textInput=findViewById(R.id.editTextInput);
        textInput2=findViewById(R.id.editSecondText);
        textInput3=findViewById(R.id.editSecondText2);
        textOutput=findViewById(R.id.textViewOutput);
        textOutput2=findViewById(R.id.textViewOutput2);

        radioGroup = findViewById(R.id.radioGroup);
    }

    public void addUser(View view){
        userStorage s = userStorage.getInstance();
        int radioID=radioGroup.getCheckedRadioButtonId();
        radioButton=findViewById(radioID);String firstName= textInput.getText().toString(); // FIRST NAME
        String lastName= textInput2.getText().toString(); // SUR NAME
        String degreeProgram= String.valueOf(radioButton.getText()); // EDUCATION
        String email=textInput3.getText().toString(); // EMAIL
        userStorage.getInstance().addUser(new User(firstName,lastName,email,degreeProgram));
    }

    public void listUsers(View view) {
        String boxText = String.valueOf(userStorage.listStudents());
        textOutput2.setText(boxText);
    }
}