 " Processing Fee");
		System.out.println("--------------------------------------------------------------------------");
		for (int i = 0; i < transaction.size(); i++) {
			// System.out.println(transaction.get(i).getPriorityFlag());
			if ("Y".equals(transaction.get(i).getPriorityFlag())) {
				table.addCell(transaction.get(i).getClientId());
				table.addCell(transaction.get(i).getTransactionType());
				table.addCell(transaction.get(i).getTransactionDate());
				table.addCell(transaction.get(i).getPriorityFlag());
				table.addCell("500 $");

				System.out.print(transaction.get(i).getClientId() + "            |");
				System.out.print(transaction.get(i).getTransactionType() + "            |");
				System.out.print(transaction.get(i).getTransact