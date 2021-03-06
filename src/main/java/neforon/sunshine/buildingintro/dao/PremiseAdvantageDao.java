package neforon.sunshine.buildingintro.dao;

import neforon.sunshine.buildingintro.vo.PremiseAdvantageItemVo;
import neforon.sunshine.model.PremiseAdvantageItem;

import java.util.List;

/**
 * Created by sunshine on 4/13/15.
 */
public interface PremiseAdvantageDao {
    public List<PremiseAdvantageItemVo> selectPremiseAdvantageById(String projectId);

    public boolean insertPremiseAdvantageItem(PremiseAdvantageItem item);
}
