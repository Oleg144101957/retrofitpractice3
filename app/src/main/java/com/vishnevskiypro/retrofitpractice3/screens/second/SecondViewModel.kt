package com.vishnevskiypro.retrofitpractice3.screens.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice3.data.repository.Repository
import com.vishnevskiypro.retrofitpractice3.model.beznal.Beznalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class SecondViewModel : ViewModel(){

    val repo = Repository()
    val moneyList: MutableLiveData<Response<Beznalichka>> = MutableLiveData()

    fun getBeznalMoney(){
        viewModelScope.launch{
            moneyList.value = repo.getBeznal()
        }
    }

}