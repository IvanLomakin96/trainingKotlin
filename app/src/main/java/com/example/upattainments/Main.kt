package com.example.trainingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//класс MainActiviti наследуется от AppCompatActivity
class MainActivity : AppCompatActivity() {
    //Первая функция, которая переопределена по умолчанию в каждом активити,
    // отвечает событию ON_CREATE. Выполняется перед стартом активити,
    // когда активити переходит из состояния INITIALIZED к состоянию CREATED.
    override fun onCreate(savedInstanceState: Bundle?) {//В качестве параметра функция onCreate
        // получает объект типа Bundle,
        // который представляет собой набор пар “ключ — значение” и может быть использован
        // для сохранения предыдущего состояния активити
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        consoleOutput()// Запускаем нашу функию в активити
    }

    val test0: String = "Hello" // объявляем и инициализируем неизменяемую переменную с типом строки
    var test1 = 22 // объявляем и инициализируем изменяемую переменную числового типа
    val test2: String? = null // объявляем неизменяемую переменную с типом строки, которая пока не инициализирована

    fun consoleOutput(){
        //Создадим функцию для вывода каких либо значений в консоль
        println(test0 + test1 + test2)
    }

}