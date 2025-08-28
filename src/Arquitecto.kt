class Arquitecto(val nombre: String) {
    fun analizarPiramide(p: Piramide) {
        println("El arquitecto $nombre esta analizando la piramide ${p.getNombre()}:")
        println("Altura: ${p.getAltura()} metros")
        println("Descripcion: ${p.descripcion()}")

        if (p is Construible) {
            println("Tiempo estimado de construccion: ${p.tiempoConstruccion()} años")
        }
        println("___________________________________________________")
    }
}