package dev.bulean.datafragmentvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Pass data between Fragments
 * https://developer.android.com/training/basics/fragments/communicating
 * https://developer.android.com/topic/libraries/architecture/viewmodel
 *
 * */
/*
* Fragment + ViewModel
* The recommended way to communicate between fragments is to create a shared ViewModel.
* Both fragments can access the ViewModel through their containing Activity.
* The Fragments can update data within the ViewModel and if the data is exposed using LiveData,
* the new state will be pushed to the other fragment as long as it is observing the LiveData from
* the ViewModel.
* */
/*
*  Implement ViewModel
* Architecture Components provides ViewModel helper class for the UI controller that is responsible
* for preparing data for the UI. ViewModel objects are automatically retained during configuration
* changes so that data they hold is immediately available to the next activity or fragment instance.
* When the owner activity is finished, the framework calls the ViewModel objects's onCleared()
* method so that it can clean up resources.
*
* */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Replace Main Activity content with the MainFragment content
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, MainFragment())
        transaction.commit()
    }

}