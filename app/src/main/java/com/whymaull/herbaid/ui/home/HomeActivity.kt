package com.whymaull.herbaid.ui.home

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whymaull.herbaid.R
import com.whymaull.herbaid.databinding.ActivityHomeBinding
import com.whymaull.herbaid.ui.favorite.FavoriteActivity
import com.whymaull.herbaid.ui.recipe.RecipeActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.bottomNavigationView.selectedItemId = R.id.navigation_home
        setupNavigation()
    }

    private fun setupNavigation() {
        binding.bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> {
                    true
                }
                R.id.navigation_recipe -> {
                    startActivity(Intent(this, RecipeActivity::class.java))
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


    companion object {

        fun start(context: Context) {
            val intent = Intent(context, HomeActivity::class.java)
            context.startActivity(intent)
        }
    }
}