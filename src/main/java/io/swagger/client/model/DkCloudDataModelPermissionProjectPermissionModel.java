/*
 * dkPlus.API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DkCloudDataModelPermissionProjectPermissionModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T12:57:09.866Z")



public class DkCloudDataModelPermissionProjectPermissionModel {
  /**
   * Gets or Sets invoices
   */
  @JsonAdapter(InvoicesEnum.Adapter.class)
  public enum InvoicesEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    InvoicesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InvoicesEnum fromValue(String text) {
      for (InvoicesEnum b : InvoicesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InvoicesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InvoicesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InvoicesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InvoicesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Invoices")
  private InvoicesEnum invoices = null;

  /**
   * Gets or Sets reports
   */
  @JsonAdapter(ReportsEnum.Adapter.class)
  public enum ReportsEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    ReportsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ReportsEnum fromValue(String text) {
      for (ReportsEnum b : ReportsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ReportsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ReportsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ReportsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ReportsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Reports")
  private ReportsEnum reports = null;

  /**
   * Gets or Sets dashboard
   */
  @JsonAdapter(DashboardEnum.Adapter.class)
  public enum DashboardEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    DashboardEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DashboardEnum fromValue(String text) {
      for (DashboardEnum b : DashboardEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DashboardEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DashboardEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DashboardEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DashboardEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Dashboard")
  private DashboardEnum dashboard = null;

  /**
   * Gets or Sets phases
   */
  @JsonAdapter(PhasesEnum.Adapter.class)
  public enum PhasesEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    PhasesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhasesEnum fromValue(String text) {
      for (PhasesEnum b : PhasesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PhasesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhasesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhasesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PhasesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Phases")
  private PhasesEnum phases = null;

  /**
   * Gets or Sets tasks
   */
  @JsonAdapter(TasksEnum.Adapter.class)
  public enum TasksEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    TasksEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TasksEnum fromValue(String text) {
      for (TasksEnum b : TasksEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TasksEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TasksEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TasksEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TasksEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Tasks")
  private TasksEnum tasks = null;

  /**
   * Gets or Sets journal
   */
  @JsonAdapter(JournalEnum.Adapter.class)
  public enum JournalEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    JournalEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JournalEnum fromValue(String text) {
      for (JournalEnum b : JournalEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<JournalEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JournalEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JournalEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return JournalEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Journal")
  private JournalEnum journal = null;

  /**
   * Gets or Sets settings
   */
  @JsonAdapter(SettingsEnum.Adapter.class)
  public enum SettingsEnum {
    FULL("Full"),
    
    VIEW("View"),
    
    MODIFY("Modify"),
    
    NONE("None"),
    
    DENY("Deny");

    private String value;

    SettingsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SettingsEnum fromValue(String text) {
      for (SettingsEnum b : SettingsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SettingsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SettingsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SettingsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SettingsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Settings")
  private SettingsEnum settings = null;

  /**
   * Gets or Sets enabled
   */
  @JsonAdapter(EnabledEnum.Adapter.class)
  public enum EnabledEnum {
    ENABLED("Enabled"),
    
    DISABLED("Disabled"),
    
    BLOCKED("Blocked");

    private String value;

    EnabledEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EnabledEnum fromValue(String text) {
      for (EnabledEnum b : EnabledEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EnabledEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnabledEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnabledEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EnabledEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Enabled")
  private EnabledEnum enabled = null;

  public DkCloudDataModelPermissionProjectPermissionModel invoices(InvoicesEnum invoices) {
    this.invoices = invoices;
    return this;
  }

   /**
   * Get invoices
   * @return invoices
  **/
  @ApiModelProperty(value = "")
  public InvoicesEnum getInvoices() {
    return invoices;
  }

  public void setInvoices(InvoicesEnum invoices) {
    this.invoices = invoices;
  }

  public DkCloudDataModelPermissionProjectPermissionModel reports(ReportsEnum reports) {
    this.reports = reports;
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @ApiModelProperty(value = "")
  public ReportsEnum getReports() {
    return reports;
  }

  public void setReports(ReportsEnum reports) {
    this.reports = reports;
  }

  public DkCloudDataModelPermissionProjectPermissionModel dashboard(DashboardEnum dashboard) {
    this.dashboard = dashboard;
    return this;
  }

   /**
   * Get dashboard
   * @return dashboard
  **/
  @ApiModelProperty(value = "")
  public DashboardEnum getDashboard() {
    return dashboard;
  }

  public void setDashboard(DashboardEnum dashboard) {
    this.dashboard = dashboard;
  }

  public DkCloudDataModelPermissionProjectPermissionModel phases(PhasesEnum phases) {
    this.phases = phases;
    return this;
  }

   /**
   * Get phases
   * @return phases
  **/
  @ApiModelProperty(value = "")
  public PhasesEnum getPhases() {
    return phases;
  }

  public void setPhases(PhasesEnum phases) {
    this.phases = phases;
  }

  public DkCloudDataModelPermissionProjectPermissionModel tasks(TasksEnum tasks) {
    this.tasks = tasks;
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @ApiModelProperty(value = "")
  public TasksEnum getTasks() {
    return tasks;
  }

  public void setTasks(TasksEnum tasks) {
    this.tasks = tasks;
  }

  public DkCloudDataModelPermissionProjectPermissionModel journal(JournalEnum journal) {
    this.journal = journal;
    return this;
  }

   /**
   * Get journal
   * @return journal
  **/
  @ApiModelProperty(value = "")
  public JournalEnum getJournal() {
    return journal;
  }

  public void setJournal(JournalEnum journal) {
    this.journal = journal;
  }

  public DkCloudDataModelPermissionProjectPermissionModel settings(SettingsEnum settings) {
    this.settings = settings;
    return this;
  }

   /**
   * Get settings
   * @return settings
  **/
  @ApiModelProperty(value = "")
  public SettingsEnum getSettings() {
    return settings;
  }

  public void setSettings(SettingsEnum settings) {
    this.settings = settings;
  }

  public DkCloudDataModelPermissionProjectPermissionModel enabled(EnabledEnum enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public EnabledEnum getEnabled() {
    return enabled;
  }

  public void setEnabled(EnabledEnum enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DkCloudDataModelPermissionProjectPermissionModel dkCloudDataModelPermissionProjectPermissionModel = (DkCloudDataModelPermissionProjectPermissionModel) o;
    return Objects.equals(this.invoices, dkCloudDataModelPermissionProjectPermissionModel.invoices) &&
        Objects.equals(this.reports, dkCloudDataModelPermissionProjectPermissionModel.reports) &&
        Objects.equals(this.dashboard, dkCloudDataModelPermissionProjectPermissionModel.dashboard) &&
        Objects.equals(this.phases, dkCloudDataModelPermissionProjectPermissionModel.phases) &&
        Objects.equals(this.tasks, dkCloudDataModelPermissionProjectPermissionModel.tasks) &&
        Objects.equals(this.journal, dkCloudDataModelPermissionProjectPermissionModel.journal) &&
        Objects.equals(this.settings, dkCloudDataModelPermissionProjectPermissionModel.settings) &&
        Objects.equals(this.enabled, dkCloudDataModelPermissionProjectPermissionModel.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoices, reports, dashboard, phases, tasks, journal, settings, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DkCloudDataModelPermissionProjectPermissionModel {\n");
    
    sb.append("    invoices: ").append(toIndentedString(invoices)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
    sb.append("    dashboard: ").append(toIndentedString(dashboard)).append("\n");
    sb.append("    phases: ").append(toIndentedString(phases)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    journal: ").append(toIndentedString(journal)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

