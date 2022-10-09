//Arce Ponce Bryan
fun main() {
    val DadoOverPower = Dado(6)
    println("Tu DadoOverPower de ${DadoOverPower.Lados} lados sacó ${DadoOverPower.DarleVuelta()} ")
    val DadoInfiniteSides = Dado(999)
    println("Tu DadoInfiniteSides de ${DadoInfiniteSides.Lados} lados sacó ${DadoInfiniteSides.DarleVuelta()} ")

   
}
class Dado (val Lados:Int){
    fun DarleVuelta(): Int{
        return (1..Lados).random()
    }
}