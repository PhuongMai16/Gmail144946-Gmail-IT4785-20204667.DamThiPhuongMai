package com.example.gmail

import android.icu.lang.UCharacter.GraphemeClusterBreak.LV
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var manggmail : ArrayList<mail> = ArrayList()

        var arrayemail : ArrayList<mail> = ArrayList()
        arrayemail.add(mail("Facebook", R.drawable.f))
        arrayemail.add(mail("Facebook", R.drawable.f))
        arrayemail.add(mail("Long Vu", R.drawable.l))
        arrayemail.add(mail("Facebook", R.drawable.f))
        arrayemail.add(mail("Facebook", R.drawable.f))
        arrayemail.add(mail("Nami", R.drawable.nn))
        arrayemail.add(mail("Long Vu", R.drawable.l))
        arrayemail.add(mail("Long Vu", R.drawable.l))

        // LV.adapter = cuttomadapter(this@MainActivity,arrayemail)


    }
}