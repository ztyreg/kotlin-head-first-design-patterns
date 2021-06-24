package observer

class CurrentConditionDisplay(private val subject: Subject) : Observer, DisplayElement {

    private var temperature = 0F
    private var humidity = 0F

    init {
        subject.registerObserver(this)
    }

    override fun display() {
        println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    override fun update(weatherMetrics: WeatherMetrics) {
        temperature = weatherMetrics.temperature
        humidity = weatherMetrics.humidity
        display()
    }
}