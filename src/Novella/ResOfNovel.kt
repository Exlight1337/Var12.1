@file:Suppress("UNUSED_PARAMETER", "unused")
package Novella
import java.io.File


class ResOfNovel {
    var c = ""
    var ansChecker = true
    var phrase = listOf("", "")
    fun readBeginning () {
        var count = 1
        while (count <= 2) {

            val file = File("C://Users/Igor/IdeaProjects/novell/$count.txt").readText().split("-----")

            val begin = file[0]
            println(begin)

            println(file[1])
            println(file[2])
            println(file[3])

            c = readLine().toString()

            when (c) {
                "1" -> phrase =  File("C://Users/Igor/IdeaProjects/novell/${count}1.txt").readText().split("-----")
                "2" -> phrase =  File("C://Users/Igor/IdeaProjects/novell/${count}2.txt").readText().split("-----")
                "3" -> phrase =  File("C://Users/Igor/IdeaProjects/novell/${count}3.txt").readText().split("-----")
                else -> count--
            }
            ansChecker = phrase[1] == "true"
            println(phrase[0])
            if ((c == "3") && (count == 1)) break
            if (ansChecker) count++


        }
    }
    }