package mvc.common;

import javax.persistence.*;

@Entity
public class Ad {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String date;

    @Column
    private String time;

    @Column
    private String comment;

    @Column
    private String type;

    @Column
    private Integer cost;

    public Ad() {}

    public Ad(String date,String time, String comment, String type, Integer cost){
        this.date = date;
        this.time = time;
        this.comment = comment;
        this.type = type;
        this.cost = cost;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ad ad = (Ad) o;

        if (!id.equals(ad.id)) return false;
        if (!date.equals(ad.date)) return false;
        if (!time.equals(ad.time)) return false;
        if (!comment.equals(ad.comment)) return false;
        if (!type.equals(ad.type)) return false;
        return cost.equals(ad.cost);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + time.hashCode();
        result = 31 * result + comment.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + cost.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", comment='" + comment + '\'' +
                ", type='" + type + '\'' +
                ", cost=" + cost +
                '}';
    }
}
