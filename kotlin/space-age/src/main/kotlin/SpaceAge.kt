import kotlin.math.roundToLong

class SpaceAge(private val age: Long) {
    fun flatOnEarth(): Double {
        return (age.toDouble() / 31557600)
    }

    fun onEarth(): Double {
        return flatOnEarth().roundTo2DecimalPlaces()
    }

    fun onMercury(): Double {
        return (flatOnEarth() / 0.2408467).roundTo2DecimalPlaces()
    }

    fun onVenus(): Double {
        return (flatOnEarth() / 0.61519726).roundTo2DecimalPlaces()
    }

    fun onMars(): Double {
        return (flatOnEarth() / 1.8808158).roundTo2DecimalPlaces()
    }

    fun onJupiter(): Double {
        return (flatOnEarth() / 11.862615).roundTo2DecimalPlaces()
    }

    fun onSaturn(): Double {
        return (flatOnEarth() / 29.447498).roundTo2DecimalPlaces()
    }

    fun onUranus(): Double {
        return (flatOnEarth() / 84.016846).roundTo2DecimalPlaces()
    }

    fun onNeptune(): Double {
        return (flatOnEarth() / 164.79132).roundTo2DecimalPlaces()
    }

    private fun Double.roundTo2DecimalPlaces(): Double {
        return (this * 100).roundToLong().toDouble() / 100
    }
}
