package br.com.jTrigonometry;

/**
 * Jardel Garcia (2016) - jardelgarcia.ti@gmail.com
 * 
 * Classe Singleton que disponibiliza uma instância da tabela trigonométrica.
 * A tabela é totalmente preenchida com os ângulos de 0° a 90° e seus respectivos
 * seno, coseno, tangente e cotangente em sua construção. (v1)
 */
import java.util.ArrayList;
import java.util.List;

public class TabelaTrigonometrica {

	private static TabelaTrigonometrica instance;
	private List<Angulo> angulos;

	public static TabelaTrigonometrica getInstance(){
		if(instance == null){
			instance = new TabelaTrigonometrica();
		}
		return instance;
	}
	
	private TabelaTrigonometrica(){
		super();
		preencherTabela();
	}
	
	public List<Angulo> getAngulos() {
		return angulos;
	}

	private void preencherTabela(){
		Angulo entradaTabela = new Angulo();
		angulos = new ArrayList<Angulo>();
		
		entradaTabela.setGraus(0D);
		entradaTabela.setSeno(0D);
		entradaTabela.setTangente(0D);
		entradaTabela.setCotangente(0D);
		entradaTabela.setCoseno(1D);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(1D);
		entradaTabela.setSeno(0.0174524064);
		entradaTabela.setTangente(0.0174550649);
		entradaTabela.setCotangente(57.2899616308);
		entradaTabela.setCoseno(0.9998476952);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(2D);
		entradaTabela.setSeno(0.0348994967);
		entradaTabela.setTangente(0.0349207695);
		entradaTabela.setCotangente(28.6362532829);
		entradaTabela.setCoseno(0.999390827);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(3D);
		entradaTabela.setSeno(0.0523359562);
		entradaTabela.setTangente(0.0524077793);
		entradaTabela.setCotangente(19.0811366877);
		entradaTabela.setCoseno(0.9986295348);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(4D);
		entradaTabela.setSeno(0.0697564737);
		entradaTabela.setTangente(0.0699268119);
		entradaTabela.setCotangente(14.3006662567);
		entradaTabela.setCoseno(0.9975640503);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(5D);
		entradaTabela.setSeno(0.0871557427);
		entradaTabela.setTangente(0.0874886635);
		entradaTabela.setCotangente(11.4300523028);
		entradaTabela.setCoseno(0.9961946981);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(6D);
		entradaTabela.setSeno(0.1045284633);
		entradaTabela.setTangente(0.1051042353);
		entradaTabela.setCotangente(9.5143644542);
		entradaTabela.setCoseno(0.9945218954);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(7D);
		entradaTabela.setSeno(0.1218693434);
		entradaTabela.setTangente(0.1227845609);
		entradaTabela.setCotangente(8.144346428);
		entradaTabela.setCoseno(0.9925461516);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(8D);
		entradaTabela.setSeno(0.139173101);
		entradaTabela.setTangente(0.1405408347);
		entradaTabela.setCotangente(7.1153697224);
		entradaTabela.setCoseno(0.9902680687);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(9D);
		entradaTabela.setSeno(0.156434465);
		entradaTabela.setTangente(0.1583844403);
		entradaTabela.setCotangente(6.3137515147);
		entradaTabela.setCoseno(0.9876883406);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(10D);
		entradaTabela.setSeno(0.1736481777);
		entradaTabela.setTangente(0.1763269807);
		entradaTabela.setCotangente(5.6712818196);
		entradaTabela.setCoseno(0.984807753);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(11D);
		entradaTabela.setSeno(0.1908089954);
		entradaTabela.setTangente(0.1943803091);
		entradaTabela.setCotangente(5.144554016);
		entradaTabela.setCoseno(0.9816271834);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(12D);
		entradaTabela.setSeno(0.2079116908);
		entradaTabela.setTangente(0.2125565617);
		entradaTabela.setCotangente(4.7046301095);
		entradaTabela.setCoseno(0.9781476007);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(13D);
		entradaTabela.setSeno(0.2249510543);
		entradaTabela.setTangente(0.2308681911);
		entradaTabela.setCotangente(4.3314758743);
		entradaTabela.setCoseno(0.9743700648);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(14D);
		entradaTabela.setSeno(0.2419218956);
		entradaTabela.setTangente(0.2493280028);
		entradaTabela.setCotangente(4.0107809335);
		entradaTabela.setCoseno(0.9702957263);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(15D);
		entradaTabela.setSeno(0.2588190451);
		entradaTabela.setTangente(0.2679491924);
		entradaTabela.setCotangente(3.7320508076);
		entradaTabela.setCoseno(0.9659258263);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(16D);
		entradaTabela.setSeno(0.2756373558);
		entradaTabela.setTangente(0.2867453858);
		entradaTabela.setCotangente(3.4874144438);
		entradaTabela.setCoseno(0.9612616959);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(17D);
		entradaTabela.setSeno(0.2923717047);
		entradaTabela.setTangente(0.3057306815);
		entradaTabela.setCotangente(3.2708526185);
		entradaTabela.setCoseno(0.956304756);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(18D);
		entradaTabela.setSeno(0.3090169944);
		entradaTabela.setTangente(0.3249196962);
		entradaTabela.setCotangente(3.0776835372);
		entradaTabela.setCoseno(0.9510565163);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(19D);
		entradaTabela.setSeno(0.3255681545);
		entradaTabela.setTangente(0.3443276133);
		entradaTabela.setCotangente(2.9042108777);
		entradaTabela.setCoseno(0.9455185756);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(20D);
		entradaTabela.setSeno(0.3420201433);
		entradaTabela.setTangente(0.3639702343);
		entradaTabela.setCotangente(2.7474774195);
		entradaTabela.setCoseno(0.9396926208);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(21D);
		entradaTabela.setSeno(0.3583679495);
		entradaTabela.setTangente(0.383864035);
		entradaTabela.setCotangente(2.6050890647);
		entradaTabela.setCoseno(0.9335804265);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(22D);
		entradaTabela.setSeno(0.3746065934);
		entradaTabela.setTangente(0.4040262258);
		entradaTabela.setCotangente(2.4750868534);
		entradaTabela.setCoseno(0.9271838546);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(23D);
		entradaTabela.setSeno(0.3907311285);
		entradaTabela.setTangente(0.4244748162);
		entradaTabela.setCotangente(2.3558523658);
		entradaTabela.setCoseno(0.9205048535);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(24D);
		entradaTabela.setSeno(0.4067366431);
		entradaTabela.setTangente(0.4452286853);
		entradaTabela.setCotangente(2.2460367739);
		entradaTabela.setCoseno(0.9135454576);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(25D);
		entradaTabela.setSeno(0.4226182617);
		entradaTabela.setTangente(0.4663076582);
		entradaTabela.setCotangente(2.1445069205);
		entradaTabela.setCoseno(0.906307787);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(26D);
		entradaTabela.setSeno(0.4383711468);
		entradaTabela.setTangente(0.4877325886);
		entradaTabela.setCotangente(2.0503038416);
		entradaTabela.setCoseno(0.8987940463);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(27D);
		entradaTabela.setSeno(0.4539904997);
		entradaTabela.setTangente(0.5095254495);
		entradaTabela.setCotangente(1.9626105055);
		entradaTabela.setCoseno(0.8910065242);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(28D);
		entradaTabela.setSeno(0.4694715628);
		entradaTabela.setTangente(0.5317094317);
		entradaTabela.setCotangente(1.8807264653);
		entradaTabela.setCoseno(0.8829475929);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(29D);
		entradaTabela.setSeno(0.4848096202);
		entradaTabela.setTangente(0.5543090515);
		entradaTabela.setCotangente(1.8040477553);
		entradaTabela.setCoseno(0.8746197071);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(30D);
		entradaTabela.setSeno(0.5);
		entradaTabela.setTangente(0.5773502692);
		entradaTabela.setCotangente(1.7320508076);
		entradaTabela.setCoseno(0.8660254038);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(31D);
		entradaTabela.setSeno(0.5150380749);
		entradaTabela.setTangente(0.600860619);
		entradaTabela.setCotangente(1.6642794824);
		entradaTabela.setCoseno(0.8571673007);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(32D);
		entradaTabela.setSeno(0.5299192642);
		entradaTabela.setTangente(0.6248693519);
		entradaTabela.setCotangente(1.600334529);
		entradaTabela.setCoseno(0.8480480962);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(33D);
		entradaTabela.setSeno(0.544639035);
		entradaTabela.setTangente(0.6494075932);
		entradaTabela.setCotangente(1.5398649638);
		entradaTabela.setCoseno(0.8386705679);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(34D);
		entradaTabela.setSeno(0.5591929035);
		entradaTabela.setTangente(0.6745085168);
		entradaTabela.setCotangente(1.4825609685);
		entradaTabela.setCoseno(0.8290375726);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(35D);
		entradaTabela.setSeno(0.5735764364);
		entradaTabela.setTangente(0.7002075382);
		entradaTabela.setCotangente(1.4281480067);
		entradaTabela.setCoseno(0.8191520443);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(36D);
		entradaTabela.setSeno(0.5877852523);
		entradaTabela.setTangente(0.726542528);
		entradaTabela.setCotangente(1.3763819205);
		entradaTabela.setCoseno(0.8090169944);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(37D);
		entradaTabela.setSeno(0.6018150232);
		entradaTabela.setTangente(0.7535540501);
		entradaTabela.setCotangente(1.3270448216);
		entradaTabela.setCoseno(0.79863551);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(38D);
		entradaTabela.setSeno(0.6156614753);
		entradaTabela.setTangente(0.7812856265);
		entradaTabela.setCotangente(1.2799416322);
		entradaTabela.setCoseno(0.7880107536);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(39D);
		entradaTabela.setSeno(0.629320391);
		entradaTabela.setTangente(0.8097840332);
		entradaTabela.setCotangente(1.2348971565);
		entradaTabela.setCoseno(0.7771459615);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(40D);
		entradaTabela.setSeno(0.6427876097);
		entradaTabela.setTangente(0.8390996312);
		entradaTabela.setCotangente(1.1917535926);
		entradaTabela.setCoseno(0.7660444431);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(41D);
		entradaTabela.setSeno(0.656059029);
		entradaTabela.setTangente(0.8692867378);
		entradaTabela.setCotangente(1.1503684072);
		entradaTabela.setCoseno(0.7547095802);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(42D);
		entradaTabela.setSeno(0.6691306064);
		entradaTabela.setTangente(0.9004040443);
		entradaTabela.setCotangente(1.1106125148);
		entradaTabela.setCoseno(0.7431448255);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(43D);
		entradaTabela.setSeno(0.6819983601);
		entradaTabela.setTangente(0.9325150861);
		entradaTabela.setCotangente(1.07236871);
		entradaTabela.setCoseno(0.7313537016);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(44D);
		entradaTabela.setSeno(0.6946583705);
		entradaTabela.setTangente(0.9656887748);
		entradaTabela.setCotangente(1.0355303138);
		entradaTabela.setCoseno(0.7193398003);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(45D);
		entradaTabela.setSeno(0.7071067812);
		entradaTabela.setTangente(1D);
		entradaTabela.setCotangente(1D);
		entradaTabela.setCoseno(0.7071067812);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(46D);
		entradaTabela.setSeno(0.7193398003);
		entradaTabela.setTangente(1.0355303138);
		entradaTabela.setCotangente(0.9656887748);
		entradaTabela.setCoseno(0.6946583705);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(47D);
		entradaTabela.setSeno(0.7313537016);
		entradaTabela.setTangente(1.07236871);
		entradaTabela.setCotangente(0.9325150861);
		entradaTabela.setCoseno(0.6819983601);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(48D);
		entradaTabela.setSeno(0.7431448255);
		entradaTabela.setTangente(1.1106125148);
		entradaTabela.setCotangente(0.9004040443);
		entradaTabela.setCoseno(0.6691306064);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(49D);
		entradaTabela.setSeno(0.7547095802);
		entradaTabela.setTangente(1.1503684072);
		entradaTabela.setCotangente(0.8692867378);
		entradaTabela.setCoseno(0.656059029);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(50D);
		entradaTabela.setSeno(0.7660444431);
		entradaTabela.setTangente(1.1917535926);
		entradaTabela.setCotangente(0.8390996312);
		entradaTabela.setCoseno(0.6427876097);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(51D);
		entradaTabela.setSeno(0.7771459615);
		entradaTabela.setTangente(1.2348971565);
		entradaTabela.setCotangente(0.8097840332);
		entradaTabela.setCoseno(0.629320391);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(52D);
		entradaTabela.setSeno(0.7880107536);
		entradaTabela.setTangente(1.2799416322);
		entradaTabela.setCotangente(0.7812856265);
		entradaTabela.setCoseno(0.6156614753);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(53D);
		entradaTabela.setSeno(0.79863551);
		entradaTabela.setTangente(1.3270448216);
		entradaTabela.setCotangente(0.7535540501);
		entradaTabela.setCoseno(0.6018150232);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(54D);
		entradaTabela.setSeno(0.8090169944);
		entradaTabela.setTangente(1.3763819205);
		entradaTabela.setCotangente(0.726542528);
		entradaTabela.setCoseno(0.5877852523);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(55D);
		entradaTabela.setSeno(0.8191520443);
		entradaTabela.setTangente(1.4281480067);
		entradaTabela.setCotangente(0.7002075382);
		entradaTabela.setCoseno(0.5735764364);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(56D);
		entradaTabela.setSeno(0.8290375726);
		entradaTabela.setTangente(1.4825609685);
		entradaTabela.setCotangente(0.6745085168);
		entradaTabela.setCoseno(0.5591929035);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(57D);
		entradaTabela.setSeno(0.8386705679);
		entradaTabela.setTangente(1.5398649638);
		entradaTabela.setCotangente(0.6494075932);
		entradaTabela.setCoseno(0.544639035);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(58D);
		entradaTabela.setSeno(0.8480480962);
		entradaTabela.setTangente(1.600334529);
		entradaTabela.setCotangente(0.6248693519);
		entradaTabela.setCoseno(0.5299192642);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(59D);
		entradaTabela.setSeno(0.8571673007);
		entradaTabela.setTangente(1.6642794824);
		entradaTabela.setCotangente(0.600860619);
		entradaTabela.setCoseno(0.5150380749);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(60D);
		entradaTabela.setSeno(0.8660254038);
		entradaTabela.setTangente(1.7320508076);
		entradaTabela.setCotangente(0.5773502692);
		entradaTabela.setCoseno(0.5);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(61D);
		entradaTabela.setSeno(0.8746197071);
		entradaTabela.setTangente(1.8040477553);
		entradaTabela.setCotangente(0.5543090515);
		entradaTabela.setCoseno(0.4848096202);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(62D);
		entradaTabela.setSeno(0.8829475929);
		entradaTabela.setTangente(1.8807264653);
		entradaTabela.setCotangente(0.5317094317);
		entradaTabela.setCoseno(0.4694715628);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(63D);
		entradaTabela.setSeno(0.8910065242);
		entradaTabela.setTangente(1.9626105055);
		entradaTabela.setCotangente(0.5095254495);
		entradaTabela.setCoseno(0.4539904997);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(64D);
		entradaTabela.setSeno(0.8987940463);
		entradaTabela.setTangente(2.0503038416);
		entradaTabela.setCotangente(0.4877325886);
		entradaTabela.setCoseno(0.4383711468);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(65D);
		entradaTabela.setSeno(0.906307787);
		entradaTabela.setTangente(2.1445069205);
		entradaTabela.setCotangente(0.4663076582);
		entradaTabela.setCoseno(0.4226182617);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(66D);
		entradaTabela.setSeno(0.9135454576);
		entradaTabela.setTangente(2.2460367739);
		entradaTabela.setCotangente(0.4452286853);
		entradaTabela.setCoseno(0.4067366431);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(67D);
		entradaTabela.setSeno(0.9205048535);
		entradaTabela.setTangente(2.3558523658);
		entradaTabela.setCotangente(0.4244748162);
		entradaTabela.setCoseno(0.3907311285);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(68D);
		entradaTabela.setSeno(0.9271838546);
		entradaTabela.setTangente(2.4750868534);
		entradaTabela.setCotangente(0.4040262258);
		entradaTabela.setCoseno(0.3746065934);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(69D);
		entradaTabela.setSeno(0.9335804265);
		entradaTabela.setTangente(2.6050890647);
		entradaTabela.setCotangente(0.383864035);
		entradaTabela.setCoseno(0.3583679495);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(70D);
		entradaTabela.setSeno(0.9396926208);
		entradaTabela.setTangente(2.7474774195);
		entradaTabela.setCotangente(0.3639702343);
		entradaTabela.setCoseno(0.3420201433);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(71D);
		entradaTabela.setSeno(0.9455185756);
		entradaTabela.setTangente(2.9042108777);
		entradaTabela.setCotangente(0.3443276133);
		entradaTabela.setCoseno(0.3255681545);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(72D);
		entradaTabela.setSeno(0.9510565163);
		entradaTabela.setTangente(3.0776835372);
		entradaTabela.setCotangente(0.3249196962);
		entradaTabela.setCoseno(0.3090169944);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(73D);
		entradaTabela.setSeno(0.956304756);
		entradaTabela.setTangente(3.2708526185);
		entradaTabela.setCotangente(0.3057306815);
		entradaTabela.setCoseno(0.2923717047);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(74D);
		entradaTabela.setSeno(0.9612616959);
		entradaTabela.setTangente(3.4874144438);
		entradaTabela.setCotangente(0.2867453858);
		entradaTabela.setCoseno(0.2756373558);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(75D);
		entradaTabela.setSeno(0.9659258263);
		entradaTabela.setTangente(3.7320508076);
		entradaTabela.setCotangente(0.2679491924);
		entradaTabela.setCoseno(0.2588190451);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(76D);
		entradaTabela.setSeno(0.9702957263);
		entradaTabela.setTangente(4.0107809335);
		entradaTabela.setCotangente(0.2493280028);
		entradaTabela.setCoseno(0.2419218956);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(77D);
		entradaTabela.setSeno(0.9743700648);
		entradaTabela.setTangente(4.3314758743);
		entradaTabela.setCotangente(0.2308681911);
		entradaTabela.setCoseno(0.2249510543);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(78D);
		entradaTabela.setSeno(0.9781476007);
		entradaTabela.setTangente(4.7046301095);
		entradaTabela.setCotangente(0.2125565617);
		entradaTabela.setCoseno(0.2079116908);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(79D);
		entradaTabela.setSeno(0.9816271834);
		entradaTabela.setTangente(5.144554016);
		entradaTabela.setCotangente(0.1943803091);
		entradaTabela.setCoseno(0.1908089954);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(80D);
		entradaTabela.setSeno(0.984807753);
		entradaTabela.setTangente(5.6712818196);
		entradaTabela.setCotangente(0.1763269807);
		entradaTabela.setCoseno(0.1736481777);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(81D);
		entradaTabela.setSeno(0.9876883406);
		entradaTabela.setTangente(6.3137515147);
		entradaTabela.setCotangente(0.1583844403);
		entradaTabela.setCoseno(0.156434465);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(82D);
		entradaTabela.setSeno(0.9902680687);
		entradaTabela.setTangente(7.1153697224);
		entradaTabela.setCotangente(0.1405408347);
		entradaTabela.setCoseno(0.139173101);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(83D);
		entradaTabela.setSeno(0.9925461516);
		entradaTabela.setTangente(8.144346428);
		entradaTabela.setCotangente(0.1227845609);
		entradaTabela.setCoseno(0.1218693434);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(84D);
		entradaTabela.setSeno(0.9945218954);
		entradaTabela.setTangente(9.5143644542);
		entradaTabela.setCotangente(0.1051042353);
		entradaTabela.setCoseno(0.1045284633);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(85D);
		entradaTabela.setSeno(0.9961946981);
		entradaTabela.setTangente(11.4300523028);
		entradaTabela.setCotangente(0.0874886635);
		entradaTabela.setCoseno(0.0871557427);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(86D);
		entradaTabela.setSeno(0.9975640503);
		entradaTabela.setTangente(14.3006662567);
		entradaTabela.setCotangente(0.0699268119);
		entradaTabela.setCoseno(0.0697564737);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(87D);
		entradaTabela.setSeno(0.9986295348);
		entradaTabela.setTangente(19.0811366877);
		entradaTabela.setCotangente(0.0524077793);
		entradaTabela.setCoseno(0.0523359562);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(88D);
		entradaTabela.setSeno(0.999390827);
		entradaTabela.setTangente(28.6362532829);
		entradaTabela.setCotangente(0.0349207695);
		entradaTabela.setCoseno(0.0348994967);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(89D);
		entradaTabela.setSeno(0.9998476952);
		entradaTabela.setTangente(57.2899616308);
		entradaTabela.setCotangente(0.0174550649);
		entradaTabela.setCoseno(0.0174524064);
		angulos.add(entradaTabela);

		entradaTabela = new Angulo();
		
		entradaTabela.setGraus(90D);
		entradaTabela.setSeno(1D);
		entradaTabela.setTangente(0D);
		entradaTabela.setCotangente(0D);
		entradaTabela.setCoseno(0D);
		angulos.add(entradaTabela);
	}
}