package test

import Novella.ResOfNovel
import com.xenomachina.argparser.ArgParser
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

    fun mainTest (args: Array<String>):List<String> {
    return  ArgParser(args).parseInto(::ResOfNovel).readNovel()
}

class Test {

}
