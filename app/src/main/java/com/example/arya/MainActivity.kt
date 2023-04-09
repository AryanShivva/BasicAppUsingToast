package com.example.arya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonup=findViewById<Button>(R.id.buttonupload)
        val buttondown=findViewById<Button>(R.id.buttondownload)

        buttonup.setOnClickListener {
            Toast.makeText(applicationContext, "uploading the files....", Toast.LENGTH_SHORT).show()

        }
        buttondown.setOnClickListener {
            Toast.makeText(applicationContext, "downloading....", Toast.LENGTH_SHORT).show()
        }

    }
}