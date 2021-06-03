package org.masivian.test.controllers;
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

    public ResponseEntity<?> createRoulette(){
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @RequestMapping( value = "/open/{idRoulette}", method = RequestMethod.PATCH )
    public ResponseEntity<?> openRoulette(@PathVariable int idRoulette){
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @RequestMapping( value = "/addBet/{idRoulette}", method = RequestMethod.POST )
    public ResponseEntity<?> addBetToRoulette(@PathVariable int idRoulette, @RequestBody Bet bet, @RequestHeader("idUser") int idUser) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping( value = "/closeRoulette/{idRoulette}", method = RequestMethod.GET )
    public ResponseEntity<?> closeRoulette( @PathVariable int idRoulette) {
        return new ResponseEntity<>(rouletteServices.closeRoulette(idRoulette),HttpStatus.OK);
    }
    @RequestMapping( value = "/allRoulettes", method = RequestMethod.GET )
    public ResponseEntity<?> getAllRoulettes() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
