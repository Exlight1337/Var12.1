@file:Suppress("UNUSED_PARAMETER", "unused")
package ClassofBook
class bookofaddress {

    data class Adress (var adress: String, var house: String, var appartament: String)

    data class bookOfName (var adList: MutableMap<String, Adress>) {


        fun addresOfNames(name: String): Adress {
           val adName = adList[name] ?: throw Exception()
            return adName
        }

        fun pair(person: Pair<String, Adress>) {
            adList.any {it.key == person.first}
                adList[person.first] = person.second
        }

        fun delete(name1: String):Boolean {
            return if (adList.containsKey(name1)){
                adList.remove(name1)
                true
            } else false
        }

        fun changeAdressOfPeople(person: Pair<String, Adress>):Boolean {
          return if (adList.containsKey(person.first)){
                adList[person.first] = person.second
              true
            }  else false
        }

        fun inTheStreet(adress: String): List<String> {
            val AdressList = mutableListOf<String>()
            for (Adr in adList)
                if (adress == Adr.value.adress)
                    AdressList.add(Adr.key)
            return AdressList
        }

        fun inTheHouse(house: String): List<String>{
            val HouseList = mutableListOf<String>()
            for (Str in adList)
                if (house == Str.value.house)
                    HouseList.add(Str.key)
            return HouseList
        }
    }
}