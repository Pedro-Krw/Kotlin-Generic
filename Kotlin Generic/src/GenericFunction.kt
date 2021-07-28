class GenericFunction(val name : String) {

    fun <T> sai(param : T){
        print("Sai get one $param , and buy 2 from $name")
    }


}

fun main() {

    val objc = GenericFunction("")
    objc.sai("run the project from jvm")
}