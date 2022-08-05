package com.vishnevskiypro.retrofitpractice3.data.api

fun main(){

    var cat: String? = null

    cat?.let {
        println(it)
    }

    cat = "Barsik"

    cat?.let {
        println(it)
    }

}