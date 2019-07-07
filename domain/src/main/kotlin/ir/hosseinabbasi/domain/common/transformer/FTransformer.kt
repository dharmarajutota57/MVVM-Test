package com.android.raj.test.domain.common.transformer

import io.reactivex.FlowableTransformer

/**
 * Created by raju  on 07/07/2019
 */
/**
 * A transformer to io thread for flowables.
 */
abstract class FTransformer<T> : FlowableTransformer<T, T>