package com.example.constaweather.ui.weather.current

import androidx.lifecycle.ViewModel
import com.example.constaweather.data.provider.UnitProvider
import com.example.constaweather.data.repository.ForecastRepository
import com.example.constaweather.internal.UnitSystem
import com.example.constaweather.internal.lazyDeferred
import com.example.constaweather.ui.base.WeatherViewModel

class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}
