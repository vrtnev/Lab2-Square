package com.example.kubik

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            calc()
        }
    }



    fun calc(){
        val value = editText.text.toString()/*.toInt()*/

        if(value.isEmpty()){
            Toast.makeText(this, "Введите число!", Toast.LENGTH_SHORT).show()
        } else {
            var a: Int = Integer.parseInt(value)
            val res = a * a
            textView2.text = res.toString()
        }
    }
}
