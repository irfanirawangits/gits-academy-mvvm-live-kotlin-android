package id.gits.gitsmvvmkotlin.mvvm.main


import android.arch.lifecycle.Observer
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.widget.Toast
import id.gits.gitsmvvmkotlin.R
import id.gits.gitsmvvmkotlin.base.BaseActivity
import id.gits.gitsmvvmkotlin.data.model.Movie
import id.gits.gitsmvvmkotlin.mvvm.maindetail.MainDetailActivity
import id.gits.gitsmvvmkotlin.util.AppHelper
import id.gits.gitsmvvmkotlin.util.obtainViewModel
import id.gits.gitsmvvmkotlin.util.replaceFragmentInActivity
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : BaseActivity() {

    private lateinit var viewModel: MainViewModel

    //==============================================================================================

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        setupFragment()
    }

    /**
     * Do setup fragment main view
     */
    private fun setupFragment() {
        supportFragmentManager.findFragmentById(R.id.frame_main_content)
        MainFragment.newInstance().let {
            replaceFragmentInActivity(it, R.id.frame_main_content)
        }
    }

    fun obtainViewModel(): MainViewModel = obtainViewModel(MainViewModel::class.java)
}
