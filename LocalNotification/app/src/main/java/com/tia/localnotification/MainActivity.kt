package com.tia.localnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text
import java.lang.reflect.Modifier

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val service = CounterNotificationService(applicationContext)
        btnShowNotification.setOnClickListener() {
            service.showNotification(Counter.value)
        }

    }
}



