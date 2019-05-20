package Novella

import com.xenomachina.argparser.ArgParser

import org.kohsuke.args4j.CmdLineParser




fun main (args: Array<String>){
    var read = ResOfNovel().readNovel()
    println(read)
}


