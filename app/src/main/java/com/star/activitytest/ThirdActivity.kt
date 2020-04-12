package com.star.activitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : BaseActivity() {

    private val tag = "ThirdActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(tag, "Task id is $taskId")

        setContentView(R.layout.activity_third)

        button3.setOnClickListener {
            ActivityCollector.finishAll()
        }
    }
}
