package com.attrecto.librarytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alma = Alma(applicationContext)
        Log.d("LIBRARY", alma.getString(R.string.app_name))
    }
}
