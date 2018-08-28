package com.example.errlindeleon.androidfinal;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class MenuAdapter extends ArrayAdapter<MenuItem> {
    private Context context;
    ViewHolder holder;

    public MenuAdapter(Context context, List<MenuItem> menuItems) {
        super(context, R.layout.menu, menuItems);
        this.context = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        holder = new ViewHolder();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.menu, null, true);

        holder.item = getItem(position);
        holder.foodName = (TextView) convertView.findViewById(R.id.foodName);
        holder.storeName = (TextView) convertView.findViewById(R.id.storeName);
        holder.userName = (TextView) convertView.findViewById(R.id.userName);
        holder.userPicture = (ImageView) convertView.findViewById(R.id.userPicture);
        holder.foodPicture = (ImageView) convertView.findViewById(R.id.foodPicture);
        holder.ratingBar = (RatingBar) convertView.findViewById(R.id.ratingBar);

        holder.ratingBar.setRating(Float.parseFloat(holder.item.getRating() + ""));
        holder.userName.setText(holder.item.getUser());
        holder.foodName.setText(holder.item.getFoodName());
        holder.storeName.setText(holder.item.getResurant());
        holder.userPicture.setImageResource(holder.item.getUserImage());
        holder.foodPicture.setImageResource(holder.item.getFoodImage());

        holder.ratingBar.setIsIndicator(true);

        holder.foodName.setClickable(true);
        holder.foodName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, RestaurantItemActivity.class));
            }
        });

        holder.storeName.setClickable(true);
        holder.storeName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RestaurantReviewItemsActivity.class);
                context.startActivity(intent);
            }
        });


        return convertView;
    }

    private class ViewHolder {
        private RatingBar ratingBar;
        private ImageView userPicture, foodPicture;
        private TextView userName, foodName, storeName;
        public MenuItem item = new MenuItem();
    }
}
