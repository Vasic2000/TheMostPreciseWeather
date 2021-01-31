package ru.vasic2000.themostpreciseweatherapp.ui.forecast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.vasic2000.themostpreciseweatherapp.R

class ForecastFragment : Fragment() {

    private lateinit var forecastModel: ForecastModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        forecastModel =
                ViewModelProvider(this).get(ForecastModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        forecastModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}