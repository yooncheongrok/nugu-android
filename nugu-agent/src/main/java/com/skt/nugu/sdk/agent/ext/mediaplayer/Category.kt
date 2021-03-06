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

package com.skt.nugu.sdk.agent.ext.mediaplayer

import com.google.gson.annotations.SerializedName

enum class Category {
    @SerializedName("NONE")
    NONE,
    @SerializedName("RECOMMEND")
    RECOMMEND,
    @SerializedName("POPULAR")
    POPULAR,
    @SerializedName("NEW")
    NEW,
    @SerializedName("CHART")
    CHART,
    @SerializedName("RECENT_PLAYED")
    RECENT_PLAYED,
    @SerializedName("FAVORITE")
    FAVORITE,
    @SerializedName("LIKE_SONG")
    LIKE_SONG,
    @SerializedName("LIKE_ALBUM")
    LIKE_ALBUM,
    @SerializedName("LIKE_ARTIST")
    LIKE_ARTIST,
    @SerializedName("LIKE_THEME")
    LIKE_THEME,
    @SerializedName("PLAYLIST")
    PLAYLIST,
    @SerializedName("NOWPLAYING")
    NOWPLAYING
}