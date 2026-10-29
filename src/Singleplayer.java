public class Singleplayer {

    // static: o método pertence à classe, então dá para chamar sem criar um objeto Singleplayer
// void: ele não devolve nada, só executa as ações
// Recebe o jogador (para pular e somar pontos) e a pergunta (Facil, Media ou Dificil)
    static void perguntar(Jogador jogador1, Pergunta pergunta) {

        // Mostra na tela o enunciado e as alternativas da pergunta
        pergunta.mostrar();

        // Lê o que o jogador digitou e guarda na variável "resposta"
        // O texto mostra quantos pulos ainda restam, vindos do Jogador
        String resposta = IO.readln("Digite a alternativa (P para pular, restam "
                + jogador1.getPulosRestantes() + " pulos): ");

        // Testa se o jogador digitou "p" ou "P" (equalsIgnoreCase ignora maiúscula e minúscula)
        if (resposta.equalsIgnoreCase("p")) {

            // pular() confere se ainda há pulo: se sim, gasta um e devolve true
            if (jogador1.pular()) {
                IO.println("Pergunta pulada!");        // pulou: não ganha pontos e a pergunta acaba
            } else {
                IO.println("Você não tem mais pulos!"); // sem pulos: só avisa
            }

            // Se não digitou "p", é uma tentativa de resposta
            // resposta() compara com a letra certa, imprime se acertou ou errou e devolve true ou false
        } else if (pergunta.resposta(resposta)) {

            // Só chega aqui se acertou: soma os pontos que a própria pergunta vale (10, 35 ou 60)
            jogador1.adicionarPontos(pergunta.getPonto());
        }
    }

    // static: o método pertence à classe, então dá para chamar sem criar um objeto Singleplayer
// void: não devolve nada, só executa o jogo
// Recebe o Jogador criado no arquivo principal, para somar pontos e controlar os pulos
    static void main(Jogador jogador1) {

        // Só escreve na tela para o jogador saber em que rodada está
        IO.println("1ª rodada");

        // new Facil(...) cria uma pergunta fácil, passando 3 coisas ao construtor:
        //   1) o enunciado
        //   2) as alternativas (o \n quebra a linha entre elas)
        //   3) a letra da resposta certa
        // O objeto criado já vai direto para o perguntar(), que faz o resto
        perguntar(jogador1, new Facil("Qual é o maior planeta do Sistema Solar?",
                "a: Júpiter\nb: Terra\nc: Marte", "a"));

        // Mesma ideia com a pergunta média: o construtor da Media define que ela vale 35 pontos
        perguntar(jogador1, new Media("Em que ano ocorreu a Proclamação da República no Brasil?",
                "a: 1822\nb: 1889\nc: 1910", "b"));

        // E com a difícil, que vale 60 pontos
        perguntar(jogador1, new Dificil("Qual mulher ganhou dois Prêmios Nobel em áreas científicas diferentes (Física e Química)?",
                "a: Rosalind Franklin\nb: Marie Curie\nc: Ada Lovelace", "b"));

        IO.println("2ª rodada");
        perguntar(jogador1, new Facil("Qual é o maior planeta do Sistema Solar?",
                "a: Júpiter\nb: Terra\nc: Marte", "a"));
        perguntar(jogador1, new Media("Em que ano ocorreu a Proclamação da República no Brasil?",
                "a: 1822\nb: 1889\nc: 1910", "b"));
        perguntar(jogador1, new Dificil("Qual mulher ganhou dois Prêmios Nobel em áreas científicas diferentes (Física e Química)?",
                "a: Rosalind Franklin\nb: Marie Curie\nc: Ada Lovelace", "b"));

        IO.println("3ª rodada");
        perguntar(jogador1, new Facil("Qual animal é conhecido como o \"Rei da Selva\"?",
                "a: Tigre\nb: Elefante\nc: Leão", "c"));
        perguntar(jogador1, new Media("Quantos fusos horários oficiais a Rússia possui?",
                "a: 5\nb: 11\nc: 15", "b"));
        perguntar(jogador1, new Dificil("Em qual batalha histórica Napoleão Bonaparte foi definitivamente derrotado em 1815?",
                "a: Waterloo\nb: Austerlitz\nc: Leipzig", "a"));

        IO.println("4ª rodada");
        perguntar(jogador1, new Facil("Quantos dias tem um ano bissexto?",
                "a: 365 dias\nb: 366 dias\nc: 364 dias", "b"));
        perguntar(jogador1, new Media("Qual é o país mais novo do mundo, que conquistou a independência em 2011?",
                "a: Sudão do Sul\nb: Kosovo\nc: Timor-Leste", "a"));
        perguntar(jogador1, new Dificil("Qual compositor alemão ficou completamente surdo em sua fase adulta e compôs a famosa 9ª Sinfonia?",
                "a: Mozart\nb: Bach\nc: Beethoven", "c"));

        IO.println("5ª rodada");
        perguntar(jogador1, new Facil("Qual é a cor resultante da mistura de azul e amarelo?",
                "a: Verde\nb: Laranja\nc: Roxo", "a"));
        perguntar(jogador1, new Media("Qual é o símbolo químico do ouro na tabela periódica?",
                "a: Ag\nb: Gd\nc: Au", "c"));
        perguntar(jogador1, new Dificil("Qual é o nome do primeiro satélite artificial lançado ao espaço pela União Soviética em 1957?",
                "a: Vostok 1\nb: Sputnik 1\nc: Apollo 11", "b"));

        IO.println("6ª rodada");
        perguntar(jogador1, new Facil("Em qual país fica localizada a Torre Eiffel?",
                "a: Itália\nb: Espanha\nc: França", "c"));
        perguntar(jogador1, new Media("Quem foi o primeiro ser humano a viajar ao espaço em 1961?",
                "a: Neil Armstrong\nb: Yuri Gagarin\nc: Buzz Aldrin", "b"));
        perguntar(jogador1, new Dificil("Quantos quilômetros aproximadamente tem a extensão total do Rio Amazonas?",
                "a: 6.900 km\nb: 4.500 km\nc: 9.200 km", "a"));

        IO.println("7ª rodada");
        perguntar(jogador1, new Facil("Quantos jogadores de cada time ficam em campo em uma partida de futebol?",
                "a: 9\nb: 11\nc: 13", "b"));
        perguntar(jogador1, new Media("Qual país venceu a Copa do Mundo de 2002?",
                "a: Alemanha\nb: Brasil\nc: Itália", "b"));
        perguntar(jogador1, new Dificil("Quem é o maior artilheiro da história das Copas do Mundo, com 16 gols?",
                "a: Ronaldo\nb: Pelé\nc: Miroslav Klose", "c"));

        IO.println("8ª rodada");
        perguntar(jogador1, new Facil("Qual é o elemento químico cuja sigla é O?",
                "a: Oxigênio\nb: Ouro\nc: Ósmio", "a"));
        perguntar(jogador1, new Media("Quantos elementos químicos possui a Tabela Periódica atualmente?",
                "a: 92\nb: 118\nc: 130", "b"));
        perguntar(jogador1, new Dificil("Qual dinastia imperial governou a China durante a construção de grande parte da seção moderna da Grande Muralha?",
                "a: Tang\nb: Han\nc: Ming", "c"));

        IO.println("9ª rodada");
        perguntar(jogador1, new Facil("Quantas cores principais tem um arco-íris tradicional?",
                "a: 5 cores\nb: 10 cores\nc: 7 cores", "c"));
        perguntar(jogador1, new Media("Qual escritor brasileiro é o autor de Memórias Póstumas de Brás Cubas?",
                "a: Machado de Assis\nb: José de Alencar\nc: Lima Barreto", "a"));
        perguntar(jogador1, new Dificil("Qual é o nome do tecido vegetal responsável pelo transporte de seiva elaborada (açúcares) nas plantas vasculares?",
                "a: Xilema\nb: Floema\nc: Parênquima", "b"));

        IO.println("10ª rodada");
        perguntar(jogador1, new Facil("Qual é a cor da camisa tradicional da Seleção Brasileira?",
                "a: Azul\nb: Verde\nc: Amarela", "c"));
        perguntar(jogador1, new Media("Qual jogador é conhecido como o \"Rei do Futebol\"?",
                "a: Pelé\nb: Maradona\nc: Ronaldo", "a"));
        perguntar(jogador1, new Dificil("Qual clube venceu o primeiro Mundial de Clubes da FIFA, em 2000?",
                "a: Vasco da Gama\nb: Corinthians\nc: Manchester United", "b"));

        IO.println("11ª rodada");
        perguntar(jogador1, new Facil("Quantos minutos dura uma partida de futebol, sem contar os acréscimos?",
                "a: 60\nb: 90\nc: 120", "b"));
        perguntar(jogador1, new Media("Qual seleção venceu a Copa do Mundo de 2022, no Catar?",
                "a: Argentina\nb: França\nc: Croácia", "a"));
        perguntar(jogador1, new Dificil("Qual é o único jogador da história a ter vencido três Copas do Mundo?",
                "a: Ronaldo\nb: Pelé\nc: Romário", "b"));

        IO.println("12ª rodada");
        perguntar(jogador1, new Facil("Quantas patas tem uma aranha?",
                "a: 6\nb: 10\nc: 8", "c"));
        perguntar(jogador1, new Media("Quem é considerado o pai da aviação no Brasil?",
                "a: Santos Dumont\nb: Barão de Mauá\nc: Marechal Rondon", "a"));
        perguntar(jogador1, new Dificil("Qual tratado assinado em 1919 encerrou oficialmente a Primeira Guerra Mundial?",
                "a: Tratado de Trianon\nb: Tratado de Versalhes\nc: Tratado de Utrecht", "b"));

        IO.println("13ª rodada");
        perguntar(jogador1, new Facil("Qual é o idioma oficial do Brasil?",
                "a: Espanhol\nb: Português\nc: Inglês", "b"));
        perguntar(jogador1, new Media("Qual é o principal gás responsável pelo efeito estufa na atmosfera da Terra?",
                "a: Metano\nb: Óxido nitroso\nc: Dióxido de carbono", "c"));
        perguntar(jogador1, new Dificil("Qual país europeu foi governado pelo ditador António de Oliveira Salazar até a década de 1960?",
                "a: Portugal\nb: Espanha\nc: Itália", "a"));

        IO.println("14ª rodada");
        perguntar(jogador1, new Facil("Quem pintou o famoso quadro Mona Lisa?",
                "a: Leonardo da Vinci\nb: Vincent van Gogh\nc: Pablo Picasso", "a"));
        perguntar(jogador1, new Media("Em qual continente fica localizado o deserto do Saara?",
                "a: Ásia\nb: África\nc: Oceania", "b"));
        perguntar(jogador1, new Dificil("Quem é considerado o criador do sistema operacional Linux?",
                "a: Richard Stallman\nb: Bill Gates\nc: Linus Torvalds", "c"));

        IO.println("15ª rodada");
        perguntar(jogador1, new Facil("Como se chama o jogador que defende o gol?",
                "a: Goleiro\nb: Zagueiro\nc: Lateral", "a"));
        perguntar(jogador1, new Media("Qual time brasileiro é conhecido como \"Galo\"?",
                "a: Cruzeiro\nb: Atlético Mineiro\nc: Botafogo", "b"));
        perguntar(jogador1, new Dificil("Qual país sediou a primeira Copa do Mundo, em 1930?",
                "a: Brasil\nb: Itália\nc: Uruguai", "c"));

        IO.println("16ª rodada");
        perguntar(jogador1, new Facil("Quantos minutos há em uma hora?",
                "a: 30\nb: 60\nc: 90", "b"));
        perguntar(jogador1, new Media("Quantos dentes tem um ser humano adulto que possui a dentição completa, incluindo os sisos?",
                "a: 28\nb: 36\nc: 32", "c"));
        perguntar(jogador1, new Dificil("Quem foi o arquiteto responsável pelo design da maioria dos prédios públicos de Brasília?",
                "a: Oscar Niemeyer\nb: Lúcio Costa\nc: Burle Marx", "a"));

        IO.println("17ª rodada");
        perguntar(jogador1, new Facil("O que o árbitro mostra para expulsar um jogador?",
                "a: Bandeira\nb: Cartão amarelo\nc: Cartão vermelho", "c"));
        perguntar(jogador1, new Media("Qual jogador argentino é conhecido como \"La Pulga\"?",
                "a: Lionel Messi\nb: Maradona\nc: Tevez", "a"));
        perguntar(jogador1, new Dificil("Quem marcou o gol conhecido como \"Mão de Deus\" na Copa de 1986?",
                "a: Maradona\nb: Pelé\nc: Zico", "a"));

        IO.println("18ª rodada");
        perguntar(jogador1, new Facil("Qual fruta é conhecida como a favorita dos macacos nos desenhos animados?",
                "a: Maçã\nb: Pera\nc: Banana", "c"));
        perguntar(jogador1, new Media("Que composto orgânico dá a cor verde às folhas das plantas?",
                "a: Clorofila\nb: Caroteno\nc: Hemoglobina", "a"));
        perguntar(jogador1, new Dificil("Qual gás nobre é o segundo elemento mais abundante no Universo?",
                "a: Argônio\nb: Hélio\nc: Neônio", "b"));

        IO.println("19ª rodada");
        perguntar(jogador1, new Facil("Quem escreveu o livro Dom Quixote?",
                "a: William Shakespeare\nb: Miguel de Cervantes\nc: Machado de Assis", "b"));
        perguntar(jogador1, new Media("Qual é a moeda oficial do Japão?",
                "a: Yuan\nb: Won\nc: Iene", "c"));
        perguntar(jogador1, new Dificil("Qual pintor espanhol é famoso por suas obras surrealistas, como A Persistência da Memória, com relógios derretendo?",
                "a: Salvador Dalí\nb: Pablo Picasso\nc: Joan Miró", "a"));

        IO.println("20ª rodada");
        perguntar(jogador1, new Facil("Quantos estados tem a região Sudeste do Brasil?",
                "a: 4\nb: 3\nc: 5", "a"));
        perguntar(jogador1, new Media("Quem liderou a Revolução Cubana ao lado de Che Guevara em 1959?",
                "a: Hugo Chávez\nb: Fidel Castro\nc: Augusto Pinochet", "b"));
        perguntar(jogador1, new Dificil("Em qual oceano fica localizada a Ilha de Madagascar?",
                "a: Oceano Atlântico\nb: Oceano Pacífico\nc: Oceano Índico", "c"));

        IO.println("Pontuação: " + jogador1.getPontuacao());
        if (jogador1.getPontuacao() >= 1000) {
            IO.println("Parabens você ganhou!!");
        } else {
            IO.println("Você perdeu!!");
        }
    }
}
