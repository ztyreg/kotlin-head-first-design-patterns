package observer

interface Observer {
    fun update(weatherMetrics: WeatherMetrics)
}