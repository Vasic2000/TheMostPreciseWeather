package ru.vasic2000.themostpreciseweatherapp.ui.forecast

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ForecastModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is forecast Fragment"
    }
    val text: LiveData<String> = _text
}