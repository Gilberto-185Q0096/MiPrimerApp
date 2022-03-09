package edu.itsco.miprimerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var txtNum1: EditText
    lateinit var txtNum2: EditText
    lateinit var lbRes: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtNum1 = findViewById(R.id.txt_n1)
        txtNum2 = findViewById(R.id.txt_n2)
        lbRes = findViewById(R.id.lb_res)


    }

    fun mayor(a:Int,b:Int):Int{

        if (a>b){
            return a
        }
        else{
            return b
        }
    }

    fun printMay (view:View){
        var a:Int = txtNum1.text.toString().toInt()
        var b:Int = txtNum2.text.toString().toInt()

        var nmayor:Int=mayor(a,b)
        lbRes.setText(nmayor.toString())
    }
}