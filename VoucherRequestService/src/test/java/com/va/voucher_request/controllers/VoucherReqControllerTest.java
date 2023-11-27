package com.va.voucher_request.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.va.voucher_request.client.VoucherClient;
import com.va.voucher_request.contoller.VoucherReqController;
import com.va.voucher_request.exceptions.NoVoucherPresentException;
import com.va.voucher_request.exceptions.ResourceAlreadyExistException;
import com.va.voucher_request.exceptions.ScoreNotValidException;
import com.va.voucher_request.model.VoucherRequest;
import com.va.voucher_request.model.VoucherRequestDto;
import com.va.voucher_request.service.EmailRequestImpl;
import com.va.voucher_request.service.VoucherReqServiceImpl;

@ExtendWith(MockitoExtension.class)
public class VoucherReqControllerTest {
	
	@Mock
    private VoucherReqServiceImpl voucherReqService;

    @Mock
    private EmailRequestImpl emailRequestService;

    @Mock
    private VoucherClient voucherClient;
    
    @InjectMocks
    private VoucherReqController voucherReqController;
    
    
    
    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    
//    
//    @Test
//    void testRequestVoucher() throws ScoreNotValidException, ResourceAlreadyExistException {
//        VoucherRequestDto requestDto = new VoucherRequestDto();
//        when(voucherReqService.requestVoucher(Mockito.any(VoucherRequestDto.class))).thenReturn(new VoucherRequest());
//
//        ResponseEntity<VoucherRequest> response = voucherReqController.requestVoucher(requestDto);
//        
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//        verify(voucherReqService, times(1)).requestVoucher(Mockito.any(VoucherRequestDto.class));
//    }
    
    
//    @Test
//    void testGetAllAssignedVoucher() throws NoVoucherPresentException {
//        when(voucherReqService.getAllAssignedVoucherRequest()).thenReturn(Arrays.asList(new VoucherRequest()));
//
//        ResponseEntity<List<VoucherRequest>> response = voucherReqController.getAllAssignedVoucher();
//        verify(voucherReqService, times(1)).getAllAssignedVoucherRequest();
//        assertEquals(HttpStatus.OK, response.getStatusCode());
//       
//    }
    

}
