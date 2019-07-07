package com.android.raj.test.domain.usecase.album

import androidx.paging.PagedList
import io.reactivex.Flowable
import io.reactivex.Single
import com.android.raj.test.domain.common.ResultState
import com.android.raj.test.domain.entity.Entity
import com.android.raj.test.domain.usecase.BaseUseCase

/**
 * Created by Dr.jacky on 10/7/2018.
 */
/**
 * Album use case
 */
interface GetAlbumsUseCase : BaseUseCase {

    /**
     * Get all of albums use case
     */
    fun getAlbums(): Flowable<ResultState<PagedList<Entity.Album>>>

    fun deleteAlbum(album: Entity.Album): Single<ResultState<Int>>

    //fun loadAlbums(pageNumber: Int): Single<ResultState<List<Entity.Album>>>
}