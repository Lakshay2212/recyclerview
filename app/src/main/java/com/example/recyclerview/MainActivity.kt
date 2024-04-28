package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.auth.User



class MainActivity : AppCompatActivity() {
    lateinit var UserArrayList:ArrayList<User>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler =findViewById<RecyclerView>(R.id.recycler)
        recycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val name = arrayOf("Lakshay","Daksh","Aditya","Moin","Harsh","Mitansh","Kanish","Pavitra","Rohit","Harsh")
        val lastMsg = arrayOf("hlo","hello","hi","hii","hey","heya","ok","ok bro","thanks","thankyou")
        val lastMsgTime = arrayOf("4:50 AM","4:55 AM","8:00 AM","8:30 AM","8:35 AM","9:00 AM","9:30 AM","9:35 AM","10:00 AM","10:30 AM")
        val imageID = intArrayOf(R.drawable.an1,R.drawable.an2,R.drawable.an3,R.drawable.an4,R.drawable.an5,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic7,R.drawable.pic8)

        UserArrayList = ArrayList()


        for(i in name.indices)
        {
            val user= User(imageID[i],name[i],lastMsg[i],lastMsgTime[i])
            UserArrayList.add(user)
        }



        recycler.adapter= MyAdapter(this,UserArrayList)
    }





}

