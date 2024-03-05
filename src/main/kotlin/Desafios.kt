class Desafios {

    // Questão 1 = 91 (PA de 13 começando de 1 a 13 = 91)
    // É uma Progressão Aritmética, portanto fiz uma função
    // com desempenho melhor com BigO(1)
    fun executeQuestionOne(n: Int) {
        val soma = n * (1 + n) / 2
        println("Questão 1 = $soma")
    }

    // Questão 2
    // Solução com um BigO(Log n) pois conforme a iteração do loop While aumenta ele nao acresce
    // em 1 unidade e sim em bem mais que uma. Complexidade de espaço O(1).
    fun executeQuestionTwo(n: Int) {
        if (isFib(n)) {
            println("Questão 2 = Pertence")
        } else {
            println("Questão 2 = Não pertençe")
        }
    }

    private fun isFib(n: Int): Boolean {
        if (n == 0) return true
        var atual = 1
        var anterior = 0
        var antesDoAnterior = 0

        while (atual <= n) {
            if (n == atual) return true
            antesDoAnterior = anterior
            anterior = atual
            atual = antesDoAnterior + anterior
        }
        return false
    }

    // Questão 3
    // a) Progressão Aritmética com razão = 2 (Somar 2 sempre ao ultimo termo) | Resposta = 9
    // b) Progressão Geométrica com razão = 2 (Multiplicar 2 sempre ao ultimo termo) | Resposta = 128
    // c) Cada termo o quadrado do seu Indice | Resposta = 49
    // d) Potência quadrática de todo numero par | Resposta = 100
    // e) Sequência de Fibonacci começando pelo 1 (Lógica de somar os dois termos anteriores) | 2 Resposta = 13
    // f) Chuto Resposta = 20. (não achei uma lógica plausivel nessa sequencia)

    // Questão 4
    // Dado um interreptor X, Y, Z para as Salas A, B, C. eu ligo o interreptor X, e vou para sala A,
    // se não tiver aceso eu ja sei que X=B ou X=C, eu volto ligo Y e vou para qualquer uma das salas B ou C
    // se eu chegar em uma delas e nao tiver aceso eu sei que X liga essa sala em questão
    // e Z liga a primeira sala que eu fui, e o outro interruptor liga a sala restante.
    // por outro lado na sala B ou C que eu for se a luz tiver ligada, eu sei que Y= essa sala
    // a outra sala entre B ou C que eu nao for é X e A=Z.
    // voltando ao caso inicial de ligar o X e ir pra sala A so que dessa vez estiver aceso
    // eu sei que A=X, eu volto ligo Y, vou para sala B por exemplo, e se tiver acesa eu sei que B=Y e C=Z,
    // por outro lado se nao tiver acesa eu sei que B=Z e C=Y.

    // Questão 5
    // Complexidade de Espaço e Tempo de O(n) onde n é o tamanho da string

    fun executeQuestionFive(string: String) {
        val stringBuilder = StringBuilder()
        for (i in string.length - 1 downTo 0) {
            stringBuilder.append(string[i])
        }
        println("Questão 5 = $stringBuilder")
    }
}
