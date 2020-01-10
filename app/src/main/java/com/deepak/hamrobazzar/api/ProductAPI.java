package com.deepak.hamrobazzar.api;

import com.deepak.hamrobazzar.model.Products;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ProductAPI {

    @GET("products/allProducts")
    Call<List<Products>> getAllProducts();
}
