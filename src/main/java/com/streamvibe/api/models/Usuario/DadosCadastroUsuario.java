package com.streamvibe.api.models.Usuario;

import com.streamvibe.api.models.Endereco.DadosCadastroEndereco;

public record DadosCadastroUsuario (
          String nome,
          String dataNascimento,
          String email,
          String senha,
          String cpf,
          DadosCadastroEndereco 
          endereco
) {

   

    }
 
    

