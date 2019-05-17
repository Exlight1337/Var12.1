@file:Suppress("UNUSED_PARAMETER", "unused")
package Novella
import java.io.File
import com.xenomachina.argparser.ArgParser

@Suppress("UNREACHABLE_CODE")
class ResOfNovel (parser: ArgParser) {

    var count = 1
    var c = ""
    var ansChecker = "true"
    var phrase = listOf("", "")
    fun readNovel(): List<String>{
        count
        while (count <= 2) {

            val source = File("input/$count.txt").readText().split("-----")

            var k = 0
            while (k <= 3) {
                println(source[k])
                k++
            }

            c = readLine().toString()
            when (c) {
                "1" -> phrase = File("input/${count}1.txt").readText().split("-----")
                "2" -> phrase = File("input/${count}2.txt").readText().split("-----")
                "3" -> phrase = File("input/${count}3.txt").readText().split("-----")
                else -> count--
            }

            ansChecker = phrase[1]
            println(phrase[0])

            if ((c == "3") && (count == 1)) {
                count--
                break
            }

            if (ansChecker.toBoolean()) {
                count++
            }
        }

        count--

        var sum = "Правильных ответов = $count"
        println(sum)
        return listOf(sum)
    }

    fun writting() {
        val game = readNovel()
        for (b in game) {
            println(b)
        }
    }
}
