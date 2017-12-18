package it.contrader.sprint4.service;

import it.contrader.sprint4.dao.GommaRepository;
import it.contrader.sprint4.model.GommaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GommaService {

    private GommaRepository gommaRepository;

    @Autowired
    public GommaService(GommaRepository gommaRepository) {
        this.gommaRepository = gommaRepository;
    }

    public List<GommaEntity> getAllGomme() {
        return this.gommaRepository.findAll();
    }

    public List<GommaEntity> findByManufacturer(String manufacturer) {
        return this.gommaRepository.findByManufacturer(manufacturer);
    }

    public GommaEntity insertGomma(GommaEntity gomma) {
        return this.gommaRepository.save(gomma);
    }

}
