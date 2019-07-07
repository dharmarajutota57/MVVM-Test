package com.android.raj.test.domain.common.transformer

import io.reactivex.SingleTransformer

/**
 * Created by raju  on 07/07/2019
 */
/**
 * A transformer to io thread for singles.
 */
abstract class STransformer<T> : SingleTransformer<T, T>