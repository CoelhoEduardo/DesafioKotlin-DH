package DesafioKotlin

open class Professor(var nome: String, var sobrenome: String, var tempoDeCasa: Int, var codigoDeProfessor: Int)

class ProfTitular(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoDeProfessor: Int,
    var especialidade: String
) : Professor(nome, sobrenome, tempoDeCasa, codigoDeProfessor)

class ProfAdjunto(
    nome: String,
    sobrenome: String,
    tempoDeCasa: Int,
    codigoDeProfessor: Int,
    var horasDeMonitoria: Int
) : Professor(nome, sobrenome, tempoDeCasa, codigoDeProfessor)


