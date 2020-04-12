package com.star.activitytest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : BaseActivity() {

    private val tag = "FirstActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Log.d(tag, this.toString())

        Log.d(tag, "Task id is $taskId")

        setContentView(R.layout.activity_first)

        button1.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)

//            val intent = Intent("com.star.activitytest.ACTION_START")
//            intent.addCategory("com.star.activitytest.MY_CATEGORY")

//            val intent = Intent(Intent.ACTION_VIEW)
//            intent.data = Uri.parse("https://cn.bing.com/")
//            intent.addCategory("com.star.activitytest.MY_CATEGORY")

//            val intent = Intent(Intent.ACTION_DIAL)
//            intent.data = Uri.parse("tel:10086")

//            val intent = Intent(this, SecondActivity::class.java)
//            val data = "Hello SecondActivity"
//            intent.putExtra("extra_data", data)

//            startActivity(intent)

//            val intent = Intent(this, SecondActivity::class.java)
//
//            startActivityForResult(intent, 1)

//            val intent = Intent(this, FirstActivity::class.java)

//            val intent = Intent(this, SecondActivity::class.java)
//
//            startActivity(intent)

            SecondActivity.actionStart(this, "data1", "data2")
        }
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(tag, "onRestart")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.main, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You clicked Add",
                Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You clicked Remove",
                Toast.LENGTH_SHORT).show()
        }

        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            1 -> if (resultCode == Activity.RESULT_OK) {
                val returnedData = data?.getStringExtra("data_return")

                Log.d("FirstActivity", "returned data is $returnedData")
            }
        }
    }
}
