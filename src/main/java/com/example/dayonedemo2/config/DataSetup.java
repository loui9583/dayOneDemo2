package com.example.dayonedemo2.config;

import com.example.dayonedemo2.entity.Player;
import com.example.dayonedemo2.repository.PlayerRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DataSetup implements ApplicationRunner {

    public DataSetup(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    PlayerRepository playerRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Lionel Messi", "Argentina", "Forward"));
        players.add(new Player("Cristiano Ronaldo", "Portugal", "Forward"));
        players.add(new Player("Neymar Jr.", "Brazil", "Forward"));
        players.add(new Player("Kylian Mbappé", "France", "Forward"));
        players.add(new Player("Robert Lewandowski", "Poland", "Forward"));
        players.add(new Player("Kevin De Bruyne", "Belgium", "Midfielder"));
        players.add(new Player("Karim Benzema", "France", "Forward"));
        players.add(new Player("Erling Haaland", "Norway", "Forward"));
        players.add(new Player("Bruno Fernandes", "Portugal", "Midfielder"));
        players.add(new Player("Joshua Kimmich", "Germany", "Midfielder"));
        players.add(new Player("Virgil van Dijk", "Netherlands", "Defender"));
        players.add(new Player("Sergio Ramos", "Spain", "Defender"));
        players.add(new Player("Mohamed Salah", "Egypt", "Forward"));
        players.add(new Player("Sadio Mané", "Senegal", "Forward"));
        players.add(new Player("Manuel Neuer", "Germany", "Goalkeeper"));
        players.add(new Player("Alisson Becker", "Brazil", "Goalkeeper"));
        players.add(new Player("Thiago Silva", "Brazil", "Defender"));
        players.add(new Player("Harry Kane", "England", "Forward"));
        players.add(new Player("Raheem Sterling", "England", "Forward"));
        players.add(new Player("Luka Modrić", "Croatia", "Midfielder"));
        players.add(new Player("Gianluigi Donnarumma", "Italy", "Goalkeeper"));
        players.add(new Player("Toni Kroos", "Germany", "Midfielder"));
        players.add(new Player("Jadon Sancho", "England", "Forward"));
        players.add(new Player("Marquinhos", "Brazil", "Defender"));
        players.add(new Player("N'Golo Kanté", "France", "Midfielder"));
        playerRepository.saveAll(players);
    }
}
