package com.post_arya415

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.arya.post_arya415.R

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvFullName = findViewById<TextView>(R.id.tvFullName)
        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvGender = findViewById<TextView>(R.id.tvGender)

        val name = intent.getStringExtra("name")
        val username = intent.getStringExtra("username")
        val age = intent.getStringExtra("age")
        val email = intent.getStringExtra("email")
        val gender = intent.getStringExtra("gender")

        tvFullName.text = name
        tvUsername.text = username
        tvAge.text = age
        tvEmail.text = email
        tvGender.text = gender
    }
}