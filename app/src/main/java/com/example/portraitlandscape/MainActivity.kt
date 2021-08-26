package com.example.portraitlandscape

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var name: String = ""
    var position: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playerEntry: EditText = findViewById(R.id.editName)
        val positionEntry: EditText = findViewById(R.id.editPosition)
        val display: Button = findViewById(R.id.button)
        val output: TextView = findViewById(R.id.outputText)

        display.setOnClickListener {
            if (checkData()) {
                name = playerEntry.text.toString()
                position = positionEntry.text.toString()

                output.text = "Player: " + name + "\n Position: " + position

            }
        }
    }
    private fun checkData(): Boolean{
        val name = findViewById<EditText>(R.id.editName)
        val position = findViewById<EditText>(R.id.editPosition)

        if (name.text.toString().isEmpty()){
            //error
            name.error = "Invalid Name"
            name.requestFocus()
            return false
        }
        if (position.text.toString().isEmpty()){
            //error
            position.error = "Invalid Last Name"
            position.requestFocus()
            return false
        }
        return true
    }
}