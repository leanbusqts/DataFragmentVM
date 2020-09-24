package dev.bulean.datafragmentvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders

class BlankFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return LayoutInflater.from(container!!.context).inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val data = view.findViewById<View>(R.id.tvOutput) as TextView
        val viewModel = ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java)
        viewModel.data.observe(viewLifecycleOwner,
            { d -> data.text = d!!.toString() })
    }
}