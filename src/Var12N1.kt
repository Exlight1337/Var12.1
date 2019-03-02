
data class People(var name: String, var adress: String, var number: Int, var cvar: Int)

class NameOfStreet {
var masive = mutableListOf<People>()
fun add( nameOrserName: String, newAdress: String, newNumber: Int, newCvartira: Int){
   if ( masive.none { it.name == nameOrserName && it.adress == newAdress
       && it.number == newNumber && it.cvar == newCvartira})
       masive.add(People(nameOrserName, newAdress, newNumber, newCvartira))
    else println("Такой человек - адрес уже есть")
}
fun delNameOfMas (delName: String): MutableList<People> {
    masive = masive.filter { it.name != delName}.toMutableList()
    return masive
}
fun changeAdressOfPeople (name: String, newAdress: String): MutableList<People> {
    masive.map{if (it.name == name) it.adress = newAdress }
    return masive
}
fun receptionOfPeople (name: String, adress: String): MutableList<People> {
    return masive
}
}
    