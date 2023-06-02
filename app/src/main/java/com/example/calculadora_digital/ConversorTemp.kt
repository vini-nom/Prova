package com.example.calculadora_digital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ConversorTemp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor_temp)

        var num = findViewById<EditText>(R.id.txtTemp)
        var result = findViewById<TextView>(R.id.txtRes)
        var btnFarenheit = findViewById<Button>(R.id.btnFarenheit)
        var btnCelsius = findViewById<Button>(R.id.btnCelsius)
        var btnNavega = findViewById<Button>(R.id.btnMoeda)

        btnFarenheit.setOnClickListener{
            var numCalc = num.text.toString()
            var numCalcFim = numCalc.toDouble()

            var calc = (numCalcFim - 32) * 5 / 9

            var res = calc.toString().format("%.2f",calc.toString()).substring(0,5)

            result.setText(res)
        }

        btnCelsius.setOnClickListener{
            var numCalc = num.text.toString()
            var numCalcFim = numCalc.toDouble()

            var calc = numCalcFim * 9 / 5 + 32

            var res = calc.toString()

            result.setText(res)
        }

        btnNavega.setOnClickListener {
            val inten = Intent(this, MainActivity::class.java)
            startActivity(inten)
        }
    }
}