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


   /*     CompanyApi apiInstance = new CompanyApi();
        //   apiInstance.setApiClient( client);
        try {
            DkCloudDataModelSettingsSettingsModel result = apiInstance.companyGet();
            System.out.println(" ===Company==== \n" + result.getInformation().getCompany().getName());
        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#companyGet");
            e.printStackTrace();
        }

         // ------------------------ Customer  Begin-----------------------------------
        CustomerApi customer = new CustomerApi();

        DkCloudDataModelCustomersCustomerModel customerModel = customer.customerGetCustomerById("0101010101");
        String customerName =customerModel.getName();
        Double balance = customerModel.getBalanceAmount();
      //  String code = customerModel.getLedgerCode();

        System.out.println("=== Name === Balance=== \n"+ customerName + "  -  "+ balance );


*/


         // ------------------------ Customer  End-----------------------------------







        List<DkPlusAPIModelsGeneralLedgerLine> linesRN = new ArrayList<>();
        DkPlusAPIModelsGeneralLedgerLine dat1 = new DkPlusAPIModelsGeneralLedgerLine();
        DkPlusAPIModelsGeneralLedgerLine dat2 = new DkPlusAPIModelsGeneralLedgerLine();
        DkPlusAPIModelsGeneralLedgerLine dat3 = new DkPlusAPIModelsGeneralLedgerLine();

        OffsetDateTime t = OffsetDateTime.now();
        //  Line 1
        dat1.setAccount("0003");// Bokhaldslykill or customer KT.
        dat1.setVoucher("r3");
        dat1.setDate(t);
        dat1.setAmount(6000.0); // Upphaed (kredit)
        dat1.setText("Ispan 1"); // Texti
        dat1.reference("test"); //Tilvisun
        dat1.setType(DkPlusAPIModelsGeneralLedgerLine.TypeEnum.CUSTOMER);// tegund - Fjarhagur (gengeral ledger)



        //  Line 2
        dat2.setAccount("7620");
        dat2.setVoucher("r3");
        dat2.setDate(t);
        dat2.setAmount(-7000.0);
        dat2.setText("Ispan 2 ");
        dat2.reference("test");
        dat2.setType(DkPlusAPIModelsGeneralLedgerLine.TypeEnum.GENERALLEDGER);

        // line 3

        dat3.setAccount("9531");
        dat3.setVoucher("r3");
        dat3.setDate(t);
        dat3.setAmount(1000.0);
        dat3.setText("Ispan 2 ");
        dat3.reference("test");
        dat3.setType(DkPlusAPIModelsGeneralLedgerLine.TypeEnum.GENERALLEDGER);


        linesRN.add(dat1);
        linesRN.add(dat2);
        linesRN.add(dat3);



        //================ Create Journal Begin ==================================
        GeneralLedgerApi ledger = new GeneralLedgerApi();
        DkPlusAPIModelsGeneralLedgerHead value = new DkPlusAPIModelsGeneralLedgerHead();
        DkPlusAPIModelsGeneralLedgerOptions op = new DkPlusAPIModelsGeneralLedgerOptions();
        op.setPost(true);
        op.setGenerateVoucher(true);


        value.setDescription("Java test Ispan");
        value.setOption(op);
        value.setLines(linesRN);

        try {
            ledger.generalLedgerJournalGetGeneralLedgerJournal(value);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralLedgerApi#generalLedgerJournalGetGeneralLedgerJournal");
            e.printStackTrace();
        }




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