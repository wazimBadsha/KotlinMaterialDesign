package kannur.com.film

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.nowfal.kdroidext.Utils.setImageUrl
import com.smarteist.autoimageslider.IndicatorAnimations
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView
import kannur.com.film.Activity.Home.adapter.SliderAdapterExample
import kannur.com.film.Activity.gallary.GallaryActivity
import kannur.com.film.Activity.movies.MoviesActivity
import kannur.com.film.Activity.songs.SongsActivity
import kannur.com.film.Tools.Tools
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Tools.setSystemBarColor(this, android.R.color.white)
        Tools.setSystemBarLight(this)
        setSupportActionBar(textView42)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)
        supportActionBar?.title = "Home"
  /*      Tools.setSystemBarColor(this, android.R.color.white)
        Tools.setSystemBarLight(this)*/
        //setSupportActionBar(toolbar)
 /*       supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowTitleEnabled(true)
        supportActionBar?.title = "Cinepalm"*/
        val sliderView = imageSlider
        val adapter = SliderAdapterExample(this)
        sliderView.setSliderAdapter(adapter)
        sliderView.setIndicatorAnimation(IndicatorAnimations.WORM) //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION)
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH)
        sliderView.setIndicatorSelectedColor(Color.WHITE)
        sliderView.setIndicatorUnselectedColor(Color.GRAY)
        sliderView.setScrollTimeInSec(4) //set scroll delay in seconds :
        sliderView.startAutoCycle()

        services_menu.setOnClickListener {
            startActivity(intentFor<SongsActivity>())
        }
        moviesbtbn.setOnClickListener {
            startActivity(intentFor<MoviesActivity>())
        }
        Gallarybtn.setOnClickListener {
            startActivity(intentFor<GallaryActivity>())
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_Home -> {
                startActivity(intentFor<MainActivity>())
                finish()
            }
            R.id.action_Settings -> {
                startActivity(intentFor<SettingPageActitivity>())
                finish()
            }
            R.id.action_Exit -> {
                val homeIntent = Intent(Intent.ACTION_MAIN)
                homeIntent.addCategory(Intent.CATEGORY_HOME)
                homeIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(homeIntent)
                super.onBackPressed()
            }
        }
        return super.onOptionsItemSelected(item)
    }
    override fun onSupportNavigateUp(): Boolean {
        super.onBackPressed()
        return super.onSupportNavigateUp()
    }
}
