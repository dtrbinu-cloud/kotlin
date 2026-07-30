package com.example.myapplication
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.SecondMain2Activity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClick: Button = findViewById(R.id.btn_click)
        val btnSecond: Button = findViewById(R.id.btn_second)

        btnClick.setOnClickListener{
                startActivity(Intent(this, SecondMain2Activity::class.java))
            intent.putExtra("text", " ini adalah data teks saya")
            startActivity(intent)

        }

        btnSecond.setOnClickListener{
             IMPLICIT INTENT
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/@Vikqri_"))
            if (intent.resolveActivity(packageManager) != null){
                startActivity(intent)
            } else{
                Toast.makeText(applicationContext,"Tidak ada aplikasi yang support", Toast.LENGTH_SHORT).show()
            }
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                type = "text/plain"
                setPackage("com.whatsapp")
            }
            intent.putExtra(Intent.EXTRA_TEXT, "Halo,selamat anda menang 100jta ")
        }
    }
}
