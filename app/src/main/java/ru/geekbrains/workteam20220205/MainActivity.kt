package ru.geekbrains.workteam20220205

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        findViewById<Button>(R.id.button).setOnClickListener{
            findViewById<TextView>(R.id.button).text = "done"
        }
        
    }
}
