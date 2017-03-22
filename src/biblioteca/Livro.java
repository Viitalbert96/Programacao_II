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
public class Livro {
    int codigo;
    String titulo;
    int ano;
    boolean livroEmprestado;
    Autor autor;
    
    public Livro(){
        codigo = 0;
        titulo = "";
        ano = 0;
        autor = new Autor();
        livroEmprestado = false;
    }
    
    void emprestar(){
        livroEmprestado = true;
    }
    
    void devolver(){
        livroEmprestado = false;
    }
    
}
