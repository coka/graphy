package models;

public class StatusBarModel
{
  private String[] labels = new String[] {"N/A", "N/A", "N/A", "N/A", "N/A"};

  public String get_label_at(int i) { return this.labels[i]; }
  public void set_label_at(int i, String text) { this.labels[i] = text; }
}
