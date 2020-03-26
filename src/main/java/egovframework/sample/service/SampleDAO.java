package egovframework.sample.service;

import java.util.List;

public interface SampleDAO {
	//DAO(Data Access Object) 클래스는 실질적으로 데이터베이스 연동을 담당하는 클래스.
	
	void insertSample(SampleVO vo) throws Exception;

	void updateSample(SampleVO vo) throws Exception;

	void deleteSample(SampleVO vo) throws Exception;

	SampleVO selectSample(SampleVO vo) throws Exception;

	List<SampleVO> selectSampleList(SampleVO vo) throws Exception;

}