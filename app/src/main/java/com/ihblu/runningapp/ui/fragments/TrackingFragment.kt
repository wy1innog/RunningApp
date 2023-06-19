package com.ihblu.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.ihblu.runningapp.R
import com.ihblu.runningapp.ui.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * @Description:
 * @Author: wy1in
 * @Date: 2023/6/18
 */
@AndroidEntryPoint
class TrackingFragment: Fragment(R.layout.fragment_tracking) {

    private val viewModel: MainViewModel by viewModels()
}