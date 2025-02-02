﻿using Entities;

namespace ASP_Core_WebAPI.RepositoryContracts;

public interface IOrderRepository
{
    //Task<List<Order>> GetAllOrders();
    Task<Order> AddOrderAsync(Order order);
    Task<List<Order>> GetOrdersByStatus(OrderStatus status);
    Task<Order?> GetOrderByIdAsync(int id);
    Task UpdateOrderAsync(Order order);
}