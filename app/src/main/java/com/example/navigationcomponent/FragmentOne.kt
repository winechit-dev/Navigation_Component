package com.example.navigationcomponent


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_one.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Button.setOnClickListener {
            val navController =Navigation.findNavController(activity!!, R.id.my_nav_host_fragment)
            navController.navigate(R.id.action_fragment_one_to_fragment_two)
        }
        Button2.setOnClickListener {
            val navController =Navigation.findNavController(activity!!, R.id.my_nav_host_fragment)
            navController.navigate(R.id.action_fragment_one_to_item_fragment)
        }
    }

}
