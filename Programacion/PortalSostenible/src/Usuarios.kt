class Usuarios {
    var nombre = "pepe"
    var correo = "pepe@hotmail.com"
    var idUsuario = 1
    var eventosApuntado = ArrayList<Evento>()

    companion object{
         private var contador = 1

    }

    constructor(){
        idUsuario = contador
        contador++
    }
    constructor(nombre:String){
        this.nombre = nombre
    }

    fun inscirbirAevento(evento: Evento){
        evento.inscribirUsuario(this)
        eventosApuntado.add(evento)
    }

    fun cancelarInscripcion(evento: Evento){
        if (this in evento.usuariosInscritos){
            evento.elimirarInscripcion(this)
            eventosApuntado.remove(evento)
        }else{
            println("El usuario no esta insscrito")
        }
    }

    override fun toString(): String {
        return "Usuarios(" +
                "nombre='$nombre', " +
                "correo='$correo', " +
                "idUsuario=$idUsuario" +
                ")"
    }


}