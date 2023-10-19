package kr.ac.kumoh.s23w07intent_data

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s23w07intent_data.databinding.ActivityImageBinding

class ImageActivity : AppCompatActivity() {
    private lateinit var main:ActivityImageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        main = ActivityImageBinding.inflate(layoutInflater)
        setContentView(main.root)
    }
}