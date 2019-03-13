
class cc {

    data class Adress (var adress: String, var house: String, var appartament: String)

    data class bookOfName (var adList: MutableMap<String,Adress>) {

        fun addresOfNames(name: String): Adress {
           val adName = adList[name] ?: throw Exception()
            return adName
        }

        fun Pair(person: Pair<String, Adress>) {
            adList.any {it.key == person.first}
                adList[person.first] = person.second
        }

        fun delete(name1: String) {
            adList.remove(name1)
        }

        fun changeAdressOfPeople(person: Pair<String, Adress>) {
           val changeAd = delete(person.first)
            Pair(person)
            return changeAd
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