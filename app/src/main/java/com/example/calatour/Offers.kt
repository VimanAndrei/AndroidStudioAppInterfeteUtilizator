package com.example.calatour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.calatour.databinding.ActivityOferteBinding

class Offers : AppCompatActivity() {
    private lateinit var binding: ActivityOferteBinding
    private lateinit var offerArrayList: ArrayList<OneOffer>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oferte)
        binding = ActivityOferteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.offer_1,
            R.drawable.offer_2,
            R.drawable.offer_3
        )


        val countryName = arrayOf(
            "Barcelona, 3 nights",
            "Maldive, 7 nights",
            "Thailand, 10 nights"
        )

        val descriptionName = arrayOf(
            "Barcelona is nice!",
            "Maldive is great!",
            "Thailand is hot!",
        )

        val price = arrayOf(
            300, 1050, 1250
        )

        offerArrayList = ArrayList()

        for( i in imageId.indices){

            val offer = OneOffer(countryName[i], imageId[i], price[i], descriptionName[i])
            offerArrayList.add(offer)

        }

        binding.listView.adapter=MyAdapter(this, offerArrayList)

    }
}