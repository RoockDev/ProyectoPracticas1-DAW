class Presencial:Evento {
    var direccion = ""
    var idPresencial = 1

    companion object{
        private var contador = 1
    }

    constructor():super(){          //super llama al constructor este caso vacio de la clase padre y asi su contador tambien funcionara
        idPresencial = contador
        contador++
    }

    constructor(direccion:String):super(){
        this.direccion = direccion
        idPresencial = contador
        contador++
    }

    override fun inscribirUsuario(usuario: Usuarios) {
        super.inscribirUsuario(usuario)

    }

    override fun confirmaAsistencia(usuario: Usuarios): Boolean {
        return super.confirmaAsistencia(usuario)
    }

    override fun elimirarInscripcion(usuario: Usuarios) {
        super.elimirarInscripcion(usuario)
    }
}