import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AutoSalonService {

    private List<Car> cars = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    // Поиск автомобилей по марке (одна из требуемых операций)
    public List<Car> findCarsByBrand(String brand) {
        return cars.stream()
                .filter(car -> car.getMake().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    // Фильтрация клиентов по бюджету (вторая требуемая операция)
    public List<Client> filterClientsByBudget(double minBudget) {
        return clients.stream()
                .filter(client -> client.getBudget() >= minBudget)
                .collect(Collectors.toList());
    }
}