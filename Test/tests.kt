package test

import Novella.ResOfNovel
import Novella.main1
import com.xenomachina.argparser.ArgParser
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import org.junit.jupiter.api.BeforeEach;
import java.io.PrintStream
import java.io.ByteArrayOutputStream


fun mainTest(args: Array<String>): List<String> {
    return ArgParser(args).parseInto(::ResOfNovel).readNovel()
}

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
        main1(argsEmpty)
        assertEquals(listOf(my.toString()), mainTest(arrayOf( "Правильных ответов =2" + System.lineSeparator())))
    }

    @Test
    fun main2() {
        val args2 = arrayOf("Правильных ответов =2","input/test.txt")
        main1(args2)
        assertEquals(listOf(my.toString()), mainTest(arrayOf( "Правильных ответов =2" + System.lineSeparator())))
    }

}


