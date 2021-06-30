package com.nikolayvaklinov.tacocloud.data;

import com.nikolayvaklinov.tacocloud.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}
