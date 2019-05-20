package Novella

import com.xenomachina.argparser.ArgParser





fun main (args: Array<String>){
    ArgParser(args).parseInto(::ResOfNovel).writting()
}


