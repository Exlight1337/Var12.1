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
    var reading = ResOfNovel().readNovel()
    @Test
    fun main() {
        assertEquals(reading, "2 Правильных ответа")
    }
}


