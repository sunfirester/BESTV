/*
 * Copyright (C) 2018 Marcus Pimenta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.pimenta.bestv.model.domain

/**
 * Created by marcus on 29-10-2019.
 */
data class WorkDomainModel(
    val id: Int = 0,
    val title: String? = null,
    val originalTitle: String? = null,
    val releaseDate: String? = null,
    val originalLanguage: String? = null,
    val overview: String? = null,
    val source: String? = null,
    val backdropPath: String? = null,
    val posterPath: String? = null,
    val popularity: Float = 0.toFloat(),
    val voteAverage: Float = 0.toFloat(),
    val voteCount: Float = 0.toFloat(),
    val isAdult: Boolean = false,
    val isFavorite: Boolean = false,
    val type: Type = Type.MOVIE
) {

    enum class Type {
        TV_SHOW,
        MOVIE
    }
}