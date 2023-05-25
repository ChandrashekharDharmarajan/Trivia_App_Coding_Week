package com.example.trivia_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        val button9 : Button = findViewById(R.id.Check4)
        val button10 : Button = findViewById(R.id.nextquestion4)
        button9.setOnClickListener(){
            checkanswer()

        }
        button10.setOnClickListener(){
            endpquiz()

        }
    }

    private fun endpquiz() {
        val intent4 = Intent(this,MainActivity7::class.java)
        startActivity(intent4)
    }

    private fun checkanswer() {
        val radiobutton5 : RadioGroup = findViewById(R.id.question5_options)
        val selectedid5 = radiobutton5.checkedRadioButtonId
        val text : TextView = findViewById(R.id.checkanswer5)
        if(selectedid5 == R.id.question5_option1){
            text.text="WRONG"
        }
        if(selectedid5 == R.id.question5_option2){
            text.text="CORRECT"
        }
        if(selectedid5 == R.id.question5_option3){
            text.text="WRONG"
        }
        if(selectedid5 == R.id.question5_option4){
            text.text="WRONG"
        }
    }
}