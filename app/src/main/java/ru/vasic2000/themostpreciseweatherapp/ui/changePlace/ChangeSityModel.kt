package ru.vasic2000.themostpreciseweatherapp.ui.changePlace

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ChangeSityModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is change city Fragment"
    }
    val text: LiveData<String> = _text
}