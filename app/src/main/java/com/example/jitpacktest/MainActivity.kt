package com.example.jitpacktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testlib.Test
import com.example.testlib2.Test2


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Test().test()
        Test2().test2()
    }
}