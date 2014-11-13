package ph.edu.ust.jakearroyo.soccr101.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import ph.edu.ust.jakearroyo.soccr101.db.Org;

import ph.edu.ust.jakearroyo.soccr101.db.OrgDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig orgDaoConfig;

    private final OrgDao orgDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        orgDaoConfig = daoConfigMap.get(OrgDao.class).clone();
        orgDaoConfig.initIdentityScope(type);

        orgDao = new OrgDao(orgDaoConfig, this);

        registerDao(Org.class, orgDao);
    }
    
    public void clear() {
        orgDaoConfig.getIdentityScope().clear();
    }

    public OrgDao getOrgDao() {
        return orgDao;
    }

}
