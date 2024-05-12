package com.example.recyclerview

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    lateinit var userarraylist: ArrayList<User2>


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main2)
        val recycler2 = findViewById<RecyclerView>(R.id.recycler2)
        recycler2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val name2 = arrayOf(
            "Lakshay",
            "Daksh",
            "Aditya",
            "Moin",
            "Harsh",
            "Mitansh",
            "Kanish",
            "Pavitra",
            "Rohit",
            "Harsh"
        )
        val lastMsgTime2 = arrayOf(
            "4:50 AM",
            "4:55 AM",
            "8:00 AM",
            "8:30 AM",
            "8:35 AM",
            "9:00 AM",
            "9:30 AM",
            "9:35 AM",
            "10:00 AM",
            "10:30 AM"
        )
        val imageID2 = intArrayOf(
            R.drawable.an1,
            R.drawable.an2,
            R.drawable.an3,
            R.drawable.an4,
            R.drawable.an5,
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic7,
            R.drawable.pic8
        )
        userarraylist = ArrayList()


        for (i in name2.indices){
            val user = User2(imageID2[i],name2[i],lastMsgTime2[i])
            userarraylist.add(user)
        }

recycler2.adapter = MyAdapter2(this,userarraylist)
    }
}