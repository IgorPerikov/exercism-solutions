object Hamming {
    fun compute(strand1: String, strand2: String): Int {
        if (strand1.length != strand2.length) {
            throw IllegalArgumentException("left and right strands must be of equal length.")
        }
        var count = 0
        strand1.forEachIndexed { index, element ->
            if (strand2[index] != element) count++
        }
        return count
    }
}
