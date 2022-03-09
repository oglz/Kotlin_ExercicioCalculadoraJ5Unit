fun main() {
    println("Escreva o 1° Operador: ")
    val n1 = readLine()!!.toDouble()
    println("Escreva o 2º Operador: ")
    val n2 = readLine()!!.toDouble()

    println("Escolha o Operador:")
    val operador = readLine()!!
    if (operador == "+") {
        var adicao = Calculadora.adicao(n1,n2)
        println("O resultado de $n1 + $n2 é $adicao")
    } else if (operador == "-") {
        var subtracao = Calculadora.subtracao(n1,n2)
        println("O resultado de $n1 - $n2 é $subtracao")
    } else if (operador == "/") {
        var divisao = Calculadora.divisao(n1, n2)
        println("O resultado de $n1 / $n2 é $divisao")
    } else if (operador == "*") {
        var multiplicacao = Calculadora.multiplicacao(n1, n2)
        println("O Resultado de $n1 * $n2 é $multiplicacao")
    }
}
