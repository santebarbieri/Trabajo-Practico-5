package pacientes

class Practica {
    Date fechaPrescripcion
    Date fechaRealizacion
    String resultado

    TipoPractica tipoPractica
    static belongsTo = [paciente: Paciente, consulta: Consulta]

    static constraints = {
        fechaPrescripcion(blank: false)
        fechaRealizacion(blank: false)
        /*fechaPrescripcion(blank:false, validator:{
            if(it > new Date(System.currentTimeMillis())){
                return ['No se puede programar una fecha posterior a la actual']
            }
        })
        fechaRealizacion (blank:false, validator: {val, Practica obj ->
            if(val < obj.fechaPrescripcion){
                return ['Error']
            }
        })*/
        resultado(maxSize:500)
    }
}