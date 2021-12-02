package com.timmitof.practice3

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.timmitof.practice3.models.MedicalCard
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class SecondActivity : AppCompatActivity() {
    lateinit var tvId: TextView
    lateinit var tvFullName: TextView
    lateinit var tvBirthDate: TextView
    lateinit var tvGender: TextView
    lateinit var tvBloodGroup: TextView
    lateinit var tvAddress: TextView
    lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvId = findViewById(R.id.tvIdUser)
        tvFullName = findViewById(R.id.tvFullName)
        tvBirthDate = findViewById(R.id.tvBirthDate)
        tvGender = findViewById(R.id.tvGender)
        tvBloodGroup = findViewById(R.id.tvBloodGroup)
        tvAddress = findViewById(R.id.tvAddress)
        backButton = findViewById(R.id.backBtn)

        val medicalCard = intent.getSerializableExtra("MEDICALCARD") as MedicalCard

        //"Tue Jan 28 00:00:00 GMT+06:00 3902"
//        val input = SimpleDateFormat("EEE MMM dd HH:mm:ss zzzz yyyy")
//        val output = SimpleDateFormat("dd MMM")
//        val date = input.parse(medicalCard.birthDate.toString())

        tvId.text = medicalCard.id
        tvFullName.text = medicalCard.fullName
        tvBirthDate.text = medicalCard.birthDate.toString()
        tvGender.text = medicalCard.gender
        tvBloodGroup.text = medicalCard.bloodGroup
        tvAddress.text = medicalCard.address

        backButton.setOnClickListener {
            onBackPressed()
        }

        Log.i("MEDICALCARD", medicalCard.toString())
    }
}