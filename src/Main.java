void main() {

    String nomeJogador1 = IO.readln("Qual e o seu nome: ");
    int idadeJogador1 = Integer.parseInt(IO.readln("Qual e sua idade: "));
    String emailJogador1 = IO.readln("Informe seu E-mail: ");
    Jogador jogador1 = new Jogador(nomeJogador1, idadeJogador1, emailJogador1);

//    String nomeJogador2 = IO.readln("Qual e o seu nome: ");
//    int idadeJogador2 = Integer.parseInt(IO.readln("Qual e sua idade: "));
//    String emailJogador2 = IO.readln("Informe seu E-mail: ");
//    String quemJogador2 = IO.readln("Quem esta mandando: ");
//    String recebeJogador2 = IO.readln("Para quem esta enviando: ");
//    Jogador jogador2 = new Jogador(nomeJogador2, idadeJogador2, emailJogador2, quemJogador2, recebeJogador2);

    String modo = IO.readln(
            "Escolha o modo de jogo:\n" +
                    "a: Singleplayer\n" +
                    "b: Multiplayer\n"
    );

    if (modo.equalsIgnoreCase("a")) {
        Singleplayer.main(jogador1);

    } else if (modo.equalsIgnoreCase("b")) {
        IO.println("Este modo ainda esta em desenvolvimento");
    }

}
