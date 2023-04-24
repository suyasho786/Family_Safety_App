package com.example.grocery_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract.Instances
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomBar = findViewById<BottomNavigationView>(R.id.main_bottom_navigation)
        bottomBar.setOnItemSelectedListener {
            if(it.itemId==R.id.nav_guard){
                inflateFragment(GuardFragment.newInstance())
            }else if(it.itemId==R.id.nav_home){
                inflateFragment(HomeFragment.newInstance())
            }
            true
        }

    }

    private fun inflateFragment(newInstance:Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,newInstance)
        transaction.commit()
    }
}