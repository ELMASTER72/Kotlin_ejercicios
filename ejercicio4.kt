// Dado el siguiente cuadro:
// 1. Lunes
// 2. Martes
// 3. Miercoles
// 4. Jueves
// 5. Viernes
// 6. Sabado
// 7. Domingo
// Haga un algoritmo que solicite el ingreso de un número e indique el dia correspondiente, valide si el código no existe.


fun main(){
    var menu = """
    1. Lunes
    2. Martes
    3. Miercoles
    4. Jueves
    5. Viernes
    6. Sabado
    7. Domingo
    Ingrese una opcion:"""
    //se crea el menu

    print(menu)
    //imprime el menu

    var opcion = readLine()?.toInt()
    //crea la variable y lee lo que el usuario ingresa en consola y lo convierte a tipo int

    when(opcion){
        1 -> println("lunes")
        2 -> println("martes")
        3 -> println("miercoles")
        4 -> println("jueves")
        5 -> println("viernes")
        6 -> println("sabado")
        7 -> println("domingo")
        else -> println("El codigo no existe")
    }
    //se crea la condicional para cada una de las opciones del menu
}


