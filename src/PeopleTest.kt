package test

import cc.bookOfName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Tests {
    val ad1 = cc.Adress("Ломоносова", "100", "140")
    val ad2 = cc.Adress("Харченко", "16", "6")
    val ad3 = cc.Adress("Васильевская", "20", "100")
    val ad4 = cc.Adress("Харченко", "16", "6ф")

    val adressName = mutableMapOf(
        "Козлов" to ad1,
        "Петров" to ad3,
        "Качоткин" to ad2,
        "Горюнов" to ad4
    )


    @Test
    fun addressNames() {
        assertEquals(
            cc.Adress("Ломоносова", "100", "140"),
            cc.bookOfName(adressName).addresOfNames("Козлов"))

        assertEquals(
            cc.Adress("Харченко", "16", "6"),
            cc.bookOfName(adressName).addresOfNames("Качоткин"))
    }

    @Test
    fun Pair() {
       val adPair1 = cc.bookOfName(mutableMapOf("Качоткин" to ad2, "Петров" to ad3, "Горюнов" to ad4))
       adPair1.Pair("Козлов" to ad1)
        assertEquals(cc.bookOfName(adressName), adPair1)

        val adPair2 = cc.bookOfName(mutableMapOf("Козлов" to ad1, "Качоткин" to ad2, "Горюнов" to ad4))
        adPair2.Pair("Петров" to ad3)
        assertEquals(cc.bookOfName(adressName), adPair2)

        val adPair3 = cc.bookOfName(mutableMapOf("Козлов" to ad1, "Качоткин" to ad2, "Петров" to ad3))
        adPair3.Pair("Горюнов" to ad4)
        assertEquals(cc.bookOfName(adressName), adPair3)
    }

    @Test
    fun delete(){
        val addadress1 = cc.bookOfName(mutableMapOf("Козлов" to ad1,"Петров" to ad3,
            "Качоткин" to ad2,
            "Горюнов" to ad4))
        addadress1.delete("Козлов")
        assertEquals(cc.bookOfName(mutableMapOf("Качоткин" to ad2,"Петров" to ad3,"Горюнов" to ad4)),addadress1)
    }

    @Test
    fun changeAdressOfPeople() {
        val chad = cc.bookOfName(mutableMapOf("Козлов" to ad1,
            "Петров" to ad3,
            "Качоткин" to ad2,
            "Горюнов" to ad4))
        chad.changeAdressOfPeople("Козлов" to cc.Adress("Харченко", "16", "6р"))
        assertEquals(cc.bookOfName(mutableMapOf("Петров" to ad3,
            "Качоткин" to ad2,
            "Горюнов" to ad4,
            "Козлов" to cc.Adress("Харченко", "16", "6р"))),chad)
    }
}