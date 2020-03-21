package egovframework.sample.service.impl;

import egovframework.sample.service.SampleDAO;
import egovframework.sample.service.SampleService;

public class AdvancedSampleServiceImpl implements SampleService{
	
	
	public AdvancedSampleServiceImpl(){
		System.out.println("===> AdvancedSampleServiceImpl 생성");
	}

	public void insertSample() throws Exception{
		System.out.println("AdvancedSampleServiceImpl---Sample 등록");
		
	}
	
	public void updateSample() throws Exception{
		System.out.println("AdvancedSampleServiceImpl---Sample 수정");
	}
	
	public void deleteSample() throws Exception{
		System.out.println("AdvancedSampleServiceImpl---Sample 삭제");
	}
	
	public void selectSample() throws Exception{
		System.out.println("AdvancedSampleServiceImpl---Sample 상세 조회");
	}
	
	public void selectSampleList() throws Exception{
		System.out.println("AdvancedSampleServiceImpl---Sample 목록 검색");
	}

	
	
	
}
