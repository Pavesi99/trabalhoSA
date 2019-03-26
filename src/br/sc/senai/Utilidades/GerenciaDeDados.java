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

    public static ArrayList<Colaborador> abrirArquivosColaborador() throws IOException {
        ManipulacaoDeArquivos arquivo = new ManipulacaoDeArquivos("C:/Users/Suporte/Desktop/Dados_Colaboradores", "cadastroDeColaboradores.csv");
        String[] linhas = arquivo.ler();
        String[] cadastroColaborador;
        ArrayList<Colaborador> listaDeColaborador = new ArrayList();

        for (int i = 0; i < linhas.length; i++) {

            if (!linhas[i].equals("")) {
                Colaborador objColaborador = new Colaborador();
                cadastroColaborador = linhas[i].split(";");

                String aux = cadastroColaborador[0];
                objColaborador.setCodCol(Integer.parseInt(aux));
                objColaborador.setNomCol(cadastroColaborador[1]);
                objColaborador.setCidCol(cadastroColaborador[2]);
                aux = cadastroColaborador[3];
                objColaborador.setNumCol(Integer.parseInt(aux));
                objColaborador.setBaiCol(cadastroColaborador[4]);
                objColaborador.setRuaCol(cadastroColaborador[5]);
                aux = cadastroColaborador[6];
                objColaborador.setCepCol(Integer.parseInt(aux));
                objColaborador.setEmaCol(cadastroColaborador[7]);
                aux = cadastroColaborador[8];
                objColaborador.setDddCol(Integer.parseInt(aux));
                aux = cadastroColaborador[9];
                objColaborador.setCelCol(Integer.parseInt(aux));
                objColaborador.setUsuCol(cadastroColaborador[10]);
                objColaborador.setSenCol(cadastroColaborador[11]);
                aux = cadastroColaborador[12];
                objColaborador.setTipCol(Integer.parseInt(aux));
                objColaborador.setUtiCol(cadastroColaborador[13]);
                aux = cadastroColaborador[14];
                objColaborador.setEquCol(Integer.parseInt(aux));
                aux = cadastroColaborador[15];
                objColaborador.setEstCol(Integer.parseInt(aux));
                listaDeColaborador.add(objColaborador);
            }

        }
        return listaDeColaborador;
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
