package com.android.raj.test.presentation.ui.home

import androidx.recyclerview.widget.DiffUtil
import com.android.raj.test.domain.entity.Entity

/**
  * Created by raju  on 10/19/2018.
 */
class AlbumDiffCallback : DiffUtil.ItemCallback<Entity.Album>() {

    override fun areItemsTheSame(oldItem: Entity.Album, newItem: Entity.Album): Boolean =
            oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Entity.Album, newItem: Entity.Album): Boolean =
            oldItem == newItem

    override fun getChangePayload(oldItem: Entity.Album, newItem: Entity.Album): Any? {
        // Return particular field for changed item.
        return super.getChangePayload(oldItem, newItem)
    }
}