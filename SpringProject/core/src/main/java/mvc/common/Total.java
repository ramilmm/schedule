package mvc.common;

import javax.persistence.*;

@Entity
public class Total {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String month;

    @Column
    private Integer total_sum;

    public Total() {}

    public Total(String month, Integer total_sum) {
        this.month = month;
        this.total_sum = total_sum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getTotal_sum() {
        return total_sum;
    }

    @Override
    public String toString() {
        return "Total{" +
                "id=" + id +
                ", month='" + month + '\'' +
                ", total_sum=" + total_sum +
                '}';
    }

    public void setTotal_sum(Integer total_sum) {
        this.total_sum = total_sum;
    }
}
