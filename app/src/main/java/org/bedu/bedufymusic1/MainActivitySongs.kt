package org.bedu.bedufymusic1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivitySongs : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycled = findViewById<RecyclerView>(R.id.recycled)
        recycled.adapter = RecyclerAdapter(listOf(
            Song("Half Full Glass of Wine", "2012"),
            Song("Solitude Is Bliss", "2020"),
            Song("Lucidity", "2012"),
            Song("Expectation", "2017"),
            Song("Elephant", "2012"),
            Song("Feels Like We Only...", "2017"),
            Song("Mind Mischie", "2012"),
            Song("Cause I'm a Man", "2017"),
            Song("Let It Happen", "2017"),
            Song("The Less I Know the Better", "2017"),
            Song("Lost in Yesterday", "2020"),
            Song("Is It True", "2017"),
            Song("Breathe Deeper", "2020"),
        ))
    }
}