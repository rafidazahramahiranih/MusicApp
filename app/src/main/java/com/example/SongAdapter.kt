package com.example

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.musicapp.DetailActivity
import com.example.musicapp.R

class SongAdapter(private val songs: List<Song>, private val context: Context) :
    RecyclerView.Adapter<SongAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageSong: ImageView = itemView.findViewById(R.id.image_song)
        val textTitle: TextView = itemView.findViewById(R.id.text_title)
        val textArtist: TextView = itemView.findViewById(R.id.text_artist)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val intent = Intent(context, DetailActivity::class.java)
                    intent.putExtra("song", songs[position])
                    context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_song, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val song = songs[position]
        holder.imageSong.setImageResource(song.imageResId)
        holder.textTitle.text = song.title
        holder.textArtist.text = song.artist
    }

    override fun getItemCount(): Int {
        return songs.size
    }
}
