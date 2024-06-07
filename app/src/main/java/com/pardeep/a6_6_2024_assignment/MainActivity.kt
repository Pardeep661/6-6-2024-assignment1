package com.pardeep.a6_6_2024_assignment


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.setViewTreeOnBackPressedDispatcherOwner
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner



class MainActivity : AppCompatActivity() {

    // initilization of var using null statement
    var btn1: RadioButton? = null
    var btn2: RadioButton? = null
    var edit_name: EditText? = null
    var number: EditText? = null
    var birthdate: EditText? = null
    var college_name: EditText? = null
    var field_name: EditText? = null
    var next: Button? = null
    var extra_data1 = null
    var extra_data2 = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        edit_name = findViewById(R.id.et_name)
        number = findViewById(R.id.number)
        birthdate = findViewById(R.id.birthdate)
        btn1 = findViewById(R.id.radioButton1)
        btn2 = findViewById(R.id.radioButton2)
        field_name = findViewById(R.id.field_name)
        college_name = findViewById(R.id.college_name)
        field_name = findViewById(R.id.field_name)
        next = findViewById(R.id.next)



        next?.setOnClickListener()
        {
            if (edit_name?.text?.trim().isNullOrBlank()) {
                edit_name?.setError("enter your name")
            } else if (number?.text?.trim().isNullOrBlank()) {
                number?.setError("enter the number")
            } else if (birthdate?.text?.trim().isNullOrBlank()) {
                birthdate?.setError("please enter your birthdate")
            } else {
                var intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("name", edit_name?.text?.toString()?.trim())
                intent.putExtra("number", number?.text?.toString()?.trim())
                intent.putExtra("birthdate", birthdate?.text?.toString()?.trim())
                intent.putExtra("college_name", college_name?.text?.toString()?.trim())
                intent.putExtra("field_name", field_name?.text?.toString()?.trim())

                startActivity(intent)
            }

        }
        btn1?.setOnClickListener() {
            Toast.makeText(this,"yes button is click", Toast.LENGTH_SHORT).show()
        }


    }
}