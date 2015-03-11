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
	public String gomain(){//상영관리 메인으로 이동 메서드
		return "/mng_show/mngShowMain.jsp";
	}
	
	@RequestMapping("/mngShowRegForm.do")
	public String goRegForm(){//상영정보 등록 폼으로 이동 메서드
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
//	public String goRegPro(){//상영정보 등록 Pro으로 이동 메서드
//		return "/mng_show/mngShowRegPro.jsp";
//	}
	
	@RequestMapping("/mngShowModCanForm.do")
	public String goModCanForm(){//상영정보 수정/삭제 폼으로 이동 메서드 
		return "/mng_show/mngShowModCanForm.jsp";
	}
}
