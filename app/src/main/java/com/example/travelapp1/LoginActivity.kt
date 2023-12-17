package com.example.travelapp1

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class LoginActivity : AppCompatActivity() {
    private var editTextUsername: EditText? = null
    private var editTextPassword: EditText? = null
    private var buttonLogin: Button? = null
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        editTextUsername = findViewById(R.id.editTextUsername)
        editTextPassword = findViewById(R.id.editTextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)
        buttonLogin!!.setOnClickListener {

            val username = editTextUsername!!.text.toString()
            val password = editTextPassword!!.text.toString()
            if (isValidCredentials(username, password)) {

                val intent: Intent = Intent(
                    this@LoginActivity,
                    MainActivity::class.java
                )
                ContextCompat.startActivity(intent)
                finish()
            } else {

            }
        }
    }

    private fun isValidCredentials(username: String, password: String): Boolean {

        return username == "demo" && password == "password"
    }
}
