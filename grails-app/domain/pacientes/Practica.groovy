package pacientes

class Practica {
    Date fechaPrescripcion
    Date fechaRealizacion
    String resultado
    TipoPractica tipoPractica
    
    static belongsTo = [paciente: Paciente, consulta: Consulta]

    static constraints = {
        fechaPrescripcion (blank:false, validator:{
            if(it > new Date(System.currentTimeMillis())){
                return ['fechaIncorrecta']
            }
        })
        fechaRealizacion (blank:false, validator: {val, Practica obj ->
            if(val < obj.fechaPrescripcion){
                return ['fechInconcistentes']
            }
         })
        resultado(maxSize:500)
    }

    String toString(){
        return tipoPractica
    }
}