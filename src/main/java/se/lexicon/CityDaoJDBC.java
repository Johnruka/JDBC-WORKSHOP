package se.lexicon;

import java.util.List;

public class CityDaoJDBC implements CityDao {

    public static void main(String[] args) {

    }

    @Override
    public City findById(int id) {
        return null;
    }

    @Override
    public List<City> findByCode(String code) {
        return List.of();
    }

    @Override
    public List<City> findByName(String name) {
        return List.of();
    }

    @Override
    public List<City> findAll() {
        return List.of();
    }

    @Override
    public City add(City city) {
        return null;
    }

    @Override
    public int delete(City city) {
        return 0;
    }
}
