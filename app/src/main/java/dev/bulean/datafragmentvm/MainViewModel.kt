package dev.bulean.datafragmentvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/*
* The ViewModel class is designed to store and manage UI-related data in a lifecycle conscious way.
* The ViewModel class allows data to survive configuration changes such as screen rotations.
* */
class MainViewModel : ViewModel() {
    val data = MutableLiveData<String>()

    fun setData(txtData:String){
        data.value = txtData
    }
}