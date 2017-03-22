/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;
 

/**
 *
 * @author José
 */
import java.util.ArrayList;
public class Biblioteca {
    ArrayList<Livro> livros;
    
    public Biblioteca()
    {
        livros = new ArrayList();
    }
    
    void adicionarLivro(Livro livro)
    {
        livros.add(livro);
    }
    
    void excluirLivro(Livro livro)
    {
        livros.remove(livro);
    }
    void listarLivro(){
        for(Livro aux:livros){
            
            System.out.println(aux.titulo);
            System.out.println(aux.autor.nome);       
        }
    
    }
    
    void emprestar(Livro livro){
        livro.emprestar();
    }
    
    void devolver(Livro livro){
        livro.devolver();
    }
    
} 


