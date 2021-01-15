package com.pushpa.softwarica.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.pushpa.softwarica.R
import com.pushpa.softwarica.model.User
import org.w3c.dom.Text

class UserAdapter(val context: Context,val lstUser:ArrayList<User>):RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    class UserViewHolder(view: View):RecyclerView.ViewHolder(view){
        val profile:ImageView
        val name:TextView
        val age:TextView
        val address:TextView
        val btnDel:ImageButton
        val gender:TextView

        init {
            profile = view.findViewById(R.id.profile)
            name = view.findViewById(R.id.name)
            age = view.findViewById(R.id.age)
            address = view.findViewById(R.id.address)
            btnDel = view.findViewById(R.id.btnDel)
            gender = view.findViewById(R.id.gender)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.post,parent,false)
        return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lstUser.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = lstUser[position]
        holder.name.text=user.name.toString()
        holder.age.text=user.age.toString()
        holder.address.text=user.address.toString()
        holder.gender.text=user.gender.toString()

        Glide.with(context).load(user.imgurl).into(holder.profile)
        holder.btnDel.setOnClickListener{
            lstUser.removeAt(position)
            notifyDataSetChanged()
        }
    }
}