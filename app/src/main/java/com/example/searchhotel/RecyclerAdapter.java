package com.example.searchhotel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.squareup.picasso.Picasso;

public class RecyclerAdapter extends FirebaseRecyclerAdapter<HotelModel,RecyclerAdapter.myviewholder>
{

    public RecyclerAdapter(@NonNull FirebaseRecyclerOptions<HotelModel> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull final HotelModel model) {
       /* holder.nametext.setText(model.getName());
        holder.coursetext.setText(model.getCourse());
        holder.emailtext.setText(model.getEmail());
        Glide.with(holder.img1.getContext()).load(model.getPurl()).into(holder.img1);*/
        holder.ratings.setText(model.getHotelRating());
        holder.hotelLocation.setText(model.getHotelLocation());
        holder.hotelName.setText(model.getHotelName());
        holder.tagsList.setText(model.getHotelListTag());
        Picasso.with(holder.hotelImage.getContext())
                .load(model.getImageUri())
                .placeholder(R.drawable.placeholder)
                .fit()
                .centerCrop()
                .into(holder.hotelImage);

        holder.hotelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity=(AppCompatActivity)view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new DescriptionFragment(model.getHotelListTag(),model.getHotelLocation(),model.getHotelName(),model.getHotelRating(), model.getImageUri(), model.getHotelMapUrl(),model.getHotelPhone(),model.getHotelEmail())).addToBackStack(null).commit();
            }
        });
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new myviewholder(view);
    }

    public class myviewholder extends RecyclerView.ViewHolder
    {
        public TextView ratings,hotelLocation,hotelName,tagsList;
        public ImageView hotelImage;

        public myviewholder(@NonNull View itemView) {
            super(itemView);

            ratings =itemView.findViewById ( R.id.ratings );
            hotelLocation = itemView.findViewById(R.id.hotelLocation);
            hotelLocation = itemView.findViewById(R.id.hotelLocation);
            hotelName = itemView.findViewById(R.id.hotelName);
            tagsList = itemView.findViewById(R.id.tagsList);
            hotelImage = itemView.findViewById(R.id.hotelImage);
        }
    }

}
