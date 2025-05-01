import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        while(true){
            System.out.println();
            System.out.println("------------------------------------------");
            System.out.println("1. Translação 2D");
            System.out.println("2. Translação 3D");
            System.out.println("3. Rotação 2D");
            System.out.println("4. Rotação 3D");
            System.out.println("5. Reflexão 2D");
            System.out.println("6. Reflexão 3D");
            System.out.println("7. Projeção 2D");
            System.out.println("8. Projeção 3D");
            System.out.println("9. Cisalhamento 2D");
            System.out.println("0. Sair");
            System.out.println("------------------------------------------");
            System.out.println();

            System.out.print("Escolha o número da operação que deseja realizar: ");
            byte opcao = prompt.nextByte();

            switch (opcao) {
                case 1:
                    System.out.println("TRANSLACAO 2D");
                    prompt.nextLine();
                    System.out.print("Digite as coordenadas x e y do vetor, separadas por espaço: ");
                    String entrada = prompt.nextLine();
                    String[] coords = entrada.trim().split("\\s+");

                    if (coords.length != 2) {
                        System.out.println("Erro: Digite exatamente duas coordenadas para o vetor.");
                        break;
                    }

                    try {
                        double x = Double.parseDouble(coords[0]);
                        double y = Double.parseDouble(coords[1]);

                        System.out.print("Digite o deslocamento dx e dy, separados por espaço: ");
                        String deslocamentoStr = prompt.nextLine();
                        String[] deslocamentos = deslocamentoStr.trim().split("\\s+");

                        if (deslocamentos.length != 2) {
                            System.out.println("Erro: Digite exatamente dois valores para o deslocamento.");
                            break;
                        }

                        double dx = Double.parseDouble(deslocamentos[0]);
                        double dy = Double.parseDouble(deslocamentos[1]);

                        double[] elementosVetor = { x, y };
                        Vector vetorOriginal = new Vector(2, elementosVetor);
                        Vector vetorTransladado = Transformations.translate2D(vetorOriginal, dx, dy);

                        System.out.println("\nVetor original:");
                        vetorOriginal.mostraVector();
                        System.out.println("\nVetor após translação:");
                        vetorTransladado.mostraVector();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Entrada inválida.");
                    }
                    break;

                case 2:
                    System.out.println("Translação 3D");
                    prompt.nextLine();
                    System.out.print("Digite as coordenadas x, y e z do vetor, separadas por espaço: ");
                    String entrada2 = prompt.nextLine();
                    String[] coords2 = entrada2.trim().split("\\s+");

                    if (coords2.length != 3) {
                        System.out.println("Erro: Digite exatamente três coordenadas para o vetor.");
                        break;
                    }

                    try {
                        double xt3d = Double.parseDouble(coords2[0]);
                        double yt3d = Double.parseDouble(coords2[1]);
                        double zt3d = Double.parseDouble(coords2[2]);

                        System.out.print("Digite o deslocamento dx, dy e dz separados por espaço: ");
                        String deslocamentoStr2 = prompt.nextLine();
                        String[] deslocamentos2 = deslocamentoStr2.trim().split("\\s+");

                        if (deslocamentos2.length != 3) {
                            System.out.println("Erro: Digite exatamente três valores para o deslocamento.");
                            break;
                        }

                        double dx = Double.parseDouble(deslocamentos2[0]);
                        double dy = Double.parseDouble(deslocamentos2[1]);
                        double dz = Double.parseDouble(deslocamentos2[2]);

                        double[] elementosVetor2 = {xt3d, yt3d, zt3d};
                        Vector vetorOriginal = new Vector(3, elementosVetor2);
                        Vector vetorTransladado = Transformations.translate3D(vetorOriginal, dx, dy, dz);

                        System.out.println("\nVetor original:");
                        vetorOriginal.mostraVector();
                        System.out.println("\nVetor após translação:");
                        vetorTransladado.mostraVector();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Entrada inválida.");
                    }
                    break;

                case 3:
                    System.out.println("ROTAÇÃO 2D");
                    prompt.nextLine();
                    System.out.print("Digite as coordenadas x e y do vetor, separadas por espaço: ");
                    String entrada2D = prompt.nextLine();
                    String[] valores2D = entrada2D.trim().split("\\s+");

                    if (valores2D.length != 2) {
                        System.out.println("Erro: Digite exatamente duas coordenadas!");
                        break;
                    }

                    try {
                        double x2D = Double.parseDouble(valores2D[0]);
                        double y2D = Double.parseDouble(valores2D[1]);

                        System.out.print("Digite o ângulo de rotação em graus (ex: 90): ");
                        double angulo2D = prompt.nextDouble();

                        System.out.print("Digite 1 para rotação HORÁRIA ou 2 para ANTI-HORÁRIA: ");
                        int sentido2D = prompt.nextInt();

                        boolean horario2D = sentido2D == 1;

                        double[] elementos2D = { x2D, y2D };
                        Vector vetor2D = new Vector(2, elementos2D);

                        Vector resultado2D = Transformations.rotation2D(vetor2D, angulo2D, horario2D);

                        System.out.println("\nVetor original:");
                        vetor2D.mostraVector();
                        System.out.println("\nVetor após rotação:");
                        resultado2D.mostraVector();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Entrada inválida.");
                    }
                    break;

                case 4:
                    System.out.println("ROTAÇÃO 3D");
                    prompt.nextLine();
                    System.out.print("Digite as coordenadas x, y e z do vetor, separadas por espaço: ");
                    String entrada3D = prompt.nextLine();
                    String[] valores3D = entrada3D.trim().split("\\s+");

                    if (valores3D.length != 3) {
                        System.out.println("Erro: Digite exatamente três coordenadas!");
                        break;
                    }

                    try {
                        double x3D = Double.parseDouble(valores3D[0]);
                        double y3D = Double.parseDouble(valores3D[1]);
                        double z3D = Double.parseDouble(valores3D[2]);

                        System.out.print("Digite o ângulo de rotação em graus (ex: 90): ");
                        double angulo3D = prompt.nextDouble();

                        System.out.print("Digite 1 para rotação HORÁRIA ou 2 para ANTI-HORÁRIA: ");
                        int sentido3D = prompt.nextInt();
                        boolean horario3D = sentido3D == 1;

                        System.out.println("Escolha o eixo de rotação:");
                        System.out.println("1 - Eixo X");
                        System.out.println("2 - Eixo Y");
                        System.out.println("3 - Eixo Z");
                        int eixo = prompt.nextInt();

                        double[] elementos3D = { x3D, y3D, z3D };
                        Vector vetor3D = new Vector(3, elementos3D);
                        Vector resultado3D = null;

                        switch (eixo) {
                            case 1:
                                resultado3D = Transformations.rotation3DX(vetor3D, angulo3D, horario3D);
                                break;
                            case 2:
                                resultado3D = Transformations.rotation3DY(vetor3D, angulo3D, horario3D);
                                break;
                            case 3:
                                resultado3D = Transformations.rotation3DZ(vetor3D, angulo3D, horario3D);
                                break;
                            default:
                                System.out.println("Opção inválida de eixo! Use 1, 2 ou 3.");
                                break;
                        }

                        if (resultado3D != null) {
                            System.out.println("\nVetor original:");
                            vetor3D.mostraVector();
                            System.out.println("\nVetor após rotação:");
                            resultado3D.mostraVector();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Entrada inválida.");
                    }
                    break;

                case 5:
                    System.out.println("Reflexão 2D");
                    prompt.nextLine();
                    System.out.print("Digite as coordenadas x e y do vetor, separadas por espaço: ");
                    String entrada5 = prompt.nextLine();
                    String[] coords5 = entrada5.trim().split("\\s+");

                    if (coords5.length != 2) {
                        System.out.println("Erro: Digite exatamente duas coordenadas para o vetor.");
                        break;
                    }

                    try {
                        double x2d = Double.parseDouble(coords5[0]);
                        double y2d = Double.parseDouble(coords5[1]);

                        System.out.print("Digite 1 para refletir no eixo X ou 2 para refletir no eixo Y: ");
                        int eixoEscolhido = prompt.nextInt();

                        Vector vetor5 = new Vector(2, new double[]{x2d, y2d});
                        Vector vetorRefletido;

                        if(eixoEscolhido == 1){
                            vetorRefletido = Transformations.reflection2DX(vetor5);
                        } else if(eixoEscolhido == 2){
                            vetorRefletido = Transformations.reflection2DY(vetor5);
                        } else{
                            System.out.println("Opção inválida para eixo de reflexão. ");
                            break;
                        }

                        System.out.println("\nVetor Original: ");
                        vetor5.mostraVector();
                        System.out.println("\nVetor após reflexão: ");
                        vetorRefletido.mostraVector();
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Entrada inválida.");
                    }
                    break;
                case 6:
                    System.out.println("Reflexão 3D");
                    prompt.nextLine();
                    System.out.print("Digite as coordenadas x, y e z do vetor, separadas por espaço: ");
                    String entrada6 = prompt.nextLine();
                    String[] coords6 = entrada6.trim().split("\\s+");

                    if (coords6.length != 3) {
                        System.out.println("Erro: Digite exatamente três coordenadas para o vetor.");
                        break;
                    }

                    try {
                        double x3d = Double.parseDouble(coords6[0]);
                        double y3d = Double.parseDouble(coords6[1]);
                        double z3d = Double.parseDouble(coords6[2]);

                        System.out.print("Digite 1 para refletir no eixo X, 2 para refletir no eixo Y e 3 para refletir no eixo Z: ");
                        int eixoEscolhido2 = prompt.nextInt();

                        Vector vetor6 = new Vector(3, new double[]{x3d, y3d, z3d});
                        Vector vetorRefletido2;

                        if(eixoEscolhido2 == 1){
                            vetorRefletido2 = Transformations.reflection3DX(vetor6);
                        } else if(eixoEscolhido2 == 2){
                            vetorRefletido2 = Transformations.reflection3DY(vetor6);
                        } else if(eixoEscolhido2 == 3){
                            vetorRefletido2 = Transformations.reflection3DZ(vetor6);
                        } else{
                            System.out.println("Opção inválida para eixo de reflexão. ");
                            break;
                        }

                        System.out.println("\nVetor Original: ");
                        vetor6.mostraVector();
                        System.out.println("\nVetor após reflexão: ");
                        vetorRefletido2.mostraVector();

                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Entrada inválida.");
                    }
                    break;
                case 7:
                    System.out.println("Projeção 2D");
                    break;
                case 8:
                    System.out.println("Projeção 3D");
                    break;
                case 9:
                    System.out.println("Cisalhamento 2D");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}
