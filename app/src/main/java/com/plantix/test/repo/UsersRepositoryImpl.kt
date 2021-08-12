package com.plantix.test.repo

import com.plantix.test.model.UserName
import com.plantix.test.util.MockUtil

class UsersRepositoryImpl : UsersRepository {

    override fun users(): List<UserName> {
        return MockUtil.provideMockUsers()
    }
}