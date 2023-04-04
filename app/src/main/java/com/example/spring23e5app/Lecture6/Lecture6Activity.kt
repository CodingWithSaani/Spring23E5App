
package com.example.spring23e5app.Lecture6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.spring23e5app.R

class Lecture6Activity : AppCompatActivity() {

    private lateinit var firstValueET:EditText
    private lateinit var secondValueET:EditText

    private lateinit var magicBtn:Button
    private lateinit var resultTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture6)

        firstValueET = findViewById(R.id.first_value_et)
        secondValueET= findViewById(R.id.second_value_et)

        magicBtn= findViewById(R.id.magic_btn)
        resultTV= findViewById(R.id.result_tv)

        magicBtn.setOnClickListener {
            doTheMagic()
        }
    }

    private fun doTheMagic()
    {
        if(firstValueET.text.toString().isNotEmpty() &&
            secondValueET.text.toString().isNotEmpty())
        {
            var firstValue = firstValueET.text.toString().toInt()
            var secondValue = secondValueET.text.toString().toInt()

            var result = firstValue + secondValue
            resultTV.text = "${getString(R.string.result_tv)} $result"
        }
        else if(firstValueET.text.toString().isEmpty())
        {
            Toast.makeText(Lecture6Activity@this, "Please enter the data" +
                    "into first field", Toast.LENGTH_SHORT).show()

            firstValueET.requestFocus()
        }
        else if(secondValueET.text.toString().isEmpty())
        {
            Toast.makeText(Lecture6Activity@this, "Please enter the data" +
                    "into second field", Toast.LENGTH_SHORT).show()

            secondValueET.requestFocus()
        }
        else
        {
            Toast.makeText(Lecture6Activity@this, "Something went wrong",
                Toast.LENGTH_SHORT).show()
        }
    }
}