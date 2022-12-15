fun main() {
//    fun part1(input: List<String>): Int {
//        return input.size
//    }

    fun part1(input: String): Int {
        val data = input.split("\n\n").map { elf ->
            elf.lines().map { it.toInt() }
        }
        return data.maxOf { it.sum() }
    }

    fun part1v2(input: String): Int {
        val data = input.split("\n\n").map { elf ->
            elf.lines().map { it.toInt() }.sum()
        }
        return data.max()
    }

    fun part1v3(input: String): Int {
        val data = input.split("\n\n").map { elf ->
            elf.lines().sumOf { it.toInt() }
        }
        return data.max()
    }

    fun part2(input: String): Int {
        val data = input.split("\n\n").map { elf ->
            elf.lines().map { it.toInt() }
        }
        return data.map { it.sum() }.sortedDescending().take(3).sum()
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInputText("Day01_test")
    check(part1(testInput) == 24000)
    check(part2(testInput) == 45000)

    val input = readInputText("Day01")
//    part1(input).println()
//    part1v3(input).println()
    part2(input).println()
}
