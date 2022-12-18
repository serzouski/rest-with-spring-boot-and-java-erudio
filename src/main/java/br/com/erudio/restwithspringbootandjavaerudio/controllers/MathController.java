package br.com.erudio.restwithspringbootandjavaerudio.controllers;

import br.com.erudio.restwithspringbootandjavaerudio.converters.NumberConverter;
import br.com.erudio.restwithspringbootandjavaerudio.exceptions.UnsupportedMathOperationException;
import br.com.erudio.restwithspringbootandjavaerudio.math.MathValidator;
import br.com.erudio.restwithspringbootandjavaerudio.math.SimpleMath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {


    private SimpleMath math = new SimpleMath();

    private static AtomicLong id = new AtomicLong();

    @GetMapping ("/sum/{numberOne}/{numberTwo}")
    public Double soma(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception{
            validator(numberOne, numberTwo);
            return math.soma(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

    }

    @GetMapping ("/sub/{numberOne}/{numberTwo}")
    public Double subtracao(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception{
            validator(numberOne, numberTwo);
            return math.subtracao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

    }

    @GetMapping ("/mul/{numberOne}/{numberTwo}")
    public Double multiplicacao(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception{
            validator(numberOne, numberTwo);
            return math.multiplicacao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

    }

    @GetMapping ("/div/{numberOne}/{numberTwo}")
    public Double divisao(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception{
            validator(numberOne, numberTwo);
            return math.divisao(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));

    }

    @GetMapping ("/squar/{numberOne}")
    public Double raizCadrada(
            @PathVariable(value = "numberOne") String numberOne
            ) throws Exception{
             validator(numberOne,"0");
            return math.raizCadrada(NumberConverter.convertToDouble(numberOne));

    }


    @GetMapping ("/med/{numberOne}/{numberTwo}")
    public Double media(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception{
            validator(numberOne,numberTwo);
            return (NumberConverter.convertToDouble(numberOne) + NumberConverter.convertToDouble(numberTwo)) / 2;


    }

    private void validator(String numberOne, String numberTwo){
        if(!MathValidator.validateNumeric(numberOne, numberTwo)){
            throw new  UnsupportedMathOperationException("não é numero, seu animal");
        }
        if(!MathValidator.validatePositive(numberOne)){
            throw new UnsupportedMathOperationException("não pode negativo, burro");
        }
    }
}
