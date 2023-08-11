import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor

fun main(args: Array<String>) {
    /*
    println("Hola")

    //Variables var
    //Constantes val

    var num1 = 5
    var nota = 3.5
    var nombre = "Pedro"
    var letra = "c"

    var num2:Int = 3
    var final:Double = 3.4
    var apellido:String = "Lopez"

    val pi = 3.1416

    var suma = num1+num2


    //Imprimir lo que sea en varias lineas de codigo

    println("""
        La suma es:
        $suma
    """.trimIndent())
    println("La suma es $suma")

    //Convertir tipos de datos

    var nu1 = "5"

    var total = nu1.toInt()*suma
    println("El total es $total")

    //Ingresar datos por teclado

    println("Ingrese valor de la base:")
    var base = readln().toDouble()

    println("Ingrese el valor de la altura")
    var altura = readln().toDouble();
    var AT = (base*altura)/2

    println("""
        Valores del triagulo
        Base: $base
        Altura: $altura
        El area es: $AT
    """.trimIndent())

    //Uso de biblioteca matematica

    var raiz = Math.sqrt(AT.toDouble())
    println("La raiz es: $raiz")

    //Redondeo de numeros cifras definidas

    println(DecimalFormat("#.###").format(raiz))

    //Redondear numeros hacia abajo

    println(floor(raiz).toInt())

    //Redondear hacia arriba

    println(ceil(raiz).toInt())

    //Estructuras
    //IF - ELSE

    var edad = 18
    if (edad >= 18){println("Fino")}
    else{println("No Fino")}

    //WHEN

    var edad = 22

    when(edad){
        1 -> {
            println("bebe")
        }
        in 2..18 -> {println("niño")}
        in 21..30 -> {println("adulto")}
        else -> { println("aja mani")}
    }
    */
    //CICLOS
    //FOR
/*
    for (i in 1..3){
        println(i)
    }

    for (i in 3 downTo 1){
        println(i)
    }

    for (j in 40 downTo 1 step 10){
        println(j)
    }
    */
    //WHILE
/*
    var num = 1

    while (num <= 10){
        println(num)
        num++
    }
    */
    //DO WHILE
/*
    var num = 100
    do {
        println(num)
        num--
    }while (num>= 1)

*//*
    //ARREGLOS

    //arrayof: almacenar cualquier tipo de dato

    var estudiantes = arrayOf("lorena","karen","tatiana",56,44,12)
    println(estudiantes[1])
    println(estudiantes.size)

    //intarrayof: almacenar enteros

    var numeros = intArrayOf(3,34,6)

    var numeros = intArrayOf(12,24,36,48,60)

    for(i in 0 until numeros.size){
        println(numeros[i])
    }
*/
    //ArrayListOf : Dinamica | .add - .remove
    //arrayListOf<String>: La lista va a ser string
    //sino, la lista recibe cualquier tipo de dato

    var milista = arrayListOf("miguel","jeison",4,5)

    var num1 = milista[2] as Int
    var num2 = milista[3] as Int

    println(num1+num2)

    milista.forEach{
        est -> println(est)
    }

    milista.forEachIndexed { i, est -> println("$i. $est") }

}