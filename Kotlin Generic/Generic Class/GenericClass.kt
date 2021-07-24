class GenericClass <T>(val data : T){

}

fun main() {
    val dataString = GenericClass<String>("pedro")
    val velueString : String = dataString.data
    val number = GenericClass<Int>(23)
    val boolean = GenericClass<Boolean>(true)
    val char = GenericClass<Char>('S')
}