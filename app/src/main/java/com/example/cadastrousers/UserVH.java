package com.example.cadastrousers;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserVH extends RecyclerView.ViewHolder {
    public TextView txt_name,lastName2,txt_age2, txt_userName2;

    public UserVH(@NonNull View itemView) {
        super(itemView);
        txt_name = itemView.findViewById(R.id.txt_name);
        lastName2 = itemView.findViewById(R.id.lastName2);
        txt_age2 = itemView.findViewById(R.id.txt_age2);
        txt_userName2 = itemView.findViewById(R.id.txt_userName2);
    }
}
