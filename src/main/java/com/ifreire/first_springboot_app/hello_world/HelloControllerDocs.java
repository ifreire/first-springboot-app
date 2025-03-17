package com.ifreire.first_springboot_app.hello_world;

//import io.swagger.v3.oas.annotations.Operation;

import org.springframework.http.ResponseEntity;

public interface HelloControllerDocs {

    //@Operation(
    //        summary = "Busca prévias de CNABs ou CNABs 240 cadastradas no sistema",
    //        description = "Recurso usado para buscar as (Remessas & Prévias) de Pagamento do sistema numa listagem."
    //)
    //@DefaultSwaggerParameters
    //@DefaultSwaggerResponses
    //@ApiResponse(
    //        responseCode = HTTP_OK + " \uD83D\uDE04",
    //        content = @Content(
    //                mediaType = APPLICATION_JSON_VALUE,
    //                schema = @Schema(implementation = RemessaPagamentoPaginationResponseDTO.class)
    //        ),
    //        description = "A sua requisição foi bem sucedida."
    //)
    public ResponseEntity<String> hello();
}
