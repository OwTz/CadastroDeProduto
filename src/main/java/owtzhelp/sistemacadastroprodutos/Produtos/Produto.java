
package owtzhelp.sistemacadastroprodutos.Produtos;

import javax.swing.JOptionPane;

public class Produto implements ProdutoInterface {
    /* Parãmetros da classe*/
 private String nome_p;
 private int id_number;
 private String desc;
  /* construtor da classe */
  public Produto(String nome, int id, String desc){
      
     setNome_p(nome);
     setId_number(id);
     setDesc(desc);
     
  }

    private String getNome_p() {
        return this.nome_p;
    }

    private void setNome_p(String nome_p) {
        this.nome_p = nome_p;
    }

    private int getId_number() {
        return this.id_number;
    }

    private void setId_number(int id_number) {
        this.id_number = id_number;
    }

    private String getDesc() {
        return this.desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }
    /* métodos especiaias */
    public void status(){
        System.out.println("--------  MENU --------");
        System.out.println("o nome do produto é: "+this.getNome_p());
         System.out.println("o ID do produto é: "+this.getId_number());
          System.out.println("a descrição do produto é: "+this.getDesc());
          System.out.println("--------  FIM DO MENU --------");
    }
    public void alterar(){
        String opc = JOptionPane.showInputDialog("o que deseja alterar?");
        switch(opc){
                case "nome":
                    this.setNome_p("alterado");
                        break;
                case "id":
                    int id = Integer.parseInt(JOptionPane.showInputDialog("digite o novo ID do item"));
                    this.setId_number(id);
                        break;
                case "desc":
                    String desc = JOptionPane.showInputDialog("Digite a nova desc");
                     this.setDesc(desc);
                default : 
                    System.out.print("valor inválido tente novamente escolhendo uma das opções");
                    break;
                    
        }
    }
  
}
