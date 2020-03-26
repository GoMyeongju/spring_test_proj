package egoveframework.example.sample.service;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleService;
import egovframework.sample.service.SampleVO;
import egovframework.sample.service.impl.SampleDAOJDBC;
import egovframework.sample.service.impl.SampleServiceImpl;

public class SampleServiceClient {
	
	public static void main(String[] args) throws Exception{
		//1. spring 컨테이너를 구동한다.
		//context-* : context로 시작하는 모든 XML 파일들을 한꺼번에 로딩한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("egovframework/spring/context-*.xml");
		
		
		//2. spring 컨테이너로부터 SampleServiceImpl 객체를 lookup(검색) 한다.
		SampleService sampleService = (SampleService) container.getBean("sampleService");
//		sampleService.insertSample();
//		sampleService.selectSampleList();
		
		SampleVO vo = new SampleVO();
		vo.setTitle("임시 제목");
		vo.setRegUser("테스터");
		vo.setContent("임시 내용입니다....");
		sampleService.insertSample(vo);
		
		List<SampleVO> sampleList = sampleService.selectSampleList(vo);
		System.out.println("[Sample LIST]");
		for(SampleVO sample : sampleList) {
			System.out.println("---> " + sample.toString());
		}
		
		//3.spring 컨테너를 종료한다.
		container.close();
	}
	
}
