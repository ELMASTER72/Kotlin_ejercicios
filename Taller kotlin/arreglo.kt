// Se desea guardar los sueldos de 5 operarios.
// Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto momento los 5 sueldos almacenados en memoria.

fun main(args: Array<String>){
val sueldo: IntArray
sueldo = IntArray(5)
for (i in 0..4) {
    print("Ingrese el sueldo "+ (i+1) + " :")
    sueldo[i] = readLine()!!.toInt()
}
for (i in 0..4) {
    println(sueldo[i])
}
}
