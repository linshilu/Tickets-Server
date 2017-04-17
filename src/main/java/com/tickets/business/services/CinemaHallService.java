package com.tickets.business.services;

import com.tickets.business.entities.CinemaHall;
import com.tickets.business.entities.repositories.CinemaHallRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by CrazeWong on 2017/4/16.
 */
@Service
public class CinemaHallService {
    private static final Logger LOG = LoggerFactory.getLogger(CinemaHallService.class);

    @Autowired
    private CinemaHallRepository cinemaHallRepo;

    public CinemaHallService() {
        super();
    }

    /**
     * Get the cinemaHall entity whose ID equals to
     * @param cinemaHallID
     * @return the cinemaHall entity
     */
    public CinemaHall getCinemaHall(Integer cinemaHallID) {
        return cinemaHallRepo.findOne(cinemaHallID);
    }

}