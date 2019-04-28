package edu.washington.lmburu.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private var p1Tally = 0
    private var p2Tally = 0
    private var p3Tally = 0
    private var p4Tally = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // player 1 +, -, +5 & -5 buttons
        p1AddOneBtn.setOnClickListener {
            p1Tally++
            p1Count.text = "$p1Tally"
            if (p1Tally <= 0) status.text = "Player 1 LOSES!"
        }

        p1MinusOneBtn.setOnClickListener {
            p1Tally--
            p1Count.text = "$p1Tally"
            if (p1Tally <= 0) status.text = "Player 1 LOSES!"

        }

        p1AddFiveBtn.setOnClickListener {
            p1Tally += 5
            p1Count.text = "$p1Tally"
            if (p1Tally <= 0) status.text = "Player 1 LOSES!"
        }

        p1MinusFiveBtn.setOnClickListener {
            p1Tally -= 5
            p1Count.text = "$p1Tally"
            if (p1Tally <= 0) status.text = "Player 1 LOSES!"
        }

        // player 2 +, -, +5 & -5 buttons
        p2AddOneBtn.setOnClickListener {
            p2Tally++
            p2Count.text = "$p2Tally"
            if (p2Tally <= 0) status.text = "Player 2 LOSES!"
        }
        p2MinusOneBtn.setOnClickListener {
            p2Tally--
            p2Count.text = "$p2Tally"
            if (p2Tally <= 0) status.text = "Player 2 LOSES!"
        }
        p2AddFiveBtn.setOnClickListener {
            p2Tally += 5
            p2Count.text = "$p2Tally"
            if (p2Tally <= 0) status.text = "Player 2 LOSES!"
        }

        p2MinusFiveBtn.setOnClickListener {
            p2Tally -= 5
            p2Count.text = "$p2Tally"
            if (p2Tally <= 0) status.text = "Player 2 LOSES!"
        }

        // player 3 +, -, +5 & -5 buttons
        p3AddOneBtn.setOnClickListener {
            p3Tally++
            p3Count.text = "$p3Tally"
            if (p3Tally <= 0) status.text = "Player 3 LOSES!"
        }

        p3MinusOneBtn.setOnClickListener {
            p3Tally--
            p3Count.text = "$p3Tally"
            if (p3Tally <= 0) status.text = "Player 3 LOSES!"

        }
        p3AddFiveBtn.setOnClickListener {
            p3Tally += 5
            p3Count.text = "$p3Tally"
            if (p3Tally <= 0) status.text = "Player 3 LOSES!"
        }
        p3MinusFiveBtn.setOnClickListener {
            p3Tally -= 5
            p3Count.text = "$p3Tally"
            if (p3Tally <= 0) status.text = "Player 3 LOSES!"
        }

        // player 4  +, -, +5 & -5 buttons
        p4AddOneBtn.setOnClickListener {
            p4Tally++
            p4Count.text = "$p4Tally"
            if (p4Tally <= 0) status.text = "Player 4 LOSES!"
        }

        p4MinusOneBtn.setOnClickListener {
            p4Tally--
            p4Count.text = "$p4Tally"
            if (p4Tally <= 0) status.text = "Player 4 LOSES!"

        }

        p4AddFiveBtn.setOnClickListener {
            p4Tally += 5
            p4Count.text = "$p4Tally"
            if (p4Tally <= 0) status.text = "Player 4 LOSES!"
        }

        p4MinusFiveBtn.setOnClickListener {
            p4Tally -= 5
            p4Count.text = "$p4Tally"
            if (p4Tally <= 0) status.text = "Player 4 LOSES!"
        }

    }

}

