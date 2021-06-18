package ch02observer

import kotlin.properties.Delegates

data class WeatherMetrics(
    val temperature: Float,
    val humidity: Float,
    val pressure: Float
)

class WeatherData : Subject {
    private val observers = mutableListOf<Observer>()
    var weatherMetrics: WeatherMetrics by Delegates.observable(
        WeatherMetrics(0.0F, 0.0F, 0.0F)
    ) { _, _, _ ->
        notifyObservers()
    }

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (ob in observers) {
            ob.update(weatherMetrics)
        }
    }
}
