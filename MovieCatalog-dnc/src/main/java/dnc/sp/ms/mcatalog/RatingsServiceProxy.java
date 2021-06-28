package dnc.sp.ms.mcatalog;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import dnc.sp.ms.mcatalog.model.UserRating;

@FeignClient(name="ratings-service" )//Service Id of rating service
public interface RatingsServiceProxy {
   
	@RequestMapping("/ratingsdata/users/{userId}")
    public UserRating getUserRating(@PathVariable(value="userId") String userId);
   
	

}