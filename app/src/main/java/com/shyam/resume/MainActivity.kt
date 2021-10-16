package com.shyam.resume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var workhistory = findViewById<Button>(R.id.work)
        workhistory.setOnClickListener {
            var moveToPortFolio = Intent(getApplicationContext(),Portfolio::class.java)
            startActivity(moveToPortFolio)
        }
        var callme = findViewById<Button>(R.id.callme)
        callme.setOnClickListener {
            var phoneuri = Uri.parse("tel:+919791076138")
            var callIntent = Intent(Intent.ACTION_DIAL,phoneuri)
            startActivity(callIntent)
        }
        var emailme = findViewById<Button>(R.id.emailme)
        emailme.setOnClickListener {
            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL,"clashwithchiefrpjyt@gmail.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT,"Nice Resume")
            emailIntent.putExtra(Intent.EXTRA_TEXT,"Nice Resume")
            startActivity(emailIntent)

        }
    }
}