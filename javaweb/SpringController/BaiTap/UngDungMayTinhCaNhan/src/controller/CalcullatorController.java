package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcullatorController {
    @GetMapping("/calculator")
    public String calculator(@RequestParam String num1, String num2, String operand, Model model) {
        switch (operand){
            case "Addition(+)":
                model.addAttribute("result", (Double.parseDouble(num1) + Double.parseDouble(num2)));
                break;
            case "Subtraction(-)":
                model.addAttribute("result", (Double.parseDouble(num1) - Double.parseDouble(num2)));
                break;
            case "Multiplication(x)":
                model.addAttribute("result", (Double.parseDouble(num1) * Double.parseDouble(num2)));
                break;
            case "Division(:)":
                model.addAttribute("result", (Double.parseDouble(num1) / Double.parseDouble(num2)));
                break;
        }
        return "index";
    }
}
