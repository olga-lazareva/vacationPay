package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Map;

@Controller
public class HolidayPayController {

    @GetMapping("/calculate")
    public String calculate(
            @RequestParam(name="salary") String salary,
            @RequestParam(name="numberOfDays") String numbers,
            Map<String, Object> model
    )
    {
        model.put("result", checkParam(salary, numbers));
        model.put("salary", salary);
        model.put("numbers", numbers);
        return "index";
    }

    @RequestMapping("/")
    public String index(Map<String, Object> model)
    {
        model.put("result", "");
        model.put("salary", "");
        model.put("numbers", "");
        return "index";
    }

    private String checkParam(String salary, String number)
    {
        if (salary.equals(""))
        {
            return "Введите среднюю заработную плату";
        }
        if (number.equals(""))
        {
            return "Введите количество дней отпуска";
        }
        try
        {
            float sal = Float.parseFloat(salary);
            int num = Integer.parseInt(number);
            HolidayPay holidayPay = new HolidayPay(sal, num);
            return "Ваши отпускниые составят: " +
                String.format("%.2f", holidayPay.getVacationPay()) +
                " рублей";
        }
        catch (NumberFormatException ex)
        {
            return "Ошибка при вводе числа";
        }
    }


}
