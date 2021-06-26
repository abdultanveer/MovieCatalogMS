package dnc.sp.ms.mcatalog.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dnc.sp.ms.mcatalog.model.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		return Arrays.asList(
				new CatalogItem("firstmovie", "first movie desc", 1),
				new CatalogItem("secondmovie", "second movie desc", 2)

				);

	}

}
