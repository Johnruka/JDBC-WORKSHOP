package se.lexicon;

import se.lexicon.db.MySQLConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static java.util.random.RandomGeneratorFactory.all;

public class CityDaoJDBC implements CityDao {

    public static void main(String[] args) {

    }

    @Override
    public city findById(int id) {
        try (
                Connection connection = MySQLConnection.getConnection();

                PreparedStatement preparedStatement = connection.prepareStatement("select * from City where id = ?");
        ) {

            int inputId = 1;
            preparedStatement.setInt(1, inputId);

            try (

                    ResultSet resultSet = preparedStatement.executeQuery();

            ) {

                city city = null;
                if (resultSet.next()) {
                    int Cityid = resultSet.getInt(1);
                    String name = resultSet.getString(1);
                    String countryCode = resultSet.getString(1);
                    String District = resultSet.getString(1);
                    int Population = resultSet.getInt(1);
                    city = new city(id, name, countryCode, District, Population);
                }
                System.out.println(city);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String findByCode(String code) {
        try (
                Connection connection = MySQLConnection.getConnection();

                PreparedStatement preparedStatement = connection.prepareStatement("select * from City where code = ?");
        ) {

            String inputcode = "NFL";
            preparedStatement.setString(1, inputcode);

            try (

                    ResultSet resultSet = preparedStatement.executeQuery();

            ) {

                city city = null;
                if (resultSet.next()) {
                    int CityId = resultSet.getInt(1);
                    String name = resultSet.getString(1);
                    String countryCode = resultSet.getString(1);
                    String District = resultSet.getString(1);
                    int Population = resultSet.getInt(1);
                    city city1 = new city(CityId, name, countryCode, District, Population);
                }
                System.out.println(city);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public String findByName(String name) {
        return name;
    }

    @Override
    public List<city> findAll() {
        return (List<city>) all();
    }

    @Override
    public city add(city city) {
        return null;
    }

    @Override
    public int delete(city city) {
        return 0;
    }
}
