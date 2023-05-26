# SoundWave
O projeto SoundWave é um sistema que gerencia áudios, como músicas e podcasts, permitindo a contagem de reproduções e curtidas, além de fornecer uma classificação para cada áudio com base em critérios específicos. O projeto foi desenvolvido como parte de um desafio proposto em uma plataforma de cursos, com o objetivo de aplicar conceitos de polimorfismo.

## Estrutura do Projeto
O projeto SoundWave é composto por quatro classes principais: Audio, Podcast, Musica e MinhasPreferidas. Cada uma dessas classes desempenha um papel importante no funcionamento do sistema.

### Classe Audio
A classe Audio é a classe base para todos os tipos de áudios no sistema. Ela possui os seguintes atributos:

titulo (String): armazena o título do áudio.
totalReproducoes (int): registra o número total de reproduções do áudio.
totalCurtidas (int): registra o número total de curtidas recebidas pelo áudio.
classificacao (int): representa a classificação do áudio.
Além dos atributos, a classe Audio possui os seguintes métodos:

curte(): incrementa o número de curtidas do áudio em uma unidade.
reproduz(): incrementa o número de reproduções do áudio em uma unidade.
Getters e setters para todos os atributos.

### Classe Podcast
A classe Podcast é uma subclasse de Audio e representa um tipo específico de áudio, ou seja, um podcast. Além dos atributos herdados da classe Audio, Podcast possui os seguintes atributos adicionais:

host (String): armazena o nome do host do podcast.
descricao (String): armazena a descrição do podcast.
A classe Podcast também possui um método sobrescrito:

getClassificacao(): calcula e retorna a classificação do podcast com base no número de curtidas recebidas. Se o número de curtidas for maior que 500, a classificação é 10; caso contrário, a classificação é 8.

### Classe Musica
A classe Musica também é uma subclasse de Audio e representa um tipo específico de áudio, ou seja, uma música. Além dos atributos herdados da classe Audio, Musica possui os seguintes atributos adicionais:

album (String): armazena o nome do álbum da música.
artista (String): armazena o nome do artista da música.
genero (String): armazena o gênero da música.
Assim como Podcast, a classe Musica possui um método sobrescrito:

getClassificacao(): calcula e retorna a classificação da música com base no número de reproduções. Se o número de reproduções for maior que 2000, a classificação é 10; caso contrário, a classificação é 8.

### Classe MinhasPreferidas
A classe MinhasPreferidas é responsável por gerenciar uma lista de áudios preferidos. Ela possui um único método:

inclui(Audio audio): recebe um objeto do tipo Audio como parâmetro e exibe uma mensagem indicando se o áudio é considerado um sucesso absoluto ou um dos mais curtidos.

### Classe Main
A classe Main contém o método main e é responsável por demonstrar o funcionamento do sistema. Nela, são criados objetos das classes Musica, Podcast e MinhasPreferidas, e são realizadas ações como reprodução e curtida nos áudios.

## Conclusão
O projeto SoundWave é um exemplo de aplicação do conceito de polimorfismo em Java. Com ele, é possível gerenciar áudios, calcular classificações específicas para cada tipo de áudio e identificar os mais populares. A estrutura modular do projeto permite fácil extensibilidade para adicionar novos tipos de áudios ou funcionalidades adicionais. Sinta-se à vontade para contribuir com o projeto e personalizá-lo de acordo com suas necessidades.
