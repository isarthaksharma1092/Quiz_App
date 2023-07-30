package com.sarthaksharma.quizzbee

data class questionData (
    val id: Int,
    val questions: String,
    val image: Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    // correctAnswer will be holding index for correct option
    val correctAnswer:Int

)