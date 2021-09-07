package com.ayushsb.foodrunner

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var txtRegister: TextView
    lateinit var txtForgotPassword: TextView
    lateinit var btnLogin: Button
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editNumber:EditText
    lateinit var editPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()
        actionBar?.hide()

        sharedPreferences = getSharedPreferences(getString(R.string.preference_file_key), Context.MODE_PRIVATE)


        txtRegister = findViewById(R.id.txtRegister)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        btnLogin = findViewById(R.id.btnLogin)
        editNumber = findViewById(R.id.edPhoneField1)
        editPassword = findViewById(R.id.edPasswordField1)

        txtRegister.setOnClickListener {
            var intent = Intent(this@LoginActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }

        txtForgotPassword.setOnClickListener {
            var intent = Intent(this@LoginActivity, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener{
            savePrefrences()
            var number = editNumber.text.toString()
            var password = editPassword.text.toString()

            Toast.makeText(this@LoginActivity,"Number: $number Password: $password",Toast.LENGTH_SHORT).show()
            var intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun savePrefrences() {
        sharedPreferences.edit().putBoolean("isLoggedIn", true).apply()
    }

}