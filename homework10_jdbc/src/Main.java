import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
//        createAccomodation();
//        createRoomFair();
//        createAccomodationFairRelation();
//
//        insertAccomodation(1, "single", "single", 1, "camera cu balcon");
//        insertAccomodation(2, "apartament", "double + supraetajat", 4, "camera cu balcon");
//        insertAccomodation(3, "double", "double", 2, "camera cu balcon");
//        insertAccomodation(4, "single", "single", 1, "camera fara balcon");
//        insertAccomodation(5, "double", "double", 2, "camera fara balcon");
//
//
//        insertRoomfair(1,142.5,"off season");
//        insertRoomfair(2,332.5,"season");
//        insertRoomfair(3,237.5,"off season");
//        insertRoomfair(4,427.5,"season");

//        insertAccomodationFairRelation(1,2,4);
//        insertAccomodationFairRelation(2,5,1);
//        insertAccomodationFairRelation(3,3,2);
//        insertAccomodationFairRelation(4,1,2);
//        insertAccomodationFairRelation(5,4,3);

        selectRoomPrices();
    }

    public static void createAccomodation() {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "123456");
             Statement stmt = conn.createStatement()) {
            String sql = "create table accomodation" +
                    "(id int," +
                    "type varchar(32)," +
                    "bed_type varchar(32)," +
                    "max_guests int, " +
                    "description varchar(512), " +
                    "primary key(id))";
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertAccomodation(Integer id, String type, String bed_type, Integer max_guests, String description) {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "123456");
             PreparedStatement ps = conn.prepareStatement("insert into accomodation (id, type, bed_type, max_guests, description) values (?,?,?,?,?)")) {
            ps.setInt(1, id);
            ps.setString(2, type);
            ps.setString(3, bed_type);
            ps.setInt(4, max_guests);
            ps.setString(5, description);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createRoomFair() {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "123456");
             Statement stmt = conn.createStatement()) {
            String sql = "create table room_fair" +
                    "(id int," +
                    "value double," +
                    "season varchar(32)," +
                    "primary key(id))";
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertRoomfair(Integer id, Double value, String season) {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "123456");
             PreparedStatement ps = conn.prepareStatement("insert into room_fair (id, value, season) values (?,?,?)")) {
            ps.setInt(1, id);
            ps.setDouble(2, value);
            ps.setString(3, season);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void createAccomodationFairRelation() {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "123456");
             Statement stmt = conn.createStatement()) {
            String sql = "create table accomodation_fair_relation" +
                    "(id int," +
                    "id_accomodation int," +
                    "id_room_fair int," +
                    "primary key(id)," +
                    "FOREIGN KEY (id_accomodation) REFERENCES accomodation (id)," +
                    "FOREIGN KEY (id_room_fair) REFERENCES room_fair (id))";
            stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insertAccomodationFairRelation(Integer id, Integer id_accomodation, Integer id_room_fair) {
        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "123456");
             PreparedStatement ps = conn.prepareStatement("insert into accomodation_fair_relation (id, id_accomodation, id_room_fair) values (?,?,?)")) {
            ps.setInt(1, id);
            ps.setInt(2, id_accomodation);
            ps.setInt(3, id_room_fair);
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void selectRoomPrices() {

        final String format = "%20s%32s%32s\n";

        try (Connection conn = Connector.connect("mysql", "localhost", "3306", "booking", "root", "123456");
             PreparedStatement ps = conn.prepareStatement("SELECT *" +
                     "FROM  accomodation_fair_relation" +
                     "    INNER JOIN accomodation ON accomodation.id = accomodation_fair_relation.id_accomodation" +
                     "    INNER JOIN room_fair ON room_fair.id  = accomodation_fair_relation.id_room_fair");

             ResultSet result = ps.executeQuery()) {
            boolean hasNext = result.next();
            if (hasNext) {
                System.out.format(format, "accomodation.id", "accomodation.type", "room_fair.value");
                do {
                    System.out.format(format,
                            result.getInt("accomodation.id"),
                            result.getString("accomodation.type"),
                            result.getString("room_fair.value"));
                } while (result.next());
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }

    }
//TODO JAVA DOC, TESTE, VERIFICARI

}
