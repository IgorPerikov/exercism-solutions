object Acronym {
    fun generate(phrase: String): String {
        var ph = phrase
        val acronym = StringBuilder()
        val lowerCaseRange = 'a'..'z'
        val upperCaseRange = 'A'..'Z'
        while (ph.isNotEmpty()) {
            ph = ph.dropWhile { c -> c !in lowerCaseRange && c !in upperCaseRange }
            if (ph.isNotEmpty()) acronym.append(ph[0].toUpperCase())
            ph = ph.dropWhile { c -> c in lowerCaseRange || c in upperCaseRange }
        }
        return acronym.toString()
    }
}
