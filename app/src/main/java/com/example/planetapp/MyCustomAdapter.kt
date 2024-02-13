package com.example.planetapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MyCustomAdapter(val context: Context,val planets:List<Planet>):BaseAdapter() {
    override fun getCount(): Int {
        return planets.size
    }

    override fun getItem(p0: Int): Any {
        return planets[p0];
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position:Int, convertView: View?,parent : ViewGroup?): View {
        val inflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view:View
        if(convertView==null){
            view=inflater.inflate(R.layout.item_list_layout,parent,false)
        }else{
            view=convertView
        }
        val item=getItem(position) as Planet
        val titleTextView= view.findViewById<TextView>(R.id.planet_name)
        val moonCountTextView=view.findViewById<TextView>(R.id.moon_count)
        val imageView=view.findViewById<ImageView>(R.id.planet_image)
        titleTextView.text=item.title
        moonCountTextView.text=item.moonCount
        imageView.setImageResource(item.image)
        view.setOnClickListener{
            Toast.makeText(context,"you clicked ${planets[position].title}",Toast.LENGTH_SHORT).show()
        }
        return view
    }
}