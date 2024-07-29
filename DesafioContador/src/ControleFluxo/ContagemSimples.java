package ControleFluxo;

 class ContagemSimples implements ContagemStrategy {
	    @Override
	    public void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
	        if (parametroUm >= parametroDois) {
	            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
	        }
	        
	        int contagem = parametroDois - parametroUm;
	        for (int c = 0; c < contagem; c++) {
	            System.out.println("Imprimindo o número " + (parametroUm + c));
	        }
	    }
	}

