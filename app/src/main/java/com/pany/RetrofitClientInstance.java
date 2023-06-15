package com.pany;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import java.lang.String;

public class RetrofitClientInstance {

	private static Retrofit retrofit;
	private static final String BASE_URL = "https://fakestoreapi.com";

	public static Retrofit getRetrofitInstance() {
		if (retrofit == null) {
			retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
					.build();
		}
		return retrofit;
	}

}
