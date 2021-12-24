package com.web0zz.cryptochat.presentation.binding

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object ViewBinding {
    @JvmStatic
    @BindingAdapter("LoadCircleImage")
    fun ImageView.bindLoadCircleImage(user_image_url: String) {
        Glide.with(this.context)
            .load(user_image_url)
            .apply(RequestOptions().circleCrop())
            .into(this)
    }
}