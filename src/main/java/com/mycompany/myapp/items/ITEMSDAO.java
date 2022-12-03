package com.mycompany.myapp.dao;

import com.mycompany.myapp.vo.ITEMSVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

@Primary
@Repository
public class ITEMSDAO {
	
//	Connection conn = null;
//	PreparedStatement stmt = null;
//	ResultSet rs = null;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setTemplate(JdbcTemplate template) {
		this.jdbcTemplate = template;
	}

	private final String ITEMS_INSERT = "insert into ITEMS (productName, image, price, discount, quantity, brandName, phoneNum, brandemail, brandAddress, descriptions) values (?,?,?,?,?,?,?,?,?,?)";

	//need to implement
	private final String ITEMS_UPDATE = "update ITEMS set productName=?, image=?, price=?, discount=?, quantity=?, brandName=?, phoneNum=?, brandemail=?, brandAddress=?, descriptions=? where seq=?";
	private final String ITEMS_DELETE = "delete from ITEMS  where seq=?";
	private final String ITEMS_GET = "select * from ITEMS  where seq=?";
	private final String ITEMS_LIST = "select * from ITEMS order by seq desc";

	public int insertItems(ITEMSVO vo) {
		return jdbcTemplate.update(ITEMS_INSERT, new Object[]{vo.getProductName(), vo.getImage(), vo.getPrice(), vo.getDiscount(),vo.getQuantity(),vo.getBrandName(),vo.getPhoneNum(), vo.getBrandemail(),vo.getBrandAddress(), vo.getDescriptions()});
	}

	// 글 삭제
	public int deleteItems(int id) {
		return jdbcTemplate.update(ITEMS_DELETE, new Object[]{id});

	}

	public int updateItems(ITEMSVO vo) {
		return jdbcTemplate.update(ITEMS_UPDATE, new Object[]{vo.getProductName(), vo.getImage(), vo.getPrice(), vo.getDiscount(),vo.getQuantity(),vo.getBrandName(),vo.getPhoneNum(), vo.getBrandemail(),vo.getBrandAddress(), vo.getDescriptions()});
	}	
	
	public ITEMSVO getItems(int seq) {
		return jdbcTemplate.queryForObject(ITEMS_GET, new Object[] {seq}, new BeanPropertyRowMapper<ITEMSVO>(ITEMSVO.class));
	}

	// need to implement
	public List<ITEMSVO> getItemsList(){
		return jdbcTemplate.query(ITEMS_LIST, new ItemRowMapper());
	}

	class ItemRowMapper implements RowMapper<ITEMSVO>{

		@Override
		public ITEMSVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			ITEMSVO data = new ITEMSVO();
			Date temp = rs.getDate("regdate");
			data.setSeq(rs.getInt("seq"));
			data.setProductName(rs.getString("productName"));
			data.setImage(rs.getString("image"));
			data.setPrice(rs.getInt("price"));
			data.setDiscount(rs.getDouble("discount"));
			data.setQuantity(rs.getInt("quantity"));
			data.setBrandName(rs.getString("brandName"));
			data.setPhoneNum(rs.getString("phoneNum"));
			data.setBrandemail(rs.getString("brandemail"));
			data.setBrandAddress(rs.getString("brandAddress"));
			data.setDescriptions(rs.getString("descriptions"));
			return data;
		}
	}
}
