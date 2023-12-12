package com.whymaull.herbaid.ui.favorite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whymaull.herbaid.R
import com.whymaull.herbaid.databinding.ActivityFavoriteBinding
import com.whymaull.herbaid.ui.home.HomeActivity
import com.whymaull.herbaid.ui.recipe.RecipeActivity

class FavoriteActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.bottomNavigationView.selectedItemId = R.id.navigation_favorite
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
                    startActivity(Intent(this, RecipeActivity::class.java))
                    true
                }
                R.id.navigation_favorite -> {
                    true
                }
                else -> false
            }
        }
    }
}