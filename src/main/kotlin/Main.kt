fun main(args: Array<String>) {
    val desafios = Desafios()
    desafios.executeQuestionOne(readlnOrNull()?.toInt() ?: 0)
    desafios.executeQuestionTwo(readlnOrNull()?.toInt() ?: 0)
    desafios.executeQuestionFive(readlnOrNull() ?: "")
}
