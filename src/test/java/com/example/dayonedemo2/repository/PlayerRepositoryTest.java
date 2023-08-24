package com.example.dayonedemo2.repository;

import com.example.dayonedemo2.entity.Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class PlayerRepositoryTest {
    @Autowired
    PlayerRepository playerRepository;
    boolean isInitialized = false;
    @BeforeEach
    void setUp() {
        if (!isInitialized) {
            Player player = new Player("test", "test", "test");
            Player player2 = new Player("test 1", "test 1", "test 1");

            playerRepository.save(player);
            playerRepository.save(player2);

            isInitialized=true;
        }
        }

    @Test
    public void testAll(){

        Long count = playerRepository.count();
        assertEquals(2,count);
    }

    @Test
    public void deleteAll(){
        playerRepository.deleteAll();
        assertEquals(0,playerRepository.count());
    }

    @Test
    void findByName() {
        Player p1 = playerRepository.findByName("test");
        assertEquals("test",p1.getName());
    }

    @Test
    void findByNameLike() {
        Player p1 = playerRepository.findByNameLike("%1%");
        assertEquals("test 1",p1.getName());
    }


}