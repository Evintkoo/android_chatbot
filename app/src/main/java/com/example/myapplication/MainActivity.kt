package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.ImageButton
import android.widget.Toast
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    public var chats : List<String> = emptyList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input = findViewById<EditText>(R.id.user_input)
        val linearLayout: LinearLayout = findViewById(R.id.linearLayout)
        val btnSubmit = findViewById<ImageButton>(R.id.send_button)
        val response = findViewById<TextView>(R.id.assistant_response)
        val linearLayout: LinearLayout = findViewById(R.id.linearLayout)
        btnSubmit.setOnClickListener {
            val question = input.text.toString()
            chats = chats + question
            // change variable question at this bottom to the response later
            Toast.makeText(this, question, Toast.LENGTH_SHORT).show()
            //getResponse()
        }
        for (text in chats) {
            val textView = TextView(this)
            textView.text = text
            textView.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            textView.setPadding(0, 16, 0, 16)
            textView.textSize = 16f

            linearLayout.addView(textView)
        }
    }
    /*fun getResponse(question:String) {

    }*/
}