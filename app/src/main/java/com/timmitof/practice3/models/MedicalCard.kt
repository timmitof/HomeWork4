package com.timmitof.practice3.models

import java.io.Serializable
import java.util.*

data class MedicalCard(
    var id: String,
    var fullName: String,
    var birthDate: String?,
    var gender: String,
    var bloodGroup: String,
    var address: String?
) : Serializable
