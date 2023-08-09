package com.example.pertemuan8mobiletrainingfave.models;

import java.util.Collection;
import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TopCharacterResponse{

	@SerializedName("pagination")
	private Pagination pagination;

	@SerializedName("data")
	private List<Character> data;
	private List<Character> characters;

	public Pagination getPagination(){
		return pagination;
	}

	public List<Character> getData(){
		return data;
	}

	public List<Character> getCharacters(){
		return characters;
	}
}