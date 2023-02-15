// Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
// 1. Sumar
// 2. Restar
// 3. Multiplicar
// 4. Dividir
// 5. Finalizar
// Haga el sistema con ciclos y valide que el segundo numero no sea negativo o cero en la opción 4

fun main(){
    var opcion: Int = 0
    var num1 : Float
    var num2 : Float
    //se inicializan las variables

    while(opcion !=5){
        print("Ingrese el primer numero: ")
        //imprime en la consola lo que debe ingresar el usuario

        num1 = readLine()!!.toFloat()
        //llama a la vaiable y le asigna un valor

        print("Ingrese el segundo numero: ")
        //imprime en la consola lo que debe ingresar el usuario

        num2 = readLine()!!.toFloat()
        //llama a la vaiable y le asigna un valor

        print("Elija una opcion: \n1. SUMAR \n2. RESTAR \n3. MULTIPLICAR \n4. DIVIDIR \n5. FINALIZAR \n")
        //imprime el menu en la consola

        opcion = readLine()!!.toInt()
        //llama a la vaiable y le asigna un valor
        
        when(opcion){
            1 -> println("La suma es: ${num1 + num2}")
            2 -> println("La resta es: ${num1 - num2}")
            3 -> println("La multiplicacion es: ${num1 * num2}")
            4 -> {
                if(num2 <= 0){
                    println("El segundo numero no puede ser negativo o cero")
                }else{
                    println("La division es: ${num1 / num2}")
                }
                //valida si el segundo numero es menor o igaul a 0
            }
            5 -> println("Programa finalizado")
            else -> println("Opcion es invalida")
        }
        //se crean las condicionales para cada una de las opciones del menu
    }
}

