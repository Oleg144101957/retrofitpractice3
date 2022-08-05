package com.vishnevskiypro.retrofitpractice3.screens.second

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vishnevskiypro.retrofitpractice3.R
import com.vishnevskiypro.retrofitpractice3.databinding.ItemMoneyBinding
import com.vishnevskiypro.retrofitpractice3.model.beznal.BeznalichkaItem

class SecondAdapter : RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {

    private var listCurrencyBeznal = emptyList<BeznalichkaItem>()


    class SecondViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemMoneyBinding.bind(view)

        fun bind(beznalichkaItem: BeznalichkaItem){
            binding.apply {
                itemName.text = beznalichkaItem.ccy
                itemBuy.text = beznalichkaItem.buy
                itemSale.text = beznalichkaItem.sale
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_money, parent, false)
        return SecondViewHolder(view)

    }


    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.bind(listCurrencyBeznal[position])
    }


    override fun getItemCount(): Int {
        return listCurrencyBeznal.size
    }

    fun setList(list: List<BeznalichkaItem>){
        listCurrencyBeznal = list
        notifyDataSetChanged()
    }


}