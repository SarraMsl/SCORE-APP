package com.mslsarra.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {

    private lateinit var pointTeam01: TextView
    private lateinit var pointTeam02: TextView
    private lateinit var btn3pointTeam01: Button
    private lateinit var btn2pointTeam01: Button
    private lateinit var btn1pointTeam01: Button
    private lateinit var btn3pointTeam02: Button
    private lateinit var btn2pointTeam02: Button
    private lateinit var btn1pointTeam02: Button
    private lateinit var reset: Button

    private var scoreTeam01 = 0
    private var scoreTeam02 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main02)

        pointTeam01 = findViewById(R.id.allPointTeam01)
        pointTeam02 = findViewById(R.id.allPointTeam02)

        btn3pointTeam01 = findViewById(R.id.add3PointTeam01)
        btn2pointTeam01 = findViewById(R.id.add2PointTeam01)
        btn1pointTeam01 = findViewById(R.id.add1PointTeam01)

        btn3pointTeam01.setOnClickListener(this)
        btn2pointTeam01.setOnClickListener(this)
        btn1pointTeam01.setOnClickListener(this)

        btn3pointTeam02 = findViewById(R.id.add3PointTeam02)
        btn2pointTeam02 = findViewById(R.id.add2PointTeam02)
        btn1pointTeam02 = findViewById(R.id.add1PointTeam02)

        btn3pointTeam02.setOnClickListener(this)
        btn2pointTeam02.setOnClickListener(this)
        btn1pointTeam02.setOnClickListener(this)

        reset = findViewById(R.id.reset)
        reset.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0) {
            btn3pointTeam01 -> scoreTeam01 += 3
            btn2pointTeam01 -> scoreTeam01 += 2
            btn1pointTeam01 -> scoreTeam01 += 1
            btn3pointTeam02 -> scoreTeam02 += 3
            btn2pointTeam02 -> scoreTeam02 += 2
            btn1pointTeam02 -> scoreTeam02 += 1
            reset -> {
                scoreTeam01 = 0
                scoreTeam02 = 0
            }
        }

        pointTeam01.text = scoreTeam01.toString()
        pointTeam02.text = scoreTeam02.toString()
    }
}
