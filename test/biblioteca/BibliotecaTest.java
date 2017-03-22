
package biblioteca;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author José
 */
public class BibliotecaTest {
    
    public BibliotecaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testadicionar() {
        Biblioteca b = new Biblioteca();
        Livro l = new Livro();
        l.titulo="prog2";
        l.ano=2017;
        l.codigo=1;
        l.autor.codigo=2;
        l.autor.nome="merlin";
        b.adicionarLivro(l);
        
        Livro l2 = new Livro();
        l2.titulo="prog3";
        l2.ano=2017;
        l2.codigo=2;
        l2.autor.codigo=3;
        l2.autor.nome="merlin2";
        b.adicionarLivro(l2);
        
        Livro l3 = new Livro();
        l3.titulo="prog1";
        l3.ano=2016;
        l3.codigo=3;
        l3.autor.codigo=4;
        l3.autor.nome="merlin3";
        b.adicionarLivro(l3);
        
        b.listarLivro();
        b.excluirLivro(l3);
    }
    
}
