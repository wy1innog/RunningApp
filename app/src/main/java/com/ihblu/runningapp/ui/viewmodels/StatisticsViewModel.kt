package com.ihblu.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.ihblu.runningapp.repositories.MainRepository
import javax.inject.Inject

/**
 * @Description:
 * @Author: wy1in
 * @Date: 2023/6/18
 */
class StatisticsViewModel @Inject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}