package DesafioKotlin

class Curso(var nome: String, var codigoDoCurso: Int, var numeroMaxDeAlunos: Int) {

    init {
        if (numeroMaxDeAlunos < 0){
            numeroMaxDeAlunos = 0
        }
    }
    var quantiAtualDeAlunos = 0
    var profTitular: Professor? = null
    var profAdjunto: Professor? = null
    var listaDeAlunos = ArrayList<Aluno?>()

    override fun equals(other: Any?): Boolean {
        return (other is Curso && other.codigoDoCurso == this.codigoDoCurso)
    }

    override fun hashCode(): Int {
        return codigoDoCurso
    }


    fun adicionarAluno(umAluno: Aluno?): Boolean {
        if (quantiAtualDeAlunos < numeroMaxDeAlunos) {
            try {
                listaDeAlunos.add(umAluno)
                quantiAtualDeAlunos++
                return true
            } catch (ex: Exception) {
                println("Aluno não adicionado, tente novamente")
                return false
            }

        } else {
            println("Numero Máximo atingido")
            return false
        }

    }

    fun excluirAluno(umAluno: Aluno?){
        if (listaDeAlunos.remove(umAluno)){
            println("Aluno removido com sucesso")
        }

    }
}
