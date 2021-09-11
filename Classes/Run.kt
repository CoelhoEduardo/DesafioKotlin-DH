package DesafioKotlin

fun main() {
    val dhManager = DigitalHouseManager()
    println("Adicionando Professores")
    println("----------------------------------------------")
    dhManager.addProfessorTitular("Edu", "Santos", 77, "Android")
    dhManager.addProfessorTitular("Mari", "Vieira", 78, "Full Stack")
    dhManager.addProfessorAdjunto("Jao", "Oliveira", 100, 60)
    dhManager.addProfessorAdjunto("Isa", "Souza", 101, 60)
    println("----------------------------------------------")
    println()
    println("Adicionando Cursos")
    println("----------------------------------------------")
    dhManager.registrarCurso("Android", 20001, 3)
    dhManager.registrarCurso("Full Stack", 20002, 2)
    println()
    println("Alocando Professores")
    dhManager.alocarProfessores(20002, 78, 101)
    dhManager.alocarProfessores(20001, 77, 100)
    println("----------------------------------------------")
    println()
    println("Adicionando Alunos")
    println("----------------------------------------------")
    dhManager.addAluno("Naruto", "Uzumaki", 10)
    dhManager.addAluno("Hinata", "Hyuga", 11)
    dhManager.addAluno("Sasuke", "Uchiha", 12)
    dhManager.addAluno("Sakura", "Uchiha", 13)
    dhManager.addAluno("Rock", "Lee", 14)
    println()
    println("Matriculando Alunos")
    println("----------------------------------------------")
    dhManager.matricularAluno(10, 20001)
    dhManager.matricularAluno(11, 20001)
    dhManager.matricularAluno(12, 20002)
    dhManager.matricularAluno(13, 20002)
    dhManager.matricularAluno(14, 20002)
    println("----------------------------------------------")

    //PARTE K
    dhManager.consultaMatricula(10)


}