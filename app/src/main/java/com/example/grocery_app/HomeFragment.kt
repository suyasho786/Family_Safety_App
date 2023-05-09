package com.example.grocery_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listMembers = listOf<MemberModel>(
            MemberModel("suyash","8209590494"),
            MemberModel("mili","8441875787"),
            MemberModel("NityaNand Mishra","9414976698"),
            MemberModel("kamini Mishra","7425944695"),
            MemberModel("kamini Mishra","7425944695"),
            MemberModel("kamini Mishra","7425944695"),
            MemberModel("kamini Mishra","7425944695"),
            MemberModel("kamini Mishra","7425944695")
        )
        val adapter = MemberAdapter(listMembers)
        val recycler = requireView().findViewById<RecyclerView>(R.id.homeRecyclerView)
        recycler.layoutManager = LinearLayoutManager(requireContext())
        recycler.adapter = adapter
    }
    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}