package com.example.trivia_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val button5 : Button = findViewById(R.id.Check2)
        val button6 : Button = findViewById(R.id.nextquestion2)
        button5.setOnClickListener(){
            checkanswer()

        }
        button6.setOnClickListener(){
            openquestion4()

        }
    }

    private fun openquestion4() {
        val intent3 = Intent(this,MainActivity5::class.java)
        startActivity(intent3)

    }

    private fun checkanswer() {
        val radiobutton3 : RadioGroup = findViewById(R.id.question3_options)
        val selectedid3 = radiobutton3.checkedRadioButtonId
        val text : TextView = findViewById(R.id.checkanswer3)
        if(selectedid3 == R.id.question3_option1){
            text.text="WRONG"
        }
        if(selectedid3 == R.id.question3_option2){
            text.text="WRONG"
        }
        if(selectedid3 == R.id.question3_option3){
            text.text="WRONG"
        }
        if(selectedid3 == R.id.question3_option4){
            text.text="CORRECT"
        }
    }
}