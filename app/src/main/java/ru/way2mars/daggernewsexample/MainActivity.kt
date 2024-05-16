package ru.way2mars.daggernewsexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.viewmodel.CreationExtras
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var repository: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        repository = "123"
    }
}