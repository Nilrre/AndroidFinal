package com.example.errlindeleon.androidfinal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RestaurantItemActivity extends AppCompatActivity {

    public ListAdapter adapter;
    public static ListView listView;
    public static List<MenuItem> menuItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.restaurant_item);

        menuItems = MainActivity.menuItems;
        adapter = new ReviewAdapter(this, menuItems);
        listView = (ListView) findViewById(R.id.FoodReviewList);
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
