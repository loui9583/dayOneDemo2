package com.example.dayonedemo2.repository;

import com.example.dayonedemo2.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findByName(String player);
    Player findByNameLike(String player);


}
