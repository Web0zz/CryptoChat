package com.web0zz.cryptochat.presentation

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatDelegate
import com.web0zz.cryptochat.R
import com.web0zz.cryptochat.databinding.ActivityMainBinding
import com.web0zz.cryptochat.presentation.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    /*
    *   Usage of Preferences in here may be wrong usage for MVVM
    *   Implemented just for demo it will be delete later // TODO
    */
    val themeModePreferences: SharedPreferences by lazy {
        this.getSharedPreferences(
            "THEME_MODE_IS_LIGHT",
            Context.MODE_PRIVATE
        )
    }

    // At launch, the splash screen will be display as a theme then on onCreate default theme will be set
    override fun initTheme() {
        setThemeMode()
        setTheme(R.style.Theme_CryptoChat)
    }

    fun setThemeMode() {
        themeModePreferences.getBoolean(getString(R.string.theme_mode), false).run {
            AppCompatDelegate.setDefaultNightMode(
                // If true set light mode else dark mode
                if (this) {
                    AppCompatDelegate.MODE_NIGHT_NO
                } else AppCompatDelegate.MODE_NIGHT_YES
            )
        }
    }
}