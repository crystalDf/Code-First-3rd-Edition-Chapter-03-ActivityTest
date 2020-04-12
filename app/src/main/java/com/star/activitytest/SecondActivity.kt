package com.star.activitytest

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : BaseActivity() {

    private val tag = "SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Log.d(tag, this.toString())

        Log.d(tag, "Task id is $taskId")

        setContentView(R.layout.activity_second)

        val extraData = intent.getStringExtra("extra_data")

        Log.d(tag, "extra data is $extraData")

        button2.setOnClickListener {
//            val intent = Intent()
//
//            intent.putExtra("data_return", "Hello FirstActivity")
//            setResult(Activity.RESULT_OK, intent)
//            finish()

//            val intent = Intent(this, FirstActivity::class.java)

            val intent = Intent(this, ThirdActivity::class.java)

            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(tag, "onDestroy")
    }

    override fun onBackPressed() {
        val intent = Intent()

        intent.putExtra("data_return", "Hello FirstActivity")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }

    companion object {
        fun actionStart(context: Context, data1: String, data2: String) {
            val intent = Intent(context, SecondActivity::class.java).apply {
                putExtra("param1", data1)
                putExtra("param2", data2)
            }

            context.startActivity(intent)
        }
    }
}
