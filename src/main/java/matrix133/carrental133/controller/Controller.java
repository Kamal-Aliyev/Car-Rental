package matrix133.carrental133.controller;


import matrix133.carrental133.dto.CarDto;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
        @RequestMapping(value = "/car-price" , method = RequestMethod.GET)
        public String getCarPrice (){
            return "car-price";
        }
        @RequestMapping(value = "/sign-car", method = RequestMethod.POST)
        public ModelAndView addCar(@ModelAttribute CarDto carDto){
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("car-data");
            modelAndView.addObject("car",carDto);
            return modelAndView;
        }
}
