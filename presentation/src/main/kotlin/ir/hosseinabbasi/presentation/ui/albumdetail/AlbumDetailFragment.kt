package com.android.raj.test.presentation.ui.albumdetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.raj.test.presentation.R
import com.android.raj.test.presentation.ui.base.BaseFragment

/**
 * Created by Dr.jacky on 9/7/2018.
 */
class AlbumDetailFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_album_detail, container, false)
}