interface animal: BaseAnimal {

    val MaxSpeed: Int
    val waight: Int

    fun getvoice(): String
    fun getcolof(): String = "Brown"
}