package com.vishnevskiypro.retrofitpractice3.screens.start

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vishnevskiypro.retrofitpractice3.data.repository.Repository
import com.vishnevskiypro.retrofitpractice3.model.nal.Nalichka
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel : ViewModel() {

    val repo = Repository()
    val moneyList: MutableLiveData<Response<Nalichka>> = MutableLiveData()

    fun getNalMoney(){
        viewModelScope.launch {
            moneyList.value = repo.getNal()
        }
    }

}