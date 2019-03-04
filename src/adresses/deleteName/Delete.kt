package adresses.deleteName
import adresses.People.ple

class Delete {
    var enumerate = mutableListOf<ple>()
    fun delNameOfMas (delName: String): MutableList<ple> {
        enumerate = enumerate.filter { it.name != delName}.toMutableList()
        return enumerate
    }
}