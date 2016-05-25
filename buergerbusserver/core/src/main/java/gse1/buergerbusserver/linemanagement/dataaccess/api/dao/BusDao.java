package gse1.buergerbusserver.linemanagement.dataaccess.api.dao;

import java.util.List;

import gse1.buergerbusserver.general.dataaccess.api.dao.ApplicationDao;
import gse1.buergerbusserver.linemanagement.common.api.Line;
import gse1.buergerbusserver.linemanagement.dataaccess.api.BusEntity;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * {@link ApplicationDao Data Access Object} for {@link BusEntity} entity.
 *
 * @author ricarda42
 *
 */
public interface BusDao extends ApplicationDao<BusEntity>, MasterDataDao<BusEntity> {

  /**
   * Returns a list of all {@link BusEntity} serving the {@link Line} as given by lineId
   *
   * @param lineId
   * @return {@link List} of buses serving line with given lineId
   */
  List<BusEntity> getBusesOnLine(Long lineId);

}
