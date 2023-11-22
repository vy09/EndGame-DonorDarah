package com.example.donordarah.ui.theme.Fitur

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class PMI2(
    val imgPmi: Int,
    val namePmi: String,
    val almtPmi: String
) : Parcelable
