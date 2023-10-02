package programmer.denis

import kotlin.random.Random

object Game {

    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
    )

    private val options = listOf("ROCK", "SCISSORS", "PAPER")

    private val optionDrawable = mapOf(
        "ROCK" to R.drawable.ilustrasi_permainan_batu_gunting_kertas,
        "SCISSORS" to R.drawable.images,
        "PAPER" to R.drawable.untitled3,
    )

    fun pickRandomOptinon(): String = options[Random.nextInt()]
    fun pickDrawable(option: String):Int = optionDrawable[option]!!
    fun isDraw(from: String,to: String): Boolean = from == to
    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!
}