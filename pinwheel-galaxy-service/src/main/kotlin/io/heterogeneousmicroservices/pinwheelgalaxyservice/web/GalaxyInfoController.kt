package io.heterogeneousmicroservices.pinwheelgalaxyservice.web

import io.heterogeneousmicroservices.pinwheelgalaxyservice.model.GalaxyInfo
import io.heterogeneousmicroservices.pinwheelgalaxyservice.service.GalaxyInfoService
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/galaxy-info")
class GalaxyInfoController(
        private val galaxyInfoService: GalaxyInfoService
) {

    @Get(processes = [MediaType.APPLICATION_JSON])
    fun index(): GalaxyInfo = galaxyInfoService.get()
}