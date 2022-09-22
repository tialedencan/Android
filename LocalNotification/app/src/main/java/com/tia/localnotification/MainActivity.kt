package com.tia.localnotification

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import com.jakewharton.threetenabp.AndroidThreeTen
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.lang.reflect.Modifier
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidThreeTen.init(this)

        val service = CounterNotificationService(applicationContext)
        btnShowNotification.setOnClickListener() {
            service.showNotification(Counter.value)
        }
        val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.  HH:mm")
        val time=LocalDateTime.now().format(formatter)
        editTextTime.setText(time.toString())
    }
}



