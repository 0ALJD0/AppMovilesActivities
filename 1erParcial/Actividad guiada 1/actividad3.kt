//Arce Ponce Bryan Aljendro
fun main() {
    val dadoOverPower = Dado(6)
    val resultadoGiro = dadoOverPower.girar()
    val numeroSuerte = 3

    when (resultadoGiro) {
        numeroSuerte -> println("Ganaste!!! :D")
        1 -> println("Lo lamento! te ha tocado  1. Intenta de nuevo!")
        2 -> println("Que trite :(, te ha tocado un 2. Intenta de nuevo!")
        3 -> println("Unfortunately, te ha tocado un 4. Intenta de nuevo!")
        5 -> println("No te deprimas! Te ha tocado un. Intenta de nuevo!")
        6 -> println("Mil disculpas! Te ha tocado un. Intenta de nuevo!")
   }
}

class Dado(val lados: Int) {
    fun girar(): Int {
        return (1..lados).random()
    }
}