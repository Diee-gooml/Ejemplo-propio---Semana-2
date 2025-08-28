fun main() {
    val giza = PiramideEgipcia("Keops", 146.0, "Keops")
    val chichen = PiramideMaya("Chichen Itzá", 30.0, "Yucatán")
    val misteriosa = PiramideEgipcia("Misteriosa")

    val arquitecto = Arquitecto("Imhotep")

    val piramides = listOf(giza, chichen, misteriosa)
    piramides.forEach {
        arquitecto.analizarPiramide(it)
    }
}