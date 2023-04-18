fun mergeAlternately(word1: String, word2: String): String {
    var result = ""
    val len = minOf(word1.length, word2.length)
    for (i in 0 until len) {
        result += word1[i]
        result += word2[i]
    }
    result += word1.substring(len) + word2.substring(len)
    return result
}

fun main() {
    val word1 = "abc"
    val word2 = "def"
    println(mergeAlternately(word1, word2))
}
