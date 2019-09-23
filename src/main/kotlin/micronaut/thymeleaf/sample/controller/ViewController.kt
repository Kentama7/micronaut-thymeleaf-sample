package micronaut.thymeleaf.sample.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.views.ModelAndView
import io.micronaut.views.View
import micronaut.thymeleaf.sample.pojo.Pet

@Controller
class ViewController {
    @Get
    @View("index")
    fun index() = HttpResponse.ok<String>()

    @Get("modelandview")
    fun modelAndView() = ModelAndView("index", "")

    @Get("pojo")
    @View("pet")
    fun pojo() = HttpResponse.ok(Pet("taro", 10))

    @Get("map")
    @View("pet")
    fun map() = HttpResponse.ok(mapOf("name" to "jiro", "age" to 2))

    @Get("modelandviewpojo")
    fun modelAndViewAndPojo() = ModelAndView("pet", Pet("saburo", 3))
}