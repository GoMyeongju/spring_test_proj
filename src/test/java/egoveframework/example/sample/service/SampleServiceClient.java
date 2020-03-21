package egoveframework.example.sample.service;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleService;
import egovframework.sample.service.impl.SampleDAOJDBC;
import egovframework.sample.service.impl.SampleServiceImpl;

public class SampleServiceClient {
	
	public static void main(String[] args) throws Exception{
		//1. spring 컨테이너를 구동한다.
		AbstractApplicationContext container = new GenericXmlApplicationContext("egovframework/spring/context-common.xml");
		
		//2. spring 컨테이너로부터 SampleServiceImpl 객체를 lookup(검색) 한다.
		SampleService sampleService = (SampleService) container.getBean("sampleService");
		sampleService.insertSample();
		sampleService.selectSampleList();
		
		//3.spring 컨테너를 종료한다.
		container.close();
	}
	
}
