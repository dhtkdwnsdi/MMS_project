package com.mms.controller;

import com.mms.controller.action.Action;
import com.mms.controller.action.ProfileFormAction;
import com.mms.controller.action.ResumeFormAction;
import com.mms.controller.action.career.CareerDeleteAction;
import com.mms.controller.action.career.CareerListFormAction;
import com.mms.controller.action.career.CareerRegisterAction;
import com.mms.controller.action.career.CareerUpdateAction;
import com.mms.controller.action.career.CareerUpdateFormAction;
import com.mms.controller.action.cert.CertDeleteAction;
import com.mms.controller.action.cert.CertListFormAction;
import com.mms.controller.action.cert.CertRegistAction;
import com.mms.controller.action.cert.CertRegistFormAction;
import com.mms.controller.action.cert.CertSearchFormAction;
import com.mms.controller.action.cert.SearchCertNameAction;
import com.mms.controller.action.edu.EduDeleteAction;
import com.mms.controller.action.edu.EduListFormAction;
import com.mms.controller.action.edu.EduRegisterAction;
import com.mms.controller.action.edu.EduUpdateAction;
import com.mms.controller.action.edu.EduUpdateFormAction;
import com.mms.controller.action.grant.GrantListFormAction;
import com.mms.controller.action.grant.GrantUpdateAction;
import com.mms.controller.action.grant.GrantUpdateFormAction;
import com.mms.controller.action.introduce.IntroduceListAction;
import com.mms.controller.action.introduce.IntroduceUpdateAction;
import com.mms.controller.action.introduce.IntroduceUpdateFormAction;
import com.mms.controller.action.memberSet.MemberSetFormAction;
import com.mms.controller.action.memberSet.MemberUpdateAction;
import com.mms.controller.action.message.MessageListFormAction;
import com.mms.controller.action.message.MessageReceiveViewFormAction;
import com.mms.controller.action.message.MessageRegisterAction;
import com.mms.controller.action.message.MessageRegisterFormAction;
import com.mms.controller.action.message.MessageSendViewFormAction;
import com.mms.controller.action.message.MsgRegisterFormAction;
import com.mms.controller.action.message.ProgrammerSearchFormAction;
import com.mms.controller.action.message.ReceiveMsgDeleteAction;
import com.mms.controller.action.message.SendMsgDeleteAction;
import com.mms.controller.action.myCert.MyCertDeleteAction;
import com.mms.controller.action.myCert.MyCertListFormAction;
import com.mms.controller.action.myCert.MyCertRegistAction;
import com.mms.controller.action.myCert.MyCertUpdateAction;
import com.mms.controller.action.myCert.MyCertUpdateFormAction;
import com.mms.controller.action.pl.PlDeleteAction;
import com.mms.controller.action.pl.PlListFormAction;
import com.mms.controller.action.pl.PlRegisterAction;
import com.mms.controller.action.pl.PlRegisterFormAction;
import com.mms.controller.action.pl.PlSearchFormAction;
import com.mms.controller.action.pl.SearchPlNameAction;
import com.mms.controller.action.pls.PlsDeleteAction;
import com.mms.controller.action.pls.PlsRegisterAction;
import com.mms.controller.action.pls.PlsUpdateFormAction;
import com.mms.controller.action.portpolio.PortpolioDeleteAction;
import com.mms.controller.action.portpolio.PortpolioListFormAction;
import com.mms.controller.action.portpolio.PortpolioReadFormAction;
import com.mms.controller.action.portpolio.PortpolioRegistFormAction;
import com.mms.controller.action.portpolio.PortpolioRegisterAction;
import com.mms.controller.action.portpolio.PortpolioUpdateAction;
import com.mms.controller.action.portpolio.PortpolioUpdateFormAction;

public class ProgrammerActionFactory {
	private static ProgrammerActionFactory instance = new ProgrammerActionFactory();

	private ProgrammerActionFactory() {
		super();
	}

	public static ProgrammerActionFactory getInstance() {
		return instance;
	}

	public Action getAction(String command) {
		Action action = null;

		System.out.println("ProgrammerActionFactory : " + command);

		/**
		 * @author LEE HAN
		 */
		if (command.equals("memberSetForm")) {
			action = new MemberSetFormAction();

		} else if (command.equals("memberUpdate")) {
			action = new MemberUpdateAction();

		} else if (command.equals("careerListForm")) {
			action = new CareerListFormAction();

		} else if (command.equals("careerRegister")) {
			action = new CareerRegisterAction();

		} else if (command.equals("careerDelete")) {
			action = new CareerDeleteAction();

		} else if (command.equals("careerUpdateForm")) {
			action = new CareerUpdateFormAction();

		} else if (command.equals("careerUpdate")) {
			action = new CareerUpdateAction();

		}
		else if (command.equals("profileForm")) {
			action = new ProfileFormAction();

		}else if (command.equals("portpolioReadForm")) {
			action = new PortpolioReadFormAction();

		}else if (command.equals("portpolioDelete")) {
			action = new PortpolioDeleteAction();
		}else if (command.equals("portpolioRegister")) {
			action = new PortpolioRegisterAction();
		}else if (command.equals("portpolioUpdateForm")) {
			action = new PortpolioUpdateFormAction();
		}else if (command.equals("portpolioUpdate")) {
			action = new PortpolioUpdateAction();
		}

		/**
		 * @author PJH
		 */


		else if (command.equals("eduListForm")) {
			action = new EduListFormAction();
		}else if (command.equals("eduRegister")) {
			action = new EduRegisterAction();
		}else if (command.equals("eduDelete")) {
			action = new EduDeleteAction();
		}else if(command.equals("eduUpdateForm")) {
			action = new EduUpdateFormAction();	
		}else if(command.equals("eduUpdate")) {
			action = new EduUpdateAction();
		}else if(command.equals("plsRegister")) {
			action = new PlsRegisterAction();	
		}else if(command.equals("plsDelete")) {
			action = new PlsDeleteAction();	
		}else if(command.equals("plsUpdateForm")) {
			action = new PlsUpdateFormAction();	
		}
		else if(command.equals("searchPlName")) {
			action = new SearchPlNameAction();	
		}
		else if (command.equals("introduceUpdateForm")) {
			action = new IntroduceUpdateFormAction();
		}else if (command.equals("introduceUpdate")) {
			action = new IntroduceUpdateAction();
		}
		
		else if (command.equals("intorduceList")) {
			action = new IntroduceListAction();
		}
		else if (command.equals("resumeForm")) {
			action = new ResumeFormAction();
		}

		/**
		 * @author OSJ
		 */
		// 자격증
		else if (command.equals("certListForm")) {
			action = new CertListFormAction();
		} 
		else if (command.equals("certRegistForm")) {
			action = new CertRegistFormAction();
		} else if (command.equals("certRegist")) {
			action = new CertRegistAction();
		} else if (command.equals("certSearchForm")) {
			action = new CertSearchFormAction();
		} 
		else if (command.equals("searchCertName")) {
			action = new SearchCertNameAction();
		}
		

		// 보유 자격증
		else if (command.equals("myCertListForm")) {
			action = new MyCertListFormAction();
		} else if (command.equals("myCertDelete")) {
			action = new MyCertDeleteAction();
		}
		else if(command.equals("myCertRegist")) {
			action = new MyCertRegistAction();
		}
		else if(command.equals("myCertUpdateForm")) {
			action = new MyCertUpdateFormAction();
		}
		else if(command.equals("myCertUpdate")) {
			action = new MyCertUpdateAction();
		}
		

		// 포트폴리오
		else if (command.equals("portpolioListForm")) {
			action = new PortpolioListFormAction();
		}
		
		else if (command.equals("portpolioRegister")) {
			action = new PortpolioRegistFormAction();
		}

		/**
		 * @author LYJ
		 */
		else if (command.equals("plSearchForm")) {
			action = new PlSearchFormAction();
		}
		
		else if (command.equals("plListForm")) {
			action = new PlListFormAction();
		} else if (command.equals("plDelete")) {
			action = new PlDeleteAction();
		} else if (command.equals("plRegister")) {
			action = new PlRegisterAction();
		} else if (command.equals("plRegisterForm")) {
			action = new PlRegisterFormAction();
		} else if (command.equals("grantListForm")) {
			action = new GrantListFormAction();
		} else if (command.equals("grantUpdate")) {
			action = new GrantUpdateAction();
		} else if (command.equals("grantUpdateForm")) {
			action = new GrantUpdateFormAction();
		} else if (command.equals("certDelete")) {
			action = new CertDeleteAction();
		} else if (command.equals("messageListForm")) {
			action = new MessageListFormAction();
		} else if (command.equals("programmerSearchForm")) {
			action = new ProgrammerSearchFormAction();
		} else if (command.equals("messageSendViewForm")) {
			action = new MessageSendViewFormAction();
		} else if (command.equals("messageReceiveViewForm")) {
			action = new MessageReceiveViewFormAction();
		} else if (command.equals("messageRegister")) {
			action = new MessageRegisterAction(); 
		} else if (command.equals("messageRegisterForm")) {
			action = new MessageRegisterFormAction();
		} else if (command.equals("msgRegisterForm")) {
			action= new MsgRegisterFormAction();
		} else if (command.equals("receiveMsgDelete")) {
			action = new ReceiveMsgDeleteAction();
		} else if (command.equals("sendMsgDelete")) {
			action = new SendMsgDeleteAction();
		}

		return action;
	}

}
