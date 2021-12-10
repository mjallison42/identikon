/*
 * Copyright 2017 Thibault Seisel
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.github.thibseisel.kdenticon

/**
 * A collection of built-in colors.
 * All colors are defined as sRGB 32 bits integers, in the form `#AARRGGBB`.
 */
public object Colors {
    public const val TRANSPARENT: Int = 0x0
    public const val SNOW: Int = 0xFFFFFAFA.toInt()
    public const val GHOST_WHITE: Int = 0xFFF8F8FF.toInt()
    public const val WHITE_SMOKE: Int = 0xFFF5F5F5.toInt()
    public const val GAINSBORO: Int = 0xFFDCDCDC.toInt()
    public const val FLORAL_WHITE: Int = 0xFFFFFAF0.toInt()
    public const val OLD_LACE: Int = 0xFFFDF5E6.toInt()
    public const val LINEN: Int = 0xFFFAF0E6.toInt()
    public const val ANTIQUE_WHITE: Int = 0xFFFAEBD7.toInt()
    public const val PAPAYA_WHIP: Int = 0xFFFFEFD5.toInt()
    public const val BLANCHED_ALMOND: Int = 0xFFFFEBCD.toInt()
    public const val BISQUE: Int = 0xFFFFE4C4.toInt()
    public const val PEACH_PUFF: Int = 0xFFFFDAB9.toInt()
    public const val NAVAJO_WHITE: Int = 0xFFFFDEAD.toInt()
    public const val MOCCASIN: Int = 0xFFFFE4B5.toInt()
    public const val CORNSILK: Int = 0xFFFFF8DC.toInt()
    public const val IVORY: Int = 0xFFFFFFF0.toInt()
    public const val LEMON_CHIFFON: Int = 0xFFFFFACD.toInt()
    public const val SEASHELL: Int = 0xFFFFF5EE.toInt()
    public const val HONEYDEW: Int = 0xFFF0FFF0.toInt()
    public const val MINT_CREAM: Int = 0xFFF5FFFA.toInt()
    public const val AZURE: Int = 0xFFF0FFFF.toInt()
    public const val ALICE_BLUE: Int = 0xFFF0F8FF.toInt()
    public const val LAVENDER: Int = 0xFFE6E6FA.toInt()
    public const val LAVENDER_BLUSH: Int = 0xFFFFF0F5.toInt()
    public const val MISTY_ROSE: Int = 0xFFFFE4E1.toInt()
    public const val WHITE: Int = 0xFFFFFFFF.toInt()
    public const val BLACK: Int = 0xFF000000.toInt()
    public const val DARK_SLATE_GRAY: Int = 0xFF2F4F4F.toInt()
    public const val DARK_SLATE_GREY: Int = 0xFF2F4F4F.toInt()
    public const val DIM_GRAY: Int = 0xFF696969.toInt()
    public const val DIM_GREY: Int = 0xFF696969.toInt()
    public const val SLATE_GRAY: Int = 0xFF708090.toInt()
    public const val SLATE_GREY: Int = 0xFF708090.toInt()
    public const val LIGHT_SLATE_GRAY: Int = 0xFF778899.toInt()
    public const val LIGHT_SLATE_GREY: Int = 0xFF778899.toInt()
    public const val GRAY: Int = 0xFFBEBEBE.toInt()
    public const val GREY: Int = 0xFFBEBEBE.toInt()
    public const val WEB_GRAY: Int = 0xFF808080.toInt()
    public const val WEB_GREY: Int = 0xFF808080.toInt()
    public const val LIGHT_GREY: Int = 0xFFD3D3D3.toInt()
    public const val LIGHT_GRAY: Int = 0xFFD3D3D3.toInt()
    public const val MIDNIGHT_BLUE: Int = 0xFF191970.toInt()
    public const val NAVY: Int = 0xFF000080.toInt()
    public const val NAVY_BLUE: Int = 0xFF000080.toInt()
    public const val CORNFLOWER_BLUE: Int = 0xFF6495ED.toInt()
    public const val DARK_SLATE_BLUE: Int = 0xFF483D8B.toInt()
    public const val SLATE_BLUE: Int = 0xFF6A5ACD.toInt()
    public const val MEDIUM_SLATE_BLUE: Int = 0xFF7B68EE.toInt()
    public const val LIGHT_SLATE_BLUE: Int = 0xFF8470FF.toInt()
    public const val MEDIUM_BLUE: Int = 0xFF0000CD.toInt()
    public const val ROYAL_BLUE: Int = 0xFF4169E1.toInt()
    public const val BLUE: Int = 0xFF0000FF.toInt()
    public const val DODGER_BLUE: Int = 0xFF1E90FF.toInt()
    public const val DEEP_SKY_BLUE: Int = 0xFF00BFFF.toInt()
    public const val SKY_BLUE: Int = 0xFF87CEEB.toInt()
    public const val LIGHT_SKY_BLUE: Int = 0xFF87CEFA.toInt()
    public const val STEEL_BLUE: Int = 0xFF4682B4.toInt()
    public const val LIGHT_STEEL_BLUE: Int = 0xFFB0C4DE.toInt()
    public const val LIGHT_BLUE: Int = 0xFFADD8E6.toInt()
    public const val POWDER_BLUE: Int = 0xFFB0E0E6.toInt()
    public const val PALE_TURQUOISE: Int = 0xFFAFEEEE.toInt()
    public const val DARK_TURQUOISE: Int = 0xFF00CED1.toInt()
    public const val MEDIUM_TURQUOISE: Int = 0xFF48D1CC.toInt()
    public const val TURQUOISE: Int = 0xFF40E0D0.toInt()
    public const val CYAN: Int = 0xFF00FFFF.toInt()
    public const val AQUA: Int = 0xFF00FFFF.toInt()
    public const val LIGHT_CYAN: Int = 0xFFE0FFFF.toInt()
    public const val CADET_BLUE: Int = 0xFF5F9EA0.toInt()
    public const val MEDIUM_AQUAMARINE: Int = 0xFF66CDAA.toInt()
    public const val AQUAMARINE: Int = 0xFF7FFFD4.toInt()
    public const val DARK_GREEN: Int = 0xFF006400.toInt()
    public const val DARK_OLIVE_GREEN: Int = 0xFF556B2F.toInt()
    public const val DARK_SEA_GREEN: Int = 0xFF8FBC8F.toInt()
    public const val SEA_GREEN: Int = 0xFF2E8B57.toInt()
    public const val MEDIUM_SEA_GREEN: Int = 0xFF3CB371.toInt()
    public const val LIGHT_SEA_GREEN: Int = 0xFF20B2AA.toInt()
    public const val PALE_GREEN: Int = 0xFF98FB98.toInt()
    public const val SPRING_GREEN: Int = 0xFF00FF7F.toInt()
    public const val LAWN_GREEN: Int = 0xFF7CFC00.toInt()
    public const val GREEN: Int = 0xFF00FF00.toInt()
    public const val LIME: Int = 0xFF00FF00.toInt()
    public const val WEB_GREEN: Int = 0xFF008000.toInt()
    public const val CHARTREUSE: Int = 0xFF7FFF00.toInt()
    public const val MEDIUM_SPRING_GREEN: Int = 0xFF00FA9A.toInt()
    public const val GREEN_YELLOW: Int = 0xFFADFF2F.toInt()
    public const val LIME_GREEN: Int = 0xFF32CD32.toInt()
    public const val YELLOW_GREEN: Int = 0xFF9ACD32.toInt()
    public const val FOREST_GREEN: Int = 0xFF228B22.toInt()
    public const val OLIVE_DRAB: Int = 0xFF6B8E23.toInt()
    public const val DARK_KHAKI: Int = 0xFFBDB76B.toInt()
    public const val KHAKI: Int = 0xFFF0E68C.toInt()
    public const val PALE_GOLDENROD: Int = 0xFFEEE8AA.toInt()
    public const val LIGHT_GOLDENROD_YELLOW: Int = 0xFFFAFAD2.toInt()
    public const val LIGHT_YELLOW: Int = 0xFFFFFFE0.toInt()
    public const val YELLOW: Int = 0xFFFFFF00.toInt()
    public const val GOLD: Int = 0xFFFFD700.toInt()
    public const val LIGHT_GOLDENROD: Int = 0xFFEEDD82.toInt()
    public const val GOLDENROD: Int = 0xFFDAA520.toInt()
    public const val DARK_GOLDENROD: Int = 0xFFB8860B.toInt()
    public const val ROSY_BROWN: Int = 0xFFBC8F8F.toInt()
    public const val INDIAN_RED: Int = 0xFFCD5C5C.toInt()
    public const val SADDLE_BROWN: Int = 0xFF8B4513.toInt()
    public const val SIENNA: Int = 0xFFA0522D.toInt()
    public const val PERU: Int = 0xFFCD853F.toInt()
    public const val BURLYWOOD: Int = 0xFFDEB887.toInt()
    public const val BEIGE: Int = 0xFFF5F5DC.toInt()
    public const val WHEAT: Int = 0xFFF5DEB3.toInt()
    public const val SANDY_BROWN: Int = 0xFFF4A460.toInt()
    public const val TAN: Int = 0xFFD2B48C.toInt()
    public const val CHOCOLATE: Int = 0xFFD2691E.toInt()
    public const val FIREBRICK: Int = 0xFFB22222.toInt()
    public const val BROWN: Int = 0xFFA52A2A.toInt()
    public const val DARK_SALMON: Int = 0xFFE9967A.toInt()
    public const val SALMON: Int = 0xFFFA8072.toInt()
    public const val LIGHT_SALMON: Int = 0xFFFFA07A.toInt()
    public const val ORANGE: Int = 0xFFFFA500.toInt()
    public const val DARK_ORANGE: Int = 0xFFFF8C00.toInt()
    public const val CORAL: Int = 0xFFFF7F50.toInt()
    public const val LIGHT_CORAL: Int = 0xFFF08080.toInt()
    public const val TOMATO: Int = 0xFFFF6347.toInt()
    public const val ORANGE_RED: Int = 0xFFFF4500.toInt()
    public const val RED: Int = 0xFFFF0000.toInt()
    public const val HOT_PINK: Int = 0xFFFF69B4.toInt()
    public const val DEEP_PINK: Int = 0xFFFF1493.toInt()
    public const val PINK: Int = 0xFFFFC0CB.toInt()
    public const val LIGHT_PINK: Int = 0xFFFFB6C1.toInt()
    public const val PALE_VIOLET_RED: Int = 0xFFDB7093.toInt()
    public const val MAROON: Int = 0xFFB03060.toInt()
    public const val WEB_MAROON: Int = 0xFF800000.toInt()
    public const val MEDIUM_VIOLET_RED: Int = 0xFFC71585.toInt()
    public const val VIOLET_RED: Int = 0xFFD02090.toInt()
    public const val MAGENTA: Int = 0xFFFF00FF.toInt()
    public const val FUCHSIA: Int = 0xFFFF00FF.toInt()
    public const val VIOLET: Int = 0xFFEE82EE.toInt()
    public const val PLUM: Int = 0xFFDDA0DD.toInt()
    public const val ORCHID: Int = 0xFFDA70D6.toInt()
    public const val MEDIUM_ORCHID: Int = 0xFFBA55D3.toInt()
    public const val DARK_ORCHID: Int = 0xFF9932CC.toInt()
    public const val DARK_VIOLET: Int = 0xFF9400D3.toInt()
    public const val BLUE_VIOLET: Int = 0xFF8A2BE2.toInt()
    public const val PURPLE: Int = 0xFFA020F0.toInt()
    public const val WEB_PURPLE: Int = 0xFF800080.toInt()
    public const val MEDIUM_PURPLE: Int = 0xFF9370DB.toInt()
    public const val THISTLE: Int = 0xFFD8BFD8.toInt()
    public const val DARK_GREY: Int = 0xFFA9A9A9.toInt()
    public const val DARK_GRAY: Int = 0xFFA9A9A9.toInt()
    public const val DARK_BLUE: Int = 0xFF00008B.toInt()
    public const val DARK_CYAN: Int = 0xFF008B8B.toInt()
    public const val DARK_MAGENTA: Int = 0xFF8B008B.toInt()
    public const val DARK_RED: Int = 0xFF8B0000.toInt()
    public const val LIGHT_GREEN: Int = 0xFF90EE90.toInt()
    public const val CRIMSON: Int = 0xFFDC143C.toInt()
    public const val INDIGO: Int = 0xFF4B0082.toInt()
    public const val OLIVE: Int = 0xFF808000.toInt()
    public const val REBECCA_PURPLE: Int = 0xFF663399.toInt()
    public const val SILVER: Int = 0xFFC0C0C0.toInt()
    public const val TEAL: Int = 0xFF008080.toInt()
}