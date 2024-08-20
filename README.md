Trabalho da materia de SOA e sistemas distribuidos 

Combase no livro - SOA_aplicado_Integrando_com_web

ATIVIDADE

Com base nos capítulos de 1 a 3 do livro "SOA aplicado - Integrando com web services e além", do Alexandre Saudate, que foi acompanhado em sala na exposição do conteúdo sobre WebServices com SOAP, e dos exemplos constantes na nossa conta do GitHub (links abaixo), os estudantes deverão:

1) Escolher um tema de um problema de sistema de informação a ser tratado computacionalmente, como por exemplo uma livraria (exemplo do livro).
2) Fazendo uma análise rápida do negócio escolhido, selecionar duas classes de negócio que se relacionem por uma agregação, como as classes Livro e Autor, do texto. O relacionamento não pode ser 1 para 1. Pode ser 1 para n ou n para n. Esta análise deve determinar os atributos das classes e seus tipos de dados.
3) Implementar as classes selecionadas em Java nos padrões do que foi exposto em sala e no livro. Estas classes devem substituir Livro e Autor no código.
4) Modificar o código, conforme consta no final do capítulo 3, implementando um webservice usando SOAP que permita :
4.1) a exibição de todos os objetos da classe principal (o lado 1 da relação), mostrando também os dados da outra classe (seguir exemplo do texto, com a classe Livro e Autor). 
4.2) a exibição de um subconjunto dos dados, mediante a passagem de algum parâmetro para o webservice.
4.3) a inserção de outros objetos das classes passados como parâmetro da chamada ao serviço. Esta chamada deve ser autenticada (usuário e senha).
5) O resultado final deve ser um webservice usando SOAP que será testado usando a ferramenta SOAPUI. O código disponibilizado já implementa todas as funcionalidades acima para Livro e Autor.
