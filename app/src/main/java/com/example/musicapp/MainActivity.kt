package com.example.musicapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.Song
import com.example.SongAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SongAdapter(generateSongList(), this)

        val buttonAbout = findViewById<Button>(R.id.button_about)
        buttonAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }

    private fun generateSongList(): List<Song> {
        val songList = mutableListOf<Song>()

        songList.add(
            Song(
                "Semua Aku Dirayakan",
                "Nadin Amizah",
                "Terima kasih, katanya. Semua aku dirayakan.",
                R.drawable.satu
            )
        )

        songList.add(
            Song(
                "Rayuan Perempuan Gila",
                "Nadin Amizah",
                "Menurutmu, apa benar saat ini kau masih mencintaiku?",
                R.drawable.dua
            )
        )

        songList.add(
            Song(
                "Teman Hidup",
                "Tulus",
                "Tetaplah bersamaku jadi teman hidupku, berdua kita hadapi dunia",
                R.drawable.tiga
            )
        )

        songList.add(
            Song(
                "Nanti Kita Seperti Ini",
                "Batas Senja",
                "Kini, Ku sudah yakin pada satu hati.",
                R.drawable.empat
            )
        )

        songList.add(
            Song(
                "Sampai Jadi Debu",
                "Banda Neira",
                "Sampai kita tua, sampai jadi debu. Ku diliang yang satu, ku di sebelahmu",
                R.drawable.lima
            )
        )

        songList.add(
            Song(
                "Wanita Terbahagia",
                "Bunga Citra Lestari",
                "Karena cinta dari kamu, jadikan aku wanita terbahagia di dunia",
                R.drawable.enam
            )
        )

        songList.add(
            Song(
                "Jangan Rubah Takdirku",
                "Andmesh Kamaleng",
                "Ku ingin habiskan nafas ini berdua dengannya, jangan rubah takdirku",
                R.drawable.tujuh
            )
        )

        songList.add(
            Song(
                "Rayuan Perempuan Gila",
                "Nadin Amizah",
                "Menurutmu, apa benar saat ini kau masih mencintaiku?",
                R.drawable.delapan
            )
        )

        songList.add(
            Song(
                "Sayap Pelindungmu",
                "The Overtunes",
                "Ku akan selalu, jadi sayap pelindungmu",
                R.drawable.sembilan
            )
        )

        songList.add(
            Song(
                "Amin Paling Serius",
                "Nadin Amizah, Sal Priadi",
                "Mari kita ketuk pintu yang sama, membawa amin paling serius seluruh dunia",
                R.drawable.sepuluh
            )
        )
        return songList
    }
}
