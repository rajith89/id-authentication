package io.mosip.registration.processor.core.auth.dto;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * General-purpose of {@code AuthRequestDTO} class used to communicate with
 * core-kernel API. This class is picked request and send to core-kernel. Where
 * core-kernal API processed operation with {@code AuthRequestDTO} attributes.
 * 
 * @author Rakesh Roshan
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class AuthRequestDTO extends BaseAuthRequestDTO {
	
	private String individualId;

	private String individualIdType;
	
	private String keyIndex;

	private RequestDTO request;

	private AuthTypeDTO authType;

	private String muaCode;

	private String txnID;

	private String reqTime;

	private String reqHmac;

	private AuthSecureDTO key;

	private List<MatchInfo> matchInfo;

	private List<PinInfo> pinInfo;

	private List<BioInfo> bioInfo;

}
