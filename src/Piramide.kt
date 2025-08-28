abstract class Piramide(private var nombre: String, private var altura: Double) {
    fun getNombre() = nombre
    fun setNombre(n: String) {
        if (n.isNotBlank()) nombre = n
    }

    fun getAltura() = altura
    fun setAltura(a: Double) {
        if (a > 0) altura = a
    }

    abstract fun descripcion(): String
}