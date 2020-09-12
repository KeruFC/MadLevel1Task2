package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            checkAnswers();
        }
    }

    private fun checkAnswers() {
        val answerOne = binding.answerOne.text.toString()
        val answerTwo = binding.answerTwo.text.toString()
        val answerThree = binding.answerThree.text.toString()
        val answerFour = binding.answerFour.text.toString()

        var amountCorrectAnswers = 0;

        if(answerOne == getString(R.string.T)){
            amountCorrectAnswers += 1
        }
        if(answerTwo == getString(R.string.F)){
            amountCorrectAnswers += 1
        }
        if(answerThree == getString(R.string.F)){
            amountCorrectAnswers += 1
        }
        if(answerFour == getString(R.string.F)){
            amountCorrectAnswers += 1
        }

        Toast.makeText(this, getString(R.string.amount, amountCorrectAnswers), Toast.LENGTH_LONG).show()

    }
}