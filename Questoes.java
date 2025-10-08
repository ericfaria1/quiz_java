import java.util.Scanner;

public class Questao {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";

    // Verifica se a resposta do usuário está correta
    public boolean isCorreta(String resposta){
        if(resposta.equalsIgnoreCase(this.correta)){
            System.out.println("✅ Parabéns! Resposta Correta - Letra: " + this.correta);
            System.out.println();
            return true;
        } else {
            System.out.println("❌ Resposta Errada!");
            System.out.println("A opção correta era: " + this.correta);
            System.out.println();
            return false;
        }
    }

    // Lê a resposta do usuário e valida
    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.print("Digite a resposta (A, B, C, D ou E): ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    // Garante que a resposta seja válida (A–E)
    private boolean respostaValida(String resp){
        if(resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
           resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")){
            return true;
        }
        System.out.println("⚠️ Resposta inválida! Digite A, B, C, D ou E.");
        System.out.println();
        return false;
    }

    // Exibe a questão e as alternativas
    public void escrevaQuestao(){
        System.out.println(this.pergunta);
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }
}
