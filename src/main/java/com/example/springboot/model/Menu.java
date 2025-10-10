package com.example.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="menu")
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="monday_lunch")
	private String mondayLunch;
	
	@Column(name="monday_dinner")
	private String mondayDinner;
	
	@Column(name="tuesday_lunch")
	private String tuesdayLunch;
	
	@Column(name="tuesday_dinner")
	private String tuesdayDinner;
	
	@Column(name="wednesday_lunch")
	private String wednesdayLunch;
	
	@Column(name="wednesday_dinner")
	private String wednesdayDinner;
	
	@Column(name="thursday_lunch")
	private String thursdayLunch;
	
	@Column(name="thursday_dinner")
	private String thursdayDinner;
	
	@Column(name="friday_lunch")
	private String fridayLunch;
	
	@Column(name="friday_dinner")
	private String fridayDinner;
	
	@Column(name="saturday_lunch")
	private String saturdayLunch;
	
	@Column(name="saturday_dinner")
	private String saturdayDinner;
	
	@Column(name="sunday_lunch")
	private String sundayLunch;
	
	@Column(name="sunday_dinner")
	private String sundayDinner;
	
	@Column(name="monday_lunch_rice")
	private String mondayLunchRice;
	
	@Column(name="monday_dinner_rice")
	private String mondayDinnerRice;
	
	@Column(name="tuesday_lunch_rice")
	private String tuesdayLunchRice;
	
	@Column(name="tuesday_dinner_rice")
	private String tuesdayDinnerRice;
	
	@Column(name="wednesday_lunch_rice")
	private String wednesdayLunchRice;
	
	@Column(name="wednesday_dinner_rice")
	private String wednesdayDinnerRice;
	
	@Column(name="thursday_lunch_rice")
	private String thursdayLunchRice;
	
	@Column(name="thursday_dinner_rice")
	private String thursdayDinnerRice;
	
	@Column(name="friday_lunch_rice")
	private String fridayLunchRice;
	
	@Column(name="friday_dinner_rice")
	private String fridayDinnerRice;
	
	@Column(name="saturday_lunch_rice")
	private String saturdayLunchRice;
	
	@Column(name="saturday_dinner_rice")
	private String saturdayDinnerRice;
	
	@Column(name="sunday_lunch_rice")
	private String sundayLunchRice;
	
	@Column(name="sunday_dinner_rice")
	private String sundayDinnerRice;
	
	@Column(name="monday_side_lunch")
	private String mondaySideLunch;
	
	@Column(name="monday_side_dinner")
	private String mondaySideDinner;
	
	@Column(name="tuesday_side_lunch")
	private String tuesdaySideLunch;
	
	@Column(name="tuesday_side_dinner")
	private String tuesdaySideDinner;
	
	@Column(name="wednesday_side_lunch")
	private String wednesdaySideLunch;
	
	@Column(name="wednesday_side_dinner")
	private String wednesdaySideDinner;
	
	@Column(name="thursday_side_lunch")
	private String thursdaySideLunch;
	
	@Column(name="thursday_side_dinner")
	private String thursdaySideDinner;
	
	@Column(name="friday_side_lunch")
	private String fridaySideLunch;
	
	@Column(name="friday_side_dinner")
	private String fridaySideDinner;
	
	@Column(name="saturday_side_lunch")
	private String saturdaySideLunch;
	
	@Column(name="saturday_side_dinner")
	private String saturdaySideDinner;
	
	@Column(name="sunday_side_lunch")
	private String sundaySideLunch;
	
	@Column(name="sunday_side_dinner")
	private String sundaySideDinner;
	
	@Column(name="monday_lunch_other")
	private String mondayLunchOther;
	
	@Column(name="monday_dinner_other")
	private String mondayDinnerOther;
	
	@Column(name="tuesday_lunch_other")
	private String tuesdayLunchOther;
	
	@Column(name="tuesday_dinner_other")
	private String tuesdayDinnerOther;
	
	@Column(name="wednesday_lunch_other")
	private String wednesdayLunchOther;
	
	@Column(name="wednesday_dinner_other")
	private String wednesdayDinnerOther;
	
	@Column(name="thursday_lunch_other")
	private String thursdayLunchOther;
	
	@Column(name="thursday_dinner_other")
	private String thursdayDinnerOther;
	
	@Column(name="friday_lunch_other")
	private String fridayLunchOther;
	
	@Column(name="friday_dinner_other")
	private String fridayDinnerOther;
	
	@Column(name="saturday_lunch_other")
	private String saturdayLunchOther;
	
	@Column(name="saturday_dinner_other")
	private String saturdayDinnerOther;
	
	@Column(name="sunday_lunch_other")
	private String sundayLunchOther;
	
	@Column(name="sunday_dinner_other")
	private String sundayDinnerOther;
	
	public Menu() {
		
	}
	
	public Menu(String ml, String md, String tl, String td, String wl, String wd, String thl, String thd, String fl, String fd,
			String sl, String sd, String sul, String sud, String mlr, String mdr, String tlr, String tdr, String wlr, String wdr, String thlr, String thdr, String flr, String fdr,
			String slr, String sdr, String sulr, String sudr, String msl, String msd, String tsl, String tsd, String wsl, String wsd, String thsl, String thsd, String fsl, String fsd,
			String ssl, String ssd, String susl, String susd, String mlo, String mdo, String tlo, String tdo, String wlo, String wdo, String thlo, String thdo, String flo, String fdo,
			String slo, String sdo, String sulo, String sudo) {
		super();
		this.mondayLunch = ml;
		this.mondayDinner = md;
		
		this.tuesdayLunch = tl;
		this.tuesdayDinner = td;
		
		this.wednesdayLunch = wl;
		this.wednesdayDinner = wd;
		
		this.thursdayLunch = thl;
		this.thursdayDinner = thd;
		
		this.fridayLunch = fl;
		this.fridayDinner = fd;
		
		this.saturdayLunch = sl;
		this.saturdayDinner = sd;
		
		this.sundayLunch = sul;
		this.sundayDinner = sud;
		
		this.mondayLunchRice = mlr;
		this.mondayDinnerRice = mdr;
		
		this.tuesdayLunchRice = tlr;
		this.tuesdayDinnerRice = tdr;
		
		this.wednesdayLunchRice = wlr;
		this.wednesdayDinnerRice = wdr;
		
		this.thursdayLunchRice = thlr;
		this.thursdayDinnerRice = thdr;
		
		this.fridayLunchRice = flr;
		this.fridayDinnerRice = fdr;
		
		this.saturdayLunchRice = slr;
		this.saturdayDinnerRice = sdr;
		
		this.sundayLunchRice = sulr;
		this.sundayDinnerRice = sudr;
		
		this.mondaySideLunch = msl;
		this.mondaySideDinner = msd;
		
		this.tuesdaySideLunch = tsl;
		this.tuesdaySideDinner = tsd;
		
		this.wednesdaySideLunch = wsl;
		this.wednesdaySideDinner = wsd;
		
		this.thursdaySideLunch = thsl;
		this.thursdaySideDinner = thsd;
		
		this.fridaySideLunch = fsl;
		this.fridaySideDinner = fsd;
		
		this.saturdaySideLunch = ssl;
		this.saturdaySideDinner = ssd;
		
		this.sundaySideLunch = susl;
		this.sundaySideDinner = susd;
		
		this.mondayLunchOther = mlo;
		this.mondayDinnerOther = mdo;
		
		this.tuesdayLunchOther = tlo;
		this.tuesdayDinnerOther = tdo;
		
		this.wednesdayLunchOther = wlo;
		this.wednesdayDinnerOther = wdo;
		
		this.thursdayLunchOther = thlo;
		this.thursdayDinnerOther = thdo;
		
		this.fridayLunchOther = flo;
		this.fridayDinnerOther = fdo;
		
		this.saturdayLunchOther = slo;
		this.saturdayDinnerOther = sdo;
		
		this.sundayLunchOther = sulo;
		this.sundayDinnerOther = sudo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMondayLunch() {
		return mondayLunch;
	}

	public void setMondayLunch(String mondayLunch) {
		this.mondayLunch = mondayLunch;
	}

	public String getMondayDinner() {
		return mondayDinner;
	}

	public void setMondayDinner(String mondayDinner) {
		this.mondayDinner = mondayDinner;
	}

	public String getTuesdayLunch() {
		return tuesdayLunch;
	}

	public void setTuesdayLunch(String tuesdayLunch) {
		this.tuesdayLunch = tuesdayLunch;
	}

	public String getTuesdayDinner() {
		return tuesdayDinner;
	}

	public void setTuesdayDinner(String tuesdayDinner) {
		this.tuesdayDinner = tuesdayDinner;
	}

	public String getWednesdayLunch() {
		return wednesdayLunch;
	}

	public void setWednesdayLunch(String wednesdayLunch) {
		this.wednesdayLunch = wednesdayLunch;
	}

	public String getWednesdayDinner() {
		return wednesdayDinner;
	}

	public void setWednesdayDinner(String wednesdayDinner) {
		this.wednesdayDinner = wednesdayDinner;
	}

	public String getThursdayLunch() {
		return thursdayLunch;
	}

	public void setThursdayLunch(String thursdayLunch) {
		this.thursdayLunch = thursdayLunch;
	}

	public String getThursdayDinner() {
		return thursdayDinner;
	}

	public void setThursdayDinner(String thursdayDinner) {
		this.thursdayDinner = thursdayDinner;
	}

	public String getFridayLunch() {
		return fridayLunch;
	}

	public void setFridayLunch(String fridayLunch) {
		this.fridayLunch = fridayLunch;
	}

	public String getFridayDinner() {
		return fridayDinner;
	}

	public void setFridayDinner(String fridayDinner) {
		this.fridayDinner = fridayDinner;
	}

	public String getSaturdayLunch() {
		return saturdayLunch;
	}

	public void setSaturdayLunch(String saturdayLunch) {
		this.saturdayLunch = saturdayLunch;
	}

	public String getSaturdayDinner() {
		return saturdayDinner;
	}

	public void setSaturdayDinner(String saturdayDinner) {
		this.saturdayDinner = saturdayDinner;
	}

	public String getSundayLunch() {
		return sundayLunch;
	}

	public void setSundayLunch(String sundayLunch) {
		this.sundayLunch = sundayLunch;
	}

	public String getSundayDinner() {
		return sundayDinner;
	}

	public void setSundayDinner(String sundayDinner) {
		this.sundayDinner = sundayDinner;
	}

	public String getMondayLunchRice() {
		return mondayLunchRice;
	}

	public void setMondayLunchRice(String mondayLunchRice) {
		this.mondayLunchRice = mondayLunchRice;
	}

	public String getMondayDinnerRice() {
		return mondayDinnerRice;
	}

	public void setMondayDinnerRice(String mondayDinnerRice) {
		this.mondayDinnerRice = mondayDinnerRice;
	}

	public String getTuesdayLunchRice() {
		return tuesdayLunchRice;
	}

	public void setTuesdayLunchRice(String tuesdayLunchRice) {
		this.tuesdayLunchRice = tuesdayLunchRice;
	}

	public String getTuesdayDinnerRice() {
		return tuesdayDinnerRice;
	}

	public void setTuesdayDinnerRice(String tuesdayDinnerRice) {
		this.tuesdayDinnerRice = tuesdayDinnerRice;
	}

	public String getWednesdayLunchRice() {
		return wednesdayLunchRice;
	}

	public void setWednesdayLunchRice(String wednesdayLunchRice) {
		this.wednesdayLunchRice = wednesdayLunchRice;
	}

	public String getWednesdayDinnerRice() {
		return wednesdayDinnerRice;
	}

	public void setWednesdayDinnerRice(String wednesdayDinnerRice) {
		this.wednesdayDinnerRice = wednesdayDinnerRice;
	}

	public String getThursdayLunchRice() {
		return thursdayLunchRice;
	}

	public void setThursdayLunchRice(String thursdayLunchRice) {
		this.thursdayLunchRice = thursdayLunchRice;
	}

	public String getThursdayDinnerRice() {
		return thursdayDinnerRice;
	}

	public void setThursdayDinnerRice(String thursdayDinnerRice) {
		this.thursdayDinnerRice = thursdayDinnerRice;
	}

	public String getFridayLunchRice() {
		return fridayLunchRice;
	}

	public void setFridayLunchRice(String fridayLunchRice) {
		this.fridayLunchRice = fridayLunchRice;
	}

	public String getFridayDinnerRice() {
		return fridayDinnerRice;
	}

	public void setFridayDinnerRice(String fridayDinnerRice) {
		this.fridayDinnerRice = fridayDinnerRice;
	}

	public String getSaturdayLunchRice() {
		return saturdayLunchRice;
	}

	public void setSaturdayLunchRice(String saturdayLunchRice) {
		this.saturdayLunchRice = saturdayLunchRice;
	}

	public String getSaturdayDinnerRice() {
		return saturdayDinnerRice;
	}

	public void setSaturdayDinnerRice(String saturdayDinnerRice) {
		this.saturdayDinnerRice = saturdayDinnerRice;
	}

	public String getSundayLunchRice() {
		return sundayLunchRice;
	}

	public void setSundayLunchRice(String sundayLunchRice) {
		this.sundayLunchRice = sundayLunchRice;
	}

	public String getSundayDinnerRice() {
		return sundayDinnerRice;
	}

	public void setSundayDinnerRice(String sundayDinnerRice) {
		this.sundayDinnerRice = sundayDinnerRice;
	}

	public String getMondaySideLunch() {
		return mondaySideLunch;
	}

	public void setMondaySideLunch(String mondaySideLunch) {
		this.mondaySideLunch = mondaySideLunch;
	}

	public String getMondaySideDinner() {
		return mondaySideDinner;
	}

	public void setMondaySideDinner(String mondaySideDinner) {
		this.mondaySideDinner = mondaySideDinner;
	}

	public String getTuesdaySideLunch() {
		return tuesdaySideLunch;
	}

	public void setTuesdaySideLunch(String tuesdaySideLunch) {
		this.tuesdaySideLunch = tuesdaySideLunch;
	}

	public String getTuesdaySideDinner() {
		return tuesdaySideDinner;
	}

	public void setTuesdaySideDinner(String tuesdaySideDinner) {
		this.tuesdaySideDinner = tuesdaySideDinner;
	}

	public String getWednesdaySideLunch() {
		return wednesdaySideLunch;
	}

	public void setWednesdaySideLunch(String wednesdaySideLunch) {
		this.wednesdaySideLunch = wednesdaySideLunch;
	}

	public String getWednesdaySideDinner() {
		return wednesdaySideDinner;
	}

	public void setWednesdaySideDinner(String wednesdaySideDinner) {
		this.wednesdaySideDinner = wednesdaySideDinner;
	}

	public String getThursdaySideLunch() {
		return thursdaySideLunch;
	}

	public void setThursdaySideLunch(String thursdaySideLunch) {
		this.thursdaySideLunch = thursdaySideLunch;
	}

	public String getThursdaySideDinner() {
		return thursdaySideDinner;
	}

	public void setThursdaySideDinner(String thursdaySideDinner) {
		this.thursdaySideDinner = thursdaySideDinner;
	}

	public String getFridaySideLunch() {
		return fridaySideLunch;
	}

	public void setFridaySideLunch(String fridaySideLunch) {
		this.fridaySideLunch = fridaySideLunch;
	}

	public String getFridaySideDinner() {
		return fridaySideDinner;
	}

	public void setFridaySideDinner(String fridaySideDinner) {
		this.fridaySideDinner = fridaySideDinner;
	}

	public String getSaturdaySideLunch() {
		return saturdaySideLunch;
	}

	public void setSaturdaySideLunch(String saturdaySideLunch) {
		this.saturdaySideLunch = saturdaySideLunch;
	}

	public String getSaturdaySideDinner() {
		return saturdaySideDinner;
	}

	public void setSaturdaySideDinner(String saturdaySideDinner) {
		this.saturdaySideDinner = saturdaySideDinner;
	}

	public String getSundaySideLunch() {
		return sundaySideLunch;
	}

	public void setSundaySideLunch(String sundaySideLunch) {
		this.sundaySideLunch = sundaySideLunch;
	}

	public String getSundaySideDinner() {
		return sundaySideDinner;
	}

	public void setSundaySideDinner(String sundaySideDinner) {
		this.sundaySideDinner = sundaySideDinner;
	}
	
	public String getMondayLunchOther() {
		return mondayLunchOther;
	}

	public void setMondayLunchOther(String mondayLunchOther) {
		this.mondayLunchOther = mondayLunchOther;
	}

	public String getMondayDinnerOther() {
		return mondayDinnerOther;
	}

	public void setMondayDinnerOther(String mondayDinnerOther) {
		this.mondayDinnerOther = mondayDinnerOther;
	}

	public String getTuesdayLunchOther() {
		return tuesdayLunchOther;
	}

	public void setTuesdayLunchOther(String tuesdayLunchOther) {
		this.tuesdayLunchOther = tuesdayLunchOther;
	}

	public String getTuesdayDinnerOther() {
		return tuesdayDinnerOther;
	}

	public void setTuesdayDinnerOther(String tuesdayDinnerOther) {
		this.tuesdayDinnerOther = tuesdayDinnerOther;
	}

	public String getWednesdayLunchOther() {
		return wednesdayLunchOther;
	}

	public void setWednesdayLunchOther(String wednesdayLunchOther) {
		this.wednesdayLunchOther = wednesdayLunchOther;
	}

	public String getWednesdayDinnerOther() {
		return wednesdayDinnerOther;
	}

	public void setWednesdayDinnerOther(String wednesdayDinnerOther) {
		this.wednesdayDinnerOther = wednesdayDinnerOther;
	}

	public String getThursdayLunchOther() {
		return thursdayLunchOther;
	}

	public void setThursdayLunchOther(String thursdayLunchOther) {
		this.thursdayLunchOther = thursdayLunchOther;
	}

	public String getThursdayDinnerOther() {
		return thursdayDinnerOther;
	}

	public void setThursdayDinnerOther(String thursdayDinnerOther) {
		this.thursdayDinnerOther = thursdayDinnerOther;
	}

	public String getFridayLunchOther() {
		return fridayLunchOther;
	}

	public void setFridayLunchOther(String fridayLunchOther) {
		this.fridayLunchOther = fridayLunchOther;
	}

	public String getFridayDinnerOther() {
		return fridayDinnerOther;
	}

	public void setFridayDinnerOther(String fridayDinnerOther) {
		this.fridayDinnerOther = fridayDinnerOther;
	}

	public String getSaturdayLunchOther() {
		return saturdayLunchOther;
	}

	public void setSaturdayLunchOther(String saturdayLunchOther) {
		this.saturdayLunchOther = saturdayLunchOther;
	}

	public String getSaturdayDinnerOther() {
		return saturdayDinnerOther;
	}

	public void setSaturdayDinnerOther(String saturdayDinnerOther) {
		this.saturdayDinnerOther = saturdayDinnerOther;
	}

	public String getSundayLunchOther() {
		return sundayLunchOther;
	}

	public void setSundayLunchOther(String sundayLunchOther) {
		this.sundayLunchOther = sundayLunchOther;
	}

	public String getSundayDinnerOther() {
		return sundayDinnerOther;
	}

	public void setSundayDinnerOther(String sundayDinnerOther) {
		this.sundayDinnerOther = sundayDinnerOther;
	}
	
	
}
