package com.pushpa.softwarica.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.pushpa.softwarica.MainActivity
import com.pushpa.softwarica.R
import com.pushpa.softwarica.model.User

class DashboardFragment : Fragment(), View.OnClickListener {
    private lateinit var uid : EditText
    private lateinit var fname : EditText
    private lateinit var age : EditText
    private lateinit var address : EditText
    private lateinit var imgurl : EditText
    private lateinit var male : RadioButton
    private lateinit var female : RadioButton
    private lateinit var save : Button
     var gender = ""

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
            uid = view.findViewById(R.id.uid)
            fname = view.findViewById(R.id.fName)
            age = view.findViewById(R.id.age)
            address = view.findViewById(R.id.address)
            imgurl = view.findViewById(R.id.imgurl)
            male = view.findViewById(R.id.male)
            female = view.findViewById(R.id.female)
            save = view.findViewById(R.id.save)

            male.setOnClickListener(this)
            female.setOnClickListener(this)
            save.setOnClickListener(this)
        return view
    }
    private fun addUser(){
        val id = uid.text.toString().toInt()
        val name = fname.text.toString()
        val uage = age.text.toString().toInt()
        val uaddress = address.text.toString()
        val uimgurl = imgurl.text.toString()
        val ugender = gender

        MainActivity.userList.add(User(id,name,uage,ugender,uaddress,uimgurl))
    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.save ->{
                addUser()
            }
            R.id.male ->{
                gender = "Male"
            }
            R.id.female ->{
                gender = "Female"
            }
        }
    }
}