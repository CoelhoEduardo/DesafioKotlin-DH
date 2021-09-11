package DesafioKotlin

class Aluno(var nome: String, var sobrenome: String, var codigoDeAluno:Int){
    override fun equals(other: Any?): Boolean {
        return (other is Aluno && other.codigoDeAluno == this.codigoDeAluno)
    }

    override fun hashCode(): Int {
        return codigoDeAluno
    }
}