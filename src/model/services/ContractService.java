package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymenteService;

	public ContractService(OnlinePaymentService onlinePaymenteService) {
		this.onlinePaymenteService = onlinePaymenteService;
	}

	public void processContract(Contract contract, Integer months) {
		contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.54));
		contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));
	}
}
