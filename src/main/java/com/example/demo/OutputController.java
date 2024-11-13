package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.print.DocFlavor;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
public class OutputController {

    //Spring boot REST API with Request Param
    //http://localhost: 8080/students?id=1
    @GetMapping("outputs/query")
    public Output requestVariable(@RequestParam String input)
    {
        LocalTime time= LocalTime.now();
        String theTime = String.valueOf(time);
        return new Output(input,theTime);
    }

    @GetMapping("access_control/query")
    public Output Access_Control(@RequestParam String input)
    {

        LocalTime time= LocalTime.now();
        String theTime = String.valueOf(time);
        return new Output(input,theTime);
    }

    @GetMapping("request_limit/query")
    public Output RequestLimit(@RequestParam String input)
    {

        LocalTime time= LocalTime.now();
        String theTime = String.valueOf(time);
        return new Output(input,theTime);
    }


}
