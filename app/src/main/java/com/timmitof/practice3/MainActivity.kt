package com.timmitof.practice3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.timmitof.practice3.models.MedicalCard
import java.sql.Date
import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var idUser: EditText
    lateinit var fullNameUser: EditText
    lateinit var birthDateUser: EditText
    lateinit var genderUser: EditText
    lateinit var bloodGroupUser: EditText
    lateinit var addressUser: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idUser = findViewById(R.id.idUser)
        fullNameUser = findViewById(R.id.fullName)
        birthDateUser = findViewById(R.id.birthDate)
        genderUser = findViewById(R.id.gender)
        bloodGroupUser = findViewById(R.id.bloodGroup)
        addressUser = findViewById(R.id.address)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val id = idUser.text.toString()
            val fullName = fullNameUser.text.toString()
            val birthDate = birthDateUser.text.toString()
            val gender = genderUser.text.toString()
            val bloodGroup = bloodGroupUser.text.toString()
            val address = addressUser.text.toString()

            val medicalCard: MedicalCard =
                MedicalCard(id, fullName, birthDate, gender, bloodGroup, address)

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("MEDICALCARD", medicalCard)
            startActivity(intent)
        }
//
//        var medicalCard = MedicalCard(
//            id = "Agent007",
//            fullName = "James Bond",
//            birthDate = Date(),
//            gender = "Male",
//            bloodGroup = "2polojitelniy",
//            address = "ul. Pushkina, Dom: Kolotushkina",
//            vaccineHistory = arrayListOf(VaccineHistory(
//                vacName = "vaccineCovid",
//                date = Date(),
//                address = "Kukushka"
//            )),
//            sicknessHistory = arrayListOf()
//        )
//        medicalCard.sicknessHistory?.add(SicknessHistory(
//            name = "Болен на голову",
//            date = Date(),
//            status = "ve4nost",
//            endDate = null
//        ))
    }
}