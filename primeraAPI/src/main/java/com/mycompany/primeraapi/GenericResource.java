package com.mycompany.primeraapi;

import jakarta.enterprise.context.RequestScoped;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author adolfo
 */
@Path("generic")
@RequestScoped
public class GenericResource {

    @Context
    private UriInfo context;

    public GenericResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAlumno(@QueryParam("id") String id, @QueryParam("nombre") String nombre, @QueryParam("asignaturas") String[]asignaturas, @QueryParam("calificaciones") int[]calificaciones) {
        calificaciones[] listaCalificaciones = new calificaciones[3];
        alumno Alumno = new alumno(id, nombre, listaCalificaciones);
        
        for(int i=0; i<3; i++){
            listaCalificaciones[i].setAsignatura(asignaturas[i]);
            listaCalificaciones[i].setCalificacion(calificaciones[i]);
        }
        Json json = new Json();
        json.setAlumno(Alumno);
        Gson gson = new Gson();
        String JsonString = gson.toJson(json);
        return JsonString;
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
