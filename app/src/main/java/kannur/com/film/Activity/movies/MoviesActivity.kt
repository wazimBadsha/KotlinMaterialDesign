package kannur.com.film.Activity.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kannur.com.film.R
import kannur.com.film.Tools.Tools
import kotlinx.android.synthetic.main.activity_gallary.*

class MoviesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallary)
        Tools.setSystemBarColor(this, R.color.md_white_1000)
        Tools.setSystemBarLight(this)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = "Movies"

    }
}
