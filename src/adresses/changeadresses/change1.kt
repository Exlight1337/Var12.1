package adresses.changeadresses
import adresses.People.ple

class change1 {
    var enumerate = mutableListOf<ple>()
    fun changeAdressOfPeople (name: String, newAdress: String): MutableList<ple> {
        enumerate.map{if (it.name == name) it.adress = newAdress }
        return enumerate
    }
}