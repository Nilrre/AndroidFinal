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

public class ReviewNoUserAdapter extends ArrayAdapter<MenuItem> {

    private Context context;
    ViewHolder holder;

    public ReviewNoUserAdapter(Context context, List<MenuItem> menuItems) {
        super(context, R.layout.review_no_user, menuItems);
        this.context = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        holder = new ViewHolder();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.review_no_user, null, true);

        holder.item = getItem(position);
        holder.foodName = (TextView) convertView.findViewById(R.id.foodName);
        holder.foodPicture = (ImageView) convertView.findViewById(R.id.foodPicture);
        holder.ratingBar = (RatingBar) convertView.findViewById(R.id.ratingBar);

        holder.ratingBar.setRating(Float.parseFloat(holder.item.getRating() + ""));
        holder.ratingBar.setIsIndicator(true);
        holder.foodName.setText(holder.item.getFoodName());
        holder.foodPicture.setImageResource(holder.item.getFoodImage());


        return convertView;
    }

    private class ViewHolder {
        private RatingBar ratingBar;
        private ImageView foodPicture;
        private TextView foodName;
        public MenuItem item = new MenuItem();
    }
}
