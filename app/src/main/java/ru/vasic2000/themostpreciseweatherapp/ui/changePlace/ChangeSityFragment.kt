package ru.vasic2000.themostpreciseweatherapp.ui.changePlace

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.vasic2000.themostpreciseweatherapp.R

class ChangeSityFragment : Fragment() {

    private lateinit var changeSityModel: ChangeSityModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        changeSityModel =
                ViewModelProvider(this).get(ChangeSityModel::class.java)
        val root = inflater.inflate(R.layout.fragment_change_sity, container, false)
        val textView: TextView = root.findViewById(R.id.change_sity)
        changeSityModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}