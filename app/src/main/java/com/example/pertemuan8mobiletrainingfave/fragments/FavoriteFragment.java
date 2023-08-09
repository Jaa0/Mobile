package com.example.pertemuan8mobiletrainingfave.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pertemuan8mobiletrainingfave.R;
import com.example.pertemuan8mobiletrainingfave.adapter.FavoriteCharacterAdapter;
import com.example.pertemuan8mobiletrainingfave.database.CharacterDB;
import com.example.pertemuan8mobiletrainingfave.models.FavoriteCharacter;

import java.util.ArrayList;
import java.util.List;

public class FavoriteFragment extends Fragment {
    RecyclerView rvCharacters;
    FavoriteCharacterAdapter favoriteCharacterAdapter;
    CharacterDB characterDB;
    List<FavoriteCharacter> favoriteCharacterList = new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);

        characterDB = new CharacterDB(getActivity());
        favoriteCharacterList = characterDB.getAllFavoriteCharacters();
        favoriteCharacterAdapter = new FavoriteCharacterAdapter(favoriteCharacterList, getActivity());

        rvCharacters = view.findViewById(R.id.rv_characters);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rvCharacters.setLayoutManager(linearLayoutManager);
        rvCharacters.setAdapter(favoriteCharacterAdapter);

        return view;
    }
}