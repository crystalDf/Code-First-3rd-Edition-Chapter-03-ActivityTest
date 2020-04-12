package com.star.activitytest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    private val tag = "BaseActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(tag, "${javaClass.simpleName} onCreate")

        ActivityCollector.addActivity(this)
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(tag, "${javaClass.simpleName} onDestroy")

        ActivityCollector.removeActivity(this)
    }
}