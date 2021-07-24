class GenericClass <T>(val data : T){
}

fun main() {


}

class tampung{
    val objectData = setDataGeneric()

}



private fun setDataGeneric(){
    val dataString = GenericClass<String>("pedro")
    val velueString : String = dataString.data
    val number = GenericClass<Int>(23)
    val valueInt : Int = number.data
    val boolean = GenericClass<Boolean>(true)
    val valueBoolean : Boolean = boolean.data
    val char = GenericClass<Char>('S')
    val valueChar : Char = char.data


}