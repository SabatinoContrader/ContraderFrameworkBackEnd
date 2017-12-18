package it.contrader.sprint4.converter;

import it.contrader.sprint4.dto.GommaDTO;
import it.contrader.sprint4.model.GommaEntity;
import org.springframework.stereotype.Component;

@Component
public class GommaConverter implements Converter<GommaEntity, GommaDTO> {


    public GommaDTO convertToDTO (GommaEntity gommaEntity) {
        return new GommaDTO(gommaEntity.getModel(), gommaEntity.getManufacturer(), gommaEntity.getPrice());
    }

    public GommaEntity convertToEntity (GommaDTO gommaDTO) {
        GommaEntity gommaEntity = new GommaEntity();
        gommaEntity.setModel(gommaDTO.getModel());
        gommaEntity.setManufacturer(gommaDTO.getManufacturer());
        gommaEntity.setPrice(gommaDTO.getPrice());
        return gommaEntity;
    }
}
