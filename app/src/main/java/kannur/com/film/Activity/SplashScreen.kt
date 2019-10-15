package kannur.com.film.Activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView

import androidx.appcompat.widget.ViewUtils

import com.bumptech.glide.Glide
import com.nowfal.kdroidext.Utils.setImageUrl
import kannur.com.film.MainActivity

import kannur.com.film.R
import kotlinx.android.synthetic.main.activity_splash_screen.*


class SplashScreen : Activity() {
    private var panel_IMG_back: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        try {
            setImageUrl(R.drawable.mainlogo,imagesplash2)
            val imageView = findViewById<View>(R.id.imagesplash) as ImageView
            val animation_1 = AnimationUtils.loadAnimation(baseContext, R.anim.fadein)
            val animation_2 = AnimationUtils.loadAnimation(baseContext, R.anim.fade_out)
            val animation_3 = AnimationUtils.loadAnimation(baseContext, R.anim.abc_fade_out)
            imageView.startAnimation(animation_2)
            animation_2.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation) {

                }

                override fun onAnimationEnd(animation: Animation) {
                    imageView.startAnimation(animation_1)
                }

                override fun onAnimationRepeat(animation: Animation) {

                }
            })

            animation_1.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation) {

                }

                override fun onAnimationEnd(animation: Animation) {
                    imageView.startAnimation(animation_3)
                    finish()
                    val i = Intent(baseContext, MainActivity::class.java)
                    startActivity(i)
                }

                override fun onAnimationRepeat(animation: Animation) {

                }
            })
        } catch (e: Exception) {
                e.printStackTrace()
        }


    }
}
