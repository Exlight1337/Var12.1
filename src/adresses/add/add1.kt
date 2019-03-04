package adresses.add
import adresses.People.ple

class add1 {
    var enumerate = mutableListOf<ple>()
    fun add( nameOrserName: String, newAdress: String, newNumber: Int, newCvartira: Int){
        if ( enumerate.none { it.name == nameOrserName && it.adress == newAdress
                    && it.number == newNumber && it.cvar == newCvartira})
            enumerate.add(ple(nameOrserName, newAdress, newNumber, newCvartira))
        else println("Такой человек - адрес уже есть")
    }
}