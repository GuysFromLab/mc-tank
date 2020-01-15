package company18.mctank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import company18.mctank.forms.DataStacked;
import company18.mctank.service.OrdersService;


@Controller
public class BillController {
	
	@Autowired
	OrdersService ordersService;
	
	@GetMapping(value = "/bill")
	String rechnung(Model model) {
		model.addAttribute("bill", ordersService.findAll());
		return "bill";
	}
	
	/*@GetMapping("/api/orders/stacked")
	@ResponseBody
	public DataStacked getStackedData(){
		DataStacked data = ordersService.stackData();
		return data;
	} */

}


