package nvc.it.ice_factory_suphakit.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import nvc.it.ice_factory_suphakit.model.Camera;

public interface CameraRepository extends MongoRepository<Camera,String> {
    
}
