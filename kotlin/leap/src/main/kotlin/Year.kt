class Year(private val year: Int) {
    val isLeap: Boolean by lazy {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                year % 400 == 0
            } else {
                true
            }
        } else {
            false
        }
    }
}
