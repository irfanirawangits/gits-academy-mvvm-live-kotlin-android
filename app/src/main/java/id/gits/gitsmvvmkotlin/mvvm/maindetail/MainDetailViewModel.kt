package id.gits.gitsmvvmkotlin.mvvm.maindetail

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import id.gits.gitsmvvmkotlin.data.model.Movie
import id.gits.gitsmvvmkotlin.data.source.GitsDataSource
import id.gits.gitsmvvmkotlin.data.source.GitsRepository

class MainDetailViewModel(context: Application, private val gitsRepository: GitsRepository) : AndroidViewModel(context) {

    var errorMessageToast = MutableLiveData<String>()
    val movieTitle = MutableLiveData<String>()
    var movieRating = MutableLiveData<String>()
    var movieDateRelease = MutableLiveData<String>()
    var movieDescription = MutableLiveData<String>()
    var movieImageBackdropUrl = MutableLiveData<String>()

    fun getMovieById(movieId: Int){

    }
}
