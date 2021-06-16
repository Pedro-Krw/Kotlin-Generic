# Class

## class app {

    var Setup : String = ""
    var Display : Int = 42
    var Vendor : String = ""


}

## class Rata_Rata{

    var Rata_Rata_Nilai : Int = 70
}



class Kiba {

        var Nama : String = "Kiba"
        var Nilai : Int = 80
        var umur : Int = 17
        var NilaiUjian  : Int = 40


}

class Zoro{

    var Nama : String = "Zoro"
    var Nilai : Int = 60
    var umur : Int = 20
    var NilaiUjian  : Int = 40
}


class War{

    var Nama : String = "War"
    var Nilai : Int = 65
    var umur : Int = 25
    var NilaiUjian  : Int = 60
}

## Logic


fun main() {


Peserta()



}


fun Peserta(){
var peserta1 = Kiba()
var peserta2 = Zoro()
var peserta3 = War()
var Rata_Rata = Rata_Rata()
var Lulus : String = " Lulus  "
var Tidak : String = " TidakLulus  "


    if (peserta1.Nilai > Rata_Rata.Rata_Rata_Nilai){
        print(peserta1.Nama + Lulus)
    }
    else{
        print(peserta1.Nama + Tidak)
    }

    if (peserta2.Nilai > Rata_Rata.Rata_Rata_Nilai){
        print(peserta2.Nama + Lulus)
    }
    else{
        print(peserta2.Nama + Tidak)
    }


    if (peserta3.Nilai > Rata_Rata.Rata_Rata_Nilai){
        print(peserta3.Nama + Lulus)
    }
    else{
        print(peserta3.Nama + Tidak)
    }



}



