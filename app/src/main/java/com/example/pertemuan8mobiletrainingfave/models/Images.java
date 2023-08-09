package com.example.pertemuan8mobiletrainingfave.models;

import com.google.gson.annotations.SerializedName;

public class Images{

	@SerializedName("jpg")
	private Jpg jpg;

	@SerializedName("webp")
	private Webp webp;

	public Jpg getJpg(){
		return jpg;
	}

	public Webp getWebp(){
		return webp;
	}
}