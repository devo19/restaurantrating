package co.grandcircus.restaurantrating;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RatingController {
	
	@Autowired
	private RestaurantRepository dao;	
	
	
	@RequestMapping("/")
	public ModelAndView list() {
		List<RestaurantEntity> leListOfProducts = dao.findAll();
		return new ModelAndView("index", "rrating", leListOfProducts);
	}
	

}
