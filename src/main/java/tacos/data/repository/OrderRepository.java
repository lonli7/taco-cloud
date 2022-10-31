package tacos.data.repository;

import tacos.model.Order;

public interface OrderRepository {
    Order save(Order order);
}
