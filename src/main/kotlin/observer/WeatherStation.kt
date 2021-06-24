package observer


fun main() {
    val weatherData = WeatherData()
    val currentDisplay = CurrentConditionDisplay(weatherData)
    val heatIndexDisplay = HeatIndexDisplay(weatherData)
    weatherData.weatherMetrics = WeatherMetrics(80f, 65f, 30.4f)
}