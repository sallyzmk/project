public class typeFire extends pokemon{

	public typeFire(String name,int maxHp,int attack, int defence, int maxMp){
		super(name);
		super.type = "��";
		
		super.maxHp = maxHp;
		super.presentHp = maxHp;
		
		super.maxMp = maxMp;
		super.presentMp = maxMp;
	
		super.attack = attack;
		
		super.defence = defence;
		super.presentDefence = defence;
		
		
	} 
	//��ų3
	public void ��ų3(pokemon enemy){
		String goodBad = pokemonType(enemy);
		int damage = (int) (super.attack*1.2);
		int costMp = 30;
		
		if(goodBad == "����") {
			 damage = (int)( damage * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
			
		System.out.println("�ұ�� ��ų�� ����ߴ�!");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		super.presentMp = super.presentMp-costMp;
	}
	
	//��ų4
	public void ��ų4(pokemon enemy){
		String goodBad = pokemonType(enemy);
		
		int damage = (int) (super.attack*1.5);
		int costMp = 50;
		
		if(goodBad == "����") {
			 damage = (int) (damage  * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
				
		System.out.println("��ȭ�� �ұ�� ��ų�� ����ߴ�.");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		super.presentMp = super.presentMp-costMp;
	}

}