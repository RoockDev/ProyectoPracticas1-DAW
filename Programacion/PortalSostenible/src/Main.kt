fun main() {
    var eventoPresencial = Presencial()
    var evento = Evento()
    var persona1 = Usuarios()
    var persona2 = Usuarios()
    var persona3 = Usuarios()
    eventoPresencial.inscribirUsuario(persona3)




    println(eventoPresencial.usuariosInscritos)
    println(evento.usuariosInscritos)
}