package com.example.abhijit.myapplicationtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button_sign_up.setOnClickListener {
            if(!edit_text_first_name.text.isBlank())
            {
                text_view_status_message.setText("success is testvc  v xvcxvcxvcxvcxvxcv xvxcv")
            }
        }
    }


    override fun onResume() {
        super.onResume()
    }

}
