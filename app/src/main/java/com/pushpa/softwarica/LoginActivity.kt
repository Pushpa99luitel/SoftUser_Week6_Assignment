package com.pushpa.softwarica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var username: EditText
    private lateinit var password: EditText
    private lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        username=findViewById(R.id.username)
        password=findViewById(R.id.password)
        login=findViewById(R.id.login)

        login.setOnClickListener {
            val us=username.text.toString()
            val pw=password.text.toString()
            if (us=="softwarica" && pw=="coventry"){
                val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }

        }
    }
}