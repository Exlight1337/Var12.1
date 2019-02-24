class Dobav (name: String, street: String, number: String, cvar: String) {
    val a = arrayOf<String>(name, street, number, cvar)
    var i = 0
    fun add(roooms: roooms) {
        if (i < a.size ){
            a[i] = roooms.toString()
            System.out.println("Добавлен человек$i")
            i++
        }
    }
}