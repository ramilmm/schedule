package mvc.common;

import javax.persistence.*;

@Entity
public class Day {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String date;

    @Column
    private Integer pryamaya_count;

    @Column
    private Integer birzha_count;

    public Day() {}

    public Day(String date, Integer pryamaya_count, Integer birzha_count) {
        this.date = date;
        this.pryamaya_count = pryamaya_count;
        this.birzha_count = birzha_count;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getPryamaya_count() {
        return pryamaya_count;
    }

    public void setPryamaya_count(Integer pryamaya_count) {
        this.pryamaya_count = pryamaya_count;
    }

    public Integer getBirzha_count() {
        return birzha_count;
    }

    public void setBirzha_count(Integer birzha_count) {
        this.birzha_count = birzha_count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Day day = (Day) o;

        if (!id.equals(day.id)) return false;
        if (!date.equals(day.date)) return false;
        if (!pryamaya_count.equals(day.pryamaya_count)) return false;
        return birzha_count.equals(day.birzha_count);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + pryamaya_count.hashCode();
        result = 31 * result + birzha_count.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Day{" +
                "birzha_count=" + birzha_count +
                ", pryamaya_count=" + pryamaya_count +
                ", date='" + date + '\'' +
                ", id=" + id +
                '}';
    }
}
