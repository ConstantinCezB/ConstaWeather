package com.example.constaweather.data.repository

import androidx.lifecycle.LiveData
import com.example.constaweather.data.db.entity.WeatherLocation
import com.example.constaweather.data.db.unitlocolized.Current.UnitSpecificCurrentWeatherEntry
import com.example.constaweather.data.db.unitlocolized.future.UnitSpecificSimpleFutureWeatherEntry
import org.threeten.bp.LocalDate


interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>

    suspend fun getFutureWeatherList(startDate: LocalDate, metric: Boolean): LiveData<out List<UnitSpecificSimpleFutureWeatherEntry>>

    suspend fun getWeatherLocation(): LiveData<WeatherLocation>
}