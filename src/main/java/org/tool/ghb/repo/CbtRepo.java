package org.tool.ghb.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.tool.ghb.entity.Cbt;
import org.tool.ghb.entity.CbtId;

public interface CbtRepo extends PagingAndSortingRepository<Cbt, CbtId> {

}
