package com.whymaull.herbaid.data.response

import com.whymaull.herbaid.data.database.Recipe

data class FavoriteRecipesResponse(
    val favoriteRecipes: List<Recipe>
)