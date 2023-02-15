// Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con esto calcule el
// promedio de notas, valide que si el estudiante saca un promedio mayor o igual a 3.5 entonces indique que el estudiante ganó
// la materia, de lo contrario indique que la perdió, en caso de perderla valide si se perdió con una nota mayor a 2.5 entonces el
// estudiante puede recuperar, el mensaje deberá mencionar el nombre y la materia del estudiante.


fun main(){
    println("Ingrese el nombre del estudiante:")
    //imprime en la consola lo que debe ingresar el usuario

    val nombre = readLine()!!
    //crea la variable y lee lo que el usuario ingresa en consola

    println("Ingrese la materia:")
    //imprime en la consola lo que debe ingresar el usuario

    val materia = readLine()!!
    //crea la variable y lee lo que el usuario ingresa en consola

    println("Ingrese la nota 1:")
    //crea la variable y lee lo que el usuario ingresa en consola

    val nota1 = readLine()!!.toFloat()
    //crea la variable y lee lo que el usuario ingresa en consola y lo convierte a tipo float

    println("Ingrese la nota 2:")
    //crea la variable y lee lo que el usuario ingresa en consola

    val nota2 = readLine()!!.toFloat()
    //crea la variable y lee lo que el usuario ingresa en consola y lo convierte a tipo float

    println("Ingrese la nota 3:")
    //crea la variable y lee lo que el usuario ingresa en consola

    val nota3 = readLine()!!.toFloat()
    //crea la variable y lee lo que el usuario ingresa en consola y lo convierte a tipo float

    val prom = (nota1+nota2+nota3)/3
    //se crea la variable de promedio de todas las notas

    println("El promedio de notas es: $prom")
    //imprime el promedio de las notas

    if(prom >= 3.5){
        println("El estudiante $nombre Gano la materia $materia")
    }else{
        println("El estudiante $nombre Perdio la materia $materia")
        if(prom >= 2.5){
            println("$nombre puede recuperar")
        }
    }
    //valida el promedio e imprime si gano o perdio pero si puede recuperar
}