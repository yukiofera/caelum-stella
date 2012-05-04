//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.04.10 at 02:12:20 PM BRT 
//


package br.com.caelum.stella.nfe.xsd.schema.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchema;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Tipo Resultado da Consulta do Status do Servi�o
 * 
 * <p>Java class for TRetConsStatServ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TRetConsStatServ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/nfe}TAmb"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/nfe}TVerAplic"/>
 *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/nfe}TStat"/>
 *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/nfe}TMotivo"/>
 *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/nfe}TCodUfIBGE"/>
 *         &lt;element name="dhRecbto" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="tMed" type="{http://www.portalfiscal.inf.br/nfe}TMed" minOccurs="0"/>
 *         &lt;element name="dhRetorno" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="xObs" type="{http://www.portalfiscal.inf.br/nfe}TMotivo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/nfe}TVerConsStatServ" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRetConsStatServ", propOrder = {
    "tpAmb",
    "verAplic",
    "cStat",
    "xMotivo",
    "cuf",
    "dhRecbto",
    "tMed",
    "dhRetorno",
    "xObs"
})

@XmlRootElement(name="retConsStatServ", namespace="")
public class TRetConsStatServ {
	
    @Override
	public String toString() {
		return "TRetConsStatServ [tpAmb=" + tpAmb + ", verAplic=" + verAplic + ", cStat=" + cStat + ", xMotivo=" + xMotivo + ", cuf=" + cuf + ", dhRecbto="
				+ dhRecbto + ", tMed=" + tMed + ", dhRetorno=" + dhRetorno + ", xObs=" + xObs + ", versao=" + versao + "]";
	}

	@XmlElement(name="tpAmb",namespace="http://www.portalfiscal.inf.br/nfe")
    protected String tpAmb;
    
	@XmlElement(name="verAplic",namespace="http://www.portalfiscal.inf.br/nfe")
    protected String verAplic;
    
    @XmlElement(name="cStat",namespace="http://www.portalfiscal.inf.br/nfe")
    protected String cStat;
    
    @XmlElement(name="xMotivo",namespace="http://www.portalfiscal.inf.br/nfe")
    protected String xMotivo;
    
    @XmlElement(name="cUF",namespace="http://www.portalfiscal.inf.br/nfe")
    protected String cuf;
    
    @XmlElement(name="dhRecbto",namespace="http://www.portalfiscal.inf.br/nfe")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhRecbto;
    
    @XmlElement(name="tMed",namespace="http://www.portalfiscal.inf.br/nfe")
    protected String tMed;
    
    @XmlElement(name="dhRetorno",namespace="http://www.portalfiscal.inf.br/nfe")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dhRetorno;
    
    @XmlElement(name="xObs",namespace="http://www.portalfiscal.inf.br/nfe")
    protected String xObs;
    
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String versao;

    /**
     * Gets the value of the tpAmb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Sets the value of the tpAmb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Gets the value of the verAplic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerAplic() {
        return verAplic;
    }

    /**
     * Sets the value of the verAplic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerAplic(String value) {
        this.verAplic = value;
    }

    /**
     * Gets the value of the cStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCStat() {
        return cStat;
    }

    /**
     * Sets the value of the cStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCStat(String value) {
        this.cStat = value;
    }

    /**
     * Gets the value of the xMotivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMotivo() {
        return xMotivo;
    }

    /**
     * Sets the value of the xMotivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMotivo(String value) {
        this.xMotivo = value;
    }

    /**
     * Gets the value of the cuf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUF() {
        return cuf;
    }

    /**
     * Sets the value of the cuf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUF(String value) {
        this.cuf = value;
    }

    /**
     * Gets the value of the dhRecbto property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhRecbto() {
        return dhRecbto;
    }

    /**
     * Sets the value of the dhRecbto property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhRecbto(XMLGregorianCalendar value) {
        this.dhRecbto = value;
    }

    /**
     * Gets the value of the tMed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTMed() {
        return tMed;
    }

    /**
     * Sets the value of the tMed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTMed(String value) {
        this.tMed = value;
    }

    /**
     * Gets the value of the dhRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDhRetorno() {
        return dhRetorno;
    }

    /**
     * Sets the value of the dhRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDhRetorno(XMLGregorianCalendar value) {
        this.dhRetorno = value;
    }

    /**
     * Gets the value of the xObs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXObs() {
        return xObs;
    }

    /**
     * Sets the value of the xObs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXObs(String value) {
        this.xObs = value;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}