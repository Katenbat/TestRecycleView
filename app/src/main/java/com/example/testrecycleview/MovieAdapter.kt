package com.example.testrecycleview

import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder


class MovieAdapter(private val listMovie: ArrayList<Movie>) :
    RecyclerView.Adapter<MovieAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.txtTitle.text = movie.title
        holder.txtYear.text = movie.year
    }

    override fun getItemCount(): Int {
        return listMovie.size()
    }

    inner class ListViewHolder(itemView: View) : ViewHolder(itemView) {
        var txtTitle: TextView
        var txtYear: TextView

        init {
            txtTitle = itemView.findViewById(R.id.txtTitle)
            txtYear = itemView.findViewById(R.id.txtYear)
        }
    }
}