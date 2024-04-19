package pro.sky.calculator.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {

    @GetMapping(value = "/calculator", produces = MediaType.TEXT_HTML_VALUE)
    public String calculator() {
        return "<h1>Добро пожаловать в калькулятор!</h1>";
    }

    @GetMapping(value = "/plus", produces = MediaType.TEXT_HTML_VALUE)
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null){
            return "<p style=\"color: red\">Параметр num1 не передан!</p>";
        } else if (num2 == null) {
            return "<p style=\"color: red\">Параметр num2 не передан!</p>";
        } else {
          return num1 + " + " + num2 + " = " + (num1+num2);
        }
    }

    @GetMapping(value = "/minus", produces = MediaType.TEXT_HTML_VALUE)
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null){
            return "<p style=\"color: red\">Параметр num1 не передан!</p>";
        } else if (num2 == null) {
            return "<p style=\"color: red\">Параметр num2 не передан!</p>";
        } else {
            return num1 + " - " + num2 + " = " + (num1-num2);
        }
    }

    @GetMapping(value = "/multiply", produces = MediaType.TEXT_HTML_VALUE)
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null){
            return "<p style=\"color: red\">Параметр num1 не передан!</p>";
        } else if (num2 == null) {
            return "<p style=\"color: red\">Параметр num2 не передан!</p>";
        } else {
            return num1 + " * " + num2 + " = " + (num1*num2);
        }
    }

    @GetMapping(value = "/divide", produces = MediaType.TEXT_HTML_VALUE)
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2) {
        if (num1 == null){
            return "<p style=\"color: red\">Параметр num1 не передан!</p>";
        } else if (num2 == null) {
            return "<p style=\"color: red\">Параметр num2 не передан!</p>";
        } else if (num2 == 0) {
            return "<p style=\"color: red\">На 0 делить нельзя!</p>";
        } else {
            return num1 + " / " + num2 + " = " + (num1/num2);
        }
    }
}
