package com.example.groceriesapplicationstartng;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.BitSet;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[], s2[];
    int imageResource[] = {R.drawable.mango_icon, R.drawable.apple_icon, R.drawable.strawberry_icon, R.drawable.bananas_icon,
            R.drawable.water_melon_icon, R.drawable.orange_icon, R.drawable.pineaple_icon, R.drawable.coconut_icon,
            R.drawable.grape_wine_icon, R.drawable.cherry_icon, R.drawable.kiwi_icon, R.drawable.starfruit_icon, R.drawable.lime_icon};
    MyAdapter adapter;

    Button button;

    public static ArrayList<my_model> modelArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        button = findViewById(R.id.button);

        s1 = getResources().getStringArray(R.array.fruit_name);
        s2 = getResources().getStringArray(R.array.fruit_price);

        adapter = new MyAdapter(this, s1, s2, imageResource);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        modelArrayList = getModel();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Next_Activity.class);
                startActivity(intent);
            }
        });



    }

    private ArrayList<my_model> getModel(){
        ArrayList<my_model> list = new ArrayList<>();

        for (int i = 0 ; i<13 ; i++){
            my_model model = new my_model();
            model.setNumber(0);
            model.setFruit(s1[i]);
            list.add(model);
        }
        return list;
    }
}
