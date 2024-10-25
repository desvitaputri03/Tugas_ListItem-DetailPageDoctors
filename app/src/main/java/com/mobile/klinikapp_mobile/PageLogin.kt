package com.mobile.klinikapp_mobile

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mobile.klinikapp_mobile.screen.HomeDoctorsActivity

class PageLogin : AppCompatActivity() {
    private lateinit var txtSignUp : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)
        txtSignUp = findViewById(R.id.txtSignUp)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtSignUp.setOnClickListener(){
            val intentPassingData = Intent(this,PageRegister::class.java)
            startActivity(intentPassingData)
        }
    }
}