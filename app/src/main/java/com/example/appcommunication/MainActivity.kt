package com.example.appcommunication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnsend:Button=findViewById(R.id.btnsend)
        val editUser:EditText=findViewById(R.id.editUserName)
        val email:EditText=findViewById(R.id.editEmail)

        btnsend.setOnClickListener{
       val username=editUser.text.toString()
            val emails=email.text.toString()

            val intent=Intent(this,AboutActivity::class.java)
            intent.putExtra("username",username)
            intent.putExtra("email",emails)
            startActivity(intent)
        }
    }
}