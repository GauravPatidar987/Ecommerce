package com.pany;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface GetDataService {

    @GET("/products")
    Call<List<Product>> getAllProducts();
}
