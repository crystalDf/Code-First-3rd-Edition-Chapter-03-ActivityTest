package com.star.activitytest

import android.app.Activity

object ActivityCollector {

    private val activities = mutableListOf<Activity>()

    fun addActivity(activity: Activity) {
        activities.add(activity)
    }

    fun removeActivity(activity: Activity) {
        activities.remove(activity)
    }

    fun finishAll() {
        activities.filter { !it.isFinishing }.forEach { it.finish() }
        activities.clear()
    }
}