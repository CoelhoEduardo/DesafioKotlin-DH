package DesafioKotlin

import java.util.*
import javax.swing.plaf.basic.BasicInternalFrameTitlePane

class DigitalHouseManager(
    var listaDeAlunos: MutableList<Aluno> = mutableListOf(),
    var listaDeProfessores: MutableList<Professor> = mutableListOf(),
    var listaDeCursos: MutableList<Curso> = mutableListOf(),
    var listaDeMatricula: MutableList<Matricula> = mutableListOf()
) {
    //Add Cursos
    fun registrarCurso(nome: String = "", codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        val curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        if (listaDeCursos.add(curso)) {
            println("Curso adicionado com sucesso: ${curso.nome}")
        }
    }

    private fun localizaCurso(codigoCurso: Int): Curso? {
        for (curso in listaDeCursos) {
            if (curso.codigoDoCurso == codigoCurso) {
                return curso
            }
        }
        return null
    }

    fun excluirCurso(codigoCurso: Int) {
        val curso = localizaCurso(codigoCurso)
        listaDeCursos.remove(curso)
        println("Curso: $curso foi removido da lista.")

    }

    //Add Professores

    fun addProfessorAdjunto(nome: String, sobrenome: String, codigoProfessor: Int, quantidadeDeHoras: Int = 0) {
        val professorAdjunto = Professor(nome, sobrenome, quantidadeDeHoras, codigoProfessor)
        if (listaDeProfessores.add(professorAdjunto)) {
            println("Professor ${professorAdjunto.nome} Adicionado com sucesso")
        }
    }

    fun addProfessorTitular(nome: String, sobrenome: String, codProfessor: Int, especialidade: String) {
        val professorTitular = Professor(nome, sobrenome, 0, codProfessor)
        if (listaDeProfessores.add(professorTitular))
            println("Professor ${professorTitular.nome} Adicionado com Sucesso")
    }

    private fun localizarProf(codProf: Int): Professor? {
        for (professores in listaDeProfessores) {
            if (professores.codigoDeProfessor == codProf) {
                return professores
            }
        }
        return null
    }

    fun excluirProfessor(codProfessor: Int) {
        val professor = localizarProf(codProfessor)
        listaDeProfessores.remove(professor)
        println("Professor removido com sucesso")
    }

    //add aluno

    fun addAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        val aluno = Aluno(nome, sobrenome, codigoAluno)
        listaDeAlunos.add(aluno)
        println("Aluno $nome, adicionado com sucesso")
    }

    private fun localizarAluno(codigoAluno: Int): Aluno? {
        for (alunos in listaDeAlunos) {
            if (alunos.codigoDeAluno == codigoAluno) {
                return alunos
            }
        }
        return null

    }

    //matriculando aluno

    fun matricularAluno(codigoAluno: Int, codigoCurso: Int) {
        val aluno = localizarAluno(codigoAluno)
        val curso = localizaCurso(codigoCurso)
        val matricula = Matricula(aluno, curso)
        if (curso?.adicionarAluno(aluno) == true) {
            listaDeMatricula.add(matricula)
            println("Matricula relizado com sucesso ${aluno?.nome}")
        } else {
            println("Infelizmente não foi possível realizar a sua matricula ${aluno?.nome}")
        }

    }

    //alocando Professor
    fun alocarProfessores(codigoCurso: Int, codigoProfTitular: Int, codigoProfAdjunto: Int) {
        val profTitular = localizarProf(codigoProfTitular)
        val profAdjunto = localizarProf(codigoProfAdjunto)
        val curso = localizaCurso(codigoProfAdjunto)
        curso?.profTitular = profTitular as ProfTitular
        curso?.profAdjunto = profAdjunto as ProfAdjunto
        println("Alocação realizado com sucesso!")
    }

    // Parte K
    fun consultaMatricula(codigoAluno: Int){
        for (matricula in listaDeMatricula){
            if(matricula.aluno?.codigoDeAluno == codigoAluno)
                println("Você está matriculado nesse curso: ${matricula.curso?.nome}")
        }
    }
    //Faria um input de Dados também para pode consultar direto da tela e assim puxar o dado da matricula

}
