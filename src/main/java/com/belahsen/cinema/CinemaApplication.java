package com.belahsen.cinema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.belahsen.cinema.entities.*;
import com.belahsen.cinema.services.*;


@SpringBootApplication
public class CinemaApplication implements CommandLineRunner {
    @Autowired
    private ICinemaInitService cinemaInitService;

    @Autowired
    private RepositoryRestConfiguration restConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Film.class, Salle.class, Ticket.class);
        /*cinemaInitService.initVilles();
        cinemaInitService.initCinema();
        cinemaInitService.initSalles();
        cinemaInitService.initPlaces();
        cinemaInitService.initSeances();
        cinemaInitService.initCategories();
        cinemaInitService.initFilms();
        cinemaInitService.initProjections();
        cinemaInitService.initTickets();*/
        System.out.println("Complete!!  ");
    }

	public ICinemaInitService getCinemaInitService() {
		return cinemaInitService;
	}

	public void setCinemaInitService(ICinemaInitService cinemaInitService) {
		this.cinemaInitService = cinemaInitService;
	}
}
