package dev.bulean.datafragmentvm

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProviders

class MainFragment : Fragment() {

    private var viewModel: MainViewModel? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java)

        val bEnter = view.findViewById<View>(R.id.bEnter) as Button
        val etInput = view.findViewById<View>(R.id.etInput) as EditText
        //listener onClick
        bEnter.setOnClickListener {
            viewModel!!.setData(etInput.text.toString())
            val bFragment = BlankFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, bFragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}