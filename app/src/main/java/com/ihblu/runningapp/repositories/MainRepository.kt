package com.ihblu.runningapp.repositories

import com.ihblu.runningapp.db.Run
import com.ihblu.runningapp.db.RunDAO
import javax.inject.Inject

/**
 * @Description:
 * @Author: wy1in
 * @Date: 2023/6/18
 */
class MainRepository @Inject constructor(
    val runDAO: RunDAO
){
    suspend fun insertRun(run: Run) = runDAO.insertRun(run)

    suspend fun deleteRun(run: Run) = runDAO.deleteRun(run)

    fun getAllRunSortedByDate() = runDAO.getAllRunSortedByDate()

    fun getAllRunSortedByDistance() = runDAO.getAllRunSortedByDistance()

    fun getAllRunSortedByTimeInMillis() = runDAO.getAllRunSortedByTimeInMillis()

    fun getAllRunSortedByAvgSpeed() = runDAO.getAllRunSortedByAvgSpeed()

    fun getAllRunSortedByCaloriesBurned() = runDAO.getAllRunSortedByCaloriesBurned()

    fun getTotalAvgSpeed() = runDAO.getTotalAvgSpeed()

    fun getTotalDistance() = runDAO.getTotalDistance()

    fun getTotalCaloriesBurned() = runDAO.getTotalCaloriesBurned()

    fun getTotalTimeInMillis() = runDAO.getTotalTimeInMillis()
}