package com.android.raj.test.data.mapper

import com.android.raj.test.data.db.album.AlbumData
import com.android.raj.test.domain.entity.Entity

/**
 * Created by Dr.jacky on 10/10/2018.
 */
/**
 * Extension class to map album data to album entity
 */
fun AlbumData.Album.map() = Entity.Album(
        id = id,
        userId = userId,
        title = title
)