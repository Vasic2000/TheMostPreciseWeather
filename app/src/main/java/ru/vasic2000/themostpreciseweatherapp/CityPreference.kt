package ru.vasic2000.themostpreciseweatherapp

import android.app.Activity
import android.content.SharedPreferences

class CityPreference {
    private val KEY = "city"
    private val MOSCOW = ""
    private val OW_KEY = "APPID"
    private val OW_MY_KEY = "07795d846f9c55c418379de9d14962e7"

    private var sharedPreferences //Спец класс для длительного хранения
            : SharedPreferences? = null

    fun CityPreference(activity: Activity) {
        sharedPreferences = activity.getPreferences(Activity.MODE_PRIVATE)
    }

    fun getCity(): String? {
        return sharedPreferences!!.getString(KEY, MOSCOW)
    }

    fun getSecretKey(): String? {
        return sharedPreferences!!.getString(OW_KEY, OW_MY_KEY)
    }

    fun setCity(city: String?) {
        sharedPreferences!!.edit().putString(KEY, city).apply()
    }
}