public class typeElec extends pokemon {

//	int skill1Mp = 30;
	public typeElec(String name,int maxHp,int attack, int defence, int maxMp){
		super(name);
		super.type = "����";
		
		super.maxHp = maxHp;
		super.presentHp = maxHp;
		
		super.maxMp = maxMp;
		super.presentMp = maxMp;
	
		super.attack = attack;
		
		super.defence = defence;
		super.presentDefence = defence;
	} 
	//��ų1
	public void ��ų1(pokemon enemy){
		String goodBad = pokemonType(enemy);
		int damage = (int) (super.attack*1.2);
		int costMp = 30;
		
		if(goodBad == "����") {
			 damage = (int)( damage * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
			
		System.out.println("������� ��ų�� ����ߴ�!");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		super.presentMp = super.presentMp-costMp;
	}
	
	//��ų2
	public void ��ų2(pokemon enemy){
		String goodBad = pokemonType(enemy);
		
		int damage = (int) (super.attack*1.5);
		int costMp = 50;
		
		if(goodBad == "����") {
			 damage = (int) (damage  * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
				
		System.out.println("��ȭ�� ������� ��ų�� ����ߴ�.");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		super.presentMp = super.presentMp-costMp;
	}
	
	
	// 20*1.5(��ų����)*1.3(��) = 39
	// 39-3(����) = 36
	// �׷��� ���α��� ü�� 100 - 36 = 64
	// ������ ���� ü�� 64����.
}