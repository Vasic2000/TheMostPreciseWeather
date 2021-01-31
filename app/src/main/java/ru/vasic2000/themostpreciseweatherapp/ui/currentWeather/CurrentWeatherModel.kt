package ru.vasic2000.themostpreciseweatherapp.ui.currentWeather

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CurrentWeatherModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is current weather Fragment"
    }
    val text: LiveData<String> = _text
}