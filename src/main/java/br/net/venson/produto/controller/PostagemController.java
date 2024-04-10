package br.net.venson.produto.controller;

import br.net.venson.produto.models.Endereco;
import br.net.venson.produto.models.Postagem;
import br.net.venson.produto.models.Solicitacao;
import br.net.venson.produto.services.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class PostagemController {
    @Autowired
    private CepService cepService;
    private ArrayList<Postagem> listaDePostagens = new ArrayList<>();

    // Rota
    @PostMapping("/postar")
    public ResponseEntity<Object> portar(@RequestBody Solicitacao solicitacao) {
        Endereco enderecoDestinatario = cepService.converteCep(solicitacao.getDestinatario());
        Endereco enderecoRemetente = cepService.converteCep(solicitacao.getRemetente());
        Postagem postagem = new Postagem(
                solicitacao.getProduto(),
                enderecoDestinatario,
                enderecoRemetente
        );
        listaDePostagens.add(postagem);
        return ResponseEntity.status(200).body(solicitacao);
    }
}
