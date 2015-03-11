package manage.show.bean;

import java.io.Reader;
import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

@Controller
public class MngShow {
	public static Reader reader;
	public static SqlMapClient sqlMapper;
	public MngShow() throws Exception{
		reader = Resources.getResourceAsReader("sqlMapConfig.xml");
		sqlMapper = SqlMapClientBuilder.buildSqlMapClient(reader);
		reader.close();
	}

	@RequestMapping("/mngShowMain.do")
	public String gomain(){//�󿵰��� �������� �̵� �޼���
		return "/mng_show/mngShowMain.jsp";
	}
	
	@RequestMapping("/mngShowRegForm.do")
	public String goRegForm(){//������ ��� ������ �̵� �޼���
		return "/mng_show/mngShowRegForm.jsp";
	}
	@RequestMapping("/mngShowRegPro.do")
	public ModelAndView goRegPro(DTO showdto){
		try {
			sqlMapper.insert("showInfoInsert", showdto);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ModelAndView mv = new ModelAndView();
		mv.addObject(showdto);
		mv.setViewName("/mng_show/mngShowRegPro.jsp");
		return mv;
	}
//	public String goRegPro(){//������ ��� Pro���� �̵� �޼���
//		return "/mng_show/mngShowRegPro.jsp";
//	}
	
	@RequestMapping("/mngShowModCanForm.do")
	public String goModCanForm(){//������ ����/���� ������ �̵� �޼��� 
		return "/mng_show/mngShowModCanForm.jsp";
	}
}
