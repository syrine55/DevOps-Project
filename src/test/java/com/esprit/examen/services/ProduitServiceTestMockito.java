package com.esprit.examen.services;
import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Produit;
import com.esprit.examen.repositories.FactureRepository;
import com.esprit.examen.repositories.ProduitRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@SpringBootTest

public class ProduitServiceTestMockito {
    @Mock
    ProduitRepository produitRepository;
    @InjectMocks
    ProduitServiceImpl produitService;

    @Test
    public void testRetrieveProduitById(){
        Produit s = new Produit(10L,"stock test", "libelle test", 100);
        Mockito.when(produitRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(s));
        assertNotNull(produitService.retrieveProduit(10L));
        System.out.println("retrieve done");
    }

    @Test
    public void testAddProduit()
    {
        Produit s = new Produit(20L,"produit test", "libelle test", 100);
        produitService.addProduit(s);
        verify(produitRepository, times(1)).save(s);
        System.out.println("add done");
    }

    @Test
    public void testGetProduit()
    {
        List<Produit> produits = new ArrayList<Produit>();
        Produit s1 = new Produit(10L,"stock 1", "libelle test", 100);
        Produit s2 = new Produit(20L,"stock 2", "libelle test", 100);
        produits.add(s1);
        produits.add(s2);
        when(produitRepository.findAll()).thenReturn(produits);
        System.out.println("get list done");
    }

    @Test
    public void testUpdateProduitById()
    {
        Produit s = new Produit(30L,"stock test", "test update", 100);
        when(produitRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(s));
        produitService.updateProduit(s);
        System.out.println("update done");
    }
}
