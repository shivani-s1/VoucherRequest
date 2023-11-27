//package com.va.voucher_request.repo;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;
//
//import com.va.voucher_request.model.VoucherRequest;
//import com.va.voucher_request.service.VoucherReqServiceImpl;
//
//@ExtendWith(MockitoExtension.class)
//public class VoucherRequestRepositoryTest {
//	
//	 @Mock
//	  private VoucherRequestRepository voucherRequestRepository;
//
//	 @InjectMocks
//	 private VoucherReqServiceImpl voucherRequestRepositoryImpl;
//	
//	  @Test
//	    void testFindByCandidateEmail() {
//	        String candidateEmail = "john@example.com";
//	        List<VoucherRequest> voucherRequests = new ArrayList<>();
//	        when(voucherRequestRepository.findByCandidateEmail(candidateEmail)).thenReturn(voucherRequests);
//
//	        List<VoucherRequest> result = voucherRequestRepositoryImpl.findByCandidateEmail(candidateEmail);
//
//	        assertEquals(voucherRequests, result);
//	        verify(voucherRequestRepository, times(1)).findByCandidateEmail(candidateEmail);
//	    }
//	  
//	    @Test
//	    void testExistsByCloudExamAndCandidateEmail() {
//	        String cloudExam = "AWS Certified Developer";
//	        String candidateEmail = "john@example.com";
//	        when(voucherRequestRepository.existsByCloudExamAndCandidateEmail(cloudExam, candidateEmail)).thenReturn(true);
//
//	        boolean result = voucherRequestRepositoryImpl.existsByCloudExamAndCandidateEmail(cloudExam, candidateEmail);
//
//	        assertTrue(result);
//	        verify(voucherRequestRepository, times(1)).existsByCloudExamAndCandidateEmail(cloudExam, candidateEmail);
//	    }
//
//}
