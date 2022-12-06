package com.example.calatour

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity,private val arrayList : ArrayList<OneOffer>) : ArrayAdapter<OneOffer>(context,
    R.layout.list_item,arrayList)        {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item,null)

        val imageView : ImageView = view.findViewById(R.id.imageOffer)
        val countryName : TextView = view.findViewById(R.id.countryNameOffer)
        val price : TextView = view.findViewById(R.id.priceOffer)
        val description : TextView = view.findViewById(R.id.descriptionOffer)

        imageView.setImageResource(arrayList[position].imageId)
        countryName.text = arrayList[position].countryName
        price.text = arrayList[position].price.toString()+'$'
        description.text = arrayList[position].description

        return view
    }

}