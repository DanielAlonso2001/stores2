package com.example.stores2
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()

        val loginButton: Button = findViewById(R.id.menuButton)
        loginButton.setOnClickListener {
            val email =
                findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.TextUser).text.toString()
            val password =
                findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.TextPassword).text.toString()

            /*     auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) { task -?
                    if (task.isSuccessful) {
                        // Login successful, start the main activity
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    } else
                        Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show()
                    }
                } */
        }
    }
}
