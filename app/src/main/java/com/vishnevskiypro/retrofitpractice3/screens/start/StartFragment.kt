package com.vishnevskiypro.retrofitpractice3.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice3.R
import com.vishnevskiypro.retrofitpractice3.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private lateinit var binding: FragmentStartBinding
    private lateinit var adapter: StartAdapter
    private lateinit var recyclerView: RecyclerView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        val mViewModel = ViewModelProvider(this).get(StartViewModel::class.java)
        binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        adapter = StartAdapter()
        recyclerView = binding.rvStart
        recyclerView.adapter = adapter

        mViewModel.getNalMoney()

        mViewModel.moneyList.observe(viewLifecycleOwner, { list ->
            list.body()?.let { adapter.setList(it) }
        })

        return binding.root
    }


}