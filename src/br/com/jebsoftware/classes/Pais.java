/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jebsoftware.classes;

/**
 *
 * @author TitanNot
 */
public class Pais {
    private String nome;
    private String nome_capital;
    private int dimensao;
    private Pais[] fronteiras;

    public Pais(String nome, String nome_capital, int dimensao) {
        this.nome = nome;
        this.nome_capital = nome_capital;
        this.dimensao = dimensao;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the nome_capital
     */
    public String getNome_capital() {
        return nome_capital;
    }

    /**
     * @param nome_capital the nome_capital to set
     */
    public void setNome_capital(String nome_capital) {
        this.nome_capital = nome_capital;
    }

    /**
     * @return the dimensao
     */
    public int getDimensao() {
        return dimensao;
    }

    /**
     * @param dimensao the dimensao to set
     */
    public void setDimensao(int dimensao) {
        this.dimensao = dimensao;
    }
    
    public boolean equals(final Pais outro){
        boolean retorno = false;
        
        String nome_pais = this.nome;
        String nome_capital_pais = this.nome_capital;
        
        String nome_outro_pais = outro.getNome();
        String nome_capital_outro_pais = outro.getNome_capital();
        
        if(nome_pais.equals(nome_outro_pais) && 
                (nome_capital_pais.equals(nome_capital_outro_pais))){
            retorno = true;
        }
        
        return retorno;
    }
    
    public void defineFronteira(Pais... paises){
        //AQUI CRIAMOS UMA VARIAVEL QUE GUARDARÁ QUANTOS PAÍSES IGUAIS EXISTE 
        //NA LISTA DE PAÍSES PASSADA POR PARAMETRO
        int quantidadePaisesIguais = 0;
        //PERCORREMOS A LISTA PASSADA POR PARAMETRO
        for(int i=0;i<paises.length;i++){
            //SE O OBJETO ATUAL FOR IGUAL A LISTA PASSADA POR PARAMETRO NO 
            //ÍNDICE DO FOR
            if(this.equals(paises[i])){
                //ACRESCENTAMOS UM VALOR NA VARIÁVEL PAISES IGUAIS
                quantidadePaisesIguais++;
            }
        }
        
        //APÓS PERCORRER A LISTA PASSADA POR PARAMETRO, DIZEMOS QUE NOSSA LISTA 
        //DE FRONTEIRAS VAI RECEBER UM NOVO ARRAY COM O TAMANHO DA LISTA SÓ COM
        //OS PAÍSES DIFERENTES (VALIDADA NO FOR ACIMA)
        this.fronteiras = new Pais[paises.length - quantidadePaisesIguais];
        //CRIAMOS UMA VARIÁVEL QUE RECEBERÁ QUANTOS PAÍSES FAZEM FRONTEIRA
        //NA VERDADE ELA FUNCIONARÁ COMO UM CONTADOR PARA IR PREENCHENDO O ARRAY
        int idxFronteira = 0;
        //PERCORREMOS A NOSSA LISTA PASSADA POR PARAMETRO NOVAMENTE
        for(int i=0;i< paises.length;i++){
            //SE O OBJETO ATUAL NÃO FOR IGUAL A LISTA DE PAÍSES NO ÍNDICE DO FOR
            if(!this.equals(paises[i])){
                //NOSSO ARRAY DE FRONTEIRAS NO ÍNDICE DA VARIAVEL (CONTADOR)
                //RECEBERÁ O OBJETO DA LISTA PASSADA POR PARAMETRO
                this.fronteiras[idxFronteira] = paises[i];
                //INCREMENTAMOS A VARIÁVEL (IDXFRONTEIRA = CONTADOR)
                idxFronteira++;
            }
        }
        
    }
    
    public Pais[] getFronteiras(){
        return this.fronteiras;
    }

    public Pais[] vizinhosEmComum(Pais outro) {
        int totaisIguais = 0;
        
        
        for (Pais fronteiraPais : this.fronteiras) {
            for (Pais fronteiraOutro : outro.fronteiras) {
                if (fronteiraPais.equals(fronteiraOutro)) {
                    totaisIguais++;
                }
            }
        }

        if (totaisIguais > 0) {
            int idxVizinhos = 0;
            Pais[] mesmosVizinhos = new Pais[totaisIguais];
            for (Pais fronteiraPais : this.fronteiras) {
                for (Pais fronteiraOutro : outro.fronteiras) {
                    if (fronteiraPais.equals(fronteiraOutro)) {
                        mesmosVizinhos[idxVizinhos] = fronteiraOutro;
                        idxVizinhos++;
                    }
                }
            }

            return mesmosVizinhos;
        }
        return null;
    }    
    
}
