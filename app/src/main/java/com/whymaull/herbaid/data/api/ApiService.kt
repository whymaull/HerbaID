package com.whymaull.herbaid.data.api

import com.whymaull.herbaid.data.response.AddFavoriteRequest
import com.whymaull.herbaid.data.response.ApiResponse
import com.whymaull.herbaid.data.response.ComplaintRequest
import com.whymaull.herbaid.data.response.ComplaintResponse
import com.whymaull.herbaid.data.response.FavoriteRecipesResponse
import com.whymaull.herbaid.data.response.LogoutRequest
import com.whymaull.herbaid.data.response.RecipesResponse
import com.whymaull.herbaid.data.response.RecommendedRecipesResponse
import com.whymaull.herbaid.data.response.SignInRequest
import com.whymaull.herbaid.data.response.SignUpRequest
import com.whymaull.herbaid.data.response.TokenResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @POST("/api/auth/signup")
    suspend fun signUp(@Body request: SignUpRequest): ApiResponse

    @POST("/api/auth/signin")
    suspend fun signIn(@Body request: SignInRequest): TokenResponse

    @POST("/api/auth/logout")
    suspend fun logout(@Body request: LogoutRequest): ApiResponse

    @POST("/api/complaints")
    suspend fun addComplaint(@Body request: ComplaintRequest): ComplaintResponse

    @POST("/api/complaints/recommended")
    suspend fun getRecommendedRecipes(@Body request: ComplaintRequest): RecommendedRecipesResponse

    @GET("/api/recipes")
    suspend fun getAllRecipes(): RecipesResponse

    @GET("/api/user/favorites")
    suspend fun getFavoriteRecipes(): FavoriteRecipesResponse

    @POST("/api/user/favorites/add")
    suspend fun addFavoriteRecipe(@Body request: AddFavoriteRequest): ApiResponse

}