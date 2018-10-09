package com.raemacias.androidlibrary;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.udacity.gradle.jokes.Joker;


/**
 * A simple {@link Fragment} subclass.
 */
public class JokeActivityFragment extends Fragment {


    public JokeActivityFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_joke, container, false);
        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(JokeActivity.JOKE_KEY);

        TextView textView = root.findViewById(R.id.joke_textview);
        Joker myJoker = new Joker();
        textView.setText(myJoker.getJoke());

        return root;
    }
}
