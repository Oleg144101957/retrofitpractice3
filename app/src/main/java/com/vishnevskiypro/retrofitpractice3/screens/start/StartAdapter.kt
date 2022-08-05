package com.vishnevskiypro.retrofitpractice3.screens.start

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice3.R
import com.vishnevskiypro.retrofitpractice3.databinding.ItemMoneyBinding
import com.vishnevskiypro.retrofitpractice3.model.nal.Nalichka
import com.vishnevskiypro.retrofitpractice3.model.nal.NalichkaItem

class StartAdapter : RecyclerView.Adapter<StartAdapter.StartViewHolder>(){

    private var listOfCurrencyNal = emptyList<NalichkaItem>()

    class StartViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val binding = ItemMoneyBinding.bind(view)

        fun bind(nalichkaItem: NalichkaItem){
            binding.apply {
                itemName.text = nalichkaItem.ccy
                itemBuy.text = nalichkaItem.buy
                itemSale.text = nalichkaItem.sale
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money, parent, false)
        return StartViewHolder(view)
    }


    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.bind(listOfCurrencyNal[position])
    }


    override fun getItemCount(): Int {
        return listOfCurrencyNal.size
    }

    fun setList(list: List<NalichkaItem>){
        listOfCurrencyNal = list
        notifyDataSetChanged()
    }

}