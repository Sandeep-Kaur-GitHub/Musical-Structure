package com.example.musicalstructure;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Display> array_list = new ArrayList<Display>();
        array_list.add(new Display("Lukka Chuppi","Various Artists",R.drawable.lukkachuppi));
        array_list.add(new Display("Kabir Singh","Vishal,Mithoon,Sachet-Parampara",R.drawable.kabir));
        DisplayAdapter display_adapter = new DisplayAdapter(this,array_list);
        ListView list_view= findViewById(R.id.list_view_main);
        list_view.setAdapter(display_adapter);
        
        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position , long id) {
                Toast.makeText(getApplicationContext(),
                        "Click ListItem Number " + position, Toast.LENGTH_LONG)
                        .show();

            }
        });

    }

}

