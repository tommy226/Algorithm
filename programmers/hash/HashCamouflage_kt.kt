package programmers.hash

fun main() {
    val clothes = arrayOf(
        arrayOf("yellowhat", "headgear"),
        arrayOf("bluesunglasses", "eyewear"),
        arrayOf("green_turban", "headgear")
    )
    val solution = Solution()
    println(solution.answer(clothes))
}

internal class Solution {
    fun answer(clothes: Array<Array<String>>): Int {
        var answer = 1

        val clothHash = HashMap<String, Int>()

        for(cloth in clothes) {
            val key = cloth[1]
            clothHash[key]?.let { value -> clothHash.put(key, value + 1) } ?: clothHash.put(key, 1)
        }
        for(keyValue in clothHash) {
            answer *= (keyValue.value + 1)
        }

        answer--

        return answer
    }
}
