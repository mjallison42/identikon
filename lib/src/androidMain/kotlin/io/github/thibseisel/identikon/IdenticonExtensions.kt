/*
 * Copyright 2022 Thibault Seisel
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
@file:JvmMultifileClass
@file:JvmName("Identicons")

package io.github.thibseisel.identikon

import android.graphics.Bitmap
import io.github.thibseisel.identikon.android.AndroidBitmapRenderer

/**
 * Renders an [Identicon] onto an Android [Bitmap].
 */
public fun Identicon.drawToBitmap(bitmap: Bitmap) {
    render(AndroidBitmapRenderer(bitmap))
}
