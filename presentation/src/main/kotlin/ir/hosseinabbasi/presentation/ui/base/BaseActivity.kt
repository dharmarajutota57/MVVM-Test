package com.android.raj.test.presentation.ui.base

import androidx.navigation.NavController
import androidx.navigation.findNavController
import dagger.android.support.DaggerAppCompatActivity

/**
  * Created by raju  on 9/7/2018.
 */
abstract class BaseActivity : DaggerAppCompatActivity() {

    private val navController: NavController by lazy {
        findNavController(getNavControllerId())
    }

    override fun onSupportNavigateUp() = navController.navigateUp()

    abstract fun getNavControllerId(): Int
}