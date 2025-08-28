class PiramideEgipcia(nombre: String, altura: Double, private var faraon: String): Piramide(nombre, altura), Construible {
    constructor(nombre: String): this(nombre, 100.0, "Desonocido")
    override fun descripcion(): String {
        return "Piramide construida por el faraon $faraon"
    }

    override fun tiempoConstruccion(): Int = 20
}