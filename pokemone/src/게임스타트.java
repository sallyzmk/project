import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ���ӽ�ŸƮ {//class ����
	static Scanner sc = new Scanner(System.in);
	Player player = new Player();
	public static void main(String[] args) { //���� ����
		// TODO Auto-generated method stub
		
		// [���ϸ��� 50����]
		//Electric(�̸�, ü��, ���ݷ�, ���, ����)
		typeElec ��ī�� = new typeElec("��ī��", 100, 20, 5, 50);
		typeElec ������ = new typeElec("������", 120, 22, 6, 60);
		typeElec ���� = new typeElec("����", 115, 23, 2, 50);
		typeElec �������� = new typeElec("��������", 120, 26, 3, 60);
		typeElec ����� = new typeElec("�����", 100, 23, 4, 50);
		typeElec �պ� = new typeElec("�պ�", 120, 25, 3, 50);
		typeElec ������ = new typeElec("������", 130, 28, 8, 70);
		typeElec ���ǽ�� = new typeElec("���ǽ��", 160, 25, 10, 70);
		typeElec ����Ű�� = new typeElec("����Ű��", 115, 23, 2, 60);
		typeElec ��� = new typeElec("���", 200, 30, 10, 80);

		//Fire(�̸�, ü��, ���ݷ�, ���, ����)
		typeFire ���̸� = new typeFire("���̸�",100,22,3,50);
		typeFire ���ڵ� = new typeFire("���ڵ�",120,24,4,60);
		typeFire ���ڸ� = new typeFire("���ڸ�",140,26,3,70);
		typeFire �Ľ����� = new typeFire("�Ľ�����",105,23,3,50);
		typeFire �������� = new typeFire("��������",110,24,4,60);
		typeFire ���׸� = new typeFire("���׸�",125,25,5,60);
		typeFire ������ = new typeFire("������",121,23,3,50);
		typeFire �������� = new typeFire("��������",123,24,3,60);
		typeFire ���� = new typeFire("����",120,26,5,50);
		typeFire ���̾� = new typeFire("���̾�",200,31,10,70);

		//Water(�̸�, ü��, ���ݷ�, ���, ����)
		typeWater ���α�= new typeWater("���α�",100,22,3,50);
		typeWater ���ĸ�= new typeWater("���ĸ�",120,24,5,70);
		typeWater ŷũ��= new typeWater("ŷũ��",110,20,6,50);
		typeWater �ߵ���= new typeWater("�ߵ���",130,20,10,50);
		typeWater ����Ÿ= new typeWater("����Ÿ",125,25,4,60);
		typeWater ���󵵽�= new typeWater("���󵵽�",140,25,12,70);
		typeWater �׾�ŷ= new typeWater("�׾�ŷ",130,23,6,60);
		typeWater ������= new typeWater("������",130,21,5,60);
		typeWater �Ͻ�Ÿ= new typeWater("�Ͻ�Ÿ",130,26,5,60);
		typeWater ����Ǫ��= new typeWater("����Ǫ��",120,21,11,60);

		//Plant(�̸�, ü��, ���ݷ�, ���, ����)
		typePlant �̻��ؾ�= new typePlant("�̻��ؾ�",100,22,3,50);
		typePlant �ѹ���= new typePlant("�ѹ���",100,21,3,40);
		typePlant ������= new typePlant("������",110,22,4,50);
		typePlant ���÷��þ�= new typePlant("���÷��þ�",120,23,5,70);
		typePlant �Ķ�= new typePlant("�Ķ�",105,21,3,50);
		typePlant �Ķ�Ʈ= new typePlant("�Ķ�Ʈ",115,23,5,60);
		typePlant �����= new typePlant("�����",100,20,2,40);
		typePlant ������Ʈ= new typePlant("������Ʈ",130,25,10,60);
		typePlant �ƶ�= new typePlant("�ƶ�",100,22,3,50);
		typePlant ����= new typePlant("����",130,24,7,60);

		//Soil(�̸�, ü��, ���ݷ�, ���, ����)
		typeSoil �𷡵���= new typeSoil("�𷡵���",130,20,9,40);
		typeSoil ����= new typeSoil("����",140,21,10,50);
		typeSoil ��״�= new typeSoil("��״�",110,20,3,60);
		typeSoil ������= new typeSoil("������",110,21,4,40);
		typeSoil ������= new typeSoil("������",120,23,7,60);
		typeSoil �ս���= new typeSoil("�ս���",140,26,4,70);
		typeSoil ������= new typeSoil("������",110,20,4,50);
		typeSoil ��ī��= new typeSoil("��ī��",125,23,8,60);
		typeSoil �ڻѸ�= new typeSoil("�ڻѸ�",130,25,9,60);
		typeSoil �ϵ�ŷ= new typeSoil("�ϵ�ŷ",130,23,7,60);
		
		// [���ϸ��� �Ӽ��� ����Ʈ]
		// ����
		ArrayList<pokemon> elecList = new ArrayList<>();
			elecList.add(��ī��);
			elecList.add(������);
			elecList.add(����);
			elecList.add(��������);
			elecList.add(�����);
			elecList.add(�պ�);
			elecList.add(������);
			elecList.add(���ǽ��);
			elecList.add(����Ű��);
			elecList.add(���);

		// ��
		ArrayList<pokemon> fireList = new ArrayList<>();
			fireList.add(���̸�);
			fireList.add(���ڵ�);
			fireList.add(���ڸ�);
			fireList.add(�Ľ�����);
			fireList.add(��������);
			fireList.add(���׸�);
			fireList.add(������);
			fireList.add(��������);
			fireList.add(����);
			fireList.add(���̾�);

		// ��
		ArrayList<pokemon> waterList = new ArrayList<>();
			waterList.add(���α�);
			waterList.add(���ĸ�);
			waterList.add(ŷũ��);
			waterList.add(�ߵ���);
			waterList.add(����Ÿ);
			waterList.add(���󵵽�);
			waterList.add(������);
			waterList.add(�Ͻ�Ÿ);
			waterList.add(�׾�ŷ);
			waterList.add(����Ǫ��);

		//Ǯ
		ArrayList<pokemon> plantList = new ArrayList<>();
			plantList.add(�̻��ؾ�);
			plantList.add(�ѹ���);
			plantList.add(������);
			plantList.add(���÷��þ�);
			plantList.add(�Ķ�);
			plantList.add(�Ķ�Ʈ);
			plantList.add(�����);
			plantList.add(������Ʈ);
			plantList.add(�ƶ�);
			plantList.add(����);
		//��
		ArrayList<pokemon> soilList = new ArrayList<>();
			soilList.add(�𷡵���);
			soilList.add(����);
			soilList.add(��״�);
			soilList.add(������);
			soilList.add(������);
			soilList.add(�ս���);
			soilList.add(������);
			soilList.add(��ī��);
			soilList.add(�ڻѸ�);
			soilList.add(�ϵ�ŷ);
				
		// [���� ���ϸ� 12����]
		//typeBossSet1(�̸�, ü��, ���ݷ�, ���)
		bossSet1 ���ö� = new bossSet1("���ö�", 130, 20, 30, "��");
		bossSet1 �ɸ���� = new bossSet1("�ɸ����", 130, 19, 30, "��");
		bossSet1 ��ũ�ι� = new bossSet1("��ũ�ι�", 130, 18, 30, "����");
		bossSet1 �Ǻ� = new bossSet1("�Ǻ�", 130, 17, 30, "��");

		//typeBossSet2(�̸�, ü��, ���ݷ�, ���)
		bossSet2 ��ī�� = new bossSet2("��ī��", 130, 22, 10, "��");
		bossSet2 ����ġ = new bossSet2("����ġ", 130, 20, 9, "��");
		bossSet2 �񸮵�� = new bossSet2("�񸮵��", 130, 19, 9, "Ǯ");
		bossSet2 �޴� = new bossSet2("�޴�", 130, 12, 9, "����");

		//typeBossSet3(�̸�, ü��, ���ݷ�, ���)
		bossSet3 Ȱȭ���� = new bossSet3("Ȱȭ����", 130, 22,9, "��");
		bossSet3 ���ʰ� = new bossSet3("���ʰ�", 130, 18,10, "��");
		bossSet3 ��ǳ = new bossSet3("��ǳ", 130, 16,11, "Ǯ");
		bossSet3 �ϸ��� = new bossSet3("�ϸ���", 130, 15,12, "��");
		
		// [���� ���ϸ� ��Ʈ�� ����Ʈ]
		ArrayList<pokemon> bossSetlist1 = new ArrayList<>();
			bossSetlist1.add(���ö�);
			bossSetlist1.add(�ɸ����);
			bossSetlist1.add(��ũ�ι�);
			bossSetlist1.add(�Ǻ�);

		ArrayList<pokemon> bossSetlist2 = new ArrayList<>(); 
			bossSetlist2.add(��ī��);
			bossSetlist2.add(����ġ);
			bossSetlist2.add(�񸮵��);
			bossSetlist2.add(�޴�);

		ArrayList<pokemon> bossSetlist3 = new ArrayList<>();
			bossSetlist3.add(Ȱȭ����);
			bossSetlist3.add(���ʰ�);
			bossSetlist3.add(��ǳ);
			bossSetlist3.add(�ϸ���);
		
		
		// [���� ����]
		gameStart();
		Player player = new Player();
		
		// [���ʸ���]
		System.out.println("���ϸ����� ���迡 ���� ���� ȯ���մϴ�.");
		timedelay(500);
		System.out.println("����� ĳ���� �̸��� �ۼ����ּ��� : ");
		String playerName = sc.next();
		player.setName(playerName);
		System.out.print("-");
		timedelay(200);
		System.out.print("-");
		timedelay(200);
		System.out.print("-");
		timedelay(200);
		System.out.print("��");
		timedelay(200);
		System.out.print("��");
		timedelay(200);
		System.out.print("�� ");
		timedelay(200);
		System.out.print("��");
		timedelay(200);
		System.out.print("��");
		timedelay(200);
		System.out.print("�� ");
		timedelay(200);
		System.out.print("��");
		timedelay(200);
		System.out.print("��");
		timedelay(200);
		System.out.print("��");
		timedelay(200);
		System.out.print("��");
		timedelay(200);
		System.out.print("-");
		timedelay(200);
		System.out.print("-");
		timedelay(200);
		System.out.print("-");
		timedelay(200);
		System.out.println("");
		System.out.printf("���ڻ� : ����? �ڳ�  %s���ݾ�! �̾� ���� �Ǵµ�?", player.getName());
		timedelay(1000);
		System.out.println("");
		System.out.println("       �� ���� �ڽ��� ���ϸ��� ������ ���� ���ٰ� �ϴ���?");
		timedelay(1000);
		System.out.println("       �� �� ������ ��� ����");
		timedelay(1000);
		
		
		// [��Ÿ�� ���ϸ� ����]
		pokemon myStartingPokemon  = null;
		myStartingPokemon = selectStartPokemon(myStartingPokemon,���α�, ���̸�, �̻��ؾ�);
		ArrayList<pokemon> myPokemonList = new ArrayList<>();
		myPokemonList.add(myStartingPokemon);
		player.myPokemonList = myPokemonList;
		
		
		// [���� ���� ��ŵ����]
		System.out.println("");
		System.out.println("���ڻ� : ���ϸ� Ʈ���̴��� ó���̴�??");
		timedelay(1000);
		System.out.println("--- 1. ���� ������ ��´�---");
		System.out.println("--- 2. S K I P ---");
		int skipOrNot = sc.nextInt();
		Explanation(skipOrNot,player);
		
		// �� ���� 1~6 switch case��
		// 6. ü����
		// ������ ��Ʈ�� ������ Ž�� �Լ� ����
		//���� �Լ�(�ο��/����ġ��/��������/���/��������)
		//System.out.println("�̵��Ͻ� ������ ������ �ּ���.");
		//System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
		//int Space = sc.nextInt();
		//Ž��(Space,player.getName());
		
		}///////���� ��
	
	
	//-----------�Լ� ����---------//
	
	// [�ð� ���� �Լ� ����]
	public static void timedelay(int milliseconds) {
		try {	
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			System.out.println("error");
		}
	}// [�ð� ���� �Լ� ��]
	
	// [���� ���� �Լ� ����]
	public static void gameStart() {
		System.out.println("���ϸ� ������ �����մϴ�.");
		timedelay(1000);
		System.out.println("���� ������ ���Ͻø� '���ӽ���'�� �Է����ּ���");
		String gamestart = sc.next();
		if(gamestart.equals("���ӽ���")) {
			System.out.println("������ �����մϴ�.");
			System.out.println("-------------");
		}else {
			System.out.println("��Ÿ�� �ֽ��ϴ�. ��Ȯ�� ���� �Է����ּ���.");
			System.out.println("-------------");
		}
	}// [���� ���� ��]
	
	// [��Ÿ�� ���ϸ� �Լ� ����]
	public static pokemon selectStartPokemon(pokemon myStartingPokemon,pokemon ���α�,  pokemon ���̸�, pokemon �̻��ؾ�) {
		System.out.println("| 1-���α� | 2-���̸� | 3-�̻��ؾ� |");
		System.out.print("���Ͻô� ���ϸ��� ��ȣ�� �Է��� �ּ��� : ");
		timedelay(500);
		System.out.print("���ڰ� �ƴ� ���� �Է��Ͻø� ������ ����ϴ�.");
		String userPickPockmon = sc.next();
		switch(userPickPockmon) {
			case "1":
				myStartingPokemon = ���α�;
				System.out.println("-------------");
				System.out.printf("����� �� ���ϸ��� %s�Դϴ�.\n",myStartingPokemon.name);
				System.out.println("-------------");
				break;
			case "2":
				myStartingPokemon = ���̸�;
				System.out.println("-------------");
				System.out.printf("����� �� ���ϸ��� %s�Դϴ�.\n",myStartingPokemon.name);
				System.out.println("-------------");
				break;
			case "3":
				myStartingPokemon = �̻��ؾ�;
				System.out.println("-------------");
				System.out.printf("����� �� ���ϸ��� %s�Դϴ�.\n",myStartingPokemon.name);
				System.out.println("-------------");
				break;	
			default: 
				System.out.println("�Է°��� �߸��Ǿ����ϴ�. ���� 1 ~ 3�� �Է��� �ּ���.");
				selectStartPokemon(myStartingPokemon,���α�, ���̸�, �̻��ؾ�);
		}
		return myStartingPokemon;
	}// [��Ÿ�� ���ϸ� �Լ� ��]
	
	// [���� ���� �Լ� ����]
	public static void Explanation(int skipOrNot, Player player) {
		switch (skipOrNot){
		case 1:		// 1. ���� ������ ��´�
			System.out.println("���ڻ� : ���� �ʵ� ��� ���ϸ� Ʈ���̳ʰ� �Ǿ����� ������ ���� �˷��ָ�!");
			timedelay(1000);
			System.out.println("       ���ϸ��� �� 5���� �Ӽ��� �ִܴ�.");
			timedelay(1000);
			System.out.println("       ���� Ǯ<��<��<����<��<Ǯ ������� ���� ������");
			timedelay(1000);
			System.out.println("       �׷��� ������ �� ������ ��� ���ϸ��� �Ӽ��� �� �ؾ߰���?");
			System.out.println("--------------------------------------------");
			timedelay(2000);
			System.out.println("���ڻ� : �߻� ���ϸ���� ���� �߿��� ���ϸ� ���� Ȱ���Ͽ� ���ϸ��� ������ �� �ִܴ�.");
			timedelay(1000);
			System.out.println("       �ٸ� �ִ� 4���� ������ ���������ϰ�, �� �̻� ������ 5���� �� �ݵ�� �� ������ ������ ������ �Ѵܴ�!");
			timedelay(1000);
			System.out.println("       �� �Ǵ��Ͽ� �ʸ��� �Ǹ��� ���ϸ� ������ ����� �ٶ���!");
			System.out.println("--------------------------------------------");
			timedelay(2000);
			System.out.println("���ڻ� : ���ϸ��� ����� �Ʒ��ߴٸ� ü�������� ���� ������� ã�ƺƷ�!");
			timedelay(1000);
			System.out.println("       �и� ���� ����ħ�� �ֽǰŶ���!");
			timedelay(1000);
			System.out.println("       ���� ������� �׻� ���Ӽ�, �ҼӼ� ���ϸ���� ������ �����Ŵٰ� �ϼ̾�.");
			timedelay(1000);
			System.out.println("       ����� ���!");
			timedelay(2000);
			System.out.println("�̵��Ͻ� ������ ������ �ּ���.");
			System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
			int firstMovingSpace1 = sc.nextInt();
			Ž��(firstMovingSpace1,player);
			break;
		case 2:		//2. S K I P
			System.out.println("���ڻ� : �׷��ٸ� ����� ���!");
			timedelay(2000);
			System.out.println("�̵��Ͻ� ������ ������ �ּ���.");
			System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
			int firstMovingSpace2 = sc.nextInt();
			Ž��(firstMovingSpace2,player);
			break;
		default: 
			System.out.println("�Է°��� �߸��Ǿ����ϴ�. ���� 1 �Ǵ� 2�� �Է��� �ּ���.");
			System.out.println("--- 1. ���� ������ ��´�---");
			System.out.println("--- 2. S K I P ---");
			int Explanationwrong = sc.nextInt();
			Explanation(Explanationwrong, player);
			break;
		}
	}// [���� ���� �Լ� ��]

	
	// [�� �Լ� ����]
	public static void Ž��(int Space, Player player) {
		switch (Space) {
		
		case 1:		//1-Ǯ����
			System.out.println("��! �߻��� Ǯ �Ӽ� ���ϸ��� Ƣ��Դ�!");
			timedelay(1000);
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("| 1-�ο�� | 2-�������� |");
			int chooseFightOrRun1 = sc.nextInt();
			
			// Ǯ�Ӽ� ���ϸ�
			typePlant �̻��ؾ�= new typePlant("�̻��ؾ�",100,22,3,50);
			typePlant �ѹ���= new typePlant("�ѹ���",100,21,3,40);
			typePlant ������= new typePlant("������",110,22,4,50);
			typePlant ���÷��þ�= new typePlant("���÷��þ�",120,23,5,70);
			typePlant �Ķ�= new typePlant("�Ķ�",105,21,3,50);
			typePlant �Ķ�Ʈ= new typePlant("�Ķ�Ʈ",115,23,5,60);
			typePlant �����= new typePlant("�����",100,20,2,40);
			typePlant ������Ʈ= new typePlant("������Ʈ",130,25,10,60);
			typePlant �ƶ�= new typePlant("�ƶ�",100,22,3,50);
			typePlant ����= new typePlant("����",130,24,7,60);
			
			// Ǯ�Ӽ� ����Ʈ
			ArrayList<pokemon> plantList = new ArrayList<>();
			plantList.add(�̻��ؾ�);
			plantList.add(�ѹ���);
			plantList.add(������);
			plantList.add(���÷��þ�);
			plantList.add(�Ķ�);
			plantList.add(�Ķ�Ʈ);
			plantList.add(�����);
			plantList.add(������Ʈ);
			plantList.add(�ƶ�);
			plantList.add(����);
			
			// ���� ���� ����
			fightOrRun(chooseFightOrRun1, player.myPokemonList, plantList);
			//�����Լ�(�÷��̾� ���ϸ󸮽�Ʈ, �ο� ����Ʈ)

			//���� ���� �� �̵�
			System.out.println("�������� �̵��Ͻ� ������ ������ �ּ���.");
			System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
			int movingSpace1 = sc.nextInt();
			Ž��(movingSpace1,player);
			break;
			
		case 2:		//2-�Ҹ���
			System.out.println("��! �߻��� �� �Ӽ� ���ϸ��� Ƣ��Դ�!");
			timedelay(1000);
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("| 1-�ο�� | 2-�������� |");
			int chooseFightOrRun2 = sc.nextInt();
			
			// �ҼӼ� ���ϸ�
			typeFire ���̸� = new typeFire("���̸�",100,22,3,50);
			typeFire ���ڵ� = new typeFire("���ڵ�",120,24,4,60);
			typeFire ���ڸ� = new typeFire("���ڸ�",140,26,3,70);
			typeFire �Ľ����� = new typeFire("�Ľ�����",105,23,3,50);
			typeFire �������� = new typeFire("��������",110,24,4,60);
			typeFire ���׸� = new typeFire("���׸�",125,25,5,60);
			typeFire ������ = new typeFire("������",121,23,3,50);
			typeFire �������� = new typeFire("��������",123,24,3,60);
			typeFire ���� = new typeFire("����",120,26,5,50);
			typeFire ���̾� = new typeFire("���̾�",200,31,10,70);
			
			// �ҼӼ� ����Ʈ
			ArrayList<pokemon> fireList = new ArrayList<>();
			fireList.add(���̸�);
			fireList.add(���ڵ�);
			fireList.add(���ڸ�);
			fireList.add(�Ľ�����);
			fireList.add(��������);
			fireList.add(���׸�);
			fireList.add(������);
			fireList.add(��������);
			fireList.add(����);
			fireList.add(���̾�);
			
			// ���� ���� ����
			fightOrRun(chooseFightOrRun2, player.myPokemonList, fireList);
			
			//���� ���� �� �̵�
			System.out.println("�������� �̵��Ͻ� ������ ������ �ּ���.");
			System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
			int movingSpace2 = sc.nextInt();
			Ž��(movingSpace2,player);
			break;
			
		case 3:		//3-������
			System.out.println("��! �߻��� �� �Ӽ� ���ϸ��� Ƣ��Դ�!");
			timedelay(1000);
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("| 1-�ο�� | 2-�������� |");
			int chooseFightOrRun3 = sc.nextInt();

			// ���Ӽ� ���ϸ�
			typeWater ���α�= new typeWater("���α�",100,22,3,50);
			typeWater ���ĸ�= new typeWater("���ĸ�",120,24,5,70);
			typeWater ŷũ��= new typeWater("ŷũ��",110,20,6,50);
			typeWater �ߵ���= new typeWater("�ߵ���",130,20,10,50);
			typeWater ����Ÿ= new typeWater("����Ÿ",125,25,4,60);
			typeWater ���󵵽�= new typeWater("���󵵽�",140,25,12,70);
			typeWater �׾�ŷ= new typeWater("�׾�ŷ",130,23,6,60);
			typeWater ������= new typeWater("������",130,21,5,60);
			typeWater �Ͻ�Ÿ= new typeWater("�Ͻ�Ÿ",130,26,5,60);
			typeWater ����Ǫ��= new typeWater("����Ǫ��",120,21,11,60);
			
			// ���Ӽ� ����Ʈ
			ArrayList<pokemon> waterList = new ArrayList<>();
			waterList.add(���α�);
			waterList.add(���ĸ�);
			waterList.add(ŷũ��);
			waterList.add(�ߵ���);
			waterList.add(����Ÿ);
			waterList.add(���󵵽�);
			waterList.add(������);
			waterList.add(�Ͻ�Ÿ);
			waterList.add(�׾�ŷ);
			waterList.add(����Ǫ��);
			
			// ���� ���� ����
			fightOrRun(chooseFightOrRun3,player. myPokemonList, waterList);

			//���� ���� �� �̵�
			System.out.println("�������� �̵��Ͻ� ������ ������ �ּ���.");
			System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
			int movingSpace3 = sc.nextInt();
			Ž��(movingSpace3,player);
			break;
			
		case 4:		//4-���⸶��
			System.out.println("��! �߻��� ���� �Ӽ� ���ϸ��� Ƣ��Դ�!");
			timedelay(1000);
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("| 1-�ο�� | 2-�������� |");
			int chooseFightOrRun4 = sc.nextInt();
			
			// ����Ӽ� ���ϸ�
			typeElec ��ī�� = new typeElec("��ī��", 100, 20, 5, 50);
			typeElec ������ = new typeElec("������", 120, 22, 6, 60);
			typeElec ���� = new typeElec("����", 115, 23, 2, 50);
			typeElec �������� = new typeElec("��������", 120, 26, 3, 60);
			typeElec ����� = new typeElec("�����", 100, 23, 4, 50);
			typeElec �պ� = new typeElec("�պ�", 120, 25, 3, 50);
			typeElec ������ = new typeElec("������", 130, 28, 8, 70);
			typeElec ���ǽ�� = new typeElec("���ǽ��", 160, 25, 10, 70);
			typeElec ����Ű�� = new typeElec("����Ű��", 115, 23, 2, 60);
			typeElec ��� = new typeElec("���", 200, 30, 10, 80);

			// ����Ӽ� ����Ʈ
			ArrayList<pokemon> elecList = new ArrayList<>();
			elecList.add(��ī��);
			elecList.add(������);
			elecList.add(����);
			elecList.add(��������);
			elecList.add(�����);
			elecList.add(�պ�);
			elecList.add(������);
			elecList.add(���ǽ��);
			elecList.add(����Ű��);
			elecList.add(���);
			
			// ���� ���� ����
			fightOrRun(chooseFightOrRun4, player.myPokemonList, elecList);

			//���� ���� �� �̵�
			System.out.println("�������� �̵��Ͻ� ������ ������ �ּ���.");
			System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
			int movingSpace4 = sc.nextInt();
			Ž��(movingSpace4,player);
			break;
		case 5:		//5-�븶��
			System.out.println("��! �߻��� �� �Ӽ� ���ϸ��� Ƣ��Դ�!");
			timedelay(1000);
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("| 1-�ο�� | 2-�������� |");
			int chooseFightOrRun5 = sc.nextInt();
			
			// ��Ӽ� ���ϸ�
			typeSoil �𷡵���= new typeSoil("�𷡵���",130,20,9,40);
			typeSoil ����= new typeSoil("����",140,21,10,50);
			typeSoil ��״�= new typeSoil("��״�",110,20,3,60);
			typeSoil ������= new typeSoil("������",110,21,4,40);
			typeSoil ������= new typeSoil("������",120,23,7,60);
			typeSoil �ս���= new typeSoil("�ս���",140,26,4,70);
			typeSoil ������= new typeSoil("������",110,20,4,50);
			typeSoil ��ī��= new typeSoil("��ī��",125,23,8,60);
			typeSoil �ڻѸ�= new typeSoil("�ڻѸ�",130,25,9,60);
			typeSoil �ϵ�ŷ= new typeSoil("�ϵ�ŷ",130,23,7,60);

			// ��Ӽ� ����Ʈ
			ArrayList<pokemon> soilList = new ArrayList<>();
			soilList.add(�𷡵���);
			soilList.add(����);
			soilList.add(��״�);
			soilList.add(������);
			soilList.add(������);
			soilList.add(�ս���);
			soilList.add(������);
			soilList.add(��ī��);
			soilList.add(�ڻѸ�);
			soilList.add(�ϵ�ŷ);
						
			// ���� ���� ����
			fightOrRun(chooseFightOrRun5, player.myPokemonList, soilList);

			//���� ���� �� �̵�
			System.out.println("�������� �̵��Ͻ� ������ ������ �ּ���.");
			System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
			int movingSpace5 = sc.nextInt();
			Ž��(movingSpace5,player);
			break;
		case 6:		//6-ü����
			///////presentPokemonNumber�� �Է� ���� player ���� ������ ������������!!!!
			System.out.println("���� �����O�� ���ϸ� ���� �Է��� �ּ���.");
			int presentPokemonNumber = sc.nextInt();
			////////
			if (presentPokemonNumber < 4){
				System.out.println("�����Ͻ� ���ϸ� ���� �����Ͽ� ü������ ������ �� �����ϴ�. 4������ ä��������!");
				System.out.println("�̵��Ͻ� ������ ������ �ּ���.");
				System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
				int cantSpace = sc.nextInt();
				Ž��(cantSpace,player);
				
			}else{
				System.out.printf("����� : �ʰ� �ٷ� %s�α���! ���ڻ�Բ� ���� ���� �����.",player.getName());
				System.out.println("");
				System.out.println("�󸶳� �����ߴ��� �� �� ����?");
				timedelay(1000);
				
				//////////
				System.out.println("������ ����Ǿ����ϴ�.");
				timedelay(1000);
				////�� �κп� ���� ���� �Լ� �Է�
				//////////
				//enemaBattle(player.myPokemonList,!!!!)
				
				System.out.println("�������� �̵��Ͻ� ������ ������ �ּ���.");
				System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
				int movingSpace6 = sc.nextInt();
				Ž��(movingSpace6,player);
			}
			break;
		default: 
			System.out.println("�Է°��� �߸��Ǿ����ϴ�. ���� 1 ~ 6������ ���ڸ� �Է��� �ּ���.");
			System.out.println("�̵��Ͻ� ������ ������ �ּ���.");
			System.out.println("| 1-Ǯ���� | 2-�Ҹ��� | 3-������ | 4-���⸶�� | 5-�븶�� | 6-ü���� |");
			int wrongSpace = sc.nextInt();
			Ž��(wrongSpace,player);
		}
	}// [�� �Լ� ��]
		
	
	// [���Ϻ� �Լ� ����]
	public static boolean ��ȹ��(int �ִ�HP, int ����HP, String ���ϸ��̸�) {
		// Ȯ��
		System.out.println("�÷��̾�� ���ͺ��� ����ߴ�!");
		double ��ȹ�� = (3*�ִ�HP-2*����HP)*150/(3*�ִ�HP);
//			System.out.println("��ȹ��:"+��ȹ�� );
		// ���� (1����ȹ���� ���� 255�� ������ ������ ��ȹ)
		if (��ȹ��>=255) {
			System.out.printf("�ų���! %s��(��) ����Ҵ�!", ���ϸ��̸�);
			return true;
		}
		
	// ���� (1����ȹ���� 255�� �ȳ��� ��� ��鸲������ �̿�)
		else {
			
		// ���Ƿ� 65535 ������ ���� 4�� ���ؼ� �迭�� ���������ϱ�
			double ��鸲��ȹ�� = ��ȹ��/255;
//				System.out.println("��鸲��ȹ��:"+��鸲��ȹ��);
			double ��鸲���� = 65535*Math.pow(��鸲��ȹ��, 1.0/4.0);	
									// Math.pow�� 4������ ����
//				System.out.println("��鸲����:"+��鸲����);
			int ��鸲���Ĺݿø� = (int) Math.round(��鸲����);
//				System.out.println("��鸲���Ĺݿø�:"+��鸲���Ĺݿø�);
			int ��鸲��������[] = new int[4];
			for(int i = 0; i<4; i++) {
				int �������� = (int) (Math.random()*65536);
//					System.out.println("��������"+i+":"+��������);
				��鸲��������[i] = ��������;
			}
			Arrays.sort(��鸲��������);
//				for(int k = 0; k<4; k++) {
//					System.out.println("��鸲��������"+k+":"+��鸲��������[k]);
//				}
			
		// 65535 ������ ������ 1,2,3,4��°�� ��鸲�����̶� �ݺ������� ���ؼ�
		
			for(int j = 0; j<4;j++) {
		// ��鸲���� < ���� �̸� 3������ ���(�ణ�� �����ð� �Է�)
			if (��鸲��������[j]<��鸲���Ĺݿø�) {
				
		// 4��°�� ��縦 �ٸ��� �����ؼ� ��ȹ
				if (j==3) {
					try {
						TimeUnit.SECONDS.sleep((long)1.5);
						System.out.printf("�ų���! %s��(��) ����Ҵ�!", ���ϸ��̸�);
						}
					catch(Exception e) {
						System.out.println(e);
						}
					return true;
				}
		// 1,2,3��°�� ���...(�����ð� �߰�)
				else{
					try {
						TimeUnit.SECONDS.sleep((long)1.5);
						System.out.println("���"+".".repeat(j+2));
						}
					catch(Exception e) {
						System.out.println(e);
						}
				}
			}
			
		// ��鸲���� >= ���� �̸� ��� ����
			else{
				System.out.println("�ȵ�! ���ϸ��� ������ ���͹��ȴ�!");
				return false;
				}
			}
			
		// 4��°���� ��ġ�� �ɷ�
			if (��鸲��������[3]<��鸲���Ĺݿø�) {
				System.out.println("�ȵ�! ���ϸ��� ������ ���͹��ȴ�!");
				return false;
			}else {
				System.out.printf("�ų���! %s��(��) ����Ҵ�!", ���ϸ��̸�);
				return true;
			}
		}
	}	// [���Ϻ� �Լ� ��]
	
	
	// [���� ���� �Լ� ����]
	public static void fightOrRun(int chooseFightOrRun, ArrayList<pokemon> �����ϸ󸮽�Ʈ, ArrayList<pokemon> �Ӽ�������Ʈ) {
		switch (chooseFightOrRun) {
		case 1:
			wildBattle(�����ϸ󸮽�Ʈ, �Ӽ�������Ʈ);
		case 2:
			break;
		default:
			System.out.println("�Է°��� �߸��Ǿ����ϴ�. ���� 1 ~ 3������ ���ڸ� �Է��� �ּ���.");
			timedelay(1000);
			System.out.println("������ �Ͻðڽ��ϱ�?");
			System.out.println("| 1-�ο�� | 2-�������� |");
			int wrongChooseFightOrRun = sc.nextInt();
			fightOrRun(wrongChooseFightOrRun, �����ϸ󸮽�Ʈ, �Ӽ�������Ʈ);
		}
		
	}// [���� ���� �Լ� ��]

	
	
	// [�߻����� �Լ� ����]
	public static void wildBattle(ArrayList<pokemon> �����ϸ󸮽�Ʈ, ArrayList<pokemon> �Ӽ�������Ʈ){
		// �Ӽ�������Ʈ �������� ������ ������ �߻� ���ϸ� ����
		int random1 = (int)(Math.random()*10);
		pokemon enemy = �Ӽ�������Ʈ.get(random1); 
				
		// -������ �÷��̾� ���ϸ� ����-
		System.out.println("������� ���ϸ��� �������ּ���!");
		timedelay(1000);
		System.out.println("--------[���� ���ϸ󸮽�Ʈ]--------");
		for(int i =0;i<�����ϸ󸮽�Ʈ.size();i++) {
			System.out.printf("| %d-%s (���� ü�� : %d)",i+1,�����ϸ󸮽�Ʈ.get(i).name,�����ϸ󸮽�Ʈ.get(i).presentHp);
		}
		System.out.println("|");
		System.out.println("-------------------------------");
		System.out.printf("\n");
		int choosepokemon = sc.nextInt();
		pokemon playerPick = �����ϸ󸮽�Ʈ.get(choosepokemon-1);
		System.out.printf("%s��(��) �����ϼ̽��ϴ�./n",�����ϸ󸮽�Ʈ.get(choosepokemon-1).name);
		
		// -�������� ���� ����-
		while (enemy.presentHp>10 && playerPick.presentHp>10) {
			System.out.println("-------------------");
			System.out.println("[�˸�] �������Դϴ�.");
			System.out.println("-------------------");
			System.out.println("����Ͻ� ��ų�� ������ �ּ���.");
			timedelay(1000);	// �и��� ����, 1000= 1�� ��
			System.out.println("| 1-�⺻ ���� | 2-��ų1 (���� 30 �Ҹ�) | ��ų2 (���� 50 �Ҹ�) | ���ϸ� �� | ����ġ�� |");
			int atc = sc.nextInt(); //attack Choose
										
						if (atc==1){//-�⺻����-
							System.out.println("-------------------");
							playerPick.�⺻����(enemy);
						}else if(atc==2){//-��ų1-
							if(playerPick.presentMp >= 30){
								if ( playerPick.type.equals("����") ){ // ������ 8������ �ᵵ�Ǵµ� �ּ��������� ==�� ���� �ʴ� ������ �ּҸ� �������� ����.
									playerPick.��ų1(enemy);
									}
								else if(playerPick.type.equals("��")) {
									playerPick.��ų3(enemy);
								}
								else if(playerPick.type.equals("Ǯ")) {
									playerPick.��ų5(enemy);
								}
								else if(playerPick.type.equals("��")) {
									playerPick.��ų7(enemy);
								}
								else if(playerPick.type.equals("��")) {
									playerPick.��ų9(enemy);
								}
							else{
								System.out.println("-------------------");
								playerPick.�⺻����(enemy);
							}
						}else if(atc==3){//-��ų2-
							if(playerPick.presentMp >= 50){
								if ( playerPick.type.equals("����") ){ // ������ 8������ �ᵵ�Ǵµ� �ּ��������� ==�� ���� �ʴ� ������ �ּҸ� �������� ����.
									playerPick.��ų2(enemy);
									}
								else if(playerPick.type.equals("��")) {
									playerPick.��ų4(enemy);
								}
								else if(playerPick.type.equals("Ǯ")) {
									playerPick.��ų6(enemy);
								}
								else if(playerPick.type.equals("��")) {
									playerPick.��ų8(enemy);
								}
								else if(playerPick.type.equals("��")) {
									playerPick.��ų10(enemy);
								}
							else{
								System.out.println("-------------------");
								playerPick.�⺻����(enemy);
							}
			
						}else if(atc==4){//-���Ϻ�-
			
							if (��ȹ��(enemy.maxHp, enemy.presentHp, enemy.name) == true){
								if(�����ϸ󸮽�Ʈ.size() < 4){
							//ArrayList<pokemon> myPokemonList�� �߰�
							//sysof("���� �������� ���ϸ��� %d �� ���� �Դϴ�.", myPokemonList.size())
									for(int i =0;i<�����ϸ󸮽�Ʈ.size();i++) {
										System.out.printf("���� �������� ���ϸ��� %d �� ���� �Դϴ�.\n", �����ϸ󸮽�Ʈ.size());
										System.out.println("--------[���� ���ϸ󸮽�Ʈ]--------");
										System.out.printf("%d. %s     \n",i+1,�����ϸ󸮽�Ʈ.get(i).name);	
										System.out.println("-------------------------------");
										// �� ����Ʈ�� �߰�
										�����ϸ󸮽�Ʈ.add(enemy);
													
									}
							}else{ //���⼭ �����ؾ���. ���� �����ϴ� ����.
							//syso ("������ �� �ִ� �� ���ϸ� ���� �ʰ��߽��ϴ�. ������ ���ϸ��� ������ �ּ���.")
								for(int i =0; i<�����ϸ󸮽�Ʈ.size(); i++) {
										System.out.println("������ ���ϸ��� �������ּ���!");
										System.out.println("--------[���� ���ϸ󸮽�Ʈ]--------");
										System.out.printf("%d. %s     \n", i+1, �����ϸ󸮽�Ʈ.get(i).name);	
										System.out.println("-------------------------------");
							
								}
								
								int �������ϸ�  = sc.nextInt();
								�����ϸ󸮽�Ʈ.remove(�������ϸ�);	
								// ����ڰ� ��ȣ�Է��Ѱ� �� �޴´�
								// �����ϸ󸮽�Ʈ.remove(����ڰ� �Է��� ��ȣ)
								// ������Ʈ�� �߰�   enemy�� 
								
								
								�����ϸ󸮽�Ʈ.add(enemy);
								
								for(int i =0;i<�����ϸ󸮽�Ʈ.size();i++) { //���⼭ ���ŵ� ����Ʈ�� ��� ����enemy�� �־�� ��
										System.out.println("--------[���� ���ϸ󸮽�Ʈ]--------");
										System.out.printf("%d. %s     \n",i+1,�����ϸ󸮽�Ʈ.get(i).name);	
										System.out.println("-------------------------------");
									}
							}
							}
								 
			
						}else if(atc == 5) {//-�������� ����- (Ȯ��)
						// �������� Ȯ����
						//'Ȯ����' 5�� ���� �������� 1,2,3,4 �϶� ���� ����
						int Ȯ���� = (int) Math.round((Math.random()*1000));
						if(Ȯ����%5 != 0){
							//���� ����
							System.out.println("������ �����ƴ�.");
							timedelay(1000);
							System.out.print("��");
							timedelay(200);
							System.out.print(".");
							timedelay(200);
							System.out.print(".");
							timedelay(200);
							System.out.print(".");
							timedelay(200);
							System.out.print("��Ҵ�.");
							break;
						}else{//���� ����
							System.out.println("������ �����߽��ϴ�.");
							System.out.println("�߻����ϸ��� ������ ���ɴϴ�.");
									}
								}
					} // -�������� ��-
						
						
				}else {//-�Է°� ����-
					System.out.println("�Է°��� �߸��Ǿ����ϴ�. 1 ~ 5 ������ ���ڸ� �Է��� �ּ���.");
					System.out.println("| 1-�⺻ ���� | 2-��ų1 (���� 30 �Ҹ�) | ��ų2 (���� 50 �Ҹ�) | ���ϸ� �� | ����ġ�� |");
					//�Լ�
				}
				
				// -��� ���ɸ� ���� ��-
				if(playerPick.presentHp>10) {
					System.out.printf("[�˸�] %s�����Դϴ�.\n",enemy.name);
					int enemyAction = 1;
					if(enemyAction == 1) {
						enemy.�⺻����(playerPick);
						System.out.println("-------------------");
						System.out.printf("%s�� ������ �������̿���!\n",enemy.name);
						System.out.printf("%s�� ü���� %d���Ҵ�.\n",playerPick.name,playerPick.presentHp);
						
						}
					}
				}// -while�� ��-
				System.out.println("������ ����Ǿ����ϴ�.");
				// -���� ���-
				if(enemy.presentHp <= 10) {
					System.out.printf("�߻��� %s�� ��������\n",enemy.name);
				}
				if(playerPick.presentHp <= 10){
					System.out.printf("���� %s�� ��������\n",playerPick.name);	
					System.out.printf("�����߾� %s. ���Ϻ��� ���ƿ�!!", playerPick.name);
				}
				
				// -������ ������ ��� ���ϸ��� hp, ����, ���� ���󺹱�-
				// ��� ���ϸ��� hp�� max hp�� �ȴ�.
				playerPick.presentHp = playerPick.maxHp;
				enemy.presentHp = enemy.maxHp;
				// ��� ���ϸ��� ������ max ������ �ȴ�.
				playerPick.presentMp = playerPick.maxMp;
				enemy.presentMp = enemy.maxMp;
				// ��� ���ϸ��� ������ ���� ������ �ȴ�.
				playerPick.presentDefence = playerPick.defence;
				enemy.presentDefence = enemy.defence;
				
	}// [�߻����� �Լ� ��]
	
	// [�������� �Լ� ����]
	// ���� �߰�
	// �Լ� �߰� �� ��>case 6�� ���� ���� �Լ� �Է�, �� �� ���� Ȯ��
	// [�������� �Լ� ��]
}//class ��