package com.plantix.test.util

import com.plantix.test.model.UserName

object MockUtil {

    /**
     * Function to provide mock names for users
     */
    fun provideMockUsers(): List<UserName> {
        val sampleNames = listOf("dinesh", "jack", "jenny", "jhon", "albert", "riyo", "sam", "peter", "mack", "honey", "antino", "andy", "ace", "jan","frank","edward")
        val userNames = mutableListOf<UserName>()
        sampleNames.forEach { name ->
            val userName = UserName(name)
            userNames.add(userName)
        }
        return userNames
    }
}