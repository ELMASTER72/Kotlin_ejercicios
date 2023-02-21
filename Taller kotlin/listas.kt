// Crear una lista mutable con las edades de varias personas. 
// Probar las propiedades y métodos principales para administrar la lista mutable.

fun main(){
  val edad: MutableList<Int> = mutableListOf()
    for(i in 0..5){
      print("Ingrese la edad " + (i+1) + " : " )
      edad.add(i,readLine()!!.toInt())
    }
    println("lista de edades")
    println(edad)
    println("lista modificada")
    edad[0] = 30
    println(edad)
    println("Promedio de las edades")
    println(edad.average())
    println("Agregar a la lista")
    edad.add(30)
    println(edad)
    println("Agregar edad al principio")
    edad.add(0,20)
    println(edad)
    println("Elimina la primera edad")
    edad.removeAt(0)
    println(edad)
    println("tamaño de la lista")
    println(edad.size)
    println("devuelve el valor en la posicion seleccionada")
    println(edad.get(5))
    println("Devuelve el primer valor")
    println(edad.first())
    println("Devuelve el último valor")
    println(edad.last())
}



// fun main(){
//     println("Lista inmutables")
//     //lista inmutables
//     val autos: List<String> = listOf("ford","mclaren","dodge","ferrari")
//     println(autos)

//     println("")
//       println("Lista mutables")
//     //lista mutables
//     var autos1: MutableList<String> = mutableListOf("ford","mclaren","dodge","ferrari")
//     println(autos1)
//     autos1.set(0,"kia")
//     println(autos1)
//     autos1.add("ford")
//     println(autos1)

//     for (i in autos1) {
//         println(i)
//     }
// }