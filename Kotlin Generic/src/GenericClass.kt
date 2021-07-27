class Data <T>(val data : T){


}

fun main() {
 DataBind()

}

 private fun DataBind(){

     val dataString = Data<String>("This Program run")
     val valueString = dataString.data
     println("ini Adalah hasil runya -> $dataString")
 }
