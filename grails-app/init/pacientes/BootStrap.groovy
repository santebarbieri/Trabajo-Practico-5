package pacientes

class BootStrap {

    def init = { servletContext ->
        /* Pacientes */
        def paciente1 = new Paciente(
                nroDocumento:"35543453",
                nombre:"Juan",
                apellido:"Perez",
                sexo:"M",
                fechaNacimiento: Date.parse('dd-MM-yyyy','01-02-1992'),
                telefono:"666-666666",
                email:"juan@gmail.com"
                )
        if(!paciente1.save(flush:true)){
            paciente1.errors.allErrors.each{println it}
        }else{
            println("Paciente agregado a BD")
        } 

       def paciente2 = new Paciente(
                nroDocumento:"35545332",
                nombre:"Martin",
                apellido:"Hidalgo",
                sexo:"M",
                fechaNacimiento: Date.parse('dd-MM-yyyy','01-02-1992'),
                telefono:"666-666666",
                email:"juan@gmail.com"
                )
        if(!paciente2.save(flush:true)){
            paciente2.errors.allErrors.each{println it}
        }else{
            println("Paciente agregado a BD")
        } 
       //println("Paciente agregado a BD -> " + paciente2.save(flush:true).toString()) 
    /* Consulatas Realizadas */
       def consulta1 = new Consulta(
           fecha: Date.parse('dd-MM-yyyy','18-10-2018'),
           hora:'12:20',
           motivo:"Dolor de muela",
           diagnostico:"Carie importante",
           tratamiento:"Tratamiento de conducto",
           paciente:paciente1
       )
       if(!consulta1.save(flush:true)){
            consulta1.errors.allErrors.each{println it}
        }else{
            println("Consulta1 a paciente1 agregada a BD")
        } 
       //println("Consulta1 Realizada -> " + consulta1.save(flush:true).toString())

       def consulta2 = new Consulta(
           fecha: Date.parse('dd-MM-yyyy','17-10-2018'),
           hora:'12:20',
           motivo:"Dolor de cabeza",
           diagnostico:"Migraña",
           tratamiento:"Tafirol Forte",
           paciente:paciente1
       )
       if(!consulta2.save(flush:true)){
            consulta2.errors.allErrors.each{println it}
        }else{
            println("Consulta2 a paciente1 agregada a BD")
        } 

        def consulta4 = new Consulta(
            fecha: Date.parse('dd-MM-yyyy','19-10-2018'),
            hora:'12:20',
            motivo:"Dolor de clavicula",
            diagnostico:"Posible fisura de clavicula",
            tratamiento:"Tafirol Forte",
            paciente:paciente1
       )
       if(!consulta4.save(flush:true)){
            consulta4.errors.allErrors.each{println it}
        }else{
            println("Consulta4 a paciente1 agregada a BD")
        } 

       println(consulta2.save(flush:true))
       def consulta3 = new Consulta(
           fecha: Date.parse('dd-MM-yyyy','21-10-2018'),
           hora:'12:20',
           motivo:"Dolor de cabeza",
           diagnostico:"Migraña",
           tratamiento:"Tafirol Forte",
           paciente:paciente2
       )
       if(!consulta3.save(flush:true)){
            println("consulta 3 - Error. fecha mayor a la actual -> ")
            consulta3.errors.allErrors.each{println it}
        }else{
            println("Consulta3 a paciente1 agregada a BD")
        } 
      
    
    /* Definición de tipos de practicas */
       def tipoPractica1 = new TipoPractica(
           codigo:'231265',
           nombre:'Radiografia Dentaria'
       )
        if(!tipoPractica1.save(flush:true)){
            tipoPractica1.errors.allErrors.each{println it}
        }else{
            println("tipoPractica1 agregada a BD")
        } 
       //println("Tipo de practica agregada -> " + tipoPractica1.save(flush:true).toString())

       def tipoPractica2 = new TipoPractica(
           codigo:'231266',
           nombre:'Resonancia Magnetica'
       )
         if(!tipoPractica2.save(flush:true)){
            tipoPractica2.errors.allErrors.each{println it}
        }else{
            println("tipoPractica2 agregada a BD")
        } 
       //println("Tipo de practica agregada -> " + tipoPractica2.save(flush:true).toString())

      def tipoPractica3 = new TipoPractica(
           codigo:'231267',
           nombre:'Radiografia General'
       )
         if(!tipoPractica3.save(flush:true)){
            tipoPractica3.errors.allErrors.each{println it}
        }else{
            println("tipoPractica3 agregada a BD")
        } 
       //println("Tipo de practica agregada -> " + tipoPractica1.save(flush:true).toString())
    
    /* Practicas Realizadas */
       def practica1 = new Practica(
           fechaPrescripcion:Date.parse('dd-MM-yyyy','17-10-2018'),
           fechaRealizacion:Date.parse('dd-MM-yyyy','17-10-2018'),
           resultado:'Muela perforada a causa de una carie severa',
           consulta: consulta1,
           paciente:paciente1,
           tipoPractica: tipoPractica1
       )
        if(!practica1.save(flush:true)){
            practica1.errors.allErrors.each{println it}
        }else{
            println("practica1 agregada a BD")
        } 
        //println("Practica1 realizada -> " + practica1.save(flush:true).toString())
        def practica2 = new Practica(
           fechaPrescripcion:Date.parse('dd-MM-yyyy','19-10-2018'),
           fechaRealizacion:Date.parse('dd-MM-yyyy','19-10-2018'),
           resultado:'Fractura clavicula derecha',
           consulta:consulta4,
           paciente:paciente1,
           tipoPractica: tipoPractica3
       )
       if(!practica2.save(flush:true)){
            practica2.errors.allErrors.each{println it}
        }else{
            println("practica2 agregada a BD")
        } 
        //println("Practica2 realizada -> " + practica2.save(flush:true).toString())
        
        def practica3 = new Practica(
           fechaPrescripcion:new Date(System.currentTimeMillis()),
           fechaRealizacion:new Date(System.currentTimeMillis()) + 3,
           resultado:'Columna vertebral con leve inflamación en disco ubicado en vertebra 12',
           consulta:consulta2,
           paciente:paciente2,
           tipoPractica: tipoPractica2
       )
       if(!practica3.save(flush:true)){
            practica3.errors.allErrors.each{println it}
        }else{
            println("practica3 agregada a BD")
        } 
        //println("Practica3 realizada -> " + practica3.save(flush:true).toString())
    /* Consultas realizadas entre dos fechas */
        def consultas = Consulta.findAllByFechaBetween(
            Date.parse('dd-MM-yyyy','17-10-2018'),
            new Date(System.currentTimeMillis()))
        println ("Consultas realizadas entre 17-10-2018 y 18-10-2018 -> " + consultas)
    

    /* Practicas Realizadas al paciente uno */
    
    /* Busqueda realizada con HQL*/
        /* Join implicito. (Poco recomendado) */
        def practicasPaciente1JoinImplicito =  Practica.findAll("""
        from Practica as pr where pr.paciente = :paciente
            and pr.tipoPractica.codigo like :search""",
            [search: "231265", paciente: paciente1])
        /*  nótese pr.tipoPractica.codigo se combina tabla practica con tipo practica implicitamente. (No recomendado)
            lo mismo sucede con pr.paciente = paciente1
            Las asociaciones están "desreferenciadas" usando la notación de puntos. */

        println("Join implicito: Practicas realizadas al paciente uno -> " + practicasPaciente1JoinImplicito)
        /* Join explicito. Recomendado */
        def practicasPaciente1JoinExplicito =  Practica.findAll("""
            from Practica as pr 
            join pr.paciente as pa
            join pr.tipoPractica as tp
            where pa = :paciente
            and tp.codigo like :search""",
            [search: "231265", paciente: paciente1])
        
        println("Join Explicito: Practicas realizadas al paciente uno -> " + practicasPaciente1JoinExplicito)
    /* Busqueda realizada con HQL*/
    /* Consulta multilinea, usar: """   """  */
    
    /* Busqueda mediante Buscador Dinamico */
        def practicasPaciente1Aux = Practica.findAllByPacienteAndTipoPractica(
            paciente1,
            tipoPractica1
            )
        println("PracticasAux realizadas al paciente uno -> " + practicasPaciente1Aux)
    }
    def destroy = {
    }
}