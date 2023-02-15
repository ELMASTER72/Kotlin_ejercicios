// Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con esto calcule el
// promedio de notas, valide que si el estudiante saca un promedio menor que 3.5 entonces indique que el estudiante perdió la
// materia, el mensaje deberá mencionar el nombre y la materia del estudiante


fun main(){
    println("Ingrese el nombre del estudiante:")
    //imprime en la consola lo que debe ingresar el usuario

    val nombre = readLine()!!
    //lee lo que el usuario ingresa en consola

    println("Ingrese la materia:")
    //imprime en la consola lo que debe ingresar el usuario

    val materia = readLine()!!
    //lee lo que el usuario ingresa en consola

    println("Ingrese la nota 1:")
    //imprime en la consola lo que debe ingresar el usuario

    val nota1 = readLine()!!.toFloat()
    //crea la variable y lee lo que el usuario ingresa en consola y lo convierte a tipo float

    println("Ingrese la nota 2:")
    val nota2 = readLine()!!.toFloat()
    //crea la variable y lee lo que el usuario ingresa en consola y lo convierte a tipo float

    println("Ingrese la nota 3:")
    //imprime en la consola lo que debe ingresar el usuario

    val nota3 = readLine()!!.toFloat()
    //crea la variable y lee lo que el usuario ingresa en consola y lo convierte a tipo float

    val prom = (nota1+nota2+nota3)/3
    //se crea la variable de promedio de todas las notas

    println("El promedio de notas es: $prom")
    //imprime el promedio de las notas

    if(prom < 3.5){
        println("El estudiante $nombre perdio la materia $materia")
    }else{
        println("El estudiante $nombre gano la matera $materia")
    }
    //valida el promedio e imprime si perdio
}
