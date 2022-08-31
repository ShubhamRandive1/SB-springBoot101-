package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import accountbean.ACCOUNT;

import exceptions.InsufficientBalance;
import exceptions.InvalidAccount;

public class accounDAO implements accountDAOimpl{

	@Override
	public void save(ACCOUNT account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ACCOUNT findById(int id) throws InvalidAccount {
		// TODO Auto-generated method stub
		ACCOUNT acc = null;
		
try(Connection conn = DAOCONNECT.DAOConn.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM accoun where id=?");
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				
				
				
			}else {
				
				throw new InvalidAccount("no account available");
			}
			
			
		}catch(SQLException e) {
			
			throw new InvalidAccount(e.getMessage());
		}
		
		
		return acc;
	}

	@Override
	public void update(ACCOUNT account) throws InvalidAccount {
		// TODO Auto-generated method stub
		
		ACCOUNT acc = null;
		
		try(Connection conn = DAOCONNECT.DAOConn.provideConnection()){
					
					PreparedStatement ps = conn.prepareStatement("UPDATE name FROM account where id=?");
					
					ResultSet rs = ps.executeQuery();
					
					if(rs.next()) {
						
						
						
					}else {
						
						throw new InvalidAccount("no account available");
					}
					
					
				}catch(SQLException e) {
					
					throw new InvalidAccount(e.getMessage());
				}
				
				System.out.println(acc);
			

		
	}

	@Override
	public void remove(ACCOUNT account) throws InvalidAccount {
		// TODO Auto-generated method stub
		
	ACCOUNT acc = null;
		
		try(Connection conn = DAOCONNECT.DAOConn.provideConnection()){
					
					PreparedStatement ps = conn.prepareStatement("DELETE name FROM account where id=?");
					
					ResultSet rs = ps.executeQuery();
					
					if(rs.next()) {
						
						
						
					}else {
						
						throw new InvalidAccount("no account available");
					}
					
					
				}catch(SQLException e) {
					
					throw new InvalidAccount(e.getMessage());
				}
				
				System.out.println(acc);

		
	}

	@Override
	public int withdraw(double amount, ACCOUNT account) throws InsufficientBalance {
		// TODO Auto-generated method stub
			ACCOUNT acc = (ACCOUNT) null;
		
		try(Connection conn = DAOCONNECT.DAOConn.provideConnection()){
					
					PreparedStatement ps = conn.prepareStatement("UPDATE account SET balance = balance-? where id=?");
					
					ResultSet rs = ps.executeQuery();
					
					if(rs.next()) {
						
						int id = rs.getInt("id");
						
						double balance = rs.getDouble("balance");
						
						
						acc = new ACCOUNT(id, null, null, balance);
								
						
						
					}else {
						
						throw new InsufficientBalance("no account available");
					}
					
					
				}catch(SQLException e) {
					
					throw new InsufficientBalance(e.getMessage());
				}
		
		
				
				
				return (int) acc.getBalance();
			}

	

	@Override
	public double deposit(double amount, ACCOUNT account) throws InvalidAccount {
		// TODO Auto-generated method stub
		
		ACCOUNT acc = null;
		
		try(Connection conn = DAOCONNECT.DAOConn.provideConnection()){
					
					PreparedStatement ps = conn.prepareStatement("UPDATE account SET balance = balance+? where id=?");
					
					ResultSet rs = ps.executeQuery();
					
					if(rs.next()) {
						
						double balance = rs.getDouble(1);
						
						int id = rs.getInt(2);
						
						
						acc = new ACCOUNT(id, null, null, balance);
						
						
					}else {
						
						throw new InvalidAccount("no account available");
					}
					
					
				}catch(SQLException e) {
					
					throw new InvalidAccount(e.getMessage());
				}
				
				System.out.println(acc);
				
				
				return acc.getBalance();
			
		
	}


}
