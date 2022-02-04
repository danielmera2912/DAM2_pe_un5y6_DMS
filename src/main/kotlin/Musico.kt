open class Musico (): Interprete{
    open var unaCancion: Array<Nota?>? = null
    open var instrumento: Instrumento = Violin()
    constructor(instrumento:Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)) : this() {
        this.instrumento=instrumento
        this.unaCancion=unaCancion
    }
    var partitura: Array<Nota?>? = unaCancion
        set(value) {
            field = value
            instrumento.reset()
            value!!.forEach { nota ->
                i("Pianista.setPartitura","incorpora nota $nota de canción")
                nota?.let { instrumento.incorporaNota(nota) }
            }
        }

    init {
        partitura = unaCancion
    }

    override fun interpretar() {
        TODO("Not yet implemented")
    }


}