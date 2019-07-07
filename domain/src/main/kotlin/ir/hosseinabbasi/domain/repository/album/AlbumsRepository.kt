package com.android.raj.test.domain.repository.album

import androidx.paging.PagedList
import io.reactivex.Flowable
import io.reactivex.Single
import com.android.raj.test.domain.common.ResultState
import com.android.raj.test.domain.entity.Entity
import com.android.raj.test.domain.repository.BaseRepository

/**
 * Created by Dr.jacky on 9/23/2018.
 */
/**
 * Album repository
 */
interface AlbumsRepository : BaseRepository {

    /**
     * Perform
     */
    fun getAlbums(): Flowable<ResultState<PagedList<Entity.Album>>>

    fun deleteAlbum(album: Entity.Album): Single<ResultState<Int>>

    //fun loadAlbums(pageNumber: Int): Single<ResultState<List<Entity.Album>>>
}