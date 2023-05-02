package com.example.spring23e5app.Lecture12

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.spring23e5app.R


class ChildFragment : Fragment() {


    private lateinit var resultTV:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val childView = inflater.inflate(R.layout.fragment_child, container, false)
        resultTV = childView.findViewById(R.id.child_data_tv)

        return childView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        resultTV.text = arguments?.getString("parentData")?:"No value received"
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String) =
            ChildFragment().apply {
                arguments = Bundle().apply {
                    putString("parentData", param1)
                }
            }
    }
}