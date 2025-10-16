package com.example.autosalon;

import com.example.autosalon.AutoSalonService;
import com.example.autosalon.Car;
import com.example.autosalon.Client;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Инициализируем сервис
        AutoSalonService service = new AutoSalonService();

        // Добавляем тестовые данные
        service.addCar(new Car("Toyota", "Camry", 2022, 35000.0));
        service.addCar(new Car("Honda", "CR-V", 2023, 32000.0));
        service.addCar(new Car("Toyota", "Corolla", 2021, 25000.0));

        service.addClient(new Client("Иван Иванов", "ivan@example.com", 40000.0));
        service.addClient(new Client("Мария Петрова", "maria@example.com", 30000.0));
        service.addClient(new Client("Петр Сидоров", "petr@example.com", 60000.0));

        // Демонстрация работы: Поиск автомобилей по марке
        System.out.println("=== Поиск автомобилей Toyota ===");
        List<Car> toyotaCars = service.findCarsByBrand("Toyota");
        for (Car car : toyotaCars) {
            System.out.println(car);
        }

        // Демонстрация работы: Фильтрация клиентов по бюджету
        System.out.println("\n=== Клиенты с бюджетом >= 35000 ===");
        List<Client> clientsWithBudget = service.filterClientsByBudget(35000.0);
        for (Client client : clientsWithBudget) {
            System.out.println(client);
        }
    }
}