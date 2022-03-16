package br.com.zup.custombutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.custombutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.progressButton2.setOnClickListener{
            binding.progressButton2.setLoading()
        }
    }
}