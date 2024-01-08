package com.jafor.hth;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    ImageView github;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        github = findViewById(R.id.imgLink);





        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myWeblink = new Intent(Intent.ACTION_VIEW);
                myWeblink.setData(Uri.parse("https://www.github.com/abujaforhadi"));
                startActivity(myWeblink);
            }
        });


    }
}