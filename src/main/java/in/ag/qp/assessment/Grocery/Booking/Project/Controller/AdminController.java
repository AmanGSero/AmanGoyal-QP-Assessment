package in.ag.qp.assessment.Grocery.Booking.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ag.qp.assessment.Grocery.Booking.Project.Entity.GroceryItem;
import in.ag.qp.assessment.Grocery.Booking.Project.Service.GroceryService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

    @Autowired
    private GroceryService groceryService;

    @PostMapping("/items")
    public GroceryItem addItem(@RequestBody GroceryItem item) {
        return groceryService.addItem(item);
    }

    @GetMapping("/items")
    public List<GroceryItem> getAllItems() {
        return groceryService.getAllItems();
    }

    @PutMapping("/items/{id}")
    public GroceryItem updateItem(@PathVariable Long id, @RequestBody GroceryItem item) {
        return groceryService.updateItem(id, item);
    }

    @DeleteMapping("/items/{id}")
    public ResponseEntity<?> deleteItem(@PathVariable Long id) {
        groceryService.deleteItem(id);
        return ResponseEntity.ok().build();
    }
}
