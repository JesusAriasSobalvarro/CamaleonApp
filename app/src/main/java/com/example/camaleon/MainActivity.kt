package com.example.camaleon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.camaleon.Models.GameInfo
import com.example.camaleon.ViewModels.GamesByUserViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        val gamesByUserViewModel: GamesByUserViewModel

        val mAdapter = GameByUserAdapter(HashMap())

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.apply {
            layoutManager = LinearLayoutManager(this.context)
            adapter = mAdapter
        }

        //val repo = GamesByUserRepository()
        //repo.addGameByUser("Game2", 10)

        gamesByUserViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(this.application))
            .get(GamesByUserViewModel::class.java)




        gamesByUserViewModel.getGamesByUser().observe(this,
            Observer<HashMap<String, GameInfo>> {
                mAdapter.setMemberList(it)
            })

    }
}