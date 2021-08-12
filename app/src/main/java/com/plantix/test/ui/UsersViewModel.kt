package com.plantix.test.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.plantix.test.model.UserName
import com.plantix.test.repo.UsersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UsersViewModel @Inject constructor(private val usersRepository: UsersRepository) : ViewModel() {

    private var _usersData = MutableLiveData<List<UserName>>()

    val usersData: LiveData<List<UserName>>
        get() = _usersData

    fun fetchUsers() {
        _usersData.value = usersRepository.users()
    }
}