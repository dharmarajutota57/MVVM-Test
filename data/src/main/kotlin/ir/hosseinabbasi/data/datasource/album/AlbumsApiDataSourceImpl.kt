package com.android.raj.test.data.datasource.album

import io.reactivex.Single
import com.android.raj.test.data.api.AlbumApi
import com.android.raj.test.data.common.extension.applyIoScheduler
import com.android.raj.test.data.mapper.map
import com.android.raj.test.domain.entity.Entity

/**
 * Created by Dr.jacky on 9/24/2018.
 */
/**
 * Album network data source implementation
 */
class AlbumsApiDataSourceImpl(private val api: AlbumApi) : AlbumsApiDataSource {

    /**
     * Get all of albums from network implementation
     */
    override fun getAlbums(page: Int, pageSize: Int): Single<List<Entity.Album>> =
            api.getAlbums(page, pageSize)
                    .applyIoScheduler()
                    .map { item -> item.map { it.map() } }
}