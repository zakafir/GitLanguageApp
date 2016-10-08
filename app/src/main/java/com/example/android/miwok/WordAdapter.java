package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zakaria_afir on 20/09/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    //color resource value
    private int mColorResourceId;


    public WordAdapter(Context context, ArrayList<Word> words,int colorResourceId) {
        super(context,0,words);
        this.mColorResourceId=colorResourceId;

    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word defaultWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_textView);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        miwokTextView.setText(defaultWord.getmTranslationWord());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView translateTextView = (TextView) listItemView.findViewById(R.id.default_textView);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        translateTextView.setText(defaultWord.getmDefaultWord());

        ImageView imageTextView = (ImageView) listItemView.findViewById(R.id.image);
        if(defaultWord.hasImage()) {
            imageTextView.setImageResource(defaultWord.getmRessourceIdImageWord());
            imageTextView.setVisibility(View.VISIBLE);
        }
        else{
            imageTextView.setVisibility(View.GONE);
        }


        //set the the color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        //find the color of the text container
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        //Set the background color of the text container
        textContainer.setBackgroundColor(color);


        return listItemView;
    }

}

