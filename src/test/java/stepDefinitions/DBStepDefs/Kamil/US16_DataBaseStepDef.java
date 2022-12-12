package stepDefinitions.DBStepDefs.Kamil;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import utilities.DBUtils;

import java.util.List;

import static utilities.DBUtils.createConnection;
import static utilities.DBUtils.getColumnData;
public class US16_DataBaseStepDef {
    public static int roomToplamSayisi_DB;

    public static List<Object> list;


    @Given("Admin medunna database e baglanir")
    public void kullanici_medunna_database_e_baglanir() {

        DBUtils.createConnection();
    }


    @Then("Admin database'den tum room bilgilerini alir ve dogrular")
    public void adminDatabaseDenTumRoomBilgileriniAlirVedogrular () {

        list = getColumnData("select * from room", "id");
        System.out.println(list);

        roomToplamSayisi_DB = list.size();


        System.out.println("Tüm kayıtlı DB Room  Sayısı : " + roomToplamSayisi_DB);

        Assert.assertTrue(list.toString().contains("1452"));




    }
}
