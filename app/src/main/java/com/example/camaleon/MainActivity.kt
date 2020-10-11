package com.example.camaleon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.camaleon.Database.FirebaseDatabase
import com.example.camaleon.Repository.GamesByUserRepository
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repo = GamesByUserRepository()
        //repo.addGameByUser("Game2", 10)

    }
}