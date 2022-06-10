package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class one_song extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_song);
        Button button=findViewById(R.id.btn_back_to_list);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("string_album_name");
            String age = bundle.getString("string_duration");
            int img = bundle.getInt("image");
            TextView tvName = findViewById(R.id.song_name);
            TextView tvAge = findViewById(R.id.duration);
            ImageView image_view = findViewById(R.id.single_image);
            tvName.setText(name);
            tvAge.setText(age);
            image_view.setImageResource(img);
        }
    }

}