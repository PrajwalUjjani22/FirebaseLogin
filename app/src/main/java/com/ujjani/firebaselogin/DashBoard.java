package com.ujjani.firebaselogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.ujjani.firebaselogin.databinding.ActivityDashBoardBinding;

public class DashBoard extends AppCompatActivity {


    ActivityDashBoardBinding activityDashBoardBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        activityDashBoardBinding = ActivityDashBoardBinding.inflate(getLayoutInflater());
        View view = activityDashBoardBinding.getRoot();
        setContentView(view);

        activityDashBoardBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signOut();
            }
        });

    }

    public void signOut() {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}