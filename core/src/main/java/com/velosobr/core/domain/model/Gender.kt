package com.velosobr.core.domain.model

sealed class Gender(val name: String) {
    object Male : Gender("male")
    object Female : Gender("female")
    object Third : Gender("third")

    companion object {
        fun fromString(name: String): Gender {

            return when (name) {
                "male" -> Male
                "female" -> Female
                "third" -> Third
                else -> Male
            }
        }
    }
}
