/**
 * Copyright (c) 2020 SK Telecom Co., Ltd. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http:www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.skt.nugu.sdk.platform.android.ux.widget

import android.content.Context
import android.support.v7.widget.AppCompatTextView
import android.text.SpannableStringBuilder
import android.text.TextUtils
import android.util.AttributeSet

class EllipsizedTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    private val builder = SpannableStringBuilder()
    init {
        setSingleLine()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val screenWidth = measuredWidth.toFloat() - compoundPaddingLeft.toFloat() - compoundPaddingRight.toFloat()
        var textWidth = screenWidth
        var ellipsizedText = TextUtils.ellipsize(text, paint, textWidth, ellipsize)

        if (ellipsizedText != text) {
            textWidth = screenWidth
            ellipsizedText = TextUtils.ellipsize(text, paint, textWidth, ellipsize)

            builder.clear()
            text = builder.append(ellipsizedText).replace(0, 1, "")
        }
    }
}