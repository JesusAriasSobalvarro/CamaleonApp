package com.example.camaleon.Database

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

abstract class FirebaseDatabase {

    companion object {
        private lateinit var instance: DatabaseReference
        fun getInstance(): DatabaseReference {
            if (!this::instance.isInitialized)
                instance = Firebase.database.reference
            return instance
        }
    }
}