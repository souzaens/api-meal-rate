package br.com.fiap.eduardo.mealrate.api;

import br.com.fiap.eduardo.mealrate.entity.Rate;
import br.com.fiap.eduardo.mealrate.repository.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/rates")
public class RateRestController {

    @Autowired
    private RateRepository rateRepository;

    @PostMapping
    public Rate createRate(@RequestBody Rate rate) {
        return rateRepository.save(rate);

    }

    @GetMapping
    public List<Rate> getRates() {
        return rateRepository.findAll();
    }

    @GetMapping("/{id}")
    public Rate getRateById(@PathVariable Integer id){
        return rateRepository.findById(id).orElseThrow();
    }
}
