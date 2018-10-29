package pacientes

class TipoPractica {
    String codigo
    String nombre

    static constraints = {
        codigo(blank:false, unique:true, matches:"[1-9]{6}")
        nombre(blank:false, maxSize: 100)
    }
}
