fun main() {
    println("¡Bienvenido!")
    print("Ingrese un número decimal: ")
    val decimal = readLine()!!.toInt()
    val binario = binario(decimal)
    println("El número $decimal a binario es $binario")
    println("Gracias por usar el programa :)")
}

fun binario(n: Int): String {
    return Integer.toBinaryString(n)
}


