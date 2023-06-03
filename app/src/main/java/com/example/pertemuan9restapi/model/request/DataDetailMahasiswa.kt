package com.example.pertemuan9restapi.model.request

import com.google.gson.annotations.SerializedName

class DataDetailMahasiswa (
    @SerializedName("NIM")
    val nIM: String,
    @SerializedName("Nama")
    val nama: String,
    @SerializedName("Telepon")
    val telepon: String
)