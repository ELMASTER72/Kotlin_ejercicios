// Haga un algoritmo que solicite el nombre de n cantidad de personas e imprima un saludo, el usuario ingresará la
// cantidad de personas a validar.

fun main(){
    print("Ingrese la cantidad de persona a saludar: ")
    //imprime en la consola lo que debe ingresar el usuario

    val cantidadpersonas = readLine()!!.toInt()
    //crea la variable y lee lo que el usuario ingresa en consola y lo convierte a tipo int

    var contador = 1
    //se crea la variable del contador

    do{
        print("ingrese el nombre de la persona $contador: ")
        //imprime en la consola lo que debe ingresar el usuario

        val nombre = readLine()!!
        //crea la variable y lee lo que el usuario ingresa en consola

        println("hola $nombre, ¿bienvenido!")
        //imprime el nombre que fue ingresado

        contador++
        //aumenta el contador
        
    }while(contador <= cantidadpersonas)
    //se crea el ciclo do while en el cual se desarrolla el bloque de ejecucion
}
