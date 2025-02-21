class Factoria {
    companion object{
        fun crearEvento(
             tipo:String,
             nombre : String,
             fecha :String,
             ubicacion :String,
             categoria:CATEGORIAS,
             atributoExtra:String=""
        ):Evento{
            return when(tipo.lowercase()){
                "presencial" -> Presencial(atributoExtra).apply {
                    this.nombre = nombre
                    this.fecha = fecha
                    this.ubicacion = ubicacion
                    this.categoria
                    this.direccion = atributoExtra
                }
                "online" -> Online(atributoExtra).apply {
                    this.nombre = nombre
                    this.fecha = fecha
                    this.ubicacion = ubicacion
                    this.categoria = categoria
                    this.plataforma =atributoExtra
                }
                else -> Evento(nombre,fecha,ubicacion,categoria)
            }
        }
    }
}