
fun main() {
    var opcao: String
    var escolha: String
    var intEscolha: Int
    var cofre:Cofre = Cofre()
    var valor: Double
    var moeda:Moeda


    while (true){
        menuPrincipal()
        opcao = readln() // retorno String porque nao irei fazer cálculos com a variável
        when(opcao){
            "1" ->{
                do {
                    menuMoeda()
                    escolha = readln()
                    intEscolha = escolha.toInt()


                }while (intEscolha <= 0 || intEscolha > 3)
                println("Digite o valor:")
                var v: String = readln()
                valor = v.toDouble()
                if(intEscolha == 1){
                    moeda = Real(valor)
                }
                else if(intEscolha == 2){
                    moeda = Dollar(valor)
                }else{
                    moeda = Euro(valor)
                }
                cofre.adicionar(moeda)
            }
            "2" ->{
                do {
                    menuMoeda()
                    escolha = readln()
                    intEscolha = escolha.toInt()


                }while (intEscolha <= 0 || intEscolha > 3)
                println("Digite o valor:")
                var v: String = readln()
                valor = v.toDouble()
                if(intEscolha == 1){
                    moeda = Real(valor)

                }
                else if(intEscolha == 2){
                    moeda = Dollar(valor)

                }else{
                    moeda = Euro(valor)

                }
                cofre.remover(moeda)


            }
            "3" -> cofre.listar()
            "4" -> cofre.converterReal()
            "0" -> break
            else -> println("opção inválida!")
        }


    }

}
fun menuPrincipal(){
    println("\nMENU PRINCIPAL\n")
    println("[1] Adicionar Moeda")
    println("[2] Remover Moeda")
    println("[3] Listar Moedas")
    println("[4] Calcular total em Reais")
    println("[0] Sair")
}
fun menuMoeda(){
    println("\nEscolha a Moeda\n")
    println("[1] Real")
    println("[2] Dollar")
    println("[3] Euro")
}