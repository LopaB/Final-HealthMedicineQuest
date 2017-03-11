package com.health.HealthMedicineQuestBackEnd.model;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Email;

@Entity
public class Payment implements Serializable 
{
       
       /**
	 * 
	 */
	private static final long serialVersionUID = -7564771556795451473L;
		@Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int paymentId;
       public static long getSerialversionuid() {
		return serialVersionUID;
	}
       @Email
       private String email;
       @Size(min=1, max=30,message="user mobile number should be between 1 to 13 characters long")
       private String phone;
       @Size(min=16, max=16,message="user card number should be 16 characters long")
       private String cardNo;
       @Size(min=3, max=3,message="user cvv should be 3 characters long")
       private String cvv;
       @CreditCardNumber
       private String cardName;
       
       @OneToOne(cascade=CascadeType.ALL)
       private User user;
       
       public User getUser() {
             return user;
       }
       public void setUser(User user) {
             this.user = user;
       }
       @Min(value=01)
       @Max(value=12)
       private int mm;
       @Min(value=17)
       @Max(value=25)
       private int yy;

       public int getPaymentId() {
             return paymentId;
       }
       public void setPaymentId(int paymentId) {
             this.paymentId = paymentId;
       }
       public String getEmail() {
             return email;
       }
       public void setEmail(String email) {
             this.email = email;
       }
       public String getPhone() {
             return phone;
       }
       public void setPhone(String phone) {
             this.phone = phone;
       }
       public String getCardNo() {
             return cardNo;
       }
       public void setCardNo(String cardNo) {
             this.cardNo = cardNo;
       }
       public String getCvv() {
             return cvv;
       }
       public void setCvv(String cvv) {
             this.cvv = cvv;
       }
       public String getCardName() {
             return cardName;
       }
       public void setCardName(String cardName) {
             this.cardName = cardName;
       }
       public int getMm() {
             return mm;
       }
       public void setMm(int mm) {
             this.mm = mm;
       }
       public int getYy() {
             return yy;
       }
       public void setYy(int yy) {
             this.yy = yy;
       }
       public Payment(int paymentId, String email, String phone, String cardNo, String cvv, String cardName, int mm,
                    int yy) {
             super();
             this.paymentId = paymentId;
             this.email = email;
             this.phone = phone;
             this.cardNo = cardNo;
             this.cvv = cvv;
             this.cardName = cardName;
             this.mm = mm;
             this.yy = yy;
       }
       public Payment() {
             super();
             // TODO Auto-generated constructor stub
       }
       

}
