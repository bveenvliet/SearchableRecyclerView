package com.example.searchablerecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class CharacterAdapter(
    private val context: Context,
    private val characterList: List<Character>
) : RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder>(), Filterable {

    private var filteredCharacterList: List<Character> = characterList

    class CharacterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView? = itemView.findViewById(R.id.tvFullName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.name_list_item, parent, false)
        return CharacterViewHolder(view)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.tvName?.text = filteredCharacterList[position].fullName
    }

    override fun getItemCount(): Int {
        return filteredCharacterList.size
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence): FilterResults {
                val searchString = constraint.toString()
                filteredCharacterList = if (searchString.isEmpty()) {
                    characterList
                } else {
                    // case insensitive search filter
                    characterList.filter { character ->
                        character.fullName.toLowerCase(Locale.getDefault())
                            .contains(searchString.toLowerCase(Locale.getDefault()))
                    }
                }
                return FilterResults().apply { values = filteredCharacterList }
            }

            override fun publishResults(constraint: CharSequence, results: FilterResults) {
                filteredCharacterList = results.values as List<Character>
                notifyDataSetChanged()
            }
        }
    }

}