package io.crnk.example.service.jpa;

import io.crnk.jpa.JpaEntityRepositoryBase;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class PersonRepository extends JpaEntityRepositoryBase<PersonEntity, UUID> {

    public PersonRepository() {
        super(PersonEntity.class);
    }

    @Override
    public PersonEntity save(PersonEntity entity) {
        // add your save logic here
        return super.save(entity);
    }

    @Override
    public PersonEntity create(PersonEntity entity) {
        // add your create logic here
        return super.create(entity);
    }

    @Override
    public void delete(UUID id) {
        // add your save logic here
        super.delete(id);
    }
}
