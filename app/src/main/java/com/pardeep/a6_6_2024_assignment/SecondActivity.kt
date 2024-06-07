package com.pardeep.a6_6_2024_assignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    // intilization of variable
    var back : Button? = null
    var textView1 =""
    var textView2 = ""
    var textView3 = ""
    var textView4 = ""




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        back = findViewById(R.id.back)

        intent.extras?.let {
            textView1 = intent.getStringExtra("name")?:""
            textView2 = intent.getStringExtra("number")?:""
            textView3 = intent.getStringExtra("college_name")?:""
            textView4 = intent.getStringExtra("field_name")?:""

            }

        var tv_view = findViewById<TextView>(R.id.usertextView)
        tv_view?.setText(textView1)
        var tv_view2 =findViewById<TextView>(R.id.number_text_view)
        tv_view2?.setText(textView2)





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        back?.setOnClickListener()
        {
            var intent = Intent(this , MainActivity::class.java)
            startActivities(arrayOf(intent))
        }
    }
}