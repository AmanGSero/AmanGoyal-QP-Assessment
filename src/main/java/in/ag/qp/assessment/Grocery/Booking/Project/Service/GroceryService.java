package in.ag.qp.assessment.Grocery.Booking.Project.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ag.qp.assessment.Grocery.Booking.Project.Entity.GroceryItem;
import in.ag.qp.assessment.Grocery.Booking.Project.repository.GroceryItemRepository;

@Service
public class GroceryService {

    @Autowired
    private GroceryItemRepository repository;

    public GroceryItem addItem(GroceryItem item) {
        return repository.save(item);
    }

    public List<GroceryItem> getAllItems() {
        return repository.findAll();
    }

    public GroceryItem updateItem(Long id, GroceryItem itemDetails) {
        GroceryItem item = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found with id " + id));
        item.setName(itemDetails.getName());
        item.setPrice(itemDetails.getPrice());
        item.setQuantity(itemDetails.getQuantity());
        return repository.save(item);
    }

    public void deleteItem(Long id) {
        repository.deleteById(id);
    }
}
