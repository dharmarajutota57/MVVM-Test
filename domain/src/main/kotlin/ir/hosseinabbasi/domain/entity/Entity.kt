package com.android.raj.test.domain.entity

/**
  * Created by raju  on 10/9/2018.
 */
/**
 * Album entity
 */
sealed class Entity {

    data class Album(
            val id: Long,
            val title: String,
            val userId: Long
    ) : Entity()
}