package com.example.crud

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sign_up.setOnClickListener {
            val username = username.text;

            val email = email.text;
            val password = password.text;

            if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this@MainActivity, "All fields are required", Toast.LENGTH_LONG)
                    .show()
            }
        }


        email.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {}
            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {

            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {

            }
        })

        //username.addTextChangedListener()

        /*email.setOnFocusChangeListener {
            val email = email.text;
            if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                Toast.makeText(this@MainActivity, "All fields are required", Toast.LENGTH_LONG)
                    .show()
            }

        }*/

    }
}
