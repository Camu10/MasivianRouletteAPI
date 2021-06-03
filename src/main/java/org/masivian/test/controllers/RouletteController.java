package org.masivian.test.controllers;
import org.masivian.test.exceptions.RouletteException;
import org.masivian.test.model.Bet;
import org.masivian.test.services.RouletteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class RouletteController {
    @Autowired
    private RouletteServices rouletteServices;
    @RequestMapping( value = "/addRoulette", method = RequestMethod.POST )
    public ResponseEntity<?> createRoulette(){
        int id = rouletteServices.createRoulette();

        return new ResponseEntity<>(id, HttpStatus.CREATED);
    }
    @RequestMapping( value = "/open/{idRoulette}", method = RequestMethod.PATCH )
    public ResponseEntity<?> openRoulette(@PathVariable int idRoulette){
        try {
            rouletteServices.openRoulette(idRoulette);

            return new ResponseEntity<>(HttpStatus.ACCEPTED);
        } catch (RouletteException e) {

            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping( value = "/addBet/{idRoulette}", method = RequestMethod.POST )
    public ResponseEntity<?> addBetToRoulette( @PathVariable int idRoulette, @RequestBody Bet bet, @RequestHeader("idUser") int idUser) {
        bet.setIdUser(idUser);
        try {
            rouletteServices.addBetToRoulette(bet, idRoulette);
        } catch (RouletteException e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping( value = "/closeRoulette/{idRoulette}", method = RequestMethod.GET )
    public ResponseEntity<?> closeRoulette( @PathVariable int idRoulette) {
        try {

            return new ResponseEntity<>(rouletteServices.closeRoulette(idRoulette),HttpStatus.OK);
        } catch (RouletteException e) {

            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping( value = "/allRoulettes", method = RequestMethod.GET )
    public ResponseEntity<?> getAllRoulettes() {

        return new ResponseEntity<>(rouletteServices.getAllRoulettes(),HttpStatus.OK);
    }
}