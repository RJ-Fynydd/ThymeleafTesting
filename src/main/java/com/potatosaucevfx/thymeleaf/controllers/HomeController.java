package com.potatosaucevfx.thymeleaf.controllers;

import com.potatosaucevfx.thymeleaf.models.Book;
import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author PotatoSauceVFX
 */
@Controller
public class HomeController {

    // Logger for class.
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // Controller
    @RequestMapping(value = {"/", "/index", "/home"}, method = RequestMethod.GET)
    public ModelAndView getHomePage(HttpServletRequest request, HttpServletResponse response,
            @RequestParam(name = "name", required = false) String name) {

        Book bookOne = new Book(0, "A lonely Potato", "RJ Nader");

        Locale loc = LocaleContextHolder.getLocale();
        ModelAndView mav = new ModelAndView("index");

        if (name == null) {
            name = "World";
        }

        logger.info(loc.getLanguage());

        mav.addObject("bookOne", bookOne);
        mav.addObject("name", name);
        mav.addObject("someText", "Welcome to the site!");

        return mav;
    }

    @RequestMapping(value = "/index2")
    public ModelAndView getHomePage2(HttpServletRequest request, HttpServletResponse response,
            @RequestParam(name = "name", required = false) String name) {

        ModelAndView mav = new ModelAndView("index2");

        return mav;
    }

}
