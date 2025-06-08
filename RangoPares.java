package ejercicioiterador2;


	
	
	public class RangoPares implements Iterable<Integer> {
	    private int inicio;
	    private int fin;

	    public RangoPares(int inicio, int fin) {
	        this.inicio = inicio;
	        this.fin = fin;
	    }

	    @Override
	    public java.util.Iterator<Integer> iterator() {
	        return new IteradorPares();
	    }

	    private class IteradorPares implements java.util.Iterator<Integer> {
	        private int actual;

	        public IteradorPares() {
	            if (inicio % 2 == 0) {
	                actual = inicio;
	            } else {
	                actual = inicio + 1;
	            }
	        }

	        @Override
	        public boolean hasNext() {
	            return actual <= fin;
	        }

	        @Override
	        public Integer next() {
	            int numero = actual;
	            actual += 2;
	            return numero;
	        }
	    }

	 
	}

