class Online:Evento {
    var plataforma = ""
    var idOnline = 1

    companion object{
        private var contador = 1
    }

    constructor():super(){
        idOnline = contador
        contador++
    }

    constructor(plataforma:String):super(){
        this.plataforma = plataforma
        idOnline = contador
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