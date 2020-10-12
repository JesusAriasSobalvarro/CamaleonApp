package com.example.camaleon

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.camaleon.Models.GameInfo


class GameByUserHolder(layoutInflater: LayoutInflater, parent: ViewGroup) :
    RecyclerView.ViewHolder(layoutInflater.inflate(R.layout.game_by_user_item, parent, false)) {

    private var mGameName: TextView? = null

    init {
        mGameName = itemView.findViewById(R.id.text_view_game_name)

    }

    fun bind(gameInfo: GameInfo) {
        println("!!!"+gameInfo.gameName)
        mGameName?.text = gameInfo.gameName
    }
}