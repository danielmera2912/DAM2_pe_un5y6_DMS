class AlumnoMusica(val instrumento:Instrumento, unaCancion: Array<Nota?> = arrayOfNulls<Nota?>(0)): Interprete {
    override fun interpretar() = instrumento.play()
}