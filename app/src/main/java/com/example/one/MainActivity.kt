package com.example.one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //deklarasi variable
        lateinit var text: TextView
        lateinit var gmbr: ImageView
        lateinit var nama: EditText
        lateinit var kelas: EditText
        lateinit var alamat: EditText
        lateinit var proses: Button
        lateinit var hapus: Button

        //pemanggilan id
        text = findViewById<TextView>(R.id.judul)
        gmbr = findViewById<ImageView>(R.id.iv)
        nama = findViewById<EditText>(R.id.etnama)
        kelas = findViewById<EditText>(R.id.etkelas)
        alamat = findViewById<EditText>(R.id.etalamat)
        proses = findViewById<Button>(R.id.btnproses)
        hapus = findViewById<Button>(R.id.btnhapus)

        //fungsi klik proses
        val nnama = nama.text.toString()
        val nkelas = kelas.text.toString()
        val nalamat = alamat.text.toString()

        proses.setOnClickListener{
            val intent = Intent(this@MainActivity,Halaman1::class.java)
            intent.putExtra("nama", nnama)
            intent.putExtra("kelas", nkelas)
            intent.putExtra("alamat", nalamat)
            startActivity(intent)
        }
    }
}