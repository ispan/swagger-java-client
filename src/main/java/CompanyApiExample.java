/**
 * Created by User on 13.11.2020.
 */

import io.swagger.client.*;
import io.swagger.client.api.CustomerApi;
import io.swagger.client.api.GeneralLedgerApi;
import io.swagger.client.api.TransactionApi;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.CompanyApi;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZoneOffset;

import java.io.File;
import java.util.*;

public class CompanyApiExample {

    public static void main(String[] args) throws ApiException {

        //    ApiKeyAuth login = new ApiKeyAuth("header", "Authorization");
        //    login.setApiKey("bearer 928c422d-30b0-44c0-8d98-812d64a397c3");


        //    ApiClient client = new ApiClient();
        //    client.setApiKey("bearer 928c422d-30b0-44c0-8d98-812d64a397c3");


        CompanyApi apiInstance = new CompanyApi();
        //   apiInstance.setApiClient( client);
        try {
            DkCloudDataModelSettingsSettingsModel result = apiInstance.companyGet();
            System.out.println(" ===Company==== \n" + result.getInformation().getCompany().getName());
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#companyGet");
            e.printStackTrace();
        }



        // ===================== Begin Fetch All customers with balance ==========================


        CustomerApi apiInstance2 = new CustomerApi();
        Boolean obj = true; // Boolean | Include Objects
        String param = "Number,Name,BalanceAmount"; // String | Field to include


        Customers customers = new Customers( obj,  param, apiInstance2);
        customers.getCustomersList();


        // ===================== End Fetch All customers with balance ==========================





        // ------------------------ Customer  Begin-----------------------------------
        CustomerApi customer = new CustomerApi();
        try {
            DkCloudDataModelCustomersCustomerModel customerModel = customer.customerGetCustomerById("000333");// 10 digits numeric with folloving zero ( as an address1 String  in XML
            String customerName = customerModel.getName();
            Double balance = customerModel.getBalanceAmount();
            System.out.println("=== Name === Balance=== \n" + customerName + "  -  " + balance);
        } catch (ApiException e) {
            System.err.println("--Costomer not found--");
            // create a new customer from an XML if customer is not found in Accounting system
            e.printStackTrace();
            DkCloudDataModelCustomersCustomerModel newCustomer = new DkCloudDataModelCustomersCustomerModel();
            newCustomer.setName("Test Jón");
            newCustomer.setNumber("000333");
            newCustomer.setAddress1("Lund 4");

            customer.customerCreateCustomer(newCustomer);
            System.out.println("======Created a new customer======");
        }
        // ------------------------ Customer  End-----------------------------------



        // ------------------------ Ledger Lines Begin-----------------------------------
        List<DkPlusAPIModelsGeneralLedgerLine> linesRN = new ArrayList<>();
        DkPlusAPIModelsGeneralLedgerLine dat1 = new DkPlusAPIModelsGeneralLedgerLine();
        DkPlusAPIModelsGeneralLedgerLine dat2 = new DkPlusAPIModelsGeneralLedgerLine();
        DkPlusAPIModelsGeneralLedgerLine dat3 = new DkPlusAPIModelsGeneralLedgerLine();

        OffsetDateTime t = OffsetDateTime.now();

        //  Line 1
        dat1.setAccount("000333");// Bokhaldslykill or customer KT.
        // dat1.setVoucher("r3");
        dat1.setDate(t);
        dat1.setAmount(8000.0); // Upphaed (kredit)
        dat1.setText("Rn. 545454"); // Texti
        dat1.reference("test"); //Tilvisun
        dat1.setType(DkPlusAPIModelsGeneralLedgerLine.TypeEnum.CUSTOMER);// tegund - Fjarhagur (gengeral ledger)


        //  Line 2
        dat2.setAccount("1001");
        // dat2.setVoucher("r3");
        dat2.setDate(t);
        dat2.setAmount(-9000.0);
        dat2.setText("Rn. 545454");
        dat2.reference("test");
        dat2.setType(DkPlusAPIModelsGeneralLedgerLine.TypeEnum.GENERALLEDGER);


        // line 3

        dat3.setAccount("9531");
        // dat3.setVoucher("r3");
        dat3.setDate(t);
        dat3.setAmount(1000.0);
        dat3.setText("Rn. 545454 ");
        dat3.reference("test");
        dat3.setType(DkPlusAPIModelsGeneralLedgerLine.TypeEnum.GENERALLEDGER);


        linesRN.add(dat1);
        linesRN.add(dat2);
        linesRN.add(dat3);
        // ------------------------ Ledger Lines End -----------------------------------


        //================ Create Journal Begin ==================================
        GeneralLedgerApi ledger = new GeneralLedgerApi();
        DkPlusAPIModelsGeneralLedgerHead value = new DkPlusAPIModelsGeneralLedgerHead();
        DkPlusAPIModelsGeneralLedgerOptions op = new DkPlusAPIModelsGeneralLedgerOptions();
        op.setPost(true);
        op.setGenerateVoucher(true);


        value.setDescription("Java Ispan v0.1");
        value.code("ws");
        value.setOption(op);
        value.setLines(linesRN);

      /*  try {
            ledger.generalLedgerJournalGetGeneralLedgerJournal(value);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralLedgerApi#generalLedgerJournalGetGeneralLedgerJournal");
            e.printStackTrace();
        }
*/
        //================ Create Journal End   ==================================


/*

        DkPlusAPIModelsGeneralLedgerHead head = new DkPlusAPIModelsGeneralLedgerHead();
        head.code("Java");// Dagbaekur fjarhags table  - Audkenni column
        head.description("Testing Ispan"); // Dagbaekur fjarhags table  - Lysing column
        head.setOption(op);
        head.lines(linesRN);

        ApiResponse respo = ledger.generalLedgerJournalGetGeneralLedgerJournalWithHttpInfo(head);*/


        //    System.out.println("create journal data responce " + respo);


    }
}