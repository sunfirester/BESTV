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

package com.pimenta.bestv.workdetail.domain

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import com.pimenta.bestv.model.domain.WorkDomainModel
import com.pimenta.bestv.model.domain.WorkPageDomainModel
import com.pimenta.bestv.workdetail.data.repository.MovieRepository
import io.reactivex.Single
import org.junit.Test

/**
 * Created by marcus on 22-10-2018.
 */
private const val MOVIE_ID = 1
private val WORK_PAGE = WorkPageDomainModel(
        page = 1,
        totalPages = 1,
        works = listOf(
                WorkDomainModel(
                        id = 1,
                        title = "Title"
                )
        )
)

class GetRecommendationByMovieUseCaseTest {

    private val movieRepository: MovieRepository = mock()

    private val useCase = GetRecommendationByMovieUseCase(
            movieRepository
    )

    @Test
    fun `should return the right data when loading the recommendations`() {
        whenever(movieRepository.getRecommendationByMovie(MOVIE_ID, 1))
                .thenReturn(Single.just(WORK_PAGE))

        useCase(MOVIE_ID, 1)
                .test()
                .assertComplete()
                .assertResult(WORK_PAGE)
    }

    @Test
    fun `should return an error when some exception happens`() {
        whenever(movieRepository.getRecommendationByMovie(MOVIE_ID, 1))
                .thenReturn(Single.error(Throwable()))

        useCase(MOVIE_ID, 1)
                .test()
                .assertError(Throwable::class.java)
    }
}