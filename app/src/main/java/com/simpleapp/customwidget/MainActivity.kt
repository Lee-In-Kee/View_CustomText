package com.simpleapp.customwidget

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.simpleapp.customwidget.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val customView = CustomView("코틀린!", this)
        binding.frameLayout.addView(customView)
    }
}

class CustomView(text: String, context: Context): View(context) {

    val text: String

    init {
        this.text = text
    }

    // Ctrl + O 로 구현
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint = Paint()
        paint.color = Color.BLACK
        paint.textSize = 100f // Float형이기 때문에 f를 붙임

        canvas?.drawText(text, 150f, 100f, paint)
    }
}