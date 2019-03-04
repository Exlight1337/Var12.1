class cc {

    data class Adress (var adress: String, var house: String, var appartament: String)

    data class bookOfName (var adList: MutableMap<String,Adress>) {

        fun addresOfNames(name: String): Adress = adList[name] ?: throw Exception()

        fun addPair(person: Pair<String, Adress>) {
            val list = adList.any{ it.key == person.first }
            if (!list)
                adList[person.first] = person.second
        }
    }
}