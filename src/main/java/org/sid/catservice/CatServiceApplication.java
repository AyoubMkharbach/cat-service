package org.sid.catservice;

import org.sid.catservice.dao.ProduitRepository;
import org.sid.catservice.entites.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {

    @Autowired
    private ProduitRepository produitRepository;

    @Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(CatServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Produit.class);
    /*
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
        produitRepository.save(new Produit(null, "Ordinateur Lx 45", 6700, 3));
        produitRepository.save(new Produit(null, "Imprimante HP", 1700, 3));
        produitRepository.save(new Produit(null, "Smart phone Samsung S9", 8000, 10));
    */
        produitRepository.findAll().forEach(produit -> System.out.println(produit.toString()));

    }
}
