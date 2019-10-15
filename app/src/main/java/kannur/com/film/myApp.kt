package kannur.com.film

import androidx.appcompat.app.AppCompatDelegate
import androidx.multidex.MultiDex
import androidx.multidex.MultiDexApplication
import com.nowfal.kdroidext.pref.KPrefHelper
import com.viralypatel.sharedpreferenceshelper.lib.SharedPreferencesHelper


class myApp: MultiDexApplication() {

    init {
        instance = this
    }

    companion object {
        private var instance: myApp? = null
        private var session: SharedPreferencesHelper? = null
        fun applicationContext(): myApp {
            return instance as myApp
        }

        fun session(): SharedPreferencesHelper {
            if(session != null){
                return  session!!
            }
            return SharedPreferencesHelper(applicationContext(), global.prefClass)
        }
    }

    override fun onCreate() {
        super.onCreate()
        MultiDex.install(this)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }
}