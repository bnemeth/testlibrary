package com.attrecto.testlibrary

import android.content.Context

interface ApplicationResources {
    val applicationContext: Context

    fun getString(resId: Int) = applicationContext.getString(resId)

    fun getString(resId: Int, vararg formats : Any) = applicationContext.getString(resId, formats)
}