package com.project.colecao.modelos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlEnum
@XmlType(name = "plataforma")
public enum TipoPlataforma {

	@XmlEnumValue("pc")
	PC,

	@XmlEnumValue("mobile")
	MOBILE,

	@XmlEnumValue("web")
	WEB;

}