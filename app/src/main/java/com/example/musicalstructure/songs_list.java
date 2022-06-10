package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class songs_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs_list);
        Button button = findViewById(R.id.btn_back_to_album);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        ArrayList<Display> array_list = new ArrayList<Display>();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("key");
            if (value.equals("kabir")) {
                array_list.add(new Display("Tujhe Kitna Chahne Lage", "04:06", R.drawable.kitnachahnelagge));
                array_list.add(new Display("Bekhayali", "03:11", R.drawable.bekhyali));
                array_list.add(new Display("Tera Ban Jaunga", "03:56", R.drawable.terabanjaunga));
                array_list.add(new Display("Mere Sohneya", "03:13", R.drawable.meresohneya));
                array_list.add(new Display("Kaise Hua", "03:55", R.drawable.bekhyali));

            } else if (value.equals("lukka")) {
                array_list.add(new Display("Haan Mujhe Ishq Hua", "03:01", R.drawable.haanmujhe));
                array_list.add(new Display("Sajni", "02:41", R.drawable.haanmujhe));
                array_list.add(new Display("Sifaarishein", "03:47", R.drawable.haanmujhe));
                array_list.add(new Display("Kaise Jeeu Tere Bin", "04:29", R.drawable.haanmujhe));
            }
        }

        DisplayAdapter display_adapter = new DisplayAdapter(this, array_list);
        ListView list_view = findViewById(R.id.list_view_songs);
        list_view.setAdapter(display_adapter);
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String string_album_name = array_list.get(position).getAlbumName().toString();
                String string_duration = array_list.get(position).getArtistName().toString();
                int image = array_list.get(position).getImageResourceId();
                Intent i = new Intent(getApplicationContext(), one_song.class);
                Bundle bundle = new Bundle();
                bundle.putString("string_album_name", string_album_name);
                bundle.putString("string_duration", string_duration);
                bundle.putInt("image", image);
                i.putExtras(bundle);
                startActivity(i);
            }
        });

    }

}