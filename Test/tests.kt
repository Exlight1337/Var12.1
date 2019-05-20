package test

import Novella.ResOfNovel
import Novella.main
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
    @Test
    fun main() {
        assertEquals(listOf("Правильных ответов =2"), mainTest(arrayOf("-test","Правильных ответов =2","input/test.txt")))
    }
}


