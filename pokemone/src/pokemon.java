//Ǯ<��<��<����<��<Ǯ
public class pokemon {
	// [�Ӽ�]
	String name;
	String type;
	
	int maxHp;
	int presentHp;
	
	int maxMp;
	int presentMp;
	
	int attack;
	
	int defence;
	int presentDefence;
	
//--------------------------------------------------------------//

	// [������] only �ʼ��׸�� 
	public pokemon(String name) {
		this.name = name;
	}	

//--------------------------------------------------------------//

	// [Ÿ�Ժ� ��]
	public String pokemonType(pokemon enemy) {
		
	String result = null; // ���谡 ���� ��쵵 ������ �� ��츦 null ���� �־�����Ѵ�.
	
	//Ǯ<��<��<����<��<Ǯ
	switch(this.type){
	    
		case "��":
	    	if(enemy.type=="����") {
	    		result = "����";

	    	}else if(enemy.type == "Ǯ") {
	    		result = "����";

	    	}break;
	    
	    case "��":
	        if(enemy.type=="Ǯ") {
	        	result = "����";

	        }else if(enemy.type =="��") {
	        	 result = "����";
	        }break;
	    
	    case "��":
	        if(enemy.type=="��") {
	            result = "����";
	        }else if(enemy.type =="����") {
	            result = "����"; 
	        }break;
	    
	    case "Ǯ":
	    	if(enemy.type=="��") {
	    		result = "����";
	    	}else if(enemy.type == "��") {
	    		result = "����";
	    	}
	    	break;
	   
	    case "����":
	        if(enemy.type=="��") {
	            result = "����";
	        }else if(enemy.type =="��") {
	             result = "����"; 
	        }
	        break;
	  }
	
		return result;
	
	}

	//--------------------------------------------------------------//
	
	// [�⺻����]
	public void �⺻����(pokemon enemy){ 
		String goodBad = pokemonType(enemy);
		int damage;
		if(goodBad == "����") {
			 damage = (int) (attack  * 1.3);
		}else {
			 damage = (int) (attack  * 0.8);
		}
		System.out.println("�⺻������ �����ߴ�.");
		
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
	}
	
//--------------------------------------------------------------//

	// [��ų1-����]
	public void ��ų1(pokemon enemy){
		String goodBad = pokemonType(enemy);
		int damage = (int) (this.attack*1.2);
		int costMp = 30;
		
		if(goodBad == "����") {
			 damage = (int)( damage * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
			
		System.out.println("������� ��ų�� ����ߴ�!");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		this.presentMp = this.presentMp-costMp;
	}
	
	// [��ų2-����]
	public void ��ų2(pokemon enemy){
		String goodBad = pokemonType(enemy);
		
		int damage = (int) (this.attack*1.5);
		int costMp = 50;
		
		if(goodBad == "����") {
			 damage = (int) (damage  * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
				
		System.out.println("��ȭ�� ������� ��ų�� ����ߴ�.");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		this.presentMp = this.presentMp-costMp;
	}
	
//--------------------------------------------------------------//

	// [��ų3-��]
	public void ��ų3(pokemon enemy){
		String goodBad = pokemonType(enemy);
		int damage = (int) (this.attack*1.2);
		int costMp = 30;
		
		if(goodBad == "����") {
			 damage = (int)( damage * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
			
		System.out.println("�ұ�� ��ų�� ����ߴ�!");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		this.presentMp = this.presentMp-costMp;
	}
	
	// [��ų4-��]
	public void ��ų4(pokemon enemy){
		String goodBad = pokemonType(enemy);
		
		int damage = (int) (this.attack*1.5);
		int costMp = 50;
		
		if(goodBad == "����") {
			 damage = (int) (damage  * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
				
		System.out.println("��ȭ�� �ұ�� ��ų�� ����ߴ�.");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		this.presentMp = this.presentMp-costMp;
	}

//--------------------------------------------------------------//

		// [��ų5-Ǯ]
	public void ��ų5(pokemon enemy){
		String goodBad = pokemonType(enemy);
		int damage = (int) (this.attack*1.2);
		int costMp = 30;
		
		if(goodBad == "����") {
			 damage = (int)( damage * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
			
		System.out.println("�������� ��ų�� ����ߴ�!");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		this.presentMp = this.presentMp-costMp;
	}

	// [��ų6-Ǯ]
	public void ��ų6(pokemon enemy){
		String goodBad = pokemonType(enemy);
		
		int damage = (int) (this.attack*1.5);
		int costMp = 50;
		
		if(goodBad == "����") {
			 damage = (int) (damage  * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
				
		System.out.println("��ȭ�� �������� ��ų�� ����ߴ�.");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		this.presentMp = this.presentMp-costMp;
	}

//--------------------------------------------------------------//

	// [��ų7-��]
	public void ��ų7(pokemon enemy){
		String goodBad = pokemonType(enemy);
		int damage = (int) (this.attack*1.2);
		int costMp = 30;
		
		if(goodBad == "����") {
			 damage = (int)( damage * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
			
		System.out.println("������ ��ų�� ����ߴ�!");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		this.presentMp = this.presentMp-costMp;
	}

	// [��ų8-��]
	public void ��ų8(pokemon enemy){
		
		
		int defence = (int) (this.defence + 50);
		int costMp = 50;
		
		System.out.println("������ �� ��ų�� ����ߴ�.");
		this.presentDefence = defence; 
		this.presentMp = this.presentMp-costMp;
	}

//--------------------------------------------------------------//

	// [��ų9-��]
	public void ��ų9(pokemon enemy){
		String goodBad = pokemonType(enemy);
		int damage = (int) (this.attack*1.2);
		int costMp = 30;
		
		if(goodBad == "����") {
			 damage = (int)( damage * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
			
		System.out.println("������ ��ų�� ����ߴ�!");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		this.presentMp = this.presentMp-costMp;
	}
	
	// [��ų10-��]
	public void ��ų10(pokemon enemy){
		String goodBad = pokemonType(enemy);
		
		int damage = (int) (this.attack*1.5);
		int costMp = 50;
		
		if(goodBad == "����") {
			 damage = (int) (damage  * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
				
		System.out.println("��ȭ�� ������ ��ų�� ����ߴ�.");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		this.presentMp = this.presentMp-costMp;
	}
	
}