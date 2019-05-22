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

package com.pimenta.bestv.common.usecase

import com.pimenta.bestv.common.presentation.mapper.toViewModel
import com.pimenta.bestv.common.presentation.model.CastViewModel
import com.pimenta.bestv.data.repository.MediaRepository
import com.pimenta.bestv.data.entity.Cast
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by marcus on 20-05-2019.
 */
class GetCastPersonalDetails @Inject constructor(
        private val mediaRepository: MediaRepository
) {

    operator fun invoke(cast: Cast): Single<CastViewModel> =
            mediaRepository.getCastDetails(cast)
                    .map { it.toViewModel() }
}