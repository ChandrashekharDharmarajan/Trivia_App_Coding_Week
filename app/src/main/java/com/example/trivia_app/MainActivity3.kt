package com.example.trivia_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val button3 : Button = findViewById(R.id.Check1)
        val button4 : Button = findViewById(R.id.nextquestion1)
        button3.setOnClickListener(){
            checkanswer()

        }
        button4.setOnClickListener(){
            openquestion3()

        }



    }

    private fun openquestion3() {
        val intent2 = Intent(this,MainActivity4::class.java)
        startActivity(intent2)
    }

    private fun checkanswer() {
        val radiobutton2 : RadioGroup = findViewById(R.id.question2_options)
        val selectedid2 = radiobutton2.checkedRadioButtonId
        val text : TextView = findViewById(R.id.checkanswer2)
        if(selectedid2 == R.id.question2_option1){
            text.text="WRONG"
        }
        if(selectedid2 == R.id.question2_option2){
            text.text="WRONG"
        }
        if(selectedid2 == R.id.question2_option3){
            text.text="CORRECT"
        }
        if(selectedid2 == R.id.question2_option4){
            text.text="WRONG"
        }
    }
}