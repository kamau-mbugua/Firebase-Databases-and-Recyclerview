package com.example.searchhotel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DescriptionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DescriptionFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    String hotelListTag,  hotelLocation,  hotelName,  hotelRating,  imageUri,hotelMapUrl,hotelPhone,hotelEmail;

    public DescriptionFragment() {
        // Required empty public constructor
    }

    /*public DescriptionFragment(String hotelListTag, String hotelLocation, String hotelName, String hotelRating, String imageUri) {
        this.hotelListTag = hotelListTag;
        this.hotelLocation = hotelLocation;
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
        this.imageUri = imageUri;
    }*/

    public DescriptionFragment(String hotelListTag, String hotelLocation, String hotelName, String hotelRating, String imageUri, String hotelMapUrl, String hotelPhone, String hotelEmail) {
        this.hotelListTag = hotelListTag;
        this.hotelLocation = hotelLocation;
        this.hotelName = hotelName;
        this.hotelRating = hotelRating;
        this.imageUri = imageUri;
        this.hotelMapUrl = hotelMapUrl;
        this.hotelPhone = hotelPhone;
        this.hotelEmail = hotelEmail;
    }

    /*public DescriptionFragment(String hotelListTag, String hotelLocation, String hotelName, String hotelRating, String imageUri) {
    }*/




    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DescriptionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DescriptionFragment newInstance(String param1, String param2) {
        DescriptionFragment fragment = new DescriptionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    ImageView hotelImage;
    TextView ratings,tvHotelEmail,tvHotelPhone,tvHotelDirection,tvhotelLocation,
            hotelNames,tagsList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_description, container, false);

        hotelImage = view.findViewById(R.id.hotelImage);
        ratings = view.findViewById(R.id.ratings);
        tvHotelEmail = view.findViewById(R.id.tvHotelEmail);
        tvHotelPhone = view.findViewById(R.id.tvHotelPhone);
        tvHotelDirection = view.findViewById(R.id.tvHotelDirection);
        tvhotelLocation = view.findViewById(R.id.hotelLocation);
        hotelNames = view.findViewById(R.id.hotelName);
        tagsList = view.findViewById(R.id.tagsList);


        ratings.setText(hotelRating);
        tvHotelEmail.setText(hotelEmail);
        tvHotelPhone.setText(hotelPhone);
        tvHotelDirection.setText(hotelMapUrl);
        tvhotelLocation.setText(hotelLocation);
        hotelNames.setText(hotelName);
        tagsList.setText(hotelListTag);

        Picasso.with(getContext()).load(imageUri).into(hotelImage);


        return  view;
    }
}