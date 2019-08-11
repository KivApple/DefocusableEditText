package com.eternal_search.defocusableedittext

import android.content.Context
import android.util.AttributeSet
import android.view.KeyEvent
import androidx.appcompat.widget.AppCompatEditText

class DefocusableEditText : AppCompatEditText {
	constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
	
	constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
	
	constructor(context: Context) : super(context)
	
	override fun onKeyPreIme(keyCode: Int, event: KeyEvent): Boolean {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			clearFocus()
		}
		return super.onKeyPreIme(keyCode, event)
	}
}
