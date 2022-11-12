package com.esprit.examen.services;

import com.esprit.examen.entities.Stock;
import com.esprit.examen.repositories.StockRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

public class ProduitServiceTestMockito {
    @Mock
    StockRepository stockRepository;
    @InjectMocks
    StockServiceImpl stockService;

    @Test
    public void testRetrieveStockById(){
        Stock s = new Stock("stock test", 10, 100);
        Mockito.when(stockRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(s));
        assertNotNull(stockService.retrieveStock(1L));
        System.out.println("retrieve done");
    }

    @Test
    public void testAddStock()
    {
        Stock s = new Stock("stock test", 10, 100);
        stockService.addStock(s);
        verify(stockRepository, times(1)).save(s);
        System.out.println("add done");
    }

    @Test
    public void testGetStock()
    {
        List<Stock> stocks = new ArrayList<Stock>();
        Stock s1 = new Stock("stock 1", 10, 100);
        Stock s2 = new Stock("stock 2", 20, 100);
        stocks.add(s1);
        stocks.add(s2);
        when(stockRepository.findAll()).thenReturn(stocks);
        System.out.println("get list done");
    }

    @Test
    public void testUpdateStockById()
    {
        Stock s = new Stock("stock test", 10, 100);
        when(stockRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(s));
        stockService.updateStock(s);
        System.out.println("update done");
    }
}
