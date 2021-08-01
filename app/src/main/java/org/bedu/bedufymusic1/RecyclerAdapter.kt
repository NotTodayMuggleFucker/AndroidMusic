package org.bedu.bedufymusic1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val playlist : List<Song>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val name = view.findViewById<TextView>(R.id.tamesong)
        private val year = view.findViewById<TextView>(R.id.musicyear)

        fun bind(song: Song){
            name.text = song.song
            year.text = song.year
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_songs, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val contact = playlist[position]
        holder.bind(contact)
    }

    override fun getItemCount(): Int {
        return playlist.size
    }
}