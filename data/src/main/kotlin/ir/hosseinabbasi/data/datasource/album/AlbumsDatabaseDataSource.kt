package com.android.raj.test.data.datasource.album

import androidx.paging.DataSource
import io.reactivex.Single
import com.android.raj.test.data.datasource.BaseDataSource
import com.android.raj.test.domain.entity.Entity

/**
  * Created by raju  on 9/24/2018.
 */
/**
 * Album database data source
 */
interface AlbumsDatabaseDataSource : BaseDataSource {

    /**
     * Get all of albums from database implementation
     */
    fun getAlbums(): DataSource.Factory<Int, Entity.Album>

    /**
     * Persist all of albums in local database
     */
    fun persist(albums: List<Entity.Album>, insertFinished: () -> Unit)

    fun deleteAlbum(album: Entity.Album): Single<Int>
}