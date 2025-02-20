class Usuarios {
    var nombre = "pepe"
    var correo = "pepe@hotmail.com"
    var idUsuario = 1

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

    override fun toString(): String {
        return "Usuarios(" +
                "nombre='$nombre', " +
                "correo='$correo', " +
                "idUsuario=$idUsuario" +
                ")"
    }


}