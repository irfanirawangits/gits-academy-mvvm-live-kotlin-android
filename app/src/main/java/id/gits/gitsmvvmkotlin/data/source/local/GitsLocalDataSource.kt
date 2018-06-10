package id.gits.gitsmvvmkotlin.data.source.local

import android.support.annotation.VisibleForTesting
import id.gits.gitsmvvmkotlin.data.source.GitsDataSource
import id.gits.gitsmvvmkotlin.data.source.local.movie.MovieDao
import id.gits.gitsmvvmkotlin.util.dbhelper.AppExecutors

/**
 * Created by irfanirawansukirman on 26/01/18.
 */

class GitsLocalDataSource private constructor(val appExecutors: AppExecutors,
                                              val movieDao: MovieDao) : GitsDataSource {

    companion object {
        private var INSTANCE: GitsLocalDataSource? = null

        @JvmStatic
        fun getInstance(appExecutors: AppExecutors, movieDao: MovieDao): GitsLocalDataSource {
            if (INSTANCE == null) {
                synchronized(GitsLocalDataSource::javaClass) {
                    INSTANCE = GitsLocalDataSource(appExecutors, movieDao)
                }
            }
            return INSTANCE!!
        }

        @VisibleForTesting
        fun clearInstance() {
            INSTANCE = null
        }
    }
}