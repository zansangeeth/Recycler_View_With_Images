package com.zasa.recyclerviewwithimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val createWallpaper = createWallpapers()
        rvRecyclerView.adapter = WallpaperAdapter(this, createWallpaper)

        rvRecyclerView.layoutManager = LinearLayoutManager(this)


    }

    // method of returning wallpaper texts
    private fun createWallpapers() : List<Wallpaper>{
        val wallpapers = mutableListOf<Wallpaper>()
        for (i in 1..10){
            wallpapers.add(Wallpaper("wallpaper $i", R.drawable.image1))
        }
        return wallpapers
    }


}