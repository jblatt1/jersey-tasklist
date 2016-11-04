package tasklist.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import tasklist.model.TaskList;

@Path("/lists")
public class TaskListResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTaskList(TaskList taskList) {
        return null;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllLists() {
        return null;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getList(@PathParam("id") String id) {
        return null;
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateList(@PathParam("id") String id, TaskList tasklist) {
        return null;
    }

}