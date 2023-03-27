package com.example.studentregister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class listActivity extends AppCompatActivity {

    private userStorage userStorage;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        userStorage = userStorage.getInstance();

        recyclerView = findViewById(R.id.rvRocketList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //recyclerView.setAdapter(new studentListAdapter(getApplicationContext(), userStorage.getUsers()));

    }
}