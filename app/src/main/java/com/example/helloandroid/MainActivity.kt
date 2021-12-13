package com.example.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private var greetingText: TextView? = null
    private var inputText: EditText? = null
    private var changeButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingText = findViewById(R.id.greeting_text)
        inputText = findViewById(R.id.input_text)
        changeButton = findViewById(R.id.change_button)

        changeButton?.setOnClickListener {
            greetingText?.text = inputText?.text
        }
    }
}