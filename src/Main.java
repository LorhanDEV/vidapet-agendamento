// VidaPet - Programa standalone inicial (TP1)
// Aluno: Lorhan Messias
// Disciplina: Projeto de Bloco: Desenvolvimento Back-End [26E4_5]

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String escolha;

        do {
            boolean podeSerAtendido = false;

            System.out.println("Dia da semana: Segunda a Sexta ");
            String dia = in.nextLine();

            if (dia.equalsIgnoreCase("Sabado") || dia.equalsIgnoreCase("Domingo")) {
                System.out.println("A clinica nao atende nesse dia");
            } else {
                System.out.println("Horario do agendamento: 08,00 as 17,30 ");
                double horario = in.nextDouble();
                in.nextLine(); // limpa o Enter que sobra depois do nextDouble

                if (horario < 8 || horario > 17.30) {
                    System.out.println("Fora do horario de atendimento");
                } else {
                    podeSerAtendido = true;
                }
                System.out.println("Pode ser agendado: " + podeSerAtendido);
            }

            System.out.println("Deseja realizar outro atendimento: sim/nao");
            escolha = in.nextLine();
        } while (escolha.equalsIgnoreCase("sim"));

        System.out.println("Encerrando...");
    }
}
