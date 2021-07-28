class Data <T>(val data : T){


}

fun main() {
 DataBind()


}

 private fun DataBind(){

     val dataString = Data<String>("This Program run")
     println("ini Adalah hasil runya -> ${dataString.data}")
     val dataset = dataBin<String>("jalan")
     print("${dataset.data_2}")


 }

class dataBin<T>(val data_2 : T){
    val getStringData = dataBin<String> ("bin data_2")
    val getIntData = dataBin<Int>(23)
    val Think = true
    val getBoolean = dataBin<Boolean>(Think)


    fun setOutput(){

        print(getStringData)
        print(getIntData)
        print(getBoolean)


    }


}


class dataSet{

}
