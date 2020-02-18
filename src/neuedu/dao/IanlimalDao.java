package neuedu.dao;

import neuedu.pojo.Anlimal;

import java.util.List;

public interface IanlimalDao {
    List<Anlimal> querry();
    int add(Anlimal anlimal);
    int update(Anlimal anlimal);
    int del(int id);
    Anlimal querry(int id);//查单个
}
