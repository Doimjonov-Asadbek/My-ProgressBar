package app.test.myprogressbar

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progress = findViewById<ProgressBar>(R.id.progressBar)

        progress.max = 10
        val currentProgress = 6

        ObjectAnimator.ofInt(progress, "progress", currentProgress)
            .setDuration(2000)
            .start()
    }
}