package com.example.mobi_ass5_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var data = intent.extras
        var newemp = data?.getParcelable<emp>("empData")
        empp_name.text = "Employee Name : ${newemp?.emp_name}"
        empp_gender.text = "Gender : ${newemp?.emp_gemder}"
        empp_email.text = "E-mail : ${newemp?.emp_email}"
        empp_salary.text = "Salary : ${newemp?.emp_salary} Baht"

    }

    fun onClickClose(view:View){
        finish()
    }


}
