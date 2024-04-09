package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //btnClear = findViewById(R.id.btnClear)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val txtAge = findViewById<EditText>(R.id.txtAge)
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)

        val txtResults = findViewById<TextView>(R.id.txtResults)
        btnGenerate.setOnClickListener {
            val age = txtAge.text.toString().toIntOrNull()
            if (age != null) {
                val result = when (age) {
                    in 20..29 -> "XXXTentacion"
                    in 30..39 -> "Bruce Lee"
                    in 40..49 -> "Bob Marley"
                    in 50..54 -> "Michael Jackson"
                    in 56..59 -> "Steve Jobs"
                    in 60..64 -> "Diego Maradona"
                    in 65..69 -> "Franklin J. Schaffner"
                    in 70..74 -> "John Ritter"
                    in 75..79 -> "Jay Thomas"
                    in 90..100 -> "Nelson Mandela"
                    else -> "Senior"
                }
                txtResults.text = "Age : $age\n${
                    when (result) {
                        "XXXTentacion" -> "Was a young American rapper and singer-songwriter his real name is jahsen Dwayne Ricardo Onfroy.He passed away at the age of 20 through a gun short."
                        "Bruce Lee" -> "Was a Martial arts actor he passed away through an allergy reaction in 1973. He passed away at the age 31."
                        "Bob Marley" -> "Was a reggae musician, he passed away through Melanoma that metastasized into lung and brain cancer in 1981."
                        "Michael Jackson" -> "Was an American singer/songwriter, dancer known as king of pop. He death was ruled as homicide in 2009."
                        "Steve jobs" -> "He was an American bussinessman, invetor and invester, he is the co-founder of the company Apple.He died of complications from oancreatic cancer in 2011"
                        "Diego Maradona" -> "He was a professional soccer and a caoch, He died in his sleep because of buildup of fluid in the lungs and congestive heart failure in 2020."
                        "Franklin J. Schaffner" -> "He was a producer. writer, He died from lung cancer in 1989."
                        "John Ritter" -> "He was and actor, producer and writer, He died undetected aortic dessection in 2003."
                        "Jay Thomas" -> "He was and actor, producer and writer, He died from cancer in 2017."
                        "Nelson Mandela" -> "He was a freedom fighter and a president of South Africa, He died from respiratory tract infection in 2013."
                        else -> "Senior."

                    }
                }"
            } else {
                txtResults.text = "Please enter a valid age."
            }

    }
    btnClear.setOnClickListener {
        txtAge.text.clear()
        txtResults.text = ""
        }



}

}



