package com.potatosaucevfx.thymeleaf.controllers;

import java.util.Locale;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.core.Local;
import org.springframework.context.i18n.LocaleContext;
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

        Locale loc = LocaleContextHolder.getLocale();
        ModelAndView mav = new ModelAndView("index");

        if (name == null) {
            name = "World";
        }

        logger.info(loc.getLanguage());

        mav.addObject("name", name);
        mav.addObject("someText", "Welcome to the site!");

        return mav;
    }

}
