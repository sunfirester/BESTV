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

package com.pimenta.bestv.castdetail.di

import com.pimenta.bestv.castdetail.presentation.ui.activity.CastDetailsActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by marcus on 25-11-2018.
 */
@Singleton
@Component
interface CastDetailActivityComponent {

    fun inject(activity: CastDetailsActivity)

    companion object {
        fun build(): CastDetailActivityComponent =
                DaggerCastDetailActivityComponent
                        .builder()
                        .build()
    }
}
