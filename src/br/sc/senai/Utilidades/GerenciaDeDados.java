package br.sc.senai.Utilidades;

import br.senai.sc.trabalhoFinalSA.modelo.Colaborador;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Vilmar
 */
public class GerenciaDeDados {

   
    public static void criarPastaColaborador() {
        File CPasta = new File("C:/Users/Suporte/Desktop/Dados_Colaboradores");
        CPasta.mkdirs();
    }

  

    public static void salvarLog(Colaborador cadastroColaborador, boolean sobreescrever) throws IOException {
        //Varrer o array
        String conteudoCsv = "";
        String linha = "";
       
            
            linha = "O usuario -->" + cadastroColaborador.getUsuCol() + "<-- logou na data -->" + cadastroColaborador.getUtiCol();

            conteudoCsv = conteudoCsv + linha + "\n";
        
        ManipulacaoDeArquivos arquivo = new ManipulacaoDeArquivos("C:/Users/Suporte/Desktop/Dados_Colaboradores", "registroDeLog.txt");
        if (sobreescrever) {
            arquivo.sobreEscrever(conteudoCsv);

        } else {
            arquivo.gravar(conteudoCsv);
        }

    }

   
}
