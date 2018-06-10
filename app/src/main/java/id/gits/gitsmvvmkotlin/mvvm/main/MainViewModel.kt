package id.gits.gitsmvvmkotlin.mvvm.main

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import id.gits.gitsmvvmkotlin.data.source.GitsRepository

/**
 * Created by irfanirawansukirman on 26/01/18.
 */

class MainViewModel(context: Application, private val gitsRepository: GitsRepository) : AndroidViewModel(context) {

}