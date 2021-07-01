package com.nikolayvaklinov.tacocloud.data;

import com.nikolayvaklinov.tacocloud.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<Order, Long> {

}
