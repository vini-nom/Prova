package com.example.calculadora_digital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var valorNum = findViewById<EditText>(R.id.editTxtNumero)
        var btnCalc = findViewById<Button>(R.id.btnCalcula)
        var btnConverte = findViewById<Button>(R.id.bt_Converte)
        var swtBit = findViewById<Switch>(R.id.swtBit)
        var swtEth = findViewById<Switch>(R.id.swtEth)
        var swtCard = findViewById<Switch>(R.id.swtCard)

        btnConverte.setOnClickListener {
            var segundaTela = Intent(this, ConversorTemp::class.java)
            startActivity(segundaTela)
        }
        btnCalc.setOnClickListener {
            var valor = valorNum.text.toString()
            var valorConvertido = valor.toDouble()
            var conversao: Double

            var alert = AlertDialog.Builder(this)

            if(swtBit.isChecked){
                conversao = valorConvertido * 0.000007661079322233582
                alert.setTitle("Valor Convertido em Bitcoin")
                alert.setMessage(conversao.toString())
                alert.create()
                alert.show()
            }

            if(swtEth.isChecked){
                conversao = valorConvertido * 0.00011201603191550745
                alert.setTitle("Valor Convertido em Etherium")
                alert.setMessage(conversao.toString())
                alert.create()
                alert.show()
            }

            if(swtCard.isChecked){
                conversao = valorConvertido * 0.00011192875535144615
                alert.setTitle("Valor Convertido em Cardona")
                alert.setMessage(conversao.toString())
                alert.create()
                alert.show()
            }
        }
    }
}