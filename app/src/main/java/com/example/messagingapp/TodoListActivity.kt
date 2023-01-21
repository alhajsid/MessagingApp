package com.example.messagingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TodoListActivity : AppCompatActivity() {

    lateinit var result : EditText
    lateinit var add : Button
    lateinit var rv_main : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo_list)

        result = findViewById(R.id.editTextResult)
        add = findViewById(R.id.buttonAdd)
        rv_main = findViewById(R.id.rv_main)

        var list = ArrayList<String>()

        list.add("alhaj")
        list.add("ataul")

        rv_main.layoutManager = LinearLayoutManager(this)
        val adaptor=MainAdaptor(list)
        rv_main.adapter = adaptor

        add.setOnClickListener {
            list.add(result.text.toString())
            adaptor.notifyDataSetChanged()
            result.setText("")
        }

    }

}