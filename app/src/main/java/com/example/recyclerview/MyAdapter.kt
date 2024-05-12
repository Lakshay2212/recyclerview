package com.example.recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(var context: Activity, var arraylist: ArrayList<User>):
    RecyclerView.Adapter<MyAdapter.MyViewHolder>(){



    class MyViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView) {

        var name = itemView.findViewById<TextView>(R.id.nameTxt)
        var lastMsg = itemView.findViewById<TextView>(R.id.lastMsgTxt)
        var lastMsgTime = itemView.findViewById<TextView>(R.id.lastMsgTimeTxt)
        var imageID = itemView.findViewById<CircleImageView>(R.id.profileImage)

    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.custom_user,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arraylist.size

    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.name.text=arraylist[position].name
        holder.lastMsg.text=arraylist[position].lastMsg
        holder.lastMsgTime.text=arraylist[position].lastMsgTime
        holder.imageID.setImageResource(arraylist[position].imageID)
    }
}



