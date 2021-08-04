package com.example.cadastrousers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAadapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    ArrayList<Users> list = new ArrayList<>();

public RVAadapter(Context ctx){this.context = ctx;}

public void setItems(ArrayList<Users> user){list.addAll(user);}

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item, parent,false);

    return new UserVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Users u = null;
        this.onBindViewHolder(holder,position,u);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position, Users u) {
        UserVH vh = (UserVH) holder;
        Users user = u==null? list.get(position):u;
        vh.txt_name.setText(user.getFirstName());
        vh.lastName2.setText(user.getLastName());
        vh.txt_age2.setText(user.getAge());
        vh.txt_userName2.setText(user.getUserName());
}
    @Override
    public int getItemCount() {
        return list.size();
    }
}
