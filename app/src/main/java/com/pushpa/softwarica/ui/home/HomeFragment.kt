package com.pushpa.softwarica.ui.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pushpa.softwarica.MainActivity
import com.pushpa.softwarica.R
import com.pushpa.softwarica.adapter.UserAdapter

class HomeFragment : Fragment() {

private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.findViewById(R.id.recyclerView)

        val adapter = UserAdapter(this.activity as Context, MainActivity.userList)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter=adapter
        return view
    }
}