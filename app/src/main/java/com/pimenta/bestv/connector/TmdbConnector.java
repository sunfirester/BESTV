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

package com.pimenta.bestv.connector;

import com.pimenta.bestv.models.CastList;
import com.pimenta.bestv.models.Genre;
import com.pimenta.bestv.models.Movie;
import com.pimenta.bestv.models.MovieList;
import com.pimenta.bestv.models.VideoList;

import java.util.List;

/**
 * Created by marcus on 08-02-2018.
 */
public interface TmdbConnector {

    /**
     * Gets the {@link List<Genre>} available at TMDb
     *
     * @return {@link List<Genre>}
     */
    List<Genre> getGenres();

    /**
     * Gets the {@link List<Movie>} by the {@link Genre}
     *
     * @param genre {@link Genre} to search the {@link List<Movie>}
     * @param page  Specify which page to query. Minimum: 1, maximum: 1000,
     *              default: 1
     *
     * @return {@link MovieList}
     */
    MovieList getMoviesByGenre(Genre genre, int page);

    /**
     * Gets the {@link CastList} by the {@link Movie}
     *
     * @param movie {@link Movie} to search the {@link List<CastList>}
     *
     * @return {@link CastList}
     */
    CastList getCastByMovie(Movie movie);

    /**
     * Gets a list of recommended movies for a movie.
     *
     * @param movie {@link Movie} to search the {@link List<Movie>}
     * @param page  Specify which page to query. Minimum: 1, maximum: 1000,
     *              default: 1
     *
     * @return {@link MovieList}
     */
    MovieList getRecommendationByMovie(Movie movie, int page);

    /**
     * Gets a list of similar movies. This is not the same as the
     * "Recommendation" system you see on the website. These items
     * are assembled by looking at keywords and genres.
     *
     * @param movie {@link Movie} to search the {@link List<Movie>}
     * @param page  Specify which page to query. Minimum: 1, maximum: 1000,
     *              default: 1
     *
     * @return {@link MovieList}
     */
    MovieList getSimilarByMovie(Movie movie, int page);

    /**
     * Gets the videos from a movie
     *
     * @param movie {@link Movie}
     *
     * @return      {@link VideoList}
     */
    VideoList getVideosByMovie(Movie movie);

    /**
     * Gets the now playing {@link MovieList}
     *
     * @param page Specify which page to query. Minimum: 1, maximum: 1000,
     *             default: 1
     *
     * @return {@link MovieList}
     */
    MovieList getNowPlayingMovies(int page);

    /**
     * Gets the popular {@link MovieList}
     *
     * @param page Specify which page to query. Minimum: 1, maximum: 1000,
     *             default: 1
     *
     * @return {@link MovieList}
     */
    MovieList getPopularMovies(int page);

    /**
     * Gets the top rated {@link MovieList}
     *
     * @param page Specify which page to query. Minimum: 1, maximum: 1000,
     *             default: 1
     *
     * @return {@link MovieList}
     */
    MovieList getTopRatedMovies(int page);

    /**
     * Gets the up coming {@link MovieList}
     *
     * @param page Specify which page to query. Minimum: 1, maximum: 1000,
     *             default: 1
     *
     * @return {@link MovieList}
     */
    MovieList getUpComingMovies(int page);

}