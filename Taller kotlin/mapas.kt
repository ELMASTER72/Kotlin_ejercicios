//cree un mapa de libros mutable y luego pruebe las diferentes propiedades y un ciclo.

fun main() {
    val booksMap = mutableMapOf(
        "Sinsajo" to 2010,
        "Yo, Robot" to 1950,
        "Crimen y castigo" to 1935,
        "soledad" to 1991
    )
    booksMap.put("Maquina del tiempo",1984)
    booksMap["Maquina del tiempo"] = 1895
    println(booksMap)
    println("ciclo for")
    for (i in booksMap) {
        println(i)
    }
    println("eliminar")
    booksMap.remove("Maquina del tiempo")
    println(booksMap)
    println("obtiene el valor default")
    println(booksMap.getOrDefault("sinsajo",2010))
    println("retorna si el mapa esta vacio")
    println(booksMap.isEmpty())
    println("Retorna true si key existe en el mapa")
    println(booksMap.containsKey("soledad"))
    println("Retorna true si una o varias claves se relacionan con value")
    println(booksMap.containsValue(1935))
}