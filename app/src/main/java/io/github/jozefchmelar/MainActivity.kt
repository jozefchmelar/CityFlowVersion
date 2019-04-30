package io.github.jozefchmelar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        app_version.text = "${BuildConfig.VERSION_NAME}  ${BuildConfig.VERSION_CODE} "
        // interstellar travel feature implemented
    }
}
