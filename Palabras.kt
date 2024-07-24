fun main() {
    println("¡Bienvenido!")
    print("Ingrese varias palabras separadas por espacios: ")
    val palabras = readLine()!!.split(" ")

    var palindromas = 0
    var dosVocales = 0
    var ConConsonante = 0

    for (palabra in palabras) {
        if (Palindroma(palabra)) {
            palindromas++
        }
        if (DosVocales(palabra)) {
            dosVocales++
        }
        if (ConConsonante(palabra)) {
            ConConsonante++
        }
    }

    println("Palabras palíndromas: $palindromas")
    println("Palabras con al menos 2 vocales diferentes: $dosVocales")
    println("Palabras que inician con una consonante: $ConConsonante")

    println("Hasta pronto...")
}

fun Palindroma(palabra: String): Boolean {
    return palabra == palabra.reversed()
}

fun DosVocales(palabra: String): Boolean {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    return palabra.count { it in vocales } >= 2
}

fun ConConsonante(palabra: String): Boolean {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    return palabra.isNotEmpty() && palabra[0].toLowerCase() !in vocales
}
