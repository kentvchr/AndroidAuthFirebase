package com.kent.androidauthfirebase

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var btnSignOut :Button
    private lateinit var mAuth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSignOut = findViewById(R.id.btnSignOut)
        mAuth = FirebaseAuth.getInstance()
        btnSignOut.setOnClickListener {
            mAuth.signOut()
            Toast.makeText(this, "SignOut Successful", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}