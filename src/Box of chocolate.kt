package box

import chocolate.Chocolate
import java.util.*

class Boxofchocolate (
        val name: String,
        private var chocolates: ArrayList<Chocolate> = ArrayList()
){
    fun initList(){
        //chocolates: ArrayList<String>; ArrayList()
        chocolates.add(Chocolate("Hersheys"))
        chocolates.add(Chocolate("Snickers"))
        chocolates.add(Chocolate("Toblerone"))
    }

    fun pickUp(){
        val random = Random()
        val max = chocolates.size
        val numRnd = random.nextInt(0..max) // print 0, 1 ó 2
        if (chocolates.size > 0){
            chocolates.removeAt(numRnd)
        }else if(chocolates.size <= 0 )
            println("Ya no hay chocolates, Forrest esta triste :(")
    }

    fun Random.nextInt(range: IntRange): Int {
        return range.start + nextInt(range.last - range.start)
   }
}



//fun addchocolate(chocolates: Chocolate) { var i = chocolates() i.chocolates.add(mo3dInfo("f", "test", "test")) }
//fun addChocolate(chocolate: Chocolate): {
 //   chocolates.add(Chocolate)





