package se.lexicon;

import java.util.List;

public interface CityDao {

    city findById(int id);

    String findByCode(String code);

    String findByName(String name);

    List<city> findAll();

    city add(city city);

    int delete(city city);

}

