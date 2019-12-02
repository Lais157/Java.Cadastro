/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

// nome email cpf

/**
 *
 * @author Padrão
 */
public class PessoaJuridica extends Pessoa {

    public String getRazaoSocial() {
        return identificacao;
    }

    public String getEmail() {
        return email;
    }

    public String getCnpj() {
        return nro_doc;
    }
    
    public PessoaJuridica(String razaoSocial, String email, String cnpj) {
        this.identificacao = razaoSocial;
        this.email = email;
        this.nro_doc = cnpj;
    }
}
