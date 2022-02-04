/**
 * A group of *members*.
 *
 * This class has no useful logic; it's just a documentation example.
 *
 * @param melodia guarda la lista de notas para la melodia.

 */
open class Instrumento() {

    protected var melodia = mutableListOf<Nota>()
    open fun incorporaNota(nota: Nota) {
        melodia.add(nota)
        /**
         * @return añade una nueva nota a la melodia
         */
    }
    open fun incorporaCancion(notas: Array<Nota>) {
        melodia= notas.toMutableList()
        /**
         * @return cambia la canción por una nueva
         */
    }
    open fun reset() = melodia.clear()
    /**
     * @return vacia la melodia
     */
    //Recorreremos las notas y las interpretaremos de la forma específica del piano.
    open fun play() {

    }

}