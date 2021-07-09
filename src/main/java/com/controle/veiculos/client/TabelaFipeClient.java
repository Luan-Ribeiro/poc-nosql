package com.controle.veiculos.client;


import com.controle.veiculos.response.VeiculoModelosResponse;
import com.controle.veiculos.response.VeiculoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;

@FeignClient(name = "veiculoService", url = "https://parallelum.com.br/fipe/api/v1/carros/marcas")
public interface TabelaFipeClient {

    @RequestMapping(method = RequestMethod.GET, consumes = "application/json")
    List<VeiculoResponse> getMarcas();

    @RequestMapping(method = RequestMethod.GET, value = "/{idMarca}/modelos", consumes = "application/json")
    VeiculoModelosResponse getModelos(@PathVariable("idMarca") String idMarca);

    @RequestMapping(method = RequestMethod.GET, value = "/{idMarca}/modelos/{idModelo}/anos", consumes = "application/json")
    List<VeiculoResponse> getAnos(@PathVariable("idMarca") String idMarca, @PathVariable("idModelo") String idModelo);

    @RequestMapping(method = RequestMethod.GET, value = "/{idMarca}/modelos/{idModelo}/anos/{idAno}", consumes = "application/json")
    HashMap<String, String> getValor(@PathVariable("idMarca") String idMarca, @PathVariable("idModelo") String idModelo, @PathVariable("idAno") String idAno);

}
