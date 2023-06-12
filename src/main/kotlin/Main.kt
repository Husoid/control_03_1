fun main(args: Array<String>) {
    println(agoToText(110000))
}

fun agoToText (time: Int): String {
    when (time) {
        in 0 .. 60 -> return "был(а) в сети только что"
        in 61 .. 60*60 -> return "был(а) в сети ${minToText(time)} назад"
        in 60*60+1 .. 24*60*60 -> return "был(а) в сети ${hourToText(time)} назад"
        in 24*60*60+1 .. 24*60*60*2 -> return "был(а) в сети вчера"
        in 24*60*60*2+1 .. 24*60*60*3 -> return "был(а) в сети позавчера"
        else -> return "был(а) в сети давно"
    }
}

fun minToText (sec: Int): String {
    when (val min = sec/60) {
        1, 21, 31, 41, 51 -> return "$min минуту"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> return "$min минуты"
        else -> return "$min минут"
    }
}

fun hourToText (sec: Int): String {
    when (val hour = sec/360) {
        1, 21, 31, 41, 51 -> return "$hour час"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> return "$hour часа"
        else -> return "$hour часов"
    }
}


