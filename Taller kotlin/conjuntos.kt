// cree 2 variables de numeros de un tamaño de 5 y luego pruebe las diferentes propiedades y un ciclo.


fun main(){

    val numeros1 = mutableSetOf(1,2,3,4,5)
    val numeros2 = mutableSetOf(1,3,5,6,7)

    println("listas")
    println(numeros1)
    println(numeros2)
    println("Ciclo for")
    for (i in numeros1) {
        println(i)
    }
    println("validar si un dato se encuentra en una variable")
    println(numeros1.contains(5))
    println("eliminar valores")
    numeros1.remove(3)
    println(numeros1)
    println("agregar valores")
    numeros1.add(3)
    println(numeros1)
    println("union de las variables")
    println("union = ${numeros1 union numeros2}}" ) 
    println("Interseccion de las variables")
    println("interseccion = ${numeros1  intersect numeros2}")
    println("subtraccion")
    println("subtraccion = ${numeros1  subtract numeros2}")


    // val numeros: Set<Int> = setOf(1,2,3,4,5,6,7)
    // println(numeros.contains(3))

    // val mezclado = setOf(1,"kawasaki",4.44,'c')
    // println(mezclado)

    // val mutables = mutableSetOf(1,2,3,4,5,6,7)
    // mutables.remove(1)
    // println(mutables)
    // mutables.add(1)
    // println(mutables)

    // for(i in mutables){
    //     println(i)
    // }
}