@file:Suppress("UNUSED_PARAMETER", "unused")
package Novella
import jcurses.system.Toolkit
import java.io.File


class ResOfNovel {
    var c = ""
    fun readBeginning () {
        val begin = File("C://Users/Igor/IdeaProjects/Var12/Begin.txt").readText()
        println(begin)

            println("1)println()")
            println("2)prentln()")
            println("3)Я не хочу изучать язык программирования Kotlin!")

         c = readLine().toString()

            when (c) {
                "1" -> println(File("C://Users/Igor/IdeaProjects/Var12/11.txt").readText())
                "2" -> println(File("C://Users/Igor/IdeaProjects/Var12/12.txt").readText())
                "3" -> println(File("C://Users/Igor/IdeaProjects/Var12/13.txt").readText())
            }
        }
    fun continued () {
        var a = ""
        val continuation = File("C://Users/Igor/IdeaProjects/Var12/Continued.txt").readText()
        println(continuation)

        println("1)К типу Int")
        println("2)К типу Double")
        println("3)К типу Char")

        a = readLine().toString()
        when(a) {
            "1" -> println(File("C://Users/Igor/IdeaProjects/Var12/21.txt").readText())
            "2" -> println(File("C://Users/Igor/IdeaProjects/Var12/22.txt").readText())
            "3" -> println(File("C://Users/Igor/IdeaProjects/Var12/23.txt").readText())
        }
    }
    }
