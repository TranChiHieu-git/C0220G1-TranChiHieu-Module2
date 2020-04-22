package CaseStudy.FuramaResort.Controllers;

import CaseStudy.FuramaResort.Models.Customer;

import java.util.Comparator;

public class NameBirthdayComparator implements Comparator<Customer> {
    public int compare(Customer ct1, Customer ct2) {
        String[] nameCustomer1 = ct1.getName().split(" ");
        String[] nameCustomer2 = ct2.getName().split(" ");
        if (!nameCustomer1[2].equals(nameCustomer2[2])) {
            return nameCustomer1[2].compareTo(nameCustomer2[2]);
        } else if (!ct1.getName().equals(ct2.getName())) {
            return ct1.getName().compareTo(ct2.getName());
        } else {
            String[] birthdayCustomer1 = ct1.getBirthday().split("/");
            String[] birthdayCustomer2 = ct2.getBirthday().split("/");
            int monthCustomer1 = Integer.parseInt(birthdayCustomer1[1]);
            int yearCustomer1 = Integer.parseInt(birthdayCustomer1[2]);
            int monthCustomer2 = Integer.parseInt(birthdayCustomer2[1]);
            int yearCustomer2 = Integer.parseInt(birthdayCustomer2[2]);
            if (yearCustomer1 != yearCustomer2) {
                return birthdayCustomer1[2].compareTo(birthdayCustomer2[2]);
            } else {
                if (monthCustomer1 != monthCustomer2) {
                    return birthdayCustomer1[1].compareTo(birthdayCustomer2[1]);
                } else {
                    return birthdayCustomer1[0].compareTo(birthdayCustomer2[0]);
                }
            }
        }
    }
}
