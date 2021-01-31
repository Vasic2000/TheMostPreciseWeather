package ru.vasic2000.themostpreciseweatherapp.ui.currentWeather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.vasic2000.themostpreciseweatherapp.R

class CurrentWeatherFragment : Fragment() {

    private lateinit var currentWeatherModel: CurrentWeatherModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        currentWeatherModel =
                ViewModelProvider(this).get(CurrentWeatherModel::class.java)
        val root = inflater.inflate(R.layout.fragment_current_weather, container, false)
        val textView: TextView = root.findViewById(R.id.current_weather)
        currentWeatherModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}