class Violinista(): Musico() {

    constructor(instrumento:Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)) : this() {
        this.instrumento=instrumento
        this.unaCancion=unaCancion
    }
    override fun interpretar() = instrumento.play()

}