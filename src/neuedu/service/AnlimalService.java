package neuedu.service;

import neuedu.dao.AnlimalDao;
import neuedu.dao.IanlimalDao;
import neuedu.pojo.Anlimal;

import java.util.List;

public class AnlimalService implements IanlimalService {
//    AnlimalDao anlimalDao = new AnlimalDao();
//    IanlimalDao anlimalDao =null;
      IanlimalDao anlimalDao = new AnlimalDao();
    @Override
    public List<Anlimal> querry() {
        return anlimalDao.querry();
    }

    @Override
    public int add(Anlimal anlimal) {
        return anlimalDao.add(anlimal);
    }

    @Override
    public int update(Anlimal anlimal) {
        return anlimalDao.update(anlimal);
    }

    @Override
    public int del(int id) {
        return anlimalDao.del(id);
    }

    @Override
    public Anlimal querry(int id) {
        return null;
    }
}
