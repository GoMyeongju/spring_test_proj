package egovframework.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleService;
import egovframework.sample.service.SampleVO;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	@Resource(name="daoSpring")
	private SampleDAO sampleDAO;
	
	
//	public SampleServiceImpl() throws Exception{
//		System.out.println("===> SampleServieImpl 생성1");
//		//sampleDAO = new SampleDAOJDBC();
//	}

//	public SampleServiceImpl(SampleDAO sampleDAO) {
//		System.out.println("===> SampleServiceImpl 생성2");
//		this.sampleDAO = sampleDAO;
//	}
//
//	public void setSampleDAO(SampleDAO sampleDAO) {
//		System.out.println("---> setDampleDAO() 호출");
//		this.sampleDAO = sampleDAO;
//	}
	
	public void insertSample(SampleVO vo) throws Exception{
		//System.out.println("SampleService---Sample 등록");
		sampleDAO.insertSample(vo);
	}
	
	public void updateSample(SampleVO vo) throws Exception{
		//System.out.println("SampleService---Sample 수정");
		sampleDAO.updateSample(vo);
	}
	
	public void deleteSample(SampleVO vo) throws Exception{
		//System.out.println("SampleService---Sample 삭제");
		sampleDAO.deleteSample(vo);
	}
	
	public SampleVO selectSample(SampleVO vo) throws Exception{
		//System.out.println("SampleService---Sample 상세 조회");
		return sampleDAO.selectSample(vo);
	}
	
	public List<SampleVO> selectSampleList(SampleVO vo) throws Exception{
		//System.out.println("SampleService---Sample 목록 검색");
		return sampleDAO.selectSampleList(vo);
	}

	
	
	
}
