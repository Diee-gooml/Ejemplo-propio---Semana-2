class PiramideMaya(nombre: String, altura: Double, private var ciudad: String): Piramide(nombre, altura), Construible {
    override fun descripcion(): String {
        return "Piramide ubicada en la cuidad de $ciudad"
    }

    override fun tiempoConstruccion(): Int = 15
}