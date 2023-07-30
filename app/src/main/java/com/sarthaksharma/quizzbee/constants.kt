package com.sarthaksharma.quizzbee

object constants {
    fun getQuestion():ArrayList<questionData>
    {
        //to bring all the question
        val questionsList = ArrayList<questionData>()
        //ques 1
        val question1 = questionData(
            1,"What Country does this flag belongs to ?",
            R.drawable.quizz_usa,
            "United States","Mexico","Texas","Australia",
            1
        )
        questionsList.add(question1)

        //ques 2
        val question2 = questionData(
            2,"What Country does this flag belongs to ?",
            R.drawable.quizz_belgium,
            "Antarctica","Germany","Taiwan","Belgium",
            4
        )
        questionsList.add(question2)
        //ques 3
        val question3 = questionData(
            3,"What Country does this flag belongs to ?",
            R.drawable.quizz_canada,
            "Austria","Switzerland","Canada","England",
            3
        )
        questionsList.add(question3)
        //ques 4
        val question4 = questionData(
            4,"What Country does this flag belongs to ?",
            R.drawable.quizz_india,
            "India","China","Wales","Luxembourg",
            1
        )
        questionsList.add(question4)

        //ques 5
        val question5 = questionData(
            5,"What Country does this flag belongs to ?",
            R.drawable.quizz_ireland,
            "United Kingdom","Ireland","IceLand","Netherlands",
            2
        )
        questionsList.add(question5)

        //ques 6
        val question6 = questionData(
            6,"What Country does this flag belongs to ?",
            R.drawable.quizz_israel,
            "Syria","Scotland","Canada","Israel",
            4
        )
        questionsList.add(question6)

        //ques 7
        val question7 = questionData(
            7,"What Country does this flag belongs to ?",
            R.drawable.quizz_newzealand,
            "New Zealand","Fiji","Tonga","Lebanon",
            1
        )
        questionsList.add(question7)

        //ques 8
        val question8 = questionData(
            8,"What contuntry does this flag belons to ?",
            R.drawable.quizz_russia,
            "Brazil","Russia","Poland","Niger",
            2
        )
        questionsList.add(question8)

        //ques 9
        val question9 = questionData(
            9,"What contuntry does this flag belons to ?",
            R.drawable.quizz_somalia,
            "Somalia","Yemen","Eritrea","Nigeria",
            1
        )
        questionsList.add(question9)

        //ques 10
        val question10 = questionData(
            10,"What contuntry does this flag belons to ?",
            R.drawable.quizz_sweden,
            "Norway","Finland","Sweden","Denmark",
            3
        )
        questionsList.add(question10)

        //ques 11
        val question11 = questionData(
            11,"What contuntry does this flag belons to ?",
            R.drawable.quizz_tajikistan,
            "Tajikistan","Uzbekistan","Iran","Kazakhstan",
            1
        )
        questionsList.add(question11)

        //ques 12
        val question12 = questionData(
            12,"What contuntry does this flag belons to ?",
            R.drawable.quizz_ukraine,
            "Ukraine","Belarus","Russia","Spain",
            1
        )
        questionsList.add(question12)

        //returing a array
        return questionsList
    }
}