/**
 * Copyright (c) 2019 SK Telecom Co., Ltd. All rights reserved.
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
package com.skt.nugu.sampleapp.template.view

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import com.skt.nugu.sampleapp.R

class ItemImageList3
@JvmOverloads
constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) :
    BaseView(context, attrs, defStyleAttr) {

    val image by lazy { findViewById<ImageView>(R.id.iv_image) }

    val header by lazy { findViewById<TextView>(R.id.tv_header) }

    val icon by lazy { findViewById<ImageView>(R.id.iv_icon) }

    init {
        setContentView(R.layout.view_item_image_list_3)
    }
}