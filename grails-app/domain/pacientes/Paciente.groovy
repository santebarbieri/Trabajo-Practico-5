package pacientes

class Paciente {
    Integer nroDocumento
    String nombre
    String apellido
    String sexo
    Date fechaNacimiento
    String telefono
    String mail

    static hasMany = [consulta: Consulta, practica: Practica] //uno a muchos

    static constraints = {
        nroDocumento(unique: true, blank: false, matches:"[1-9]{8}")
        apellido(blank: false, maxSize: 100)
        nombre(blank: false, maxSize: 100)
        sexo(inList:['F','M'])
        fechaNacimiento(blank: false)
        telefono(matches:"[1-9]{3}-[1,-9]{6}")
        mail(email: true)
    }
}