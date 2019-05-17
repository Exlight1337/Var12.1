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
    private val myOut = ByteArrayOutputStream()
    private val errOut = ByteArrayOutputStream()

    @BeforeEach
    fun before() {
        System.setOut(PrintStream(myOut))
        System.setErr(PrintStream(errOut))
    }
        @Test
        fun main(){
            val argsEmpty = arrayOf("Правильных ответов = 2")
            main(argsEmpty)
            assertEquals(myOut.toString(),"Правильных ответов = 2",System.lineSeparator())
        }
    }
