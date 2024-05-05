package com.example.rockpaperscissors

import kotlin.time.times

fun main(){
    var inputString = readln()
    println("Please enter a number $inputString")
    var inputNumber = readln()
    inputString = inputNumber.toInt().toString()
    println("Enter the number $inputNumber")

    val multiplier = 5
    var result = multiplier.times(multiplier) * inputNumber
    println("Result of operation is $result")

}