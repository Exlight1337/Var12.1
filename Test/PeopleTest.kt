package test

import ClassofBook.bookofaddress
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Tests {
    val ad1 = bookofaddress.Adress("Ломоносова", "100", "140")
    val ad2 = bookofaddress.Adress("Харченко", "16", "6")
    val ad3 = bookofaddress.Adress("Васильевская", "20", "100")
    val ad4 = bookofaddress.Adress("Харченко", "16", "6ф")
    val ad5 = bookofaddress.Adress("Ломоносова","100","7")
    val adressName = mutableMapOf(
        "Козлов" to ad1,
        "Петров" to ad3,
        "Качоткин" to ad2,
        "Горюнов" to ad4,
        "Артюхов" to ad5
    )


    @Test
    fun addressOfNames() {
        assertEquals(
            bookofaddress.Adress("Ломоносова", "100", "140"),
            bookofaddress.bookOfName(adressName).addresOfNames("Козлов"))

        assertEquals(
            bookofaddress.Adress("Харченко", "16", "6"),
            bookofaddress.bookOfName(adressName).addresOfNames("Качоткин"))

        assertEquals(
            bookofaddress.Adress("Ломоносова", "100", "7"),
            bookofaddress.bookOfName(adressName).addresOfNames("Артюхов"))

        assertEquals(
            bookofaddress.Adress("Харченко", "16", "6ф"),
            bookofaddress.bookOfName(adressName).addresOfNames("Горюнов"))

        assertEquals(
            bookofaddress.Adress("Васильевская", "20", "100"),
            bookofaddress.bookOfName(adressName).addresOfNames("Петров"))
    }

    @Test
    fun pair() {
       val adPair1 = bookofaddress.bookOfName(mutableMapOf("Качоткин" to ad2, "Петров" to ad3, "Горюнов" to ad4,
           "Артюхов" to ad5))
       adPair1.pair("Козлов" to ad1)
        assertEquals(bookofaddress.bookOfName(adressName), adPair1)

        val adPair2 = bookofaddress.bookOfName(mutableMapOf("Козлов" to ad1, "Качоткин" to ad2, "Горюнов" to ad4,
            "Артюхов" to ad5))
        adPair2.pair("Петров" to ad3)
        assertEquals(bookofaddress.bookOfName(adressName), adPair2)

        val adPair3 = bookofaddress.bookOfName(mutableMapOf("Козлов" to ad1, "Качоткин" to ad2, "Петров" to ad3,
            "Артюхов" to ad5))
        adPair3.pair("Горюнов" to ad4)
        assertEquals(bookofaddress.bookOfName(adressName), adPair3)

        val adPair4 = bookofaddress.bookOfName(mutableMapOf("Козлов" to ad1, "Качоткин" to ad2, "Петров" to ad3,
            "Горюнов" to ad4))
        adPair4.pair("Артюхов" to ad5)
        assertEquals(bookofaddress.bookOfName(adressName), adPair4)
    }

    @Test
    fun delete(){
        val addadress1 = bookofaddress.bookOfName(mutableMapOf("Козлов" to ad1,"Петров" to ad3,
            "Качоткин" to ad2,
            "Горюнов" to ad4,
            "Артюхов" to ad5))
        addadress1.delete("Козлов")
        assertEquals(bookofaddress.bookOfName(mutableMapOf("Качоткин" to ad2,"Петров" to ad3,"Горюнов" to ad4,"Артюхов" to ad5
        )),addadress1)
    }

    @Test
    fun changeAdressOfPeople() {
        val chad = bookofaddress.bookOfName(mutableMapOf("Козлов" to ad1,
            "Петров" to ad3,
            "Качоткин" to ad2,
            "Горюнов" to ad4,
            "Артюхов" to ad5))
        chad.changeAdressOfPeople("Козлов" to bookofaddress.Adress("Харченко", "16", "6р"))
        assertEquals(bookofaddress.bookOfName(mutableMapOf("Петров" to ad3,
            "Качоткин" to ad2,
            "Горюнов" to ad4,
            "Артюхов" to ad5,
            "Козлов" to bookofaddress.Adress("Харченко", "16", "6р"))),chad)
    }

    @Test
    fun inTheStreet(){
        assertEquals(listOf("Качоткин", "Горюнов"),bookofaddress.bookOfName(adressName).inTheStreet("Харченко"))
        assertEquals(listOf("Козлов", "Артюхов"),bookofaddress.bookOfName(adressName).inTheStreet("Ломоносова"))

    }

    @Test
    fun inTheHouse(){
        assertEquals(listOf("Качоткин","Горюнов"),bookofaddress.bookOfName(adressName).inTheHouse("16"))
        assertEquals(listOf("Козлов", "Артюхов"),bookofaddress.bookOfName(adressName).inTheHouse("100"))
    }
}