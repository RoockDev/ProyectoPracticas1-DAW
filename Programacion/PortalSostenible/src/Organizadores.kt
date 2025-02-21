class Organizadores {
    var nombre = ""
    var nombreEmpresa = ""
    var correo = ""
    var eventosCreados = ArrayList<Evento>()
    var idOrganizador = 1

    companion object{
        private var contador = 1
    }

    constructor(){
        idOrganizador = contador
        contador++
    }

    constructor(nombre:String, nombreEmpresa:String,correo:String){
        this.nombre = nombre
        this.nombreEmpresa = nombreEmpresa
        this.correo = correo
        idOrganizador = contador
        contador++
    }

    fun crearEventoGenerico(nombre:String,fecha:String,ubicacion:String,categoria: CATEGORIAS):Evento{
        var eventoCreado = Evento(nombre,fecha,ubicacion,categoria)
        eventosCreados.add(eventoCreado)
        return eventoCreado //DUDA REVISAR LUEGO PARA LA LISTA DE ORGANIZADORES EN CLASE EVENTO
    }
    fun crearEventoPresencial(nombre:String,fecha:String,ubicacion:String,direccion:String,categoria: CATEGORIAS):Presencial{
        var eventoPresencial = Presencial(direccion)
        eventoPresencial.nombre = nombre
        eventoPresencial.fecha = fecha
        eventoPresencial.ubicacion = ubicacion
        eventoPresencial.categoria = categoria
        eventosCreados.add(eventoPresencial)
        return eventoPresencial //DUDA REVISAR LUEGO PARA LA LISTA DE ORGANIZADORES EN CLASE EVENTO
    }
    fun crearEventoOnline(nombre:String,fecha:String,ubicacion:String,plataforma:String,categoria: CATEGORIAS):Online{
        var eventoOnline = Online(plataforma)
        eventoOnline.nombre = nombre
        eventoOnline.fecha = fecha
        eventoOnline.ubicacion = ubicacion
        eventoOnline.categoria = categoria
        eventosCreados.add(eventoOnline)
        return eventoOnline //DUDA REVISAR LUEGO PARA LA LISTA DE ORGANIZADORES EN CLASE EVENTO
    }


    fun modificarEventoGenerico(evento: Evento,nuevoNombre:String,nuevaFecha:String,nuevaUbicacion:String,categoria: CATEGORIAS){
        if (evento in eventosCreados){
            evento.nombre = nuevoNombre
            evento.fecha = nuevaFecha
            evento.ubicacion = nuevaUbicacion
            evento.categoria = categoria
            println("Evento modificado")
        }else{
            println("Ese evento no esta en tu lista, no puedes crearlo")
        }

    }
    fun modificarEventoPresencial(eventoPresencial: Presencial,nuevoNombre:String,nuevaFecha:String,nuevaUbicacion:String,nuevaDireccion:String,categoria: CATEGORIAS){
        if (eventoPresencial in eventosCreados){
            eventoPresencial.nombre = nuevoNombre
            eventoPresencial.fecha = nuevaFecha
            eventoPresencial.ubicacion = nuevaUbicacion
            eventoPresencial.direccion = nuevaDireccion
            eventoPresencial.categoria = categoria
            println("Evento Presencial modificado")
        }else{
            println("Ese evento no esta en tu lista, no puedes crearlo")
        }

    }
    fun modificarEventoOnlinea(eventoOnline: Online,nuevoNombre:String,nuevaFecha:String,nuevaUbicacion:String,nuevaPlataforma:String,categoria: CATEGORIAS){
        if (eventoOnline in eventosCreados){
            eventoOnline.nombre = nuevoNombre
            eventoOnline.fecha = nuevaFecha
            eventoOnline.ubicacion = nuevaUbicacion
            eventoOnline.plataforma = nuevaPlataforma
            eventoOnline.categoria = categoria
            println("Evento Online modificado")
        }else{
            println("Ese evento no esta en tu lista, no puedes crearlo")
        }

    }

    fun liminarEventoGenerico(evento: Evento) {
        if (evento in eventosCreados){
            eventosCreados.remove(evento)
            println("Evento ${evento.nombre} eliminado")
        }else{
            println("Este evento no lo has creado tu, por lo tanto no puedes eliminarlo")
        }

    }

    fun eliminiarEventoOnline(eventoOnline:Online){
        if (eventoOnline in eventosCreados){
            eventosCreados.remove(eventoOnline)
            println("Evento online ${eventoOnline.nombre} eliminado")
        }else{
            println("Este evento no ha sido creado por ti, por lo tanto no puedes eliminarlo")
        }

    }

    fun eliminarEventoPresencial(eventoPresencial:Presencial){
        if (eventoPresencial in eventosCreados){
            eventosCreados.remove(eventoPresencial)
            println("Evento presencial ${eventoPresencial.nombre} eliminado")
        }else{
            println("Este evento no ha sido creado por ti, por lo tanto no puedes eliminarlo")
        }

    }





}