package in.ag.qp.assessment.Grocery.Booking.Project.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ag.qp.assessment.Grocery.Booking.Project.Entity.GroceryItem;
import in.ag.qp.assessment.Grocery.Booking.Project.Service.GroceryService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private GroceryService groceryService;

    @GetMapping("/items")
    public List<GroceryItem> getAllItems() {
        return groceryService.getAllItems();
    }
}

