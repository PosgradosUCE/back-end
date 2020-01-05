package com.lascano.tesis.controller.controladores;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lascano.tesis.model.entidades.afp;
import com.lascano.tesis.model.entidades.bibvirrepDig;
import com.lascano.tesis.model.entidades.contexto;
import com.lascano.tesis.model.entidades.cpa;
import com.lascano.tesis.model.entidades.ep;
import com.lascano.tesis.model.entidades.estructuraPrograma;
import com.lascano.tesis.model.entidades.evaluacionSeguimiento;
import com.lascano.tesis.model.entidades.gestioAcademica;
import com.lascano.tesis.model.entidades.gruposInvestigacion;
import com.lascano.tesis.model.entidades.acp;
import com.lascano.tesis.model.entidades.pv;
import com.lascano.tesis.model.entidades.seguimientoGraduados;
import com.lascano.tesis.model.entidades.sistemasBecas;
import com.lascano.tesis.model.entidades.tid;
import com.lascano.tesis.model.entidades.tpm;
import com.lascano.tesis.model.entidades.tt;
import com.lascano.tesis.model.entidades.idi;
import com.lascano.tesis.model.entidades.movilidadAcademica;
import com.lascano.tesis.model.entidades.participacionRedes;
import com.lascano.tesis.model.entidades.perfilEgreso;
import com.lascano.tesis.model.entidades.planEstudios;
import com.lascano.tesis.model.entidades.planMicrocurricular;
import com.lascano.tesis.model.entidades.politicasAdmision;
import com.lascano.tesis.model.entidades.politicasTitulacion;
import com.lascano.tesis.model.entidades.cooprd;
import com.lascano.tesis.model.entidades.iaa;
import com.lascano.tesis.service.servicios.AcpService;
import com.lascano.tesis.service.servicios.AfpService;
import com.lascano.tesis.service.servicios.BibvirrepDigService;
import com.lascano.tesis.service.servicios.ContextService;
import com.lascano.tesis.service.servicios.CooprdService;
import com.lascano.tesis.service.servicios.CpaService;
import com.lascano.tesis.service.servicios.EpService;
import com.lascano.tesis.service.servicios.EstructuraProgramaService;
import com.lascano.tesis.service.servicios.EvaluacionSeguimientoService;
import com.lascano.tesis.service.servicios.GruposInvestigacionService;
import com.lascano.tesis.service.servicios.IaaService;
import com.lascano.tesis.service.servicios.IdiService;
import com.lascano.tesis.service.servicios.MovilidadAcademicaService;
import com.lascano.tesis.service.servicios.ParticipacionRedesService;
import com.lascano.tesis.service.servicios.PerfilEgresoService;
import com.lascano.tesis.service.servicios.PlanEstudiosService;
import com.lascano.tesis.service.servicios.PlanMicrocurricularService;
import com.lascano.tesis.service.servicios.PoliticasAdmisionService;
import com.lascano.tesis.service.servicios.PoliticasTitulacionService;
import com.lascano.tesis.service.servicios.PvService;
import com.lascano.tesis.service.servicios.SeguimientoGraduadosService;
import com.lascano.tesis.service.servicios.SistemasBecasService;
import com.lascano.tesis.service.servicios.TidService;
import com.lascano.tesis.service.servicios.TpmService;
import com.lascano.tesis.service.servicios.TtService;
import com.lascano.tesis.service.servicios.gestionAcademicaService;

@CrossOrigin(origins = { "https://localhost:4200" })
@RestController
@RequestMapping("/api")
public class BackEndController {

	// aqui se encuentran los indicadores sobre academia cuerpo academico
	// afinidad de formacion de posgrado
	// afp = afinidad de formacion de posgradp
	// pfa = total de progesores con formacion de posgrado realtiva afin a las
	// lineas de investigacion o subares
	// disciplinares del programa acdemico
	// tp = total de profesores del programa
	// este indicador mide el porcentaje de cuerpo academico que conforma el
	// programa

	@Secured({"ROLE_ADMIN", "ROLE_USER"})
	@GetMapping("/hola")
	public String hola() {

		return "hola";
	}

	@Autowired
	AfpService servicioAfp;
	@Autowired
	CpaService servicioCpa;
	@Autowired
	AcpService servicioAcp;
	@Autowired
	PvService servicioPv;
	@Autowired
	TidService servicioTd;
	@Autowired
	EpService servicioEp;
	@Autowired
	TpmService servicioTpm;
	@Autowired
	TtService servicioTt;
	@Autowired
	IdiService servicioIdi;
	@Autowired
	CooprdService servicioCooprd;
	@Autowired
	IaaService servicioIaa;
	@Autowired
	ContextService servicioContext;
	@Autowired
	gestionAcademicaService sevicioGestionAcademica;
	@Autowired
	EstructuraProgramaService servicioEstructuraPrograma;
	@Autowired
	PoliticasAdmisionService servicioPoliticasAdmision;
	@Autowired
	PoliticasTitulacionService servicioPoliticasTitulacion;
	@Autowired
	SistemasBecasService servicioSistemasBecas;
	@Autowired
	SeguimientoGraduadosService servicioSeguimientoGraduados;
	@Autowired
	PerfilEgresoService servicioPerfilEgreso;
	@Autowired
	PlanEstudiosService servicioPlanEstudios;
	@Autowired
	PlanMicrocurricularService servicioPlanMicrocurricular;
	@Autowired
	EvaluacionSeguimientoService servicioEvaluacionSeguimiento;
	@Autowired
	GruposInvestigacionService servicioGruposInvestigacion;
	@Autowired
	BibvirrepDigService servicioBibvirrepDig;
	@Autowired
	MovilidadAcademicaService serviceMovilidadAcademica;
	@Autowired
	ParticipacionRedesService servicioParticipacionRedes;

	@Secured({"ROLE_ADMIN"})
	@GetMapping("/academia/cuerpoacademico/afp/{pfa}/{tp}/{date}")
	public afp afp(@PathVariable String pfa, @PathVariable String tp,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		afp p = new afp();
		p.setPfa(pfa);
		p.setTp(tp);
		Float afp = ((Float.parseFloat(p.getPfa())) / (Float.parseFloat(p.getTp())));
		p.setAfp(afp.toString());
		System.out.println(date);
		p.setDate(date);
		servicioAfp.save(p);
		return p;
	}

	// composicion de la planta academica
	// cpa = composicion de la planta academica
	// phdl = total de profesores con formacion academica de phd obtenida en
	// universidades de excelencia y listado del IES
	// raking de universidades latinoamericanas
	// mscl = total de profesores con formacion academica msc especialidad en
	// ciencias de la salud
	// phd = total de profesores con fomarcion academica de phd no incluida en phdl
	// msc = total de profesores con formacion academica msc no incluidas en mscl
	// area ciencias de la salud
	// tp = total de profesores del programa
	// este indicador mide el porcentahe del cuerpo academico
	@GetMapping("/academia/cuerpoacademico/cpa/{phdl}/{mscl}/{phd}/{msc}/{tp}/{date}")
	public cpa cpa(@PathVariable String phdl, @PathVariable String mscl, @PathVariable String phd,
			@PathVariable String msc, @PathVariable String tp, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		cpa p = new cpa();
		p.setPhdl(phdl);
		p.setMscl(mscl);
		p.setPhd(phd);
		p.setMsc(msc);
		p.setTp(tp);
		Float cpa = (float) (((1.5 * (Float.parseFloat(phdl))) + (1.25 * (Float.parseFloat(mscl)))
				+ (Float.parseFloat(phd)) + (Float.parseFloat(msc))) / (Float.parseFloat(tp)));
		p.setCpa(cpa.toString());
		p.setDate(date);
		servicioCpa.save(p);
		return p;
	}

	// actualizacion cientifica
	// acp = actualizacion cientifica
	// ndad = total de profesores que han asistido a eventos de actualizacion
	// cientifica afin al programa
	// tp = total de profesores que han impartido clases en el programa durante el
	// periodo de evaluacion
	@GetMapping("/academia/cuerpoacademico/acp/{ndad}/{tp}/{date}")
	public acp acp(@PathVariable String ndad, @PathVariable String tp,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		acp p = new acp();
		p.setNdad(ndad);
		p.setTp(tp);
		Float acp = (100 * (Float.parseFloat(ndad) / Float.parseFloat(tp)));
		p.setAcp(acp.toString());
		p.setDate(date);
		servicioAcp.save(p);
		return p;
	}

	// profesores visitantes
	// pv = profesor visitante
	// mscv = total de profesores visitantes con formacion de maestria
	// phdv = total de profesores visitantes con formacion de doctorado
	// tp = total de profesores que conforman el programa
	@GetMapping("/academia/cuerpoacademico/pv/{mscv}/{phdv}/{tp}/{date}")
	public pv pv(@PathVariable String mscv, @PathVariable String phdv, @PathVariable String tp,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		pv p = new pv();
		p.setMscv(mscv);
		p.setPhdv(phdv);
		p.setTp(tp);
		Float pv = (float) (100 * ((Float.parseFloat(mscv) + (1.5 * Float.parseFloat(phdv))) / Float.parseFloat(tp)));
		p.setPv(pv.toString());
		p.setDate(date);
		servicioPv.save(p);
		return p;
	}

	// de aqui en dalente se encuentran los indicadores de academia pero para
	// carrera docente
	// tid = titularidad y dedicacion
	// ptc = total de profesores titulares con dedicacion a tiepo completo
	// tp = total de profesores
	@GetMapping("/academia/carreradocente/tid/{ptc}/{tp}/{date}")
	public tid tid(@PathVariable String ptc, @PathVariable String tp,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		tid p = new tid();
		p.setPtc(ptc);
		p.setTp(tp);
		Float tid = (100 * (Float.parseFloat(ptc) / Float.parseFloat(tp)));
		p.setTid(tid.toString());
		p.setDate(date);
		servicioTd.save(p);
		return p;
	}

	// de aqui en adelante se encuentran los indicadores academia pero para
	// eficiencia academica
	// ep = estudiantes por profesor
	// ne = total de estudiantes del programa
	// tp = total de profesores que conforman el personal academico del programa
	@GetMapping("/academia/eficienciacademica/ep/{ne}/{tp}/{date}")
	public ep ep(@PathVariable String ne, @PathVariable String tp, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		ep p = new ep();
		p.setNe(ne);
		p.setTp(tp);
		Float ep = ((Float.parseFloat(ne) / Float.parseFloat(tp)));
		p.setEp(ep.toString());
		p.setDate(date);
		servicioEp.save(p);
		return p;
	}

	// tpm = tasa de permanencia
	// ter = total de estudiantes que se ingresaron en la cohorte que se determine,
	// que concluyeron
	// la programacion academica en el tiempo planificado por el programa
	// te = total de estudiantes de la cohorte definida
	@GetMapping("/academia/carreradocente/tpm/{ter}/{te}/{date}")
	public tpm tpm(@PathVariable String ter, @PathVariable String te,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		tpm p = new tpm();
		p.setTer(ter);
		p.setTe(te);

		Float tpm = (100 * (Float.parseFloat(ter) / Float.parseFloat(te)));

		p.setTpm(tpm.toString());
		p.setDate(date);
		servicioTpm.save(p);
		return p;
	}

	// tt = tasa de graduacion
	// tet = total de estudiantes de la cohorte analizada que concluyeron el
	// proyecto de graduacion
	// o aprobaron el examen complexivo en un plazo menor o igual al planificado
	// para su graduacion
	// en condiciones normales
	// te = total de estudiantes de la cohorte definida
	@GetMapping("/academia/carreradocente/tt/{tet}/{te}/{date}")
	public tt tt(@PathVariable String tet, @PathVariable String te, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		tt p = new tt();
		p.setTe(te);
		p.setTet(tet);

		Float tt = (100 * (Float.parseFloat(tet) / Float.parseFloat(te)));

		p.setTt(tt.toString());
		p.setDate(date);
		servicioTt.save(p);

		return p;
	}

	// I+D+I
	// condiciones
	// I + D colaborativo interno
	// i + d + i = relacion per capita de proyectos de investifacion, desarrollo o
	// innovacion por profesores
	// del programa
	// pe = total de proyectos de invetigacion, o desarrollo e innovacion en los que
	// participan estudiantes
	// colaborando con profesores durante el periodo de evaluacion
	// tp = total de profesores del programa
	@GetMapping("/idi/condiciones/idi/{pp}/{pe}/{tp}/{date}")
	public idi idi(@PathVariable String pp, @PathVariable String pe, @PathVariable String tp,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		idi p = new idi();
		p.setPp(pp);
		p.setPe(pe);
		p.setTp(tp);

		Float idi = (float) ((Float.parseFloat(pp) + (1.5 * Float.parseFloat(pe))) / Float.parseFloat(tp));

		p.setIdi(idi.toString());
		p.setDate(date);
		servicioIdi.save(p);

		return p;
	}

	// cooperacion exyterna y redes de investigacion
	// cooprd = cooperacion externa y redes de investigacion
	// tacl = total de articulos academicos indexados en scopus o isis web
	// desarroolladps en cooperacion o coautoria
	// con profesores del program y de otras instituciones de educacion superior en
	// el marco de acuerdos interinstitucionales
	// de cooperacion en I + D y redes de investigacion
	// tac = total de articulos academicos de la planta academica del programa
	@GetMapping("/idi/condiciones/cooprd/{tacl}/{tac}/{date}")
	public cooprd cooprd(@PathVariable String tacl, @PathVariable String tac,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		cooprd p = new cooprd();
		p.setTac(tac);
		p.setTacl(tacl);

		Float cooprd = (100 * (Float.parseFloat(tacl) / Float.parseFloat(tac)));

		p.setCooprd(cooprd.toString());
		p.setDate(date);
		servicioCooprd.save(p);
		return p;
	}

	/*
	 * float ri = 0;
	 * 
	 * // revistas indexadas // ri = revistas indexadas // f = factor de impacto de
	 * la revista i-esima // nr = numero de revistas indexadas en scopus, isi web of
	 * knowledge y o bases // de datos emergentes, que cuentan con profesores // del
	 * programa como parte de su comete editorial // nr = revista i esima indexada
	 * en scopus, isi web of knowledge y o bases de // datos emergentes // numero de
	 * revistas presentes en bases de datos tales como scielo, latindex, // lilacs y
	 * redalyc que cuentan con profesores del // programa como parte de su comite
	 * editorial
	 * 
	 * @GetMapping("/idi/condiciones/ri/{nr}/{f}/{nrr}") public float
	 * ri(@PathVariable Long[] nr, @PathVariable Long[] f, @PathVariable Long nrr) {
	 * for (int i = 0; i <= nr.length; i++) { ri = (float) (1 + (3.92 * f[i] *
	 * nr[i]) + nrr); } return ri; }
	 */

	/*
	 * float sumatoria = 0; float sumatoriaTp = 0;
	 * 
	 * // produccion cientifica en revistas indexadas de impacto mundial // ipaim =
	 * indice de produccion academica con impacto mundial // npa = numero de
	 * profesores que son autores o coautores de los articulos // publicados en
	 * revistas de impacto mundial // nsjr = numero de articulos academicos
	 * publicados por los investigadores del // programa durante el periodo de
	 * evaluacion // b = factor de ajuste que depende del tipo de programa // tp =
	 * numero total de profesores del programa durante el periodo de evaluacion // a
	 * = valor entre 0 y 1, otorgado al impacto local, regonal o nacional //
	 * atribuido al articulo i esimo
	 * 
	 * @GetMapping("/idi/resultados/ipaim/{npa}/{b}/{tp}/{nsjr}/{sjr}/{a}") public
	 * float ipaim(@PathVariable Long npa, @PathVariable Long tp, @PathVariable Long
	 * b, @PathVariable Long[] nsjr,
	 * 
	 * @PathVariable Long[] sjr, @PathVariable Long[] a) { for (int i = 0; i <=
	 * nsjr.length; i++) { sumatoria = (float) (1 + (3.92 * sjr[i]) + a[i]); }
	 * sumatoriaTp = ((npa / (b * tp)) * (1 / tp)) * sumatoria; return sumatoriaTp;
	 * }
	 */

	/*
	 * float sumatoriaNar = 0; float sumatoriaNarTp = 0;
	 * 
	 * // produccion cientifica en revistas indexadas de impacto regional //ipair =
	 * indice de produccion academica con impacto regional //npa = numero de
	 * profesores que son autores o coautores de los articulos pubilcados en
	 * revistas de impacto mundial //npr = numero de profesores que son autores o
	 * coautroes de los articulos publicados durante el periodo de evaluacion //que
	 * se consideran en este indicador //b = factor de ajuste que depende del tipo
	 * de programa //tp = numero total de profesores del programa durante el periodo
	 * de evaluacion //nar = numero de articulos o trabajos cientificos de los
	 * investigadores del programa, publicados o aceptados en revistas //que constan
	 * en bases de datos, cuyo criterio de indexacion comtemplen parametros de
	 * calidad reconocidos regionalmente //a = valor entre 0 y 1 otorgado al impacto
	 * local, regional o nacional atribuido al articulo i esimo
	 * 
	 * @GetMapping("/idi/resultados/ipair/{npr}/{b}/{tp}/{npa}/{nar}/{a}") public
	 * float ipair(@PathVariable Long npr, @PathVariable Long tp, @PathVariable Long
	 * b, @PathVariable Long npa,
	 * 
	 * @PathVariable Long[] nar, @PathVariable Long[] a) { for (int i = 0; i <=
	 * nar.length; i++) { sumatoriaNar = (float) (1 + a[i]); } sumatoriaNarTp =
	 * ((npr / (b * (tp - npa)) * (1 / (tp - npa)))) * sumatoriaNar; return
	 * sumatoriaNarTp; }
	 */
	/*
	 * float sumatoria1 = 0; float sumatoria2 = 0; float sumatoriaTotalTp = 0;
	 * //libros y o capitulos de libros revisados por pares //lcl = libros o
	 * capitulos d libros revisados por pares //npl = numero de profesores que son
	 * auteres o coautores d libros o capitulos de libros pulicados //durante el
	 * periodo de evaluacion que se consideran en este indicador //b = factor de
	 * ajuste que depende del tipo de programa //tp = numero de profesores del
	 * programa durante el periodo de evaluacion //l = numero total de libros
	 * publicados por profesor y su sub i que representa cada libro //a = valor
	 * entre 0 y 1 otorgado al impacto local, regional o nacional atribuido al libro
	 * i esimo o //capitulo de ibro i esimo //cl = numero total de capitulos de
	 * libros publicados por profesores del programa //y cada libro publicado por
	 * este en su sub indice i //o = valor otorgado al capitulo de libro i esimo 0 y
	 * 0,5
	 * 
	 * @GetMapping("/idi/resultados/lcl/{npl}/{b}/{tp}/{l}/{cl}/{a}/{o}") public
	 * float lcl(@PathVariable Long npl, @PathVariable Long b, @PathVariable Long
	 * tp, @PathVariable Long[] l,
	 * 
	 * @PathVariable Long[] cl, @PathVariable Long[] o, @PathVariable Long[] a) {
	 * for (int i = 0; i <= l.length; i++) { sumatoria1 = (float) (l[i] + a[i]); }
	 * for (int i = 0; i <= cl.length; i++) { sumatoriaNar = (float) ((cl[i] * o[i])
	 * + a[i]); } sumatoriaTotalTp = ((npl / (b * tp)) * (1 / tp)) * (sumatoria1 +
	 * sumatoria2); return sumatoriaTotalTp; }
	 * 
	 */
	// ambiente institucional
	// recursos de aprendizaje
	// ambientes de aprendizaje
	// iaa = indice de valoracion de ambientes de aprendizaje
	// fun = funcionalidad de ambientes de aprendizaje
	// eq = equipamiento de ambientes de aprendizaje
	// dis = disponibilidad de ambientes de aprendizaje
	// todos los aspectos calificados en escala de 1 a 10
	@GetMapping("/ambienteinstitucional/recursosaprendizaje/iaa/{fun}/{eq}/{dis}/{date}")
	public iaa iaa(@PathVariable String fun, @PathVariable String eq, @PathVariable String dis,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		iaa p = new iaa();
		p.setFun(fun);
		p.setEq(eq);
		p.setDis(dis);

		Float iaa = ((Float.parseFloat(fun) + Float.parseFloat(eq) + Float.parseFloat(dis)) / 3);
		p.setIaa(iaa.toString());
		p.setDate(date);
		servicioIaa.save(p);
		return p;
	}

	// aqui va a ir todo lo que refiere a indicadores cualitativos
	@GetMapping("/organizacion/constitucion/contexto/contextev/{context1}/{context2}/{context3}/{context4}/{context5}/{context6}/{context7}/{date}")
	public contexto contecto(@PathVariable String context1, @PathVariable String context2,
			@PathVariable String context3, @PathVariable String context4, @PathVariable String context5,
			@PathVariable String context6, @PathVariable String context7,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		contexto p = new contexto();
		p.setContext1(context1);
		p.setContext2(context2);
		p.setContext3(context3);
		p.setContext4(context4);
		p.setContext5(context5);
		p.setContext6(context6);
		p.setContext7(context7);

		Float promedioContext = (Float.parseFloat(context1) + Float.parseFloat(context2) + Float.parseFloat(context3)
				+ Float.parseFloat(context4) + Float.parseFloat(context5) + Float.parseFloat(context6)
				+ Float.parseFloat(context7)) / 7;
		p.setPromedioContext(promedioContext.toString());
		p.setDate(date);
		servicioContext.save(p);

		return p;
	}

	@GetMapping("/organizacion/constitucion/gestionacademica/{gestionAcademica1}/{gestionAcademica2}/{gestionAcademica3}/{gestionAcademica4}/{gestionAcademica5}/{gestionAcademica6}/{date}")
	public gestioAcademica gestionAcademica(@PathVariable String gestionAcademica1,
			@PathVariable String gestionAcademica2, @PathVariable String gestionAcademica3,
			@PathVariable String gestionAcademica4, @PathVariable String gestionAcademica5,
			@PathVariable String gestionAcademica6, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		gestioAcademica p = new gestioAcademica();
		p.setGestionAcademica1(gestionAcademica1);
		p.setGestionAcademica2(gestionAcademica2);
		p.setGestionAcademica3(gestionAcademica3);
		p.setGestionAcademica4(gestionAcademica4);
		p.setGestionAcademica5(gestionAcademica5);
		p.setGestionAcademica6(gestionAcademica6);
		Float promedioGestionAcademica = (Float.parseFloat(gestionAcademica1) + Float.parseFloat(gestionAcademica2)
				+ Float.parseFloat(gestionAcademica3) + Float.parseFloat(gestionAcademica4)
				+ Float.parseFloat(gestionAcademica5) + Float.parseFloat(gestionAcademica6)) / 6;
		p.setPromedioGestionAcademica(promedioGestionAcademica.toString());
		p.setDate(date);
		sevicioGestionAcademica.save(p);

		return p;
	}

	@GetMapping("/organizacion/constitucion/estructuraprograma/{estructuraPrograma1}/{estructuraPrograma2}/{estructuraPrograma3}/{estructuraPrograma4}/{estructuraPrograma5}/{date}")
	public estructuraPrograma estructuraPrograma(@PathVariable String estructuraPrograma1,
			@PathVariable String estructuraPrograma2, @PathVariable String estructuraPrograma3,
			@PathVariable String estructuraPrograma4, @PathVariable String estructuraPrograma5,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		estructuraPrograma p = new estructuraPrograma();
		p.setEstructuraPrograma1(estructuraPrograma1);
		p.setEstructuraPrograma2(estructuraPrograma2);
		p.setEstructuraPrograma3(estructuraPrograma3);
		p.setEstructuraPrograma4(estructuraPrograma4);
		p.setEstructuraPrograma5(estructuraPrograma5);
		Float promedioEstructuraPrograma = (Float.parseFloat(estructuraPrograma1)
				+ Float.parseFloat(estructuraPrograma2) + Float.parseFloat(estructuraPrograma3)
				+ Float.parseFloat(estructuraPrograma4) + Float.parseFloat(estructuraPrograma5)) / 5;
		p.setPromedioEstructuraPrograma(promedioEstructuraPrograma.toString());
		p.setDate(date);
		servicioEstructuraPrograma.save(p);
		return p;
	}

	@GetMapping("/organizacion/politicasprocedimientos/politicasadmision/{politicasAdmision1}/{politicasAdmision2}/{politicasAdmision3}/{politicasAdmision4}/{date}")
	public politicasAdmision politicasAdmision(@PathVariable String politicasAdmision1,
			@PathVariable String politicasAdmision2, @PathVariable String politicasAdmision3,
			@PathVariable String politicasAdmision4, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		politicasAdmision p = new politicasAdmision();
		p.setPoliticasAdmision1(politicasAdmision1);
		p.setPoliticasAdmision2(politicasAdmision2);
		p.setPoliticasAdmision3(politicasAdmision3);
		p.setPoliticasAdmision4(politicasAdmision4);
		Float promedioPoliticasAdmision = (Float.parseFloat(politicasAdmision1) + Float.parseFloat(politicasAdmision2)
				+ Float.parseFloat(politicasAdmision3) + Float.parseFloat(politicasAdmision4)) / 4;
		p.setPromedioPoliticasAdmision(promedioPoliticasAdmision.toString());
		p.setDate(date);
		servicioPoliticasAdmision.save(p);
		return p;
	}

	@GetMapping("/organizacion/politicasprocedimientos/politicastitulacion/{politicasTitulacion1}/{politicasTitulacion2}/{politicasTitulacion3}/{politicasTitulacion4}/{date}")
	public politicasTitulacion politicasTitulacion(@PathVariable String politicasTitulacion1,
			@PathVariable String politicasTitulacion2, @PathVariable String politicasTitulacion3,
			@PathVariable String politicasTitulacion4, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		politicasTitulacion p = new politicasTitulacion();
		p.setPoliticasTitulacion1(politicasTitulacion1);
		p.setPoliticasTitulacion2(politicasTitulacion2);
		p.setPoliticasTitulacion3(politicasTitulacion3);
		p.setPoliticasTitulacion4(politicasTitulacion4);
		Float promedioPoliticasTitulacion = (Float.parseFloat(politicasTitulacion1)
				+ Float.parseFloat(politicasTitulacion2) + Float.parseFloat(politicasTitulacion3)
				+ Float.parseFloat(politicasTitulacion4)) / 4;
		p.setPromedioPoliticasTitulacion(promedioPoliticasTitulacion.toString());
		p.setDate(date);
		servicioPoliticasTitulacion.save(p);
		return p;
	}

	@GetMapping("/organizacion/politicasprocedimientos/sistemasbecas/{sistemasBecas1}/{sistemasBecas2}/{sistemasBecas3}/{sistemasBecas4}/{date}")
	public sistemasBecas sistemasBecas(@PathVariable String sistemasBecas1, @PathVariable String sistemasBecas2,
			@PathVariable String sistemasBecas3, @PathVariable String sistemasBecas4,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		sistemasBecas p = new sistemasBecas();
		p.setSistemasBecas1(sistemasBecas1);
		p.setSistemasBecas2(sistemasBecas2);
		p.setSistemasBecas3(sistemasBecas3);
		p.setSistemasBecas4(sistemasBecas4);
		Float promedioSistemasBecas = (Float.parseFloat(sistemasBecas1) + Float.parseFloat(sistemasBecas2)
				+ Float.parseFloat(sistemasBecas3) + Float.parseFloat(sistemasBecas4)) / 4;
		p.setPromedioSistemasBecas(promedioSistemasBecas.toString());
		p.setDate(date);
		servicioSistemasBecas.save(p);

		return p;
	}

	@GetMapping("/organizacion/politicasprocedimientos/seguimientograduados/{seguimientoGraduados1}/{seguimientoGraduados2}/{seguimientoGraduados3}/{seguimientoGraduados4}/{seguimientoGraduados5}/{seguimientoGraduados6}/{date}")
	public seguimientoGraduados seguimientoGraduados(@PathVariable String seguimientoGraduados1,
			@PathVariable String seguimientoGraduados2, @PathVariable String seguimientoGraduados3,
			@PathVariable String seguimientoGraduados4, @PathVariable String seguimientoGraduados5,
			@PathVariable String seguimientoGraduados6, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		seguimientoGraduados p = new seguimientoGraduados();
		p.setSeguimientoGraduados1(seguimientoGraduados1);
		p.setSeguimientoGraduados2(seguimientoGraduados2);
		p.setSeguimientoGraduados3(seguimientoGraduados3);
		p.setSeguimientoGraduados4(seguimientoGraduados4);
		p.setSeguimientoGraduados5(seguimientoGraduados5);
		p.setSeguimientoGraduados6(seguimientoGraduados6);
		Float promedioSeguimientoGraduados = (Float.parseFloat(seguimientoGraduados1)
				+ Float.parseFloat(seguimientoGraduados2) + Float.parseFloat(seguimientoGraduados3)
				+ Float.parseFloat(seguimientoGraduados4) + Float.parseFloat(seguimientoGraduados5)
				+ Float.parseFloat(seguimientoGraduados6)) / 6;
		p.setPromedioSeguimientoGraduados(promedioSeguimientoGraduados.toString());
		p.setDate(date);
		servicioSeguimientoGraduados.save(p);

		return p;
	}

	@GetMapping("/programaacademico/design/perfilegreso/{perfilEgreso1}/{perfilEgreso2}/{perfilEgreso3}/{perfilEgreso4}/{perfilEgreso5}/{perfilEgreso6}/{date}")
	public perfilEgreso perfilEgreso(@PathVariable String perfilEgreso1, @PathVariable String perfilEgreso2,
			@PathVariable String perfilEgreso3, @PathVariable String perfilEgreso4, @PathVariable String perfilEgreso5,
			@PathVariable String perfilEgreso6, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		perfilEgreso p = new perfilEgreso();
		p.setPerfilEgreso1(perfilEgreso1);
		p.setPerfilEgreso2(perfilEgreso2);
		p.setPerfilEgreso3(perfilEgreso3);
		p.setPerfilEgreso4(perfilEgreso4);
		p.setPerfilEgreso5(perfilEgreso5);
		p.setPerfilEgreso6(perfilEgreso6);
		Float promedioPerfilEgreso = (Float.parseFloat(perfilEgreso1) + Float.parseFloat(perfilEgreso2)
				+ Float.parseFloat(perfilEgreso3) + Float.parseFloat(perfilEgreso4) + Float.parseFloat(perfilEgreso5)
				+ Float.parseFloat(perfilEgreso6)) / 6;
		p.setPromedioPerfilEgreso(promedioPerfilEgreso.toString());
		p.setDate(date);
		servicioPerfilEgreso.save(p);
		return p;
	}

	@GetMapping("/programaacademico/design/planestudios/{planEstudios1}/{planEstudios2}/{planEstudios3}/{planEstudios4}/{planEstudios5}/{date}")
	public planEstudios planEstudios(@PathVariable String planEstudios1, @PathVariable String planEstudios2,
			@PathVariable String planEstudios3, @PathVariable String planEstudios4, @PathVariable String planEstudios5,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		planEstudios p = new planEstudios();
		p.setPlanEstudios1(planEstudios1);
		p.setPlanEstudios2(planEstudios2);
		p.setPlanEstudios3(planEstudios3);
		p.setPlanEstudios4(planEstudios4);
		p.setPlanEstudios5(planEstudios5);
		Float promedioPlanEstudios = (Float.parseFloat(planEstudios1) + Float.parseFloat(planEstudios2)
				+ Float.parseFloat(planEstudios3) + Float.parseFloat(planEstudios4) + Float.parseFloat(planEstudios5))
				/ 5;
		p.setPromedioPlanEstudios(promedioPlanEstudios.toString());
		p.setDate(date);
		servicioPlanEstudios.save(p);

		return p;

	}

	@GetMapping("/programaacademico/implementacion/planmicrocurricular/{planMicrocurricular1}/{planMicrocurricular2}/{planMicrocurricular3}/{planMicrocurricular4}/{date}")
	public planMicrocurricular planMicrocurricular(@PathVariable String planMicrocurricular1,
			@PathVariable String planMicrocurricular2, @PathVariable String planMicrocurricular3,
			@PathVariable String planMicrocurricular4, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		planMicrocurricular p = new planMicrocurricular();
		p.setPlanMicrocurricular1(planMicrocurricular1);
		p.setPlanMicrocurricular2(planMicrocurricular2);
		p.setPlanMicrocurricular3(planMicrocurricular3);
		p.setPlanMicrocurricular4(planMicrocurricular4);
		Float promedioPlanMicrocurricular = (Float.parseFloat(planMicrocurricular1)
				+ Float.parseFloat(planMicrocurricular2) + Float.parseFloat(planMicrocurricular3)
				+ Float.parseFloat(planMicrocurricular4)) / 4;
		p.setPromedioPlanMicrocurricular(promedioPlanMicrocurricular.toString());
		p.setDate(date);
		servicioPlanMicrocurricular.save(p);

		return p;
	}

	@GetMapping("/programaacademico/implementacion/evaluacionseguimiento/{evaluacionSeguimiento1}/{evaluacionSeguimiento2}/{evaluacionSeguimiento3}/{evaluacionSeguimiento4}/{evaluacionSeguimiento5}/{date}")
	public evaluacionSeguimiento evaluacionSeguimiento(@PathVariable String evaluacionSeguimiento1,
			@PathVariable String evaluacionSeguimiento2, @PathVariable String evaluacionSeguimiento3,
			@PathVariable String evaluacionSeguimiento4, @PathVariable String evaluacionSeguimiento5,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		evaluacionSeguimiento p = new evaluacionSeguimiento();
		p.setEvaluacionSeguimiento1(evaluacionSeguimiento1);
		p.setEvaluacionSeguimiento2(evaluacionSeguimiento2);
		p.setEvaluacionSeguimiento3(evaluacionSeguimiento3);
		p.setEvaluacionSeguimiento4(evaluacionSeguimiento4);
		p.setEvaluacionSeguimiento5(evaluacionSeguimiento5);
		Float promedioEvaluacionSeguimiento = (Float.parseFloat(evaluacionSeguimiento1)
				+ Float.parseFloat(evaluacionSeguimiento2) + Float.parseFloat(evaluacionSeguimiento3)
				+ Float.parseFloat(evaluacionSeguimiento4) + Float.parseFloat(evaluacionSeguimiento5)) / 5;
		p.setPromedioEvaluacionSeguimiento(promedioEvaluacionSeguimiento.toString());
		p.setDate(date);
		servicioEvaluacionSeguimiento.save(p);

		return p;
	}

	@GetMapping("/idi/condiciones/gruposinvestigacion/{gruposInvestigacion1}/{gruposInvestigacion2}/{gruposInvestigacion3}/{gruposInvestigacion4}/{date}")
	public gruposInvestigacion gruposInvestigacion(@PathVariable String gruposInvestigacion1,
			@PathVariable String gruposInvestigacion2, @PathVariable String gruposInvestigacion3,
			@PathVariable String gruposInvestigacion4, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		gruposInvestigacion p = new gruposInvestigacion();
		p.setGruposInvestigacion1(gruposInvestigacion1);
		p.setGruposInvestigacion2(gruposInvestigacion2);
		p.setGruposInvestigacion3(gruposInvestigacion3);
		p.setGruposInvestigacion4(gruposInvestigacion4);
		Float promedioGruposInvestigacion = (Float.parseFloat(gruposInvestigacion1)
				+ Float.parseFloat(gruposInvestigacion2) + Float.parseFloat(gruposInvestigacion3)
				+ Float.parseFloat(gruposInvestigacion4)) / 4;
		p.setPromedioGruposInvestigacion(promedioGruposInvestigacion.toString());
		p.setDate(date);
		servicioGruposInvestigacion.save(p);
		return p;
	}

	@GetMapping("/ambienteinstitucional/recursosaprendizaje/bibvirrepdig/{bibvirrepDig1}/{bibvirrepDig2}/{bibvirrepDig3}/{date}")
	public bibvirrepDig bibvirrepDig(@PathVariable String bibvirrepDig1, @PathVariable String bibvirrepDig2,
			@PathVariable String bibvirrepDig3, @DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {

		bibvirrepDig p = new bibvirrepDig();
		p.setBibvirrepDig1(bibvirrepDig1);
		p.setBibvirrepDig2(bibvirrepDig2);
		p.setBibvirrepDig3(bibvirrepDig3);
		Float promedioBibvirrepDig = (Float.parseFloat(bibvirrepDig1) + Float.parseFloat(bibvirrepDig2)
				+ Float.parseFloat(bibvirrepDig3)) / 3;
		p.setPromedioBibvirrepDig(promedioBibvirrepDig.toString());
		p.setDate(date);
		servicioBibvirrepDig.save(p);
		return p;
	}

	@GetMapping("/ambienteinstitucional/redescooperacion/movilidadacademica/{movilidadAcademica1}/{movilidadAcademica2}/{movilidadAcademica3}/{date}")
	public movilidadAcademica movilidadAcademica(@PathVariable String movilidadAcademica1,
			@PathVariable String movilidadAcademica2, @PathVariable String movilidadAcademica3,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		movilidadAcademica p = new movilidadAcademica();
		p.setMovilidadAcademica1(movilidadAcademica1);
		p.setMovilidadAcademica2(movilidadAcademica2);
		p.setMovilidadAcademica3(movilidadAcademica3);
		Float promedioMovilidadAcademica = (Float.parseFloat(movilidadAcademica1)
				+ Float.parseFloat(movilidadAcademica2) + Float.parseFloat(movilidadAcademica3)) / 3;
		p.setPromedioMovilidadAcademica(promedioMovilidadAcademica.toString());
		p.setDate(date);
		return p;
	}

	@GetMapping("/ambienteinstitucional/redescooperacion/participacioredes/{participacionRedes1}/{participacionRedes2}/{participacionRedes3}/{date}")
	public participacionRedes participacionRedes(@PathVariable String participacionRedes1,
			@PathVariable String participacionRedes2, @PathVariable String participacionRedes3,
			@DateTimeFormat(pattern = "dd-MM-yyyy") Date date) {
		participacionRedes p = new participacionRedes();
		p.setParticipacionRedes1(participacionRedes1);
		p.setParticipacionRedes2(participacionRedes2);
		p.setParticipacionRedes3(participacionRedes3);
		Float promedioParticipacionRedes = (Float.parseFloat(participacionRedes1)
				+ Float.parseFloat(participacionRedes2) + Float.parseFloat(participacionRedes3)) / 3;
		p.setPromedioParticipacionRedes(promedioParticipacionRedes.toString());
		p.setDate(date);
		servicioParticipacionRedes.save(p);
		return p;
	}

}
