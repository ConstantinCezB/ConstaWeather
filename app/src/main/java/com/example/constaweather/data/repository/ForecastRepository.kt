package com.example.constaweather.data.repository

import androidx.lifecycle.LiveData
import com.example.constaweather.data.db.entity.WeatherLocation
import com.example.constaweather.data.db.unitlocolized.Current.UnitSpecificCurrentWeatherEntry


interface ForecastRepository {
    suspend fun getCurrentWeather(metric: Boolean): LiveData<out UnitSpecificCurrentWeatherEntry>
    suspend  fun getWeatherLocation(): LiveData<WeatherLocation>

}