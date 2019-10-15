package com.example.mobi_ass5_intent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class emp (val emp_name: String, val emp_gemder: String, val emp_email: String, val emp_salary: Int) : Parcelable {

}