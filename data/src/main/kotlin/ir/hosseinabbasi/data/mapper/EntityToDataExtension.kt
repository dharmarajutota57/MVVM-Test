package com.android.raj.test.data.mapper

import com.android.raj.test.data.db.album.AlbumData
import com.android.raj.test.domain.entity.Entity

/**
  * Created by raju  on 10/10/2018.
 */
/**
 * Extension class to map album entity to album data
 */
fun Entity.Album.map() = AlbumData.Album(
        id = id,
        userId = userId,
        title = title
)