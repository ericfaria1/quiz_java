import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Questao> questoes = new ArrayList<>();

        // === Criação das 15 questões ===
        Questao q1 = new Questao();
        q1.pergunta = "1) Qual palavra-chave é usada para definir uma classe em Java?";
        q1.opcaoA = "A) define";
        q1.opcaoB = "B) function";
        q1.opcaoC = "C) class";
        q1.opcaoD = "D) object";
        q1.opcaoE = "E) package";
        q1.correta = "C";

        Questao q2 = new Questao();
        q2.pergunta = "2) Qual tipo de dado é usado para armazenar números decimais em Java?";
        q2.opcaoA = "A) int";
        q2.opcaoB = "B) float";
        q2.opcaoC = "C) char";
        q2.opcaoD = "D) boolean";
        q2.opcaoE = "E) String";
        q2.correta = "B";

        Questao q3 = new Questao();
        q3.pergunta = "3) O que o comando 'System.out.println()' faz?";
        q3.opcaoA = "A) Lê uma entrada do usuário";
        q3.opcaoB = "B) Imprime um texto na tela";
        q3.opcaoC = "C) Declara uma variável";
        q3.opcaoD = "D) Cria um loop";
        q3.opcaoE = "E) Finaliza o programa";
        q3.correta = "B";

        Questao q4 = new Questao();
        q4.pergunta = "4) Qual destes é um tipo primitivo em Java?";
        q4.opcaoA = "A) String";
        q4.opcaoB = "B) Integer";
        q4.opcaoC = "C) Boolean";
        q4.opcaoD = "D) ArrayList";
        q4.opcaoE = "E) Scanner";
        q4.correta = "C";

        Questao q5 = new Questao();
        q5.pergunta = "5) Qual operador é usado para comparar igualdade entre dois valores?";
        q5.opcaoA = "A) =";
        q5.opcaoB = "B) ==";
        q5.opcaoC = "C) !=";
        q5.opcaoD = "D) <>";
        q5.opcaoE = "E) equals";
        q5.correta = "B";

        Questao q6 = new Questao();
        q6.pergunta = "6) Qual estrutura é usada para repetir instruções enquanto uma condição for verdadeira?";
        q6.opcaoA = "A) if";
        q6.opcaoB = "B) for";
        q6.opcaoC = "C) while";
        q6.opcaoD = "D) switch";
        q6.opcaoE = "E) case";
        q6.correta = "C";

        Questao q7 = new Questao();
        q7.pergunta = "7) O que significa JVM?";
        q7.opcaoA = "A) Java Virtual Machine";
        q7.opcaoB = "B) Java Variable Manager";
        q7.opcaoC = "C) Java View Mode";
        q7.opcaoD = "D) Java Version Manager";
        q7.opcaoE = "E) Java Virtual Module";
        q7.correta = "A";

        Questao q8 = new Questao();
        q8.pergunta = "8) Qual comando é usado para importar pacotes em Java?";
        q8.opcaoA = "A) include";
        q8.opcaoB = "B) package";
        q8.opcaoC = "C) import";
        q8.opcaoD = "D) using";
        q8.opcaoE = "E) require";
        q8.correta = "C";

        Questao q9 = new Questao();
        q9.pergunta = "9) Qual das opções representa corretamente uma estrutura condicional?";
        q9.opcaoA = "A) loop()";
        q9.opcaoB = "B) repeat()";
        q9.opcaoC = "C) if/else";
        q9.opcaoD = "D) case/select";
        q9.opcaoE = "E) for/each";
        q9.correta = "C";

        Questao q10 = new Questao();
        q10.pergunta = "10) Em Java, qual é o nome do método principal executado em um programa?";
        q10.opcaoA = "A) start()";
        q10.opcaoB = "B) main()";
        q10.opcaoC = "C) run()";
        q10.opcaoD = "D) init()";
        q10.opcaoE = "E) execute()";
        q10.correta = "B";

        Questao q11 = new Questao();
        q11.pergunta = "11) Qual modificador de acesso permite que um atributo seja acessado apenas dentro da mesma classe?";
        q11.opcaoA = "A) public";
        q11.opcaoB = "B) protected";
        q11.opcaoC = "C) private";
        q11.opcaoD = "D) default";
        q11.opcaoE = "E) static";
        q11.correta = "C";

        Questao q12 = new Questao();
        q12.pergunta = "12) O que é um construtor em uma classe Java?";
        q12.opcaoA = "A) Um método usado para destruir objetos";
        q12.opcaoB = "B) Um método chamado automaticamente ao criar um objeto";
        q12.opcaoC = "C) Um atributo especial da classe";
        q12.opcaoD = "D) Um loop de inicialização";
        q12.opcaoE = "E) Um tipo de interface";
        q12.correta = "B";

        Questao q13 = new Questao();
        q13.pergunta = "13) Qual estrutura é usada para armazenar múltiplos valores do mesmo tipo?";
        q13.opcaoA = "A) int";
        q13.opcaoB = "B) array";
        q13.opcaoC = "C) String";
        q13.opcaoD = "D) boolean";
        q13.opcaoE = "E) float";
        q13.correta = "B";

        Questao q14 = new Questao();
        q14.pergunta = "14) Qual palavra-chave é usada para herança entre classes?";
        q14.opcaoA = "A) extends";
        q14.opcaoB = "B) implements";
        q14.opcaoC = "C) inherit";
        q14.opcaoD = "D) superclass";
        q14.opcaoE = "E) abstract";
        q14.correta = "A";

        Questao q15 = new Questao();
        q15.pergunta = "15) O que significa a sigla OOP em programação?";
        q15.opcaoA = "A) Object Oriented Programming";
        q15.opcaoB = "B) Output Oriented Program";
        q15.opcaoC = "C) Organized Object Process";
        q15.opcaoD = "D) Object Optimization Protocol";
        q15.opcaoE = "E) Online Oriented Programming";
        q15.correta = "A";

        // Adicionando todas à lista
        questoes.add(q1);
        questoes.add(q2);
        questoes.add(q3);
        questoes.add(q4);
        questoes.add(q5);
        questoes.add(q6);
        questoes.add(q7);
        questoes.add(q8);
        questoes.add(q9);
        questoes.add(q10);
        questoes.add(q11);
        questoes.add(q12);
        questoes.add(q13);
        questoes.add(q14);
        questoes.add(q15);

        // === Execução do Quiz ===
        int acertos = 0;

        System.out.println("=====================================");
        System.out.println("🎯 QUIZ DE ALGORITMOS E JAVA");
        System.out.println("=====================================");
        System.out.println();

        for (int i = 0; i < questoes.size(); i++) {
            Questao q = questoes.get(i);
            q.escrevaQuestao();
            String resposta = q.leiaResposta();

            if (q.isCorreta(resposta)) {
                acertos++;
            }
        }

        // === Resultado final ===
        System.out.println("===== RESULTADO FINAL =====");
        System.out.println("Total de acertos: " + acertos + " de " + questoes.size());
        double porcentagem = ((double) acertos / questoes.size()) * 100;
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagem);
        System.out.println("===========================");
    }
}
