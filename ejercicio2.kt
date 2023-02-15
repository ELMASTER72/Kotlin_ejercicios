// Algoritmo que solicite la edad de una persona, si la edad es menor a 18 indique es la persona es menor de edad, de lo
// contrario indique que es mayor de edad

fun main(){
    println("Ingrese la edad:")
    //imprime en la consola lo que debe ingresar el usuario

    val edad = readLine()!!.toInt()
    //crea la variable y lee lo que el usuario ingresa en consola y lo convierte a tipo int

    if(edad < 18 ){
        println("La persona es menor de edad")
    }else{
        println("La persona es mayor de edad")
    }
    println("La edad es: $edad")
    //valida si la edad es mayor o menor a 18 e imprime si es mayor o menor de edad
}