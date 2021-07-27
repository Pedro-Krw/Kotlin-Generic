class Data <T>(val data : T){


}

fun main() {
 DataBind()

}

 private fun DataBind(){

     val dataString = Data<String>("This Program run")
     println("ini Adalah hasil runya -> ${dataString.data}")
 }


