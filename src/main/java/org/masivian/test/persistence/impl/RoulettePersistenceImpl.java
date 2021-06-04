package org.masivian.test.persistence.impl;
import org.masivian.test.model.Roulette;
import org.masivian.test.persistence.RoulettePersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Repository
public class RoulettePersistenceImpl implements RoulettePersistence {
    @Autowired
    private RedisTemplate<String, Roulette> redisTemplate;
    private HashOperations  hashOperations;
    private static final String KEY = "ROULETTE";
    public RoulettePersistenceImpl(RedisTemplate redisTemplate){
        this.redisTemplate = redisTemplate;
    }
    @PostConstruct
    private void init() {
        hashOperations = redisTemplate.opsForHash();
    }
    @Override
    public void saveRoulette(Roulette roulette) {
        hashOperations.put(KEY, roulette.getId(), roulette);
    }
    @Override
    public Roulette getRouletteById(long id) {
        Roulette roulette;
        roulette = (Roulette) hashOperations.get(KEY, id);

        return roulette;
    }
    @Override
    public List<Roulette> getAllRoulettes() {
        Map<String, Roulette> roulettes =hashOperations.entries(KEY);
        List<Roulette> roulettes1 = new ArrayList<>();
        roulettes.forEach((k,v) -> roulettes1.add(v));

        return roulettes1;
    }
}