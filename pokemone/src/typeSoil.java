public class typeSoil extends pokemon{

	public typeSoil(String name,int maxHp,int attack, int defence, int maxMp){
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
	//��ų7
	public void ��ų7(pokemon enemy){
		String goodBad = pokemonType(enemy);
		int damage = (int) (super.attack*1.2);
		int costMp = 30;
		
		if(goodBad == "����") {
			 damage = (int)( damage * 1.3);
		}else {
			 damage = (int) (damage  * 0.8);
		}
			
		System.out.println("������ ��ų�� ����ߴ�!");
		enemy.presentHp = enemy.presentHp - (damage - enemy.defence);
		super.presentMp = super.presentMp-costMp;
	}
//��ų8
	public void ��ų8(pokemon enemy){
		
		
		int defence = (int) (super.defence + 50);
		int costMp = 50;
		
		System.out.println("������ �� ��ų�� ����ߴ�.");
		super.presentDefence = defence; 
		super.presentMp = super.presentMp-costMp;
	}
	
}