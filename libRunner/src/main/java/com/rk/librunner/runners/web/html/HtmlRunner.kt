package com.rk.librunner.runners.web.html

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import com.rk.librunner.RunnerImpl
import java.io.File

class HtmlRunner : RunnerImpl(listOf("html")) {
	override fun run(file: File, context: Context) {
		val intent = Intent(context, HtmlActivity::class.java)
		intent.putExtra("filepath",file.absolutePath)
		context.startActivity(intent)
	}
	
	override fun getName(): String {
		return "WebRunner"
	}
	
	override fun getDescription(): String {
		return "preview html"
	}
	
	override fun getIcon(context: Context): Drawable? {
		return null
	}
}