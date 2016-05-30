package gse1.buergerbusserver.schedulemanagement.service.api.rest;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import gse1.buergerbusserver.schedulemanagement.logic.api.to.ScheduleEto;
import gse1.buergerbusserver.schedulemanagement.logic.api.to.StopEto;

/**
 * TODO mbaniasad This type ...
 *
 * @author mbaniasad
 * @since 0.1
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/schedulemanagement/v1")
public interface SchedulemanagementRestService {

  
  public List<StopEto> getAllStops();

  @GET
  @Path("/schedules/")
  List<ScheduleEto> getAllSchedules();
  
//  @GET 
//  @Path("/stopsWithSchedules/")
//  
  @GET
  @Path("/stops/")
  HashMap<String,Object> GetAllStopsWithSchedules();
}
