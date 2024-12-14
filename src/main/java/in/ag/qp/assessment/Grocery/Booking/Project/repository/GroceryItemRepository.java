package in.ag.qp.assessment.Grocery.Booking.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ag.qp.assessment.Grocery.Booking.Project.Entity.GroceryItem;

public interface GroceryItemRepository extends JpaRepository<GroceryItem, Long> {
	
}
