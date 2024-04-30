package org.example.repositories;


import lombok.Getter;
import lombok.Setter;
import org.example.models.Gate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
@Getter
@Setter

@Repository
public class GateRepository {
    private Map<Long, Gate> gates = new HashMap<>();

    public Optional<Object> findById(long gateId) {
        if(gates.containsKey(gateId)) {
            return Optional.of(gates.get(gateId));
        }
        return Optional.empty();
    }
}