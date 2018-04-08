Exerc�cios de Java

Escreva uma classe que represente um pa�s. Um pa�s tem como atributos o seu
nome, o nome da capital, sua dimens�o em Km2 e uma lista de pa�ses com os quais
ele faz fronteira. Represente a classe e forne�a os seguintes construtores e m�todo:


a) Construtor que inicialize o nome, capital e a dimens�o do pa�s;


b) M�todos de acesso (obter/get) para as propriedades indicadas no item (a);


c) Um m�todo que permita verificar se dois pa�ses s�o iguais. Dois pa�ses s�o
iguais se tiverem o mesmo nome e a mesma capital. A assinatura deste m�todo
deve ser:

public boolean equals(final Pais outro);


d) Um m�todo que define quais outros pa�ses fazem fronteira (note que um pa�s
n�o pode fazer fronteira com ele mesmo);


e) Um m�todo que retorne a lista de pa�ses que fazem fronteira;


f) Um m�todo que receba um outro pa�s como par�metro e retorne uma lista de
vizinhos comuns aos dois pa�ses.