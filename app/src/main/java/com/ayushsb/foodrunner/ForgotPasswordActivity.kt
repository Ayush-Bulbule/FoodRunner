package com.ayushsb.foodrunner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgotPasswordActivity : AppCompatActivity() {

    lateinit var edPhone: EditText
    lateinit var edEmail: EditText
    lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        edPhone = findViewById(R.id.edPhone1)
        edEmail = findViewById(R.id.edEmail1)
        btnSubmit = findViewById(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            var email = edEmail.text.toString()
            var phone = edPhone.text.toString()

            Toast.makeText(
                this@ForgotPasswordActivity,
                "Email:$email and Phone:$phone",
                Toast.LENGTH_SHORT
            ).show()
        }


    }
}