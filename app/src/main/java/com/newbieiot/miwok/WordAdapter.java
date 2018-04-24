package com.newbieiot.miwok;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int adapterColor;

    public WordAdapter(Activity context, ArrayList<Word> words, int adapterColor){
        super(context,0, words);
        this.adapterColor = adapterColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // convertView is a reusable view
        View listItemView = convertView;

        // if no reusable view available then create one using the layout provided
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }


        // get the object in this position of arraylist
        Word currentWord = getItem(position);

        // set miwok text from the arraylist object
        TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokWord());

        // set default text from the arraylist object
        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultWord());

        // set reference image if available otherwise remove view
        ImageView refImage = listItemView.findViewById(R.id.ref_image);
        if(currentWord.hasImage()){
            refImage.setImageResource(currentWord.getRefImage());
        } else {
            refImage.setVisibility(View.GONE);
        }

        // set text background color
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),this.adapterColor);
        textContainer.setBackgroundColor(color);


        return listItemView;
    }

}
