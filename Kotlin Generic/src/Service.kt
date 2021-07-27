data class Service<T>(
    val default : T ,

)
 private  fun setData(){
     val dataString = Service<String>("This program is use generic class on data class")
     val setup = dataString.default

}