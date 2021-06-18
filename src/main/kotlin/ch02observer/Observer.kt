package ch02observer

interface Observer {
    fun update(weatherMetrics: WeatherMetrics)
}