package com.qiantao.kotlinstudy

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.qiantao.kotlinstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity"
    private lateinit var tvHello: View
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
        tvHello = findViewById(R.id.tv_hello)

        printId(null)
    }

    fun printId(view: View?) {
        Log.i(TAG, "" + view?.id)
    }

    fun test() {
        var array: IntArray = intArrayOf(1, 2)
    }
}