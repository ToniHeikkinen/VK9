package com.example.studentregister;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
/*
public class studentListAdapter extends RecyclerView.Adapter<studentViewHolder> {
    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public studentListAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public studentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new studentViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_list,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull studentViewHolder holder, int position) {
        holder.firstName.setText(users.get(position).getFirstName());
        holder.lastName.setText(String.valueOf(users.get(position).getLastName()));
        holder.email.setText(String.valueOf(users.get(position).getEmail()));
        holder.degreeProgram.setText(String.valueOf(users.get(position).getDegreeProgram()));

    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
*/