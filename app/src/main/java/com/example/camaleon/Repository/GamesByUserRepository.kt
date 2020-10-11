package com.example.camaleon.Repository


import androidx.lifecycle.MutableLiveData
import com.example.camaleon.Database.FirebaseDatabase
import com.example.camaleon.Models.GameInfo
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.getValue

class GamesByUserRepository() {
    val allGamesByUser = MutableLiveData<HashMap<String, GameInfo>>()

    init {
        FirebaseDatabase.getInstance().child("gamesByUser").addValueEventListener(object:
            ValueEventListener {
            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

            override fun onDataChange(snapshot: DataSnapshot) {
                val gameInfo = snapshot.getValue<HashMap<String, GameInfo>>()
                allGamesByUser.value = gameInfo
            }
        })
    }

//    fun addGameByUser(name: String, score: Int) {
//        FirebaseDatabase.getInstance().child("gamesByUser").push().setValue(GameInfo(name, score))
//    }
}