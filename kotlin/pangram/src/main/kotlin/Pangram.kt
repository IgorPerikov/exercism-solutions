object Pangram {
    fun isPangram(text: String): Boolean {
        val allLettersSet = ('a'..'z').toSet() as MutableSet<Char>
        text.forEach { letter ->
            allLettersSet.remove(letter.toLowerCase())
        }
        return allLettersSet.isEmpty()
    }
}
