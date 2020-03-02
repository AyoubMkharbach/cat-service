package org.sid.catservice;

import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entites.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProduitRestServices {

    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping(value = "/listProduits")
    public List<Produit> listProduits(){
        return produitRepository.findAll();
    }

    @PostMapping(value = "/listProduits/{id}")
    public Produit save(@PathVariable(name = "id") Long id){
        return produitRepository.findById(id).get();
    }

    @PutMapping(value = "/listProduits/{id}")
    public Produit update(@PathVariable(name = "id") Long id, @RequestBody Produit produit){
        produit.setId(id);
        return produitRepository.save(produit);
    }

    @PutMapping(value = "/listProduits")
    public Produit update(@RequestBody Produit produit){
        return produitRepository.save(produit);
    }

    @DeleteMapping(value = "/listProduits")
    public void delete(@PathVariable(name = "id") Long id){
        produitRepository.deleteById(id);
    }
}
