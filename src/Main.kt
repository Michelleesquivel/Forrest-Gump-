package main


import box.Boxofchocolate
import persons.forrest

fun main(args: Array<String>) {
    val caja = Boxofchocolate(name = "caja1")
    val people = forrest(name = "Forrest Gump")
    var wantsToContinue = true

    caja.initList()
    do {

        print("¿Desea que Forrest Gump agarre un chocolate? Presione 1=si 2=no:  ")
        val opcion = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                people.pickOne()
                caja.pickUp()
                print("Forrest Gump ha agarrado un chocolate\n")
                print("Forrest Gump tiene " + people.quantity.size + " chocolates")
                val opcion1 = readLine()!!.toInt()


            }
            2-> {

            }
        }

    }while(wantsToContinue
    )
}