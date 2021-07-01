package com.nikolayvaklinov.tacocloud.data;

import com.nikolayvaklinov.tacocloud.Order;
import com.nikolayvaklinov.tacocloud.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository
        extends CrudRepository<Order, Long> {

    List<Order> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);

  /*
  List<Order> findByUserOrderByPlacedAtDesc(User user);
   */

}
