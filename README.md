Exercícios de Java

Escreva uma classe que represente um país. Um país tem como atributos o seu
nome, o nome da capital, sua dimensão em Km2 e uma lista de países com os quais
ele faz fronteira. Represente a classe e forneça os seguintes construtores e método:


a) Construtor que inicialize o nome, capital e a dimensão do país;


b) Métodos de acesso (obter/get) para as propriedades indicadas no item (a);


c) Um método que permita verificar se dois países são iguais. Dois países são
iguais se tiverem o mesmo nome e a mesma capital. A assinatura deste método
deve ser:

public boolean equals(final Pais outro);


d) Um método que define quais outros países fazem fronteira (note que um país
não pode fazer fronteira com ele mesmo);


e) Um método que retorne a lista de países que fazem fronteira;


f) Um método que receba um outro país como parâmetro e retorne uma lista de
vizinhos comuns aos dois países.