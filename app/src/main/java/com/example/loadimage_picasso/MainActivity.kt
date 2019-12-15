package com.example.loadimage_picasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button_load.setOnClickListener(){
            val url = "https://java.sogeti.nl/JavaBlog/wp-content/uploads/2009/04/android_icon_256.png"
            Picasso.get().load(url).into(imageView)
        }
    }
}
