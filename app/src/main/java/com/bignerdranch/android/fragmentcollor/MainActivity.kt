package com.bignerdranch.android.fragmentcollor

import android.graphics.Color
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import java.lang.Long

class MainActivity : AppCompatActivity() {


    lateinit var frameLayout_1: FrameLayout
    lateinit var frameLayout_2: FrameLayout
    lateinit var frameLayout_3: FrameLayout
    lateinit var frameLayout_4: FrameLayout
    lateinit var frameLayout_5: FrameLayout
    lateinit var frameLayout_6: FrameLayout
    lateinit var frameLayout_7: FrameLayout
    lateinit var frameLayout_8: FrameLayout
    lateinit var frameLayout_9: FrameLayout
    lateinit var frameLayout_10: FrameLayout
    lateinit var frameLayout_11: FrameLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        frameLayout_1 = findViewById(R.id.fragment_1)
        frameLayout_2 = findViewById(R.id.fragment_2)
        frameLayout_3 = findViewById(R.id.fragment_3)
        frameLayout_4 = findViewById(R.id.fragment_4)
        frameLayout_5 = findViewById(R.id.fragment_5)
        frameLayout_6 = findViewById(R.id.fragment_6)
        frameLayout_7 = findViewById(R.id.fragment_7)
        frameLayout_8 = findViewById(R.id.fragment_8)
        frameLayout_9 = findViewById(R.id.fragment_9)
        frameLayout_10 = findViewById(R.id.fragment_10)
        frameLayout_11 = findViewById(R.id.fragment_11)


        frameLayout_1.setOnClickListener {
            colorText(Color.BLUE, "Синий")
        }

        frameLayout_2.setOnClickListener {
            colorText(Color.RED, "Красный")
        }

        frameLayout_3.setOnClickListener {
            colorText(Color.YELLOW, "Желтый")
        }

        frameLayout_4.setOnClickListener {
            colorText(Color.BLACK, "Чёрный", Color.WHITE)
        }
        frameLayout_5.setOnClickListener {
            colorText(Color.WHITE, "Белый")
        }

        frameLayout_6.setOnClickListener {
            colorText(Long(0xFFAC4D04).toInt(), "Коричневый")
        }

        frameLayout_7.setOnClickListener {
            colorText(Color.GRAY, "Серый")
        }

        frameLayout_8.setOnClickListener {
            colorText(Long(0xFF9800FF).toInt(), "Фиолетовый")
        }

        frameLayout_9.setOnClickListener {
            colorText(Long(0xFFEA91FF).toInt(), "Розовый")
        }
        frameLayout_10.setOnClickListener {
            colorText(Long(0xFFFF9800).toInt(), "Оранджевы")
        }

        frameLayout_11.setOnClickListener {
            colorText(Color.GREEN, "Зеленый")
        }
    }


    fun colorText(color: Int, text: String, textColor: Int = Color.BLACK) {
        val generic = GenericFragment.newInstance(color, text, textColor)
        val transaction = supportFragmentManager
        transaction.beginTransaction()
            .replace(R.id.big_fragment, generic)
            .addToBackStack(null)
            .commit()
    }
}