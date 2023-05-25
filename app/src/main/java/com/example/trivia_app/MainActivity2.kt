package com.example.trivia_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val button1 : Button = findViewById(R.id.Check)
        val button2 : Button = findViewById(R.id.nextquestion)
        button1.setOnClickListener(){
            checkanswer()

        }
        button2.setOnClickListener(){
            openquestion2()

        }
    }

    private fun openquestion2() {
        val intent1 = Intent(this,MainActivity3::class.java)
        startActivity(intent1)
    }

    private fun checkanswer() {
        val radiobutton1 : RadioGroup = findViewById(R.id.question2_options)
        val selectedid1 = radiobutton1.checkedRadioButtonId
        val text : TextView = findViewById(R.id.checkanswer1)
        if(selectedid1 == R.id.question1_option1){
            text.text="WRONG"
        }
        if(selectedid1 == R.id.question1_option2){
            text.text="CORRECT"
        }
        if(selectedid1 == R.id.question1_option3){
            text.text="WRONG"
        }
        if(selectedid1 == R.id.question1_option4){
            text.text="WRONG"
        }

    }
}