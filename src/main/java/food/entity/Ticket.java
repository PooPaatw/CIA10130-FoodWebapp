package food.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "ticket")
public class Ticket {

 @Id
 @Column(name = "tk_id", insertable = false, updatable = false)
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer tkId;

 @Column(name = "tk_name")
 private String tkName;

 @Column(name = "tk_price")
 private Integer tkPrice;

 public Integer getTkId() {
  return tkId;
 }

 public void setTkId(Integer tkId) {
  this.tkId = tkId;
 }

 public String getTkName() {
  return tkName;
 }

 public void setTkName(String tkName) {
  this.tkName = tkName;
 }



 public Integer getTkPrice() {
  return tkPrice;
 }

 public void setTkPrice(Integer tkPrice) {
  this.tkPrice = tkPrice;
 }



 @Override
 public String toString() {
  return "Ticket [tk_id=" + tkId + ", tk_name=" + tkName + ", tk_price=" + tkPrice
    + ", tk_status="  + "]";
 }



}
