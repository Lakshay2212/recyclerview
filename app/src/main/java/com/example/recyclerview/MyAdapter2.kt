package com.example.recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter2(var context: Activity, var arraylist2: ArrayList<User2>):
    RecyclerView.Adapter<MyAdapter2.MyViewHolder>(){
    class MyViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){
        var name2 = itemView.findViewById<TextView>(R.id.nameTxt)
        var lastMsgTime2 = itemView.findViewById<TextView>(R.id.lastMsgTimeTxt)
        var imageID2 = itemView.findViewById<CircleImageView>(R.id.profileImage)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_user2,parent,false)
        return MyAdapter2.MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arraylist2.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name2.text=arraylist2[position].name2
        holder.lastMsgTime2.text=arraylist2[position].lastMsgTime2
        holder.imageID2.setImageResource(arraylist2[position].imageID2)
    }

}