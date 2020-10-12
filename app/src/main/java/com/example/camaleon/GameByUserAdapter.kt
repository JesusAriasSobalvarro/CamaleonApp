package com.example.camaleon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.camaleon.Models.GameInfo

class GameByUserAdapter(var list: HashMap<String, GameInfo>):
    RecyclerView.Adapter<GameByUserHolder>() {

    private var mKeys = list.keys.toList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameByUserHolder {
        val inflater = LayoutInflater.from(parent.context)
        return GameByUserHolder(inflater, parent)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GameByUserHolder, position: Int) {
        if (mKeys.isNotEmpty()) {
            val gameInfo = list[mKeys[position]]

            if (gameInfo != null) {
                holder.bind(gameInfo)
            }
        }


    }

    fun setMemberList(newList: HashMap<String, GameInfo>) {
        list = newList
        mKeys = list.keys.toList()
        notifyDataSetChanged()
    }
}


