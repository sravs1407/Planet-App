package com.example.planetapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView:ListView=findViewById(R.id.list_view)
        val planet1=Planet("Mercury","0 moons",R.drawable.mercury)
        val planet2=Planet("Venus","1 moons",R.drawable.venus)
        val planet3=Planet("Earth","2 moons",R.drawable.earth)
        val planet4=Planet("Mars","3 moons",R.drawable.mars)
        val planet5=Planet("Jupyter","4 moons",R.drawable.jupyiter)
        val planet6=Planet("Satrun","5 moons",R.drawable.saturn)
        val planetList=ArrayList<Planet>()
        planetList.add(planet1)
        planetList.add(planet2)
        planetList.add(planet3)
        planetList.add(planet4)
        planetList.add(planet5)
        planetList.add(planet6)
        val myAdapter=MyCustomAdapter(this,planetList)
        listView.adapter=myAdapter


    }
}