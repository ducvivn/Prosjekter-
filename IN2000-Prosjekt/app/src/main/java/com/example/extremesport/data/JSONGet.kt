package com.example.extremesport.data

import android.content.Context
import com.example.extremesport.R
import java.io.InputStream

interface JSONGet {
    val JSON: InputStream
}

class AppDataContainer(private val context: Context): JSONGet {
    override val JSON: InputStream by lazy{
        context.resources.openRawResource(R.raw.locations)
    }
}