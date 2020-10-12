package com.example.camaleon.ViewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.camaleon.Models.GameInfo
import com.example.camaleon.Repository.GamesByUserRepository

class GamesByUserViewModel(application: Application) : AndroidViewModel(application) {
    private var gamesByUserRepository: GamesByUserRepository = GamesByUserRepository()
    private var gamesByUser: MutableLiveData<HashMap<String, GameInfo>>

    init {
        gamesByUser = gamesByUserRepository.allGamesByUser
    }

    fun getGamesByUser(): MutableLiveData<HashMap<String, GameInfo>>{
        return gamesByUser
    }
}