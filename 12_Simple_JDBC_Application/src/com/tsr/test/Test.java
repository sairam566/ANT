package com.tsr.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tsr.entity.Parcel;
import com.tsr.helper.JDBCUtlity;

public class Test {

	public static void main(String[] args) throws SQLException {
		Connection connection = JDBCUtlity.getConnection();
		Statement statement = connection.createStatement();
		 ResultSet result = statement.executeQuery("select parcel_no, charges, delivery_type, description, weight, delivery_associate_no from parcel ");
		 List<Parcel> parcels = new ArrayList<>();
		 while (result.next()) {
			Parcel parcel = new Parcel();
			parcel.setParcelNo(result.getInt(1));
			parcel.setCharges(result.getDouble(2));
			parcel.setDeliveryType(result.getString(3));
			parcel.setDescription(result.getString(4));
			parcel.setWeight(result.getInt(5));
			parcel.setDeliveryAssociateNo(result.getInt(6));
			parcels.add(parcel);
		}
		 parcels.forEach(System.out::println);
		
	}

}
