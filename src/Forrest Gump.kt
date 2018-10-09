package persons

import box.Boxofchocolate

class forrest ( val name: String,
        val quantity: ArrayList<Int> = ArrayList()
){

    fun chocolates(): Int{
        return quantity.size
    }
    fun pickOne (){
        quantity.add(1)
    }

}
