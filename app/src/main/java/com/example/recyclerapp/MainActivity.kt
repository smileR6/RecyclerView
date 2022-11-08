package com.example.recyclerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.UserHandle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recycler :RecyclerView = findViewById(R.id.recycuser)

        val user1 = User("Actor" , "The Rock")
        val user2 = User( "Comedian", "KEvin Hart")
        val user3 = User("Tiwa Savage", "Musician")
        val user4 = User("Woman King", "Movie")
        val user5 = User("Black Adam", "Cinema")
        val user6 = User("Novelist", "Fiona Kemmy")
        val user7 = User("When the sun","Book")

//        array data
        val usersList = ArrayList<User>()
        usersList.add(user1)
        usersList.add(user2)
        usersList.add(user3)
        usersList.add(user4)
        usersList.add(user5)
        usersList.add(user6)
        usersList.add(user7)

        var adapter = CustomAdapter(usersList)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter





    }
}