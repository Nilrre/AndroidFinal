package com.example.errlindeleon.androidfinal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ListAdapter adapter;
    public static ListView listView;
    public static List<MenuItem> menuItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        menuItems.add(new MenuItem("Steve", "I HATE this thing", 4, R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground, "MCDONALDS", "Turkey Burger"));
        menuItems.add(new MenuItem("Mike", "I NEED food", 1, R.drawable.ic_launcher_background, R.drawable.ic_launcher_foreground, "Wendy's", "Cheese Fries"));

        adapter = new MenuAdapter(this, menuItems);
        listView = (ListView) findViewById(R.id.MenuList);
        listView.setAdapter(adapter);

        final Context context = this;
        TextView header = (TextView)findViewById(R.id.FOODishHeader);
        header.setClickable(true);
        header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, MainActivity.class));
            }
        });
    }
}
