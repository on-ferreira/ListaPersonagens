package com.example.presentation.ui.utils.extension

import android.view.View

fun View.visible() {
    if (this.visibility != View.VISIBLE) this.visibility = View.VISIBLE
}

fun View.gone() {
    if (this.visibility != View.GONE) this.visibility = View.GONE
}