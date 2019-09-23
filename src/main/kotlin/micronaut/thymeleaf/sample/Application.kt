package micronaut.thymeleaf.sample

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("micronaut.thymeleaf.sample")
                .mainClass(Application.javaClass)
                .start()
    }
}