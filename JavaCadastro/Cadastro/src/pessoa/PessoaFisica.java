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
public class PessoaFisica extends Pessoa {

    public String getNome() {
        return identificacao;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return nro_doc;
    }
    
    public PessoaFisica(String nome, String email, String cpf) {
        this.identificacao = nome;
        this.email = email;
        this.nro_doc = cpf;
    }
}
