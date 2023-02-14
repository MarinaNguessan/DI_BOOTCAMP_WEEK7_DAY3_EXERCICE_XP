package atos;

public class Exercice2Tri {

	
	 public static <E extends Comparable<E>> void selectionSort(E[] list) {
		    for (int i = 0; i < list.length - 1; i++) {
		        // trouver le minimum
		        int minIndex = i;
		        for (int j = i + 1; j < list.length; j++) {
		            if (list[j].compareTo(list[minIndex]) < 0) {
		                minIndex = j;
		            }
		        }

		        // échanger avec l'élément courant si nécessaire
		        if (minIndex != i) {
		            E temp = list[i];
		            list[i] = list[minIndex];
		            list[minIndex] = temp;
		        }
		        }
		    }
	
	
	public static void main(String[] args) {
		
		Integer[] intArray = {2, 9, 5, 4, 8, 1, 6};

	    System.out.println("Tableau non trié :");
	    for (int i : intArray) {
	        System.out.print(i + " ");
	    }

	    selectionSort(intArray);

	    System.out.println("\n\nTableau trié :");
	    for (int i : intArray) {
	        System.out.print(i + " ");
	    }
	    }

	}


