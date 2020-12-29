
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import io.swagger.client.ApiException;
import io.swagger.client.api.CustomerApi;
import io.swagger.client.model.DkCloudDataModelCustomersCustomerModel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 * Created by User on 3.12.2020.
 */
public class Customers {
    private final Boolean obj;
    private final String param;
    private final CustomerApi apiInstance2;

    public Customers(Boolean obj, String param, CustomerApi apiInstance2) {

        this.obj = obj;
        this.param = param;
        this.apiInstance2 = apiInstance2;

    }




    //========================= Begin MIXIN ================================
/*
    public abstract class CustomerFormat{
        @JsonFormat(shape = JsonFormat.Shape.NUMBER, pattern = "  ")
        abstract String getNumber();
    }*/
//========================= End MIXIN ================================

    char space = 32 ;

    public void getCustomersList() {
        try {
            List<DkCloudDataModelCustomersCustomerModel> result = apiInstance2.customerGetCustomers(obj, param);
            File csvOutputFile = new File("C:\\csv_tests\\user_output.csv");
            CsvMapper mapper = new CsvMapper();
            mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);
            CsvSchema schema = CsvSchema.builder().setUseHeader(false)
                    .addColumn("number")
                    // .addColumn("name")
                    .addColumn("balanceAmount")
                    .setColumnSeparator(space)
                    .build();
           // mapper.addMixInAnnotations(DkCloudDataModelCustomersCustomerModel.class,CustomerFormat.class);


           ObjectWriter writer = mapper.writerFor(DkCloudDataModelCustomersCustomerModel.class).with(schema);


            System.out.println("All cusotmers size: " + result.size());




            List<DkCloudDataModelCustomersCustomerModel> customersWithBalance = result.stream().filter(c -> c.getBalanceAmount() > 0).collect(Collectors.toList());
            try {

                writer.writeValues(csvOutputFile).writeAll(customersWithBalance);
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Users saved to csv file under path: ");
            System.out.println(csvOutputFile);


        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerApi#customerGetCustomers");
            e.printStackTrace();
        }


    }


}
