package com.example.cadastrousers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextInputEditText firstName = findViewById(R.id.firstname);
        final TextInputEditText lastName = findViewById(R.id.lastname);
        final TextInputEditText age = findViewById(R.id.idade);
        final TextInputEditText userName = findViewById(R.id.username);
        cadastro = findViewById(R.id.SignUpFstBtn);
        DAOUsers daousers = new DAOUsers();

        cadastro.setOnClickListener(v -> {

            Users user = new Users(firstName.getText().toString(), lastName.getText().toString(), age.getText().toString(), userName.getText().toString());
            daousers.add(user).addOnSuccessListener(suc ->{

                Toast.makeText(this, "O valor foi inserido", Toast.LENGTH_SHORT).show();
            }).addOnFailureListener(er ->{
                Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
            });
        });
    }
}