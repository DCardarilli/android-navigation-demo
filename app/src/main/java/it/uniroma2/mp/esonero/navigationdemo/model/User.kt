package it.uniroma2.mp.esonero.navigationdemo.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User (
    var name: String = "",
    var age: Int = 0
) : Parcelable