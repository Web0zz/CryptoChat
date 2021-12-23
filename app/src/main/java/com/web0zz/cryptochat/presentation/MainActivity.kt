package com.web0zz.cryptochat.presentation

import com.web0zz.cryptochat.R
import com.web0zz.cryptochat.databinding.ActivityMainBinding
import com.web0zz.cryptochat.presentation.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {
    // At launch, the splash screen will be display as a theme then on onCreate default theme will be set
    override fun initTheme() {
        setTheme(R.style.Theme_CryptoChat)
    }
}