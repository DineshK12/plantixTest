package com.plantix.test.repo

import com.plantix.test.model.UserName

interface UsersRepository {
    fun users() : List<UserName>
}