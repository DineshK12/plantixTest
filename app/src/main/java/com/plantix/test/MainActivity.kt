package com.plantix.test
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.plantix.test.ui.UsersFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.frameLayout, UsersFragment.newInstance())
                .commit()
        }
    }
}