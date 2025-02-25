package com.stefanini.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class TextoComMaisDeUmaLetraMapper implements ExceptionMapper<TextoComMaisDeUmaLetraException> {

    @Override
    public Response toResponse(TextoComMaisDeUmaLetraException exception) {
        return Response.status(Status.BAD_REQUEST).entity(exception.getMessage()).build(); 
    }
    
}
