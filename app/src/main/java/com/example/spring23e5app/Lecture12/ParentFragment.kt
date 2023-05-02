package com.example.spring23e5app.Lecture12

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.spring23e5app.R


class ParentFragment : Fragment() {

    private lateinit var mcommunicator: communicator
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is communicator)
        {
            mcommunicator  = context
        }

    }

    private lateinit var sendDataBtn:Button
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val kotlinRepresentatio = inflater.inflate(R.layout.fragment_parent, container, false)
        sendDataBtn = kotlinRepresentatio.findViewById(R.id.send_parent_data_btn)

        return kotlinRepresentatio
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sendDataBtn.setOnClickListener {
            mcommunicator.sendDataFromParentToChild("Data from parent")
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ParentFragment().apply {
                arguments = Bundle().apply {
//                    putString(ARG_PARAM1, param1)
//                    putString(ARG_PARAM2, param2)
                }
            }
    }
}