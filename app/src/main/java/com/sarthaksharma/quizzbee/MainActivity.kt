package com.sarthaksharma.quizzbee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edText :EditText = findViewById(R.id.ed_Text)
        val btnStart : Button = findViewById(R.id.btn_Start)

        btnStart.setOnClickListener()
        {
            //by this if statement we are making sure that txt is not empty
            if(edText.text.isEmpty() or edText.text.equals(' ')){
                Toast.makeText(this,"Enter your name ",Toast.LENGTH_LONG).show()
            }else
            {
                //creating a intend to move from main to next acivity
                val intentToQuiz = Intent(this,quizQuestionActivity::class.java)
                //need to add "::class.java" that's how it is done
                // do not forget to start the Launch intent
                startActivity(intentToQuiz)

            }
        }
    }
}
//**************************** Notes *****************************
/*
==> To remove the action bar go to android manifest. or ""the best is change in the themes file easy and less complex""
    ==>its a place where  it defines the structure and metadata of our application, its components, and its requirements.
       This file includes nodes for each of the Activities, Services, Content Providers, and Broadcast Receivers that make the application,
       and using Intent Filters and Permissions determines how they coordinate with each other and other applications.

==> take a look at manifest file
 */