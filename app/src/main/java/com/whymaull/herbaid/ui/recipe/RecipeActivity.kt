package com.whymaull.herbaid.ui.recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whymaull.herbaid.R
import com.whymaull.herbaid.databinding.ActivityRecipeBinding
import com.whymaull.herbaid.ui.favorite.FavoriteActivity
import com.whymaull.herbaid.ui.home.HomeActivity

class RecipeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecipeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.bottomNavigationView.selectedItemId = R.id.navigation_recipe
        setupNavigation()
    }

    private fun setupNavigation() {
        binding.bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> {
                    startActivity(Intent(this, HomeActivity::class.java))
                    true
                }
                R.id.navigation_recipe -> {
                    true
                }
                R.id.navigation_favorite -> {
                    startActivity(Intent(this, FavoriteActivity::class.java))
                    true
                }
                else -> false
            }
        }

    }

}