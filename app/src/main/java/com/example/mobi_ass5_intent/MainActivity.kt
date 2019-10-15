package com.example.mobi_ass5_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import java.time.Instant

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickShowDetail (view: View){
        val intent = Intent (this, Main2Activity::class.java)

        var radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        var selectedId: Int= radioGroup.checkedRadioButtonId;
        var radioButton: RadioButton= findViewById(selectedId);

        intent.putExtra("empData", emp(emp_name.text.toString(),radioButton.text.toString(),emp_email.text.toString(), emp_salary.text.toString().toInt()))
        startActivity(intent)
    }

    fun reset(view: View) {
        emp_name.text.clear()
        radioGroup.clearCheck()
        emp_email.text.clear()
        emp_salary.text.clear()
    }
}
