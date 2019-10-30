package kannur.com.film.Activity.songs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kannur.com.film.R
import kannur.com.film.Tools.Tools
import kotlinx.android.synthetic.main.activity_songs.*

class SongsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs)
        Tools.setSystemBarColor(this, R.color.md_white_1000)
        Tools.setSystemBarLight(this)
        setSupportActionBar(linearLayout8)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = "Movies"
    }
}
