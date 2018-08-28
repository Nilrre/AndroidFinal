package com.example.errlindeleon.androidfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class ReviewAdapter extends ArrayAdapter<MenuItem> {

    private Context context;
    ViewHolder holder;

    public ReviewAdapter(Context context, List<MenuItem> menuItems) {
        super(context, R.layout.review, menuItems);
        this.context = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        holder = new ViewHolder();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.review, null, true);

        holder.item = getItem(position);
        holder.userReview = (TextView) convertView.findViewById(R.id.userReview);
        holder.userName = (TextView) convertView.findViewById(R.id.userName);
        holder.userPicture = (ImageView) convertView.findViewById(R.id.userPicture);
        holder.foodPicture = (ImageView) convertView.findViewById(R.id.foodPicture);
        holder.ratingBar = (RatingBar) convertView.findViewById(R.id.ratingBar);

        holder.ratingBar.setRating(Float.parseFloat(holder.item.getRating() + ""));
        holder.ratingBar.setIsIndicator(true);
        holder.userName.setText(holder.item.getUser());
        holder.userReview.setText(holder.item.getReview());
        holder.userPicture.setImageResource(holder.item.getUserImage());
        holder.foodPicture.setImageResource(holder.item.getFoodImage());


        return convertView;
    }

    private class ViewHolder {
        private RatingBar ratingBar;
        private ImageView userPicture, foodPicture;
        private TextView userName, userReview;
        public MenuItem item = new MenuItem();
    }
}