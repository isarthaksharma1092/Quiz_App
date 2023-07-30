package com.sarthaksharma.quizzbee

//import android.graphics.Color
//import android.graphics.Typeface
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.ImageView
//import android.widget.ProgressBar
//import android.widget.TextView
//import android.widget.Toast
//import androidx.core.content.ContextCompat
//
//class quizQuestionActivity : AppCompatActivity(), View.OnClickListener {
//    private var mCurrentPosition: Int = 1
//    private var mQuestionList: ArrayList<questionData>? = null
//    private var mSelectedOptionPosition: Int = 0
//
//    private var progressbar: ProgressBar? = null
//    private var tvProgress: TextView? = null
//    private var tvQuestion: TextView? = null
//    private var imgFlag: ImageView? = null
//
//    private var tvOption1: TextView? = null
//    private var tvOption2: TextView? = null
//    private var tvOption3: TextView? = null
//    private var tvOption4: TextView? = null
//    private var btnSubmit: Button? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_quiz_question)
//

//
//        setQuestion()
//
//    }
//
//
//    private fun setQuestion() {
////        val questionsList = constants.getQuestion()
//
//        val question: questionData = mQuestionList!![mCurrentPosition - 1]
//        defaultOptionsView()
//
//        imgFlag?.setImageResource(question.image)
//        progressbar?.progress = mCurrentPosition
//        tvProgress?.text = "$mCurrentPosition" + "/" + progressbar?.max
//        tvQuestion?.text = question.questions
//
//        tvOption1?.text = question.opetionOne
//        tvOption2?.text = question.opetionTwo
//        tvOption3?.text = question.opetionThree
//        tvOption4?.text = question.opetionfour
//
//        if (mCurrentPosition == mQuestionList!!.size) {
//            btnSubmit?.text = "Finish"
//        } else {
//            btnSubmit?.text = "Next"
//        }
//
//    }
//
//    private fun defaultOptionsView() {
//        val options = ArrayList<TextView>()
//        tvOption1?.let {
//            options.add(0, it)
//        }
//        tvOption2?.let {
//            options.add(1, it)
//        }
//        tvOption3?.let {
//            options.add(2, it)
//        }
//        tvOption4?.let {
//            options.add(3, it)
//        }
//        for (option in options) {
//            option.setTextColor(Color.parseColor("#E7DBDB"))
//            option.typeface = Typeface.DEFAULT
//            option.background = ContextCompat.getDrawable(
//                this, R.drawable.selected_option_border
//            )
//        }
//    }
//
//    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
//        defaultOptionsView()
//        mSelectedOptionPosition = selectedOptionNum
//
//        tv.setTextColor(Color.parseColor("#363A43"))
//        //TYPE FACE TO MAKE SELECTED text bold
//        tv.setTypeface(tv.typeface, Typeface.BOLD)
//        tv.background = ContextCompat.getDrawable(
//            this, R.drawable.selected_option_border
//        )
//    }
//
//    override fun onClick(view: View?) {
//        when (view?.id) {
//            R.id.tvOption1 -> {
//                tvOption1?.let { selectedOptionView(it, 1) }
//            }
//
//
//            R.id.tvOption2 -> {
//                tvOption2?.let { selectedOptionView(it, 2) }
//            }
//
//
//            R.id.tvOption3 -> {
//                tvOption3?.let { selectedOptionView(it, 3) }
//            }
//
//            R.id.tvOption4 -> {
//                tvOption4?.let { selectedOptionView(it, 4) }
//            }
//
//            R.id.btn_Submit -> {
//                if (mSelectedOptionPosition == 0) {
//                    mCurrentPosition++
//
//                    when {
//                        mCurrentPosition <= mQuestionList!!.size -> {
//                            setQuestion()
//                        }
//
//                        else -> {
//                            Toast.makeText(
//                                this@quizQuestionActivity,
//                                "You have successfully completed the quiz.",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                        }
//                    }
//                } else {
//                    val questions = mQuestionList?.get(mCurrentPosition - 1)
//                    if (questions!!.correctAnswer != mSelectedOptionPosition) {
//                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_bg)
//                    }
//                    answerView(questions.correctAnswer, R.drawable.correct_option_bg)
//                    if (mCurrentPosition == mQuestionList!!.size) {
//                        btnSubmit?.text = "Finish"
//                    } else {
//                        btnSubmit?.text = "Go to next Question"
//                    }
//                    mSelectedOptionPosition = 0
//                }
//            }
//        }
//    }
//
//    private  fun answerView(answer: Int,drawableView: Int){
//        when(answer){
//            1->{
//                tvOption1?.background = ContextCompat.getDrawable(
//                    this,drawableView
//                )
//            }
//            2->{
//                tvOption2?.background = ContextCompat.getDrawable(
//                    this,drawableView
//                )
//            }
//            3->{
//                tvOption3?.background = ContextCompat.getDrawable(
//                    this,drawableView
//                )
//            }
//            4->{
//                tvOption4?.background = ContextCompat.getDrawable(
//                    this,drawableView
//                )
//            }
//        }
//    }
//}

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class quizQuestionActivity : AppCompatActivity(), View.OnClickListener {


    //Create global variables for the views in the layout
    private var progressBar: ProgressBar?=null
    private var tvProgress: TextView? = null
    private var tvQuestion:TextView? = null
    private var ivImage: ImageView? = null
    private var tvOptionOne:TextView? = null
    private var tvOptionTwo:TextView? = null
    private var tvOptionThree:TextView? = null
    private var tvOptionFour:TextView? = null
    private var buttonSubmit: Button? = null
    /**
     * This function is auto created by Android when the Activity Class is created.
     */


    private var mCurrentPosition: Int = 1 // Default and the first question position
    private var mQuestionsList: ArrayList<questionData>? = null
    // END


    private var mSelectedOptionPosition: Int = 0
    // END


    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_quiz_question)

        progressBar=findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tvProgress)
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.imgFlag)
        tvOptionOne = findViewById(R.id.tvOption1)
        tvOptionTwo = findViewById(R.id.tvOption2)
        tvOptionThree = findViewById(R.id.tvOption3)
        tvOptionFour = findViewById(R.id.tvOption4)

        buttonSubmit = findViewById(R.id.btn_Submit)
        mQuestionsList = constants.getQuestion()
        // END

        setQuestion()

        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)

        // TODO(STEP 1: Adding a click event for submit button.)
        buttonSubmit?.setOnClickListener (this)
    }


    private fun setQuestion() {

        val question: questionData =
            mQuestionsList!![mCurrentPosition - 1] // Getting the question from the list with the help of current position.
        defaultOptionsView()

        // TODO (STEP 6: Check here if the position of question is last then change the text of the button.)
        // START
        if (mCurrentPosition == mQuestionsList!!.size) {
            buttonSubmit?.text = "FINISH"
        } else {
            buttonSubmit?.text = "SUBMIT"
        }
        // END
        progressBar?.progress =
            mCurrentPosition // Setting the current progress in the progressbar using the position of question
        tvProgress?.text =
            "$mCurrentPosition" + "/" + progressBar?.max // Setting up the progress text

        // Now set the current question and the options in the UI
        tvQuestion?.text = question.questions
        ivImage?.setImageResource(question.image)
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour
    }

    override fun onClick(view: View?) {
        when (view?.id) {

            R.id.tvOption1 -> {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)
                }

            }

            R.id.tvOption2 -> {
                tvOptionTwo?.let {
                    selectedOptionView(it, 2)
                }

            }

            R.id.tvOption3 -> {
                tvOptionThree?.let {
                    selectedOptionView(it, 3)
                }

            }

            R.id.tvOption4 -> {
                tvOptionFour?.let {
                    selectedOptionView(it, 4)
                }

            }

            // TODO(STEP 2: Adding a click event for submit button. And change the questions and check the selected answers.)
            // START
            R.id.btn_Submit->{

                if (mSelectedOptionPosition == 0) {

                    mCurrentPosition++

                    when {

                        mCurrentPosition <= mQuestionsList!!.size -> {

                            setQuestion()
                        }
                        else -> {

                            Toast.makeText(this@quizQuestionActivity, "You have successfully completed the quiz.", Toast.LENGTH_SHORT).show()
                        }
                    }
                } else {
                    val question = mQuestionsList?.get(mCurrentPosition - 1)

                    // This is to check if the answer is wrong
                    if (question!!.correctAnswer != mSelectedOptionPosition) {
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_bg)
                    }

                    // This is for correct answer
                    answerView(question.correctAnswer, R.drawable.correct_option_bg)

                    if (mCurrentPosition == mQuestionsList!!.size) {
                        buttonSubmit?.text = "FINISH"
                    } else {
                        buttonSubmit?.text = "GO TO NEXT QUESTION"
                    }

                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    // TODO (STEP 3: Create a function for answer view.)
    // START
    /**
     * A function for answer view which is used to highlight the answer is wrong or right.
     */
    private fun answerView(answer: Int, drawableView: Int) {

        when (answer) {

            1 -> {
                tvOptionOne?.background = ContextCompat.getDrawable(
                    this@quizQuestionActivity,
                    drawableView
                )
            }
            2 -> {
                tvOptionTwo?.background = ContextCompat.getDrawable(
                    this@quizQuestionActivity,
                    drawableView
                )
            }
            3 -> {
                tvOptionThree?.background = ContextCompat.getDrawable(
                    this@quizQuestionActivity,
                    drawableView
                )
            }
            4 -> {
                tvOptionFour?.background = ContextCompat.getDrawable(
                    this@quizQuestionActivity,
                    drawableView
                )
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this@quizQuestionActivity,
            R.drawable.selected_option_border
        )
    }


    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0, it)
        }
        tvOptionTwo?.let {
            options.add(1, it)
        }
        tvOptionThree?.let {
            options.add(2, it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this@quizQuestionActivity,
                R.drawable.curvebtn
            )
        }
    }
}