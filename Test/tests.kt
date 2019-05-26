package test

import Novella.ResOfNovel
import Novella.main
import com.xenomachina.argparser.ArgParser
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.BeforeEach;
import java.io.PrintStream
import java.io.ByteArrayOutputStream

class Test {
private val my = ByteArrayOutputStream()
private val err = ByteArrayOutputStream()

@BeforeEach
fun before() {
    System.setOut(PrintStream(my))
    System.setErr(PrintStream(err))
}


    @Test
    fun main() {
        val argsEmpty = arrayOf<String>()
        main(argsEmpty)

        assertEquals(my.toString(), "Правильных ответов =2" + System.lineSeparator())
    }

    @Test
    fun main2() {
        val args2 = arrayOf("Правильных ответов =2","input/test.txt")
        main(args2)

        assertEquals(my.toString(), "Правильных ответов =2" + System.lineSeparator())
    }

}


