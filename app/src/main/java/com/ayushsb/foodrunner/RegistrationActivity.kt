package com.ayushsb.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegistrationActivity : AppCompatActivity() {

    lateinit var edName: EditText
    lateinit var edEmail: EditText
    lateinit var edAddress: EditText
    lateinit var edPhone: EditText
    lateinit var edPassword: EditText
    lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        // calling the action bar
        var actionBar = getSupportActionBar()

        // showing the back button in action bar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }

        edName = findViewById(R.id.edName)
        edEmail = findViewById(R.id.edEmail)
        edPhone = findViewById(R.id.edPhone)
        edAddress = findViewById(R.id.edAddress)
        edPassword = findViewById(R.id.edPasswordField2)
        btnRegister = findViewById(R.id.btnRegister)

        btnRegister.setOnClickListener {
            Toast.makeText(
                this@RegistrationActivity,
                "Name:${edName.text?.toString()}; Email:${edEmail.text?.toString()}; Phone:${edPhone.text?.toString()}; Address:${edAddress.text?.toString()}",
                Toast.LENGTH_SHORT
            ).show()
        }


    }

    // this event will enable the back
    // function to the button on press
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }

}