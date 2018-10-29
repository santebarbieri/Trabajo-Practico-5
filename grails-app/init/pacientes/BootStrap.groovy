package pacientes

class BootStrap {

    def init = { servletContext ->
        // punto 1.4
        //Instacnais clase paciente ()
        def paciente1 = new Paciente(nroDocumento: '37643402', nombre: 'Santé', apellido:'Barbieri', sexo:'M', fechaNacimiento: Date.parse('YYYY-MM-DD' , '2015-10-20'), telefono: '333-666666', mail:'santebarbieri@hotmail.com')
        if(!paciente1.save(flush:true)){
            paciente1.errors.allErrors.each{println it}
        }
        /*def paciente2 = new Paciente(nroDocumento: 37643402, nombre: 'Martin', apellido:'Hidalgo', sexo:'F', fechaNacimiento: Date.parse('YYYY-MM-DD' , '1995-03-29'), telefono: '333-666667', mail:'martinhidalgo@hotmail.com')
        if(!paciente2.save(flush:true)){
            paciente2.errors.allErrors.each{println it}
        }*/
        //instancias clse consulta
        def consulta1 = new Consulta(paciente: paciente1, fecha: Date.parse('YYYY-MM-DD' , '2018-11-15'), hora:'17:00', motivo:'dolor en la lengua', diagnostico:'fractura de lengua', tratamiento:'pastillas')
        if(!consulta1.save(flush:true)){
            consulta1.errors.allErrors.each{println it}
        }
        //paciente1.save()
        def consulta2 = new Consulta(paciente: paciente1, fecha: Date.parse('YYYY-MM-DD' , '2018-12-20'), hora:'14:00', motivo:'dolor de ojo', diagnostico:'fractura de ojo', tratamiento:'inyeccion')
        if(!consulta2.save(flush:true)){
            consulta2.errors.allErrors.each{println it}
        }
        //paciente1.save()
        //instancias clase tipoPractica
        def tipoPractica1 = new TipoPractica(codigo:'231265', nombre:'extraccion de muela')
        if(!tipoPractica1.save(flush:true)){
            tipoPractica1.errors.allErrors.each{println it}
        }
        def tipoPractica2 = new TipoPractica(codigo:'123456', nombre:'enyesado de brazo')
        if(!tipoPractica2.save(flush:true)){
            tipoPractica2.errors.allErrors.each{println it}
        }
        //Intancias clase practica
        def practica1 = new Practica(paciente: paciente1, tipoPractica: tipoPractica1, consulta: consulta1, fechaPrescripcion: Date.parse('YYYY-MM-DD' , '2019-12-20'), fechaRealizacion: Date.parse('YYYY-MM-DD' , '2020-12-20'), resultado:'exito')
        if(!practica1.save(flush:true)){
            practica1.errors.allErrors.each{println it}
        }
        def practica2 = new Practica(paciente: paciente1, tipoPractica: tipoPractica1, consulta: consulta1, fechaPrescripcion: Date.parse('YYYY-MM-DD' , '2019-11-20'), fechaRealizacion: Date.parse('YYYY-MM-DD' , '2020-11-20'), resultado:'fracaso')
        if(!practica2.save(flush:true)){
            practica2.errors.allErrors.each{println it}
        }
        def practica3 = new Practica(paciente: paciente1, tipoPractica: tipoPractica2, consulta: consulta1, fechaPrescripcion: Date.parse('YYYY-MM-DD' , '2019-10-20'), fechaRealizacion: Date.parse('YYYY-MM-DD' , '2020-10-20'), resultado:'fracaso')
        if(!practica3.save(flush:true)){
            practica3.errors.allErrors.each{println it}
        }                
    }
    def destroy = {
    }
}