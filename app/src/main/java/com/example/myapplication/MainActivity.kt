package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var CheckboxKi: CheckBox
    private lateinit var CheckboxAra: CheckBox
    private lateinit var EditText: EditText
    private lateinit var Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CheckboxKi = findViewById(R.id.checkBoxKi)
        CheckboxAra = findViewById(R.id.checkBoxAra)
        EditText = findViewById(R.id.editText)
        Button = findViewById(R.id.button)
    }

    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkBoxKi -> {
                    if (checked) {
                        Button.setOnClickListener{

                            Toast.makeText(applicationContext,"წარმატებით გაიგზავნა", Toast.LENGTH_LONG).show()
                        }

                    } else {
                        // Remove the meat
                    }
                }
                R.id.checkBoxAra -> {
                    if (checked) {
                        Button.setOnClickListener{
                            EditText.getText().clear();
                            Toast.makeText(applicationContext,"თქვენ არ ხართ ვაქცინირებული", Toast.LENGTH_LONG).show()
                        }


                    } else {
                        // I'm lactose intolerant
                    }
                }

            }
        }
    }
}