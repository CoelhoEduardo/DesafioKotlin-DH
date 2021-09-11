//package DesafioKotlin
//
//class DigitalHouseManager {
//
//    private var listaAlunos = mutableListOf<Aluno>()
//    private var listaProfessores = mutableListOf<Professor>()
//    private var listaCursos = mutableListOf<Curso>()
//    private var listaMatriculas = mutableListOf<Matricula>()
//
//    /*
//    Criar um método na classe DigitalHouseManager que permita registrar um
//curso. O método recebe como parâmetros o nome do curso, o código e a
//quantidade máxima de alunos admitidos. O método deve criar um curso com
//os dados correspondentes e adicioná-lo à lista de cursos.
//    ○ fun registrarCurso(nome: String, codigoCurso: Integer,
//    quantidadeMaximaDeAlunos: Integer )
//     */
//
//    fun registrarCurso(
//        nome: String,
//        codigoCurso: Int,
//        quantidadeMaximaDeAlunos: Int
//    ) {
//        if (!validarCodigo(codigoCurso))
//            return
//        if (existeCurso(codigoCurso)) {
//            println("Esse codigo ja existe. Nao e possivel registrar cursos com o mesmo codigo\n" )
//            imprimeCodigosCursos()
//            return
//        }
//        try {
//            var curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
//            listaCursos.add(curso)
//            println(green + "Curso Registrado\n" + reset)
//        } catch (ex: Exception) {
//            println(red + "Nao foi possivel registrar esse curso! Tente Novamente.\n" + reset)
//        }
//    }
//
//    //imprime os codigos dentro da lista de cursos.
//
//    fun imprimeCodigosCursos() {
//        println(
//            yellow +
//                    """
//            ------------------------------
//            -------Lista de Cursos-------
//        """.trimIndent() + reset
//        )
//        for (cont in listaCursos) {
//            println("${cont.codigo} ${cont.nome}")
//        }
//        println(yellow + "------------------------------\n" + reset)
//    }
//
//    /*
//    Criar um método na classe DigitalHouseManager que permita excluir um
//curso. O método recebe como parâmetro o código do curso. O método deve
//utilizar o código do curso para encontrá-lo na lista de cursos e excluí-lo da
//lista.
//○ fun excluirCurso(codigoCurso: Integer)
//     */
//
//    fun excluirCurso(codigoCurso: Int) {
//        if (!validarCodigo(codigoCurso))
//            return
//        if (existeCurso(codigoCurso)) {
//            try {
//                var curso = buscarCurso(codigoCurso)
//                listaCursos.remove(curso)
//                println(green + "Curso foi removido da lista.\n" + reset)
//                return
//            } catch (ex: Exception) {
//                println(red + "Nao foi possivel remover o curso da lista.\n" + reset)
//            }
//        } else {
//            println(red + "Codigo de curso nao encontrado.\n" + reset)
//        }
//    }
//
//    //Consultar se existe o curso na lista de cursos cadastrados
//
//    private fun existeCurso(codigoCurso: Int): Boolean {
//        for (curso in listaCursos) {
//            if (curso.codigo == codigoCurso) {
//                return true
//            }
//        }
//        return false
//    }
//
//// Retorna curso da lista
//
//    private fun buscarCurso(codigoCurso: Int): Curso? {
//        for (curso in listaCursos) {
//            if (curso.codigo == codigoCurso) {
//                return curso
//            }
//        }
//        return null
//    }
//
///*
//Criar um método na classe DigitalHouseManager que permita registrar um
//professor adjunto. O método recebe como parâmetros o nome do professor, o
//sobrenome, o código e a quantidade de horas disponíveis para monitoria. O
//tempo de casa inicial do professor será zero. O método deve criar um
//professor adjunto com os dados correspondentes e adicioná-lo à lista de
//professores.
//○ fun registrarProfessorAdjunto(nome: String , sobrenome: String ,
//codigoProfessor: Integer, quantidadeDeHoras: Integer)
// */
//
//    fun registrarProfessorAdjunto(
//        nome: String,
//        sobrenome: String,
//        codigoProfessor: Int,
//        quantidadeDeHoras: Int
//    ) {
//        if (!validarCodigo(codigoProfessor))
//            return
//        if (existeProfessor(codigoProfessor)) {
//            println(red + "Esse codigo ja existe. Nao e possivel registrar professor com o mesmo codigo.\n" + reset)
//            imprimeCodigosProfessores()
//            return
//        }
//        try {
//            var professorAdjunto =
//                ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, tempoDeCasa = 0, codigoProfessor)
//            listaProfessores.add(professorAdjunto)
//            println(green + "Professor Adjunto Registrado\n" + reset)
//        } catch (ex: Exception) {
//            println(red + "Nao foi possivel registrar esse professor! Tente Novamente.\n" + reset)
//        }
//    }
//
///*
//Criar um método na classe DigitalHouseManager que permita registrar um
//professor titular. O método recebe como parâmetros o nome do professor, o
//sobrenome, o código e a especialidade. O tempo de casa inicial do professor
//será zero. O método deve criar um professor titular com os dados
//correspondentes e adicioná-lo à lista de professores.
//○ fun registrarProfessorTitular(nome: String , sobrenome: String,
//codigoProfessor: Integer, especialidade: String)
// */
//
//    fun registrarProfessorTitular(
//        nome: String,
//        sobrenome: String,
//        codigoProfessor: Int,
//        especialidade: String
//    ) {
//        if (!validarCodigo(codigoProfessor))
//            return
//        if (existeProfessor(codigoProfessor)) {
//            println(red + "Esse codigo ja existe. Nao e possivel registrar professores com o mesmo codigo.\n" + reset)
//            imprimeCodigosProfessores()
//            return
//        }
//        try {
//            var professorTitular = ProfessorTitular(especialidade, nome, sobrenome, tempoDeCasa = 0, codigoProfessor)
//            listaProfessores.add(professorTitular)
//            println(green + "Professor Titular Registrado.\n" + reset)
//        } catch (ex: Exception) {
//            println(red + "Nao foi possivel registrar esse professor! Tente Novamente.\n" + reset)
//        }
//    }
//
///*
//Criar um método na classe DigitalHouseManager que permita excluir um
//professor. O método recebe como parâmetro o código do professor. O
//método deve utilizar o código do professor para encontrá-lo na lista de
//professores e eliminá-lo da lista.
//○ fun excluirProfessor(codigoProfessor: Integer)
// */
//
//    fun excluirProfessor(codigoProfessor: Int) {
//        if (!validarCodigo(codigoProfessor))
//            return
//        if (existeProfessor(codigoProfessor)) {
//            try {
//                var professor = buscarProfessor(codigoProfessor)
//                listaProfessores.remove(professor)
//                println(green + "Professor(a) ${professor?.nome} foi removido da lista.\n" + reset)
//                return
//            } catch (ex: Exception) {
//                println(red + "Nao foi possivel remover o professor da lista.\n" + reset)
//            }
//        } else {
//            println(red + "Codigo de professor nao encontrado.\n" + reset)
//        }
//    }
//
//    // Retorna professor da lista
//
//    private fun buscarProfessor(codigoProfessor: Int): Professor? {
//        for (professor in listaProfessores) {
//            if (professor.codigo == codigoProfessor) {
//                return professor
//            }
//        }
//        return null
//    }
//
////Consultar se existe o profressor na lista de professores cadastrados
//
//    private fun existeProfessor(codigoProfessor: Int): Boolean {
//        for (professor in listaProfessores) {
//            if (professor.codigo == codigoProfessor) {
//                return true
//            }
//        }
//        return false
//    }
//
//    //imprime os codigos dentro da lista de professores.
//
//    fun imprimeCodigosProfessores() {
//        println(
//            yellow +
//                    """
//            ------------------------------
//            -----Lista de Professores-----
//        """.trimIndent() + reset
//        )
//        for (professor in listaProfessores) {
//            println("${professor.codigo} ${professor.nome}")
//        }
//        println(yellow + "------------------------------\n" + reset)
//    }
//
///*
//Criar um método na classe DigitalHouseManager que permita registrar um
//aluno. O método recebe como parâmetros o nome, o sobrenome e o código
//do aluno. O método deve criar um aluno com os dados correspondentes e
//adicioná-lo à lista de alunos.
//○ matricularAluno(nome: String, sobrenome: String, codigoAluno:
//Integer)
// */
//
//    fun registrarAluno(
//        nome: String,
//        sobrenome: String,
//        codigoAluno: Int
//    ) {
//        if (!validarCodigo(codigoAluno))
//            return
//        if (existeAluno(codigoAluno)) {
//            println(red + "Esse codigo ja existe. Nao e possivel registrar alunos com o mesmo codigo.\n" + reset)
//            imprimeCodigosAlunos()
//            return
//        }
//        try {
//            var aluno = Aluno(nome, sobrenome, codigoAluno)
//            listaAlunos.add(aluno)
//            println(green + "Aluno Registrado.\n" + reset)
//        } catch (ex: Exception) {
//            println(red + "Nao foi possivel registrar esse Aluno! Tente Novamente.\n" + reset)
//        }
//    }
//
////imprime os codigos dentro da lista de alunos.
//
//    fun imprimeCodigosAlunos() {
//        println(
//            yellow +
//                    """
//            ------------------------------
//            -------Lista de Alunos-------
//        """.trimIndent() + reset
//        )
//        for (aluno in listaAlunos) {
//            println("${aluno.codigo} ${aluno.nome}")
//        }
//        println(yellow + "------------------------------\n" + reset)
//    }
//
//    //Consultar se existe o aluno na lista de alunos cadastrados
//
//    private fun existeAluno(codigoAluno: Int): Boolean {
//        for (aluno in listaAlunos) {
//            if (aluno.codigo == codigoAluno) {
//                return true
//            }
//        }
//        return false
//    }
//
////Retorna aluno da lista
//
//    private fun buscarAluno(codigoAluno: Int): Aluno? {
//        for (aluno in listaAlunos) {
//            if (aluno.codigo == codigoAluno) {
//                return aluno
//            }
//        }
//        return null
//    }
//
//    //Excluir aluno da lista.
//
//    fun excluirAluno(codigoAluno: Int) {
//        if (!validarCodigo(codigoAluno))
//            return
//        if (existeAluno(codigoAluno)) {
//            try {
//                var aluno = buscarAluno(codigoAluno)
//                listaAlunos.remove(aluno)
//                println(green + "Aluno(a) ${aluno?.nome} foi removido da lista.\n" + reset)
//                return
//            } catch (ex: Exception) {
//                println(red + "Nao foi possivel remover o aluno da lista.\n" + reset)
//            }
//        } else {
//            println(red + "Codigo de aluno nao encontrado.\n" + reset)
//        }
//    }
//
///*
//    Criar um método na classe DigitalHouseManager que permita matricular um
//    aluno em um curso. O método recebe como parâmetros o código do aluno e
//    o código do curso em que ele está se matriculando.
//    ○ matricularAluno(codigoAluno: Integer, codigoCurso: Integer)
//    O método deve:
//    ● Encontrar o curso em que o aluno está se matriculando.
//    ● Encontrar o aluno que queremos matricular.
//    ● Matricular o aluno, se for possível.
//    ● No caso de ser possível, criar uma matrícula e configurá-la com os
//    dados correspondentes.
//    ○ Adicionar a matrícula à lista de matrículas.
//    ○ Informar na tela que a matrícula foi realizada.
//    ● Se não houver vagas disponíveis:
//    ○ Informar na tela que não foi possível realizar a matrícula porque
//    não há vagas.
//*/
//
//    fun matricularAluno(
//        codigoAluno: Int,
//        codigoCurso: Int
//    ) {
//        if (existeCurso(codigoCurso)) {
//            if (existeAluno(codigoAluno)) {
//                var aluno = buscarAluno(codigoAluno)
//                var curso = buscarCurso(codigoCurso)
//                try {
//                    var matricula = Matricula(aluno, curso)
//                    if (curso?.adicionarUmAluno(aluno) == true) {
//                        listaMatriculas.add(matricula)
//                        println("Matricula Realizada.\n")
//                    }
//                } catch (ex: Exception) {
//                    println(red + "Nao foi possivel realizar a matricula. Tente novamente.\n" + reset)
//                }
//            } else {
//                println(red + "Aluno nao encontrado.\n" + reset)
//            }
//        } else {
//            println(red + "Curso nao encontrado.\n" + reset)
//        }
//    }
//
//    //Excluir matricula
//
//    fun desmatricularAluno(
//        codigoAluno: Int,
//        codigoCurso: Int
//    ) {
//        if (existeCurso(codigoCurso)) {
//            if (existeAluno(codigoAluno)) {
//                var aluno = buscarAluno(codigoAluno)
//                var curso = buscarCurso(codigoCurso)
//                try {
//                    var matricula = Matricula(aluno, curso)
//                    if (curso?.excluirAluno(aluno) == true) {
//                        listaMatriculas.remove(matricula)
//                        println("Matricula Cancelada.\n")
//                    }
//                } catch (ex: Exception) {
//                    println(red + "Nao foi possivel cancelar a matricula. Tente novamente.\n" + reset)
//                }
//            } else {
//                println(red + "Aluno nao encontrado.\n" + reset)
//            }
//        } else {
//            println(red + "Curso nao encontrado.\n" + reset)
//        }
//    }
//
//    //Imprime Matriculas Ativas
//
//    fun imprimirMatriculas() {
//        println(
//            yellow +
//                    """
//            ------------------------------
//            -----Lista de Matriculas------
//        """.trimIndent() + reset
//        )
//        for (matricula in listaMatriculas) {
//            println(
//                """
//            Curso: ${matricula.curso?.codigo}  ${matricula.curso?.nome}
//            Aluno: ${matricula.aluno?.codigo}  ${matricula.aluno?.nome}
//                    """.trimIndent()
//            )
//            println(yellow + "------------------------------\n" + reset)
//        }
//
//    }
//
//
///*
//Criar um método na classe DigitalHouseManager que permita alocar
//professores a um curso. O método recebe como parâmetros o código do
//curso, o código do professor titular e o código do professor adjunto.
//○ fun alocarProfessores(codigoCurso: Integer,
//codigoProfessorTitular: Integer, codigoProfessorAdjunto:
//Integer)
//O método deve:
//● Encontrar o professor titular na lista de professores.
//● Encontrar o professor adjunto na lista de professores.
//● Alocar ambos professores ao curso.
// */
//
//    fun alocarProfessores(
//        codigoCurso: Int,
//        codigoProfessorTitular: Int,
//        codigoProfessorAdjunto: Int
//    ) {
//        if (existeProfessor(codigoProfessorTitular)) {
//            if (existeProfessor(codigoProfessorAdjunto)) {
//                if (existeCurso(codigoCurso)) {
//                    var profTitular = buscarProfessor(codigoProfessorTitular)
//                    var profAdjunto = buscarProfessor(codigoProfessorAdjunto)
//                    var curso = buscarCurso(codigoCurso)
//                    try {
//                        curso?.profTitular = profTitular as ProfessorTitular
//                        curso?.profAdjunto = profAdjunto as ProfessorAdjunto
//                        println(green + "Realizado alocacao dos professores.\n" + reset)
//                    } catch (ex: Exception) {
//                        println(red + "Nao foi possivel realizar a alocacao de professores. Tente novamente.\n" + reset)
//                    }
//                }
//            } else {
//                println(red + "Professor Adjunto nao encontrado.\n" + reset)
//            }
//        } else {
//            println(red + "Professor Titular nao encontrado.\n" + reset)
//        }
//    }
//
//    fun consultarMatriculas(codigoAluno: Int) {
//        if (existeAluno(codigoAluno)) {
//            for (matriculas in listaMatriculas) {
//                if (matriculas.aluno?.codigo == codigoAluno) {
//                    println(
//                        yellow +
//                                """
//
//                Aluno: ${matriculas.aluno?.nome} ${matriculas.aluno?.sobrenome}
//                Curso: ${matriculas.curso?.nome}
//
//            """.trimIndent() + reset
//                    )
//                } else {
//                    println(red + "Aluno sem matricula.\n" + reset)
//                }
//            }
//        } else {
//            println(red + "Aluno nao encontrado.\n" + reset)
//        }
//    }
//
//}
//
//
//
//
