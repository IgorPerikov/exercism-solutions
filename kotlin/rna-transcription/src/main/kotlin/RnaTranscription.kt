fun transcribeToRna(dna: String): String = dna
    .toCharArray()
    .map { dnaNucleotide ->
        when(dnaNucleotide) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> ' '
        }
    }
    .joinToString(separator = "")
