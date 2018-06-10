package id.gits.gitsmvvmkotlin.data.source

import android.util.Log
import com.google.gson.Gson
import id.gits.gitsmvvmkotlin.data.model.Movie

/**
 * Created by irfanirawansukirman on 26/01/18.
 */

open class GitsRepository(val remoteDataSource: GitsDataSource,
                          val localDataSource: GitsDataSource) : GitsDataSource {


    companion object {

        private var INSTANCE: GitsRepository? = null

        /**
         * Returns the single instance of this class, creating it if necessary.

         * @param gitsRemoteDataSourcethe backend data source
         * *
         * @return the [GitsRepository] instance
         */
        @JvmStatic
        fun getInstance(gitsRemoteDataSource: GitsDataSource, gitsLocalDataSource: GitsDataSource) =
                INSTANCE ?: synchronized(GitsRepository::class.java) {
                    INSTANCE ?: GitsRepository(gitsRemoteDataSource, gitsLocalDataSource)
                            .also { INSTANCE = it }
                }

        /**
         * Used to force [getInstance] to create a new instance
         * next time it's called.
         */
        @JvmStatic
        fun destroyInstance() {
            INSTANCE = null
        }
    }
}