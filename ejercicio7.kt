// Haga un algoritmo que permita calcular el promedio de n estudiantes, el sistema debe imprimir:
// 1. Cantidad de estudiantes procesados
// 2. Promedio total de los promedios


fun main(){
    var cantidadestudiantes: Int
    var sumapromedios = 0.0
    //se inicializan las variables

    println("Ingrese la cantidad de estudiantes: ")
    //imprime en la consola lo que debe ingresar el usuario

    cantidadestudiantes = readLine()!!.toInt()
    //llama a la vaiable y le asigna un valor

    for (i in 1..cantidadestudiantes) {
        println("Ingrese el promedio del estudiante $i: ")
        //imprime en la consola lo que debe ingresar el usuario

        var promedio = readLine()!!.toDouble()
        //crea la variable y lee lo que el usuario ingresa en consola y lo convierte a tipo double

        sumapromedios += promedio
        //suma el valor de los promedios a la variable promedios
    }
    var promediototal = sumapromedios/cantidadestudiantes
    //crea la variable y realiza la division de suma de los promedios por los estudiantes

    println("Cantidad de estuantes procesados: $cantidadestudiantes")
    //imprime la cantidad de los estudiantes

    println("Promedio total de los promedios: $promediototal")
    //imprime el promedio total de los promedios
}