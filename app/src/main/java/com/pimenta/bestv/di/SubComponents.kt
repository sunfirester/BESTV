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

package com.pimenta.bestv.di

import com.pimenta.bestv.feature.castdetail.presenter.CastDetailsPresenter
import com.pimenta.bestv.feature.castdetail.ui.CastDetailsFragment
import com.pimenta.bestv.feature.recommendation.presenter.RecommendationPresenter
import com.pimenta.bestv.feature.recommendation.service.RecommendationService
import com.pimenta.bestv.feature.search.presenter.SearchPresenter
import com.pimenta.bestv.feature.search.ui.SearchFragment
import com.pimenta.bestv.feature.splash.presenter.SplashPresenter
import com.pimenta.bestv.feature.splash.ui.SplashFragment
import com.pimenta.bestv.feature.workbrowse.presenter.WorkBrowsePresenter
import com.pimenta.bestv.feature.workbrowse.ui.WorkBrowseFragment
import com.pimenta.bestv.feature.workdetail.presenter.WorkDetailsPresenter
import com.pimenta.bestv.feature.workdetail.ui.WorkDetailsFragment
import com.pimenta.bestv.feature.workgrid.presenter.WorkGridPresenter
import com.pimenta.bestv.feature.workgrid.ui.GenreWorkGridFragment
import com.pimenta.bestv.feature.workgrid.ui.TopWorkGridFragment
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent
interface SplashFragmentComponent {

    fun inject(splashFragment: SplashFragment)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun view(view: SplashPresenter.View): Builder

        fun build(): SplashFragmentComponent
    }
}

@Subcomponent
interface WorkBrowseFragmentComponent {

    fun inject(workBrowseFragment: WorkBrowseFragment)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun view(view: WorkBrowsePresenter.View): Builder

        fun build(): WorkBrowseFragmentComponent
    }
}

@Subcomponent
interface TopWorkGridFragmentComponent {

    fun inject(topWorkGridFragment: TopWorkGridFragment)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun view(view: WorkGridPresenter.View): Builder

        fun build(): TopWorkGridFragmentComponent
    }
}

@Subcomponent
interface GenreWorkGridFragmentComponent {

    fun inject(genreWorkGridFragment: GenreWorkGridFragment)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun view(view: WorkGridPresenter.View): Builder

        fun build(): GenreWorkGridFragmentComponent
    }
}

@Subcomponent
interface WorkDetailsFragmentComponent {

    fun inject(workDetailsFragment: WorkDetailsFragment)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun view(view: WorkDetailsPresenter.View): Builder

        fun build(): WorkDetailsFragmentComponent
    }
}

@Subcomponent
interface CastDetailsFragmentComponent {

    fun inject(castDetailsFragment: CastDetailsFragment)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun view(view: CastDetailsPresenter.View): Builder

        fun build(): CastDetailsFragmentComponent
    }
}

@Subcomponent
interface SearchFragmentComponent {

    fun inject(searchFragment: SearchFragment)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun view(view: SearchPresenter.View): Builder

        fun build(): SearchFragmentComponent
    }
}

@Subcomponent
interface RecommendationServiceComponent {

    fun inject(recommendationService: RecommendationService)

    @Subcomponent.Builder
    interface Builder {

        @BindsInstance
        fun service(service: RecommendationPresenter.Service): Builder

        fun build(): RecommendationServiceComponent
    }
}