package jpabook;

import jpabook.jpashop.domain.item.Book;
import jpabook.jpashop.domain.item.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.transaction.annotation.Transactional;

public class ItemTest {
    Item item;

    @BeforeEach
    void setup(){
        item = new Book();
        item.setId(1L);
        item.setName("Object");
        item.setPrice(500);
        item.addStock(3);
    }

    @Test
    @Transactional
    void test1(){
        item.addStock(2);
        Assertions.assertEquals(item.getStockQuantity(), 5);
    }
}
