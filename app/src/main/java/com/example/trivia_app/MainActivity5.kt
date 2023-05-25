package com.example.trivia_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val button7 : Button = findViewById(R.id.Check3)
        val button8 : Button = findViewById(R.id.nextquestion3)
        button7.setOnClickListener(){
            checkanswer()

        }
        button8.setOnClickListener(){
            openquestion5()

        }
    }

    private fun openquestion5() {
        val intent3 = Intent(this,MainActivity6::class.java)
        startActivity(intent3)
    }

    private fun checkanswer() {
        val radiobutton4 : RadioGroup = findViewById(R.id.question4_options)
        val selectedid4 = radiobutton4.checkedRadioButtonId
        val text : TextView = findViewById(R.id.checkanswer4)
        if(selectedid4 == R.id.question4_option1){
            text.text="CORRECT"
        }
        if(selectedid4 == R.id.question4_option2){
            text.text="WRONG"
        }
        if(selectedid4 == R.id.question4_option3){
            text.text="WRONG"
        }
        if(selectedid4 == R.id.question4_option4){
            text.text="WRONG"
        }
    }
}