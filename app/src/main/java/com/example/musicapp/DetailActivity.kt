package com.example.musicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.Song

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val song = intent.getParcelableExtra<Song>("song")
        if (song != null) {
            val detailImage = findViewById<ImageView>(R.id.detail_image_song)
            val detailTitle = findViewById<TextView>(R.id.detail_text_title)
            val detailArtist = findViewById<TextView>(R.id.detail_text_artist)
            val detailDescription = findViewById<TextView>(R.id.detail_text_description)

            detailImage.setImageResource(song.imageResId)
            detailTitle.text = song.title
            detailArtist.text = song.artist
            detailDescription.text = song.description
        }
    }
}
