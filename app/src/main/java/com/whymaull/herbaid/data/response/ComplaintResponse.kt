package com.whymaull.herbaid.data.response

import com.whymaull.herbaid.data.database.Recipe

data class ComplaintResponse(
    val message: String,
    val recommendedRecipes: List<Recipe>
)